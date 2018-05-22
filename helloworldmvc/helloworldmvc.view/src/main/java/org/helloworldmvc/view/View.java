package org.helloworldmvc.view;

import org.helloworldmvc.*;
import org.helloworldmvc.Contract.IView;

public class View implements IView{
	public String displayMessage(String message){
		System.out.println(message);
		return null;
	}

}
