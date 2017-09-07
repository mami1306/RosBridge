package main;

import edu.wpi.rail.jrosbridge.*;
import edu.wpi.rail.jrosbridge.services.*;

public class RosService {
	
	private Service service;
	private String  serviceType;
	
	public Service getService() {
		return service;
	}

	public String getServiceType() {
		return serviceType;
	}
	
	public void createService(Ros ros,String name, String type){
		this.serviceType=type;
		this.service=new Service(ros,name,type);
	}
	
}