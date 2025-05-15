package com.gvp.orm.Spring;

import org.springframework.stereotype.Component;

@Component("rocketEngine")
public class RocketEngine implements Engine{

	@Override
	public String getEngineDetails() {
		
		return "Rocket Engine give good performence";
	}

}
