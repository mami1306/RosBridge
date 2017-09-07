package main;

import java.lang.String;

import edu.wpi.rail.jrosbridge.messages.*;
import edu.wpi.rail.jrosbridge.messages.geometry.*;
import edu.wpi.rail.jrosbridge.messages.std.*;

import edu.wpi.rail.jrosbridge.primitives.Time;

public class RosMessage {

	private Message message;
	private String messageType;
	
	/**
	 * @param x coordinate [double]
	 * @param y coordinate [double]
	 * @param z coordinate [double]
	 * @return Point
	 */
	public Point createPointMessage(double x, double y, double z) {
		this.messageType = "geometry_msgs/Point";
		Point point = new Point(x, y, z);
		this.message = point;
		return point;
	}
	
	public Point32 createPoint32Message(float x, float y, float z) {
		this.messageType = "geometry_msgs/Point32";
		Point32 point = new Point32(x, y, z);
		this.message = point;
		return point;
	}
	
	public PointStamped createPointStampedMessage(Header header, Point point) {
		this.messageType = "geometry_msgs/PointStamped";
		PointStamped sPoint = new PointStamped(header, point);
		this.message = sPoint;
		return sPoint;
	}
	
	public Polygon createPolygon(Point32[] points) {
		this.messageType = "geometry_msgs/Polygon";
		Polygon poly = new Polygon(points);
		this.message = poly;
		return poly;		
	}
	
	public PolygonStamped createPolygon(Header header, Polygon polygon) {
		this.messageType = "geometry_msgs/PolygonStamped";
		PolygonStamped poly = new PolygonStamped(header, polygon);
		this.message = poly;
		return poly;		
	}
	
	public Pose	createPoseMessage(Point point, Quaternion quat) {
		this.messageType = "geometry_msgs/Pose";
		Pose pose = new Pose(point, quat);
		this.message = pose;
		return pose;
	}
	
	public Message getMessage() {
		return message;
	}
	
	public String getMessageType() {
		return messageType;
	}
	
	public Header setHeader(String frame_id) {
		Time time = Time.now();
		Header tmp = new Header(0, time, frame_id);
		return tmp;
	}
}