package jrosbridge.messages.sensor;

import java.io.StringReader;
import java.util.Arrays;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;

import jrosbridge.messages.Message;
import jrosbridge.messages.std.Header;

public class JointState extends Message{

	/**
	 * The name of the header field for the message.
	 */
	public static final String FIELD_HEADER = "header";
	
	/**
	 * The name of the name field for the message.
	 */
	public static final String FIELD_NAME = "name";
	
	/**
	 * The name of the position field for the message.
	 */
	public static final String FIELD_POSITION = "position";
	
	/**
	 * The name of the velocity field for the message.
	 */
	public static final String FIELD_VELOCITY = "velocity";
	
	/**
	 * The name of the effort field for the message.
	 */
	public static final String FIELD_EFFORT = "effort";

	/**
	 * The message type.
	 */
	public static final String TYPE = "sensor_msgs/JointState";

	private final double[] position, velocity, effort;
	private final String[] names;
	private final Header header;

	/**
	 * Create a new JointState with the given values.
	 * 
	 * @param name
	 * 			  The names of the joints 
	 * @param positon
	 *            The position values of the joints.
	 * @param velocity
	 *            The velocity values of the joints.
	 * @param effort
	 *            The effort values of the joints.
	 */	
	public JointState(Header header, String[] names, double[] position, double[] velocity, double[] effort) {
		// build the JSON object
		
		super(Json.createObjectBuilder()
				.add(JointState.FIELD_HEADER, header.toJsonObject())
				.add(JointState.FIELD_NAME, names.toString())
				.add(JointState.FIELD_POSITION, Json.createReader(
					new StringReader(Arrays.toString(position))).readArray())
				.add(JointState.FIELD_VELOCITY, Json.createReader(
					new StringReader(Arrays.toString(velocity))).readArray())
				.add(JointState.FIELD_EFFORT, Json.createReader(
					new StringReader(Arrays.toString(effort))).readArray()).build(), 
				JointState.TYPE);

		this.names = names;
		this.position = position;
		this.velocity =velocity;
		this.effort = effort;
		this.header = header;
	}

	/**
	 * Get the names of all joints.
	 * 
	 * @return The names of these joints.
	 */
	public String[] getJoints() {
		return this.names;
	}

	/**
	 * Get the position values of all joints.
	 * 
	 * @return The position values of these joints.
	 */
	public double[] getPositions() {
		return this.position;
	}

	/**
	 * Get the velocities of all joints.
	 * 
	 * @return The velocities of these joints.
	 */
	public double[] getVelocities() {
		return this.velocity;
	}
	
	/**
	 * Get the effort values of all joints.
	 * 
	 * @return The effort values of these joints.
	 */
	public double[] getEfforts() {
		return this.effort;
	}

	/**
	 * Create a clone of this JointState.
	 */
	@Override
	public JointState clone() {
		return new JointState(this.header, this.names, this.position, this.velocity, this.effort);
	}

	/**
	 * Create a new JointState based on the given JSON string. Any missing values
	 * will be set to their defaults.
	 * 
	 * @param jsonString
	 *            The JSON string to parse.
	 * @return A JointState message based on the given JSON string.
	 */
	public static JointState fromJsonString(String jsonString) {
		// convert to a message
		return JointState.fromMessage(new Message(jsonString));
	}

	/**
	 * Create a new JointState based on the given Message. Any missing values will be
	 * set to their defaults.
	 * 
	 * @param m
	 *            The Message to parse.
	 * @return A JointState message based on the given Message.
	 */
	public static JointState fromMessage(Message m) {
		// get it from the JSON object
		return JointState.fromJsonObject(m.toJsonObject());
	}

	/**
	 * Create a new JointState based on the given JSON object. Any missing values
	 * will be set to their defaults.
	 * 
	 * @param jsonObject
	 *            The JSON object to parse.
	 * @return A JointState message based on the given JSON object.
	 */
	public static JointState fromJsonObject(JsonObject jsonObject) {
		// check the fields
		String[] names = new String[] {};
		double[] position = new double[] {};
		double[] velocity = new double[] {};
		double[] effort = new double[] {};
		JsonArray jsonNames = jsonObject
				.getJsonArray(JointState.FIELD_NAME);
		JsonArray jsonPosition = jsonObject
				.getJsonArray(JointState.FIELD_POSITION);
		JsonArray jsonVelocity = jsonObject
				.getJsonArray(JointState.FIELD_VELOCITY);
		JsonArray jsonEffort = jsonObject
				.getJsonArray(JointState.FIELD_EFFORT);
		if (jsonNames != null) {
			// convert each data
			names = new String[jsonPosition.size()];
			position = new double[jsonPosition.size()];
			velocity = new double[jsonPosition.size()];
			effort = new double[jsonPosition.size()];
			for (int i = 0; i < position.length; i++) {
				names[i] = jsonNames.getString(i);
				position[i] = (double) jsonPosition.getJsonNumber(i).doubleValue();
				velocity[i] = (double) jsonVelocity.getJsonNumber(i).doubleValue();
				effort[i] = (double) jsonEffort.getJsonNumber(i).doubleValue();
			}
		}
		
		Header header = jsonObject.containsKey(JointState.FIELD_HEADER) ? Header
				.fromJsonObject(jsonObject
						.getJsonObject(JointState.FIELD_HEADER))
				: new Header();		
		
		return new JointState(header, names, position, velocity, effort);
	}
}
