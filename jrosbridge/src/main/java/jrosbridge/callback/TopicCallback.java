package jrosbridge.callback;

import jrosbridge.messages.Message;
import jrosbridge.messages.geometry.*;

/**
 * The TopicCallback interface defines a single method which will be called when
 * an incoming message is received for an associated topic.
 * 
 * @author Russell Toris - russell.toris@gmail.com
 * @version April 1, 2014
 */
public class TopicCallback {
	
	private Message message;
	private String type;
	
	public TopicCallback(String type) {
		this.type = type;
	}
	
	/**
	 * This function is called when an incoming message is received for a given
	 * topic. No ROS type checking is done on the internal message data.
	 * 
	 * @param message
	 *            The message that was received.
	 */
	public void handleMessage(Message message){
		System.out.println("Published from Ros: " + message.toString());
		
		switch(type){
		case "geometry_msgs/Point":
			Point point = Point.fromJsonString(message.toString());
			this.message = point;
			break;
		case "geometry_msgs/Point32":
			Point32 point32 = Point32.fromJsonString(message.toString());
			this.message = point32;
			break;
		case "geometry_msgs/PointStamped":
			PointStamped pointStamped = PointStamped.fromJsonString(message.toString());
			this.message = pointStamped;
			break;
		case "geometry_msgs/Polygon":
			Polygon polygon = Polygon.fromJsonString(message.toString());
			this.message = polygon;
			break;
		case "geometry_msgs/PolygonStamped":
			PolygonStamped polygonStamped = PolygonStamped.fromJsonString(message.toString());
			this.message = polygonStamped;
			break;
		case "geometry_msgs/Pose":
			Pose pose = Pose.fromJsonString(message.toString());
			this.message = pose;
			break;
		case "geometry_msgs/Pose2D":
			Pose2D pose2D = Pose2D.fromJsonString(message.toString());
			this.message = pose2D;
			break;
		case "geometry_msgs/PoseArray":
			PoseArray poseArray = PoseArray.fromJsonString(message.toString());
			this.message = poseArray;
			break;
		case "geometry_msgs/PoseStamped":
			PoseStamped poseStamped = PoseStamped.fromJsonString(message.toString());
			this.message = poseStamped;
			break;
		case "geometry_msgs/PoseWithCovariance":
			PoseWithCovariance poseWithCovariance = PoseWithCovariance.fromJsonString(message.toString());
			this.message = poseWithCovariance;
			break;
		case "geometry_msgs/PoseWithCovarianceStamped":
			PoseWithCovarianceStamped poseWithCovarianceStamped = PoseWithCovarianceStamped.fromJsonString(message.toString());
			this.message = poseWithCovarianceStamped;
			break;
		case "geometry_msgs/Quaternion":
			Quaternion quaternion = Quaternion.fromJsonString(message.toString());
			this.message = quaternion;
			break;
		case "geometry_msgs/QuaternionStamped":
			QuaternionStamped quaternionStamped = QuaternionStamped.fromJsonString(message.toString());
			this.message = quaternionStamped;
			break;
		case "geometry_msgs/Transform":
			Transform transform = Transform.fromJsonString(message.toString());
			this.message = transform;
			break;
		case "geometry_msgs/TransformStamped":
			TransformStamped transformStamped = TransformStamped.fromJsonString(message.toString());
			this.message = transformStamped;
			break;
		case "geometry_msgs/Twist":
			Twist twist = Twist.fromJsonString(message.toString());
			this.message = twist;
			break;
		case "geometry_msgs/TwistStamped":
			TwistStamped twistStamped = TwistStamped.fromJsonString(message.toString());
			this.message = twistStamped;
			break;
		case "geometry_msgs/TwistWithCovariance":
			TwistWithCovariance twistWithCovariance = TwistWithCovariance.fromJsonString(message.toString());
			this.message = twistWithCovariance;
			break;
		case "geometry_msgs/TwistWithCovarianceStamped":
			TwistWithCovarianceStamped twistWithCovarianceStamped = TwistWithCovarianceStamped.fromJsonString(message.toString());
			this.message = twistWithCovarianceStamped;
			break;
		case "geometry_msgs/Vector3":
			Vector3 vector3 = Vector3.fromJsonString(message.toString());
			this.message = vector3;
			break;
		case "geometry_msgs/Vector3Stamped":
			Vector3Stamped vector3Stamped = Vector3Stamped.fromJsonString(message.toString());
			this.message = vector3Stamped;
			break;
		case "geometry_msgs/Wrench":
			Wrench wrench = Wrench.fromJsonString(message.toString());
			this.message = wrench;
			break;
		case "geometry_msgs/WrenchStamped":
			WrenchStamped wrenchStamped = WrenchStamped.fromJsonString(message.toString());
			this.message = wrenchStamped;
			break;
		default:
			System.out.println("[WARN]: No matching message type.");
		}
	}
	
	public Message getMessage() {
		return this.message;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
