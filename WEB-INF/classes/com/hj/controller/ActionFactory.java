package com.hj.controller;

import com.hj.controller.aciton.Action;
import com.hj.controller.aciton.BattelAction;
import com.hj.controller.aciton.CaptureAction;
import com.hj.controller.aciton.FieldAction;
import com.hj.controller.aciton.FieldAgainAction;
import com.hj.controller.aciton.JoinFormAction;
import com.hj.controller.aciton.JoinResultAction;
import com.hj.controller.aciton.LoginFormAction;
import com.hj.controller.aciton.LoginResultAction;
import com.hj.controller.aciton.ShowAction;
import com.hj.controller.aciton.TrainerFormAction;
import com.hj.controller.aciton.TrainerResultAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();

	private ActionFactory() {
		super();
	}
	
	public static ActionFactory getInstatnce() {
		return instance;
	}

	public Action getAction(String key) {
		Action action = null;
		System.out.println("ActionFactory : " + key);
		
		if (key.equals("join")) {
			action = new JoinFormAction();
		} else if (key.equals("join_result")) {
			action = new JoinResultAction();
		} else if (key.equals("field")) {
			action = new FieldAction();
		} else if (key.equals("show")) {
			action = new ShowAction();
		} else if (key.equals("poke")) {
			action = new BattelAction();
		} else if (key.equals("capture")) {
	         action = new CaptureAction();
	    } else if (key.equals("login")) {
	    	action = new LoginFormAction();
	    } else if (key.equals("login_result")) {
	    	action = new LoginResultAction();
	    } else if (key.equals("trainer_form")) {
	    	action = new TrainerFormAction();
	    } else if (key.equals("trainer_result")) {
	    	action = new TrainerResultAction();
	    } else if (key.equals("field_again")) {
	    	action = new FieldAgainAction();
	    }
		
		return action;
	}
}
