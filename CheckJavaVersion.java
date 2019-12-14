package com.journaldev.misc;

import java.lang.Runtime.Version;

public class CheckJavaVersion {

	public static void main(String[] args) {

		// For Java 8 or lower, use System Property
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.specification.version"));

	}

}
