package com.gvp.orm.Spring;

import org.springframework.stereotype.Component;

@Component("jetengine")
public class JetEngine implements Engine{

	@Override
	public String getEngineDetails() {
		// TODO Auto-generated method stub
		return "JetEngine";
	}

}
