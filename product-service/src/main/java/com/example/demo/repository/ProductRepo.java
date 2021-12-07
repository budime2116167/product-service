package com.example.demo.repository;

public interface ProductRepo {
	
	public default void message() {
		System.out.println("inside  repo method ");
	}

}
