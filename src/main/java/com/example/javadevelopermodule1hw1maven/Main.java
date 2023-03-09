package com.example.javadevelopermodule1hw1maven;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		Gson gson = new Gson();
		Person me = new Person();

		String result = gson.toJson(me);
		System.out.println(result);
	}
}
