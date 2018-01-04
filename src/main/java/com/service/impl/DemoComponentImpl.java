package com.service.impl;

import org.springframework.stereotype.Component;

import com.service.DemoComponent;

@Component
public class DemoComponentImpl implements DemoComponent{
	
	private String demo = "test";

	@Override
	public String getDemo() {
		return demo;
	}

	public void setDemo(String demo) {
		this.demo = demo;
	}
	

}
