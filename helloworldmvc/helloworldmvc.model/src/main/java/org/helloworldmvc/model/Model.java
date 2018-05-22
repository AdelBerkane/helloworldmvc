package org.helloworldmvc.model;

import org.helloworldmvc.Contract.IModel;
import org.helloworldmvc.model.DAOHelloWorld;
public class Model implements IModel {
	public String getHelloWorld() {
		DAOHelloWorld hw = new DAOHelloWorld();
		hw.readFile();
		return hw.getHelloWorldMessage();
	}
}
