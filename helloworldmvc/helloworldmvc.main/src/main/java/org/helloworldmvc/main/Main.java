package org.helloworldmvc.main;
import org.helloworldmvc.Contract.IModel;
import org.helloworldmvc.Contract.IView;
import org.helloworldmvc.controller.Controller;
import org.helloworldmvc.model.Model;
import org.helloworldmvc.view.View;


public class Main {
	public static void main (String [] args) {
		IModel modz = new Model();
		IView viewz = new View();
		Controller controla = new Controller(viewz, modz);
		
		controla.run();
	}

}
