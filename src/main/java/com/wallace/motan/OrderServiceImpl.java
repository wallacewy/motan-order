package com.wallace.motan;

public class OrderServiceImpl implements OrderService {
	
	public String hello(String name) {
        System.out.println(name + " invoked order service");
        return "Hello " + name + ", it's greeting from order service (group v2)";
    }
}
