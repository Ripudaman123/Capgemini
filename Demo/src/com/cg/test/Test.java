package com.cg.test;

import com.cg.factory.MessageFactory;

public class Test {

	public static void main(String[] args) {
	
		try {
			MessageFactory.getMessageRenderer().render();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
