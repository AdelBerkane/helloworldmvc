package org.helloworldmvc.model;

public class DAOHelloWorld {
	private static String FileName = "HelloWorld.txt";
	private static DAOHelloWorld instance = null;
	private String helloWorldMessage = null;

	public String getHelloWorldMessage() {
		return helloWorldMessage;
	}

	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}

	private DAOHelloWorld() {
	}

	public static DAOHelloWorld getInstance() {
		return instance;
	}

	private static void setInstance(DAOHelloWorld instance) {
		instance = instance;
	}
	private void readFile() {
		
	}

}
