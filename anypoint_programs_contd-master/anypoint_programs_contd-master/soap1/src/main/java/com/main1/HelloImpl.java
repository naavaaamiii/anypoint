package com.main1;

public class HelloImpl implements SoapInter {

	@Override
	public String hiMessage(String name) {
		// TODO Auto-generated method stub
		return "hello "+name;
	}

}
