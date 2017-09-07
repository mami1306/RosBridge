package main;

import edu.wpi.rail.jrosbridge.*;

public class RosWrapper {

	private Ros rosObject;
	
	public RosWrapper() {
		rosObject = new Ros("localhost");
	}
	
	public RosWrapper(String host) {
		rosObject = new Ros(host);
	}
	
	public boolean connect() {
		System.out.println("Trying to connect with Rosbridge");
		boolean result = this.rosObject.connect();
		if(result) {
			System.out.println("Connection successfull");
			return result;
		}
		else{
			System.out.println("Connection unsuccessfull!");
			return result;
		}	
	}
	
	public boolean disconnect() {
		System.out.println("Trying to disconnect from Rosbridge");
		boolean result = this.rosObject.disconnect();
		if(result) {
			System.out.println("Disconnection successfull");
			return result;
		}
		else{
			System.out.println("Disconnection unsuccessfull!");
			return result;
		}	
	}
	
	public void publishOnTopic(String topic, RosMessage message) {
		Topic tmp = new Topic(this.rosObject, topic, message.getMessageType());
		tmp.publish(message.getMessage());
	}
	
	public static void main(String[] args) {
		System.out.println("Just a runnable Library ;)");
	}
}
