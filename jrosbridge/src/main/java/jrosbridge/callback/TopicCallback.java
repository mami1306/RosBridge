package jrosbridge.callback;

import jrosbridge.messages.Message;
import jrosbridge.messages.geometry.*;
import jrosbridge.messages.sensor.*;
import jrosbridge.messages.std.*;
import jrosbridge.messages.std.Byte;

import java.lang.String;

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
		System.out.println("Published from Ros-Topic: " + this.type);
		
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
		case "std_msgs/Byte":
			Byte byteVal = Byte.fromJsonString(message.toString());
			this.message = byteVal;
			break;
		case "std_msgs/Bool":
			Bool bool = Bool.fromJsonString(message.toString());
			this.message = bool;
			break;
		case "std_msgs/ByteMultiArray":
			ByteMultiArray byteMultiArray = ByteMultiArray.fromJsonString(message.toString());
			this.message = byteMultiArray;
			break;
		case "std_msgs/Char":
			Char charVal = Char.fromJsonString(message.toString());
			this.message = charVal;
			break;
		case "std_msgs/ColorRGBA":
			ColorRGBA colorRGBA = ColorRGBA.fromJsonString(message.toString());
			this.message = colorRGBA;
			break;
		case "std_msgs/Duration":
			Duration duration = Duration.fromJsonString(message.toString());
			this.message = duration;
			break;
		case "std_msgs/Empty":
			Empty empty = Empty.fromJsonString(message.toString());
			this.message = empty;
			break;
		case "std_msgs/Float32":
			Float32 float32 = Float32.fromJsonString(message.toString());
			this.message = float32;
			break;
		case "std_msgs/Float32MultiArray":
			Float32MultiArray float32MultiArray= Float32MultiArray.fromJsonString(message.toString());
			this.message = float32MultiArray;
			break;
		case "std_msgs/Float64":
			Float64 float64 = Float64.fromJsonString(message.toString());
			this.message = float64;
			break;
		case "std_msgs/Float64MultiArray":
			Float64MultiArray float64MultiArray= Float64MultiArray.fromJsonString(message.toString());
			this.message = float64MultiArray;
			break;
		case "std_msgs/Header":
			Header header = Header.fromJsonString(message.toString());
			this.message = header;
			break;
		case "std_msgs/Int16":
			Int16 int16 = Int16.fromJsonString(message.toString());
			this.message = int16;
			break;
		case "std_msgs/Int16MultiArray":
			Int16MultiArray int16MultiArray = Int16MultiArray.fromJsonString(message.toString());
			this.message = int16MultiArray;
			break;
		case "std_msgs/Int32":
			Int32 int32 = Int32.fromJsonString(message.toString());
			this.message = int32;
			break;
		case "std_msgs/Int32MultiArray":
			Int32MultiArray int32MultiArray = Int32MultiArray.fromJsonString(message.toString());
			this.message = int32MultiArray;
			break;
		case "std_msgs/Int64":
			Int64 int64 = Int64.fromJsonString(message.toString());
			this.message = int64;
			break;
		case "std_msgs/Int64MultiArray":
			Int64MultiArray int64MultiArray = Int64MultiArray.fromJsonString(message.toString());
			this.message = int64MultiArray;
			break;
		case "std_msgs/Int8":
			Int8 int8 = Int8.fromJsonString(message.toString());
			this.message = int8;
			break;
		case "std_msgs/Int8MultiArray":
			Int8MultiArray int8MultiArray = Int8MultiArray.fromJsonString(message.toString());
			this.message = int8MultiArray;
			break;
		case "std_msgs/MultiArrayDimension":
			MultiArrayDimension multiArrayDimension = MultiArrayDimension.fromJsonString(message.toString());
			this.message = multiArrayDimension;
			break;
		case "std_msgs/MultiArrayLayout":
			MultiArrayLayout multiArrayLayout = MultiArrayLayout.fromJsonString(message.toString());
			this.message = multiArrayLayout;
			break;
		case "String":
			jrosbridge.messages.std.String string = jrosbridge.messages.std.String.fromJsonString(message.toString());
			this.message = string;
			break;
		case "std_msgs/Time":
			Time time = Time.fromJsonString(message.toString());
			this.message = time;
			break;
		case "std_msgs/UInt16":
			UInt16 uInt16 = UInt16.fromJsonString(message.toString());
			this.message = uInt16;
			break;
		case "std_msgs/UInt16MultiArray":
			UInt16MultiArray uInt16MultiArray = UInt16MultiArray.fromJsonString(message.toString());
			this.message = uInt16MultiArray;
			break;
		case "std_msgs/UInt32":
			UInt32 uInt32 = UInt32.fromJsonString(message.toString());
			this.message = uInt32;
			break;
		case "std_msgs/UInt32MultiArray":
			UInt32MultiArray uInt32MultiArray = UInt32MultiArray.fromJsonString(message.toString());
			this.message = uInt32MultiArray;
			break;
		case "std_msgs/UInt64":
			UInt64 uInt64 = UInt64.fromJsonString(message.toString());
			this.message = uInt64;
			break;
		case "std_msgs/UInt64MultiArray":
			UInt64MultiArray uInt64MultiArray = UInt64MultiArray.fromJsonString(message.toString());
			this.message = uInt64MultiArray;
			break;
		case "std_msgs/UInt8":
			UInt8 uInt8 = UInt8.fromJsonString(message.toString());
			this.message = uInt8;
			break;
		case "std_msgs/UInt8MultiArray":
			UInt8MultiArray uInt8MultiArray = UInt8MultiArray.fromJsonString(message.toString());
			this.message = uInt8MultiArray;
			break;
		case "sensor_msgs/JointState":
			JointState jointState = JointState.fromJsonString(message.toString());
			this.message = jointState;
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
