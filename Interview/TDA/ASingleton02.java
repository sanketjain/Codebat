package com.journaldev.designpatterns;

public class ASingleton02 {

	private static ASingleton02 instance;
	private static Object mutex = new Object();

	private ASingleton02() {
	}

	public static ASingleton02 getInstance() {
		ASingleton02 result = instance;
		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null)
					instance = result = new ASingleton02();
			}
		}
		return result;
	}

}