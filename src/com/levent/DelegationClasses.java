package com.levent;

import java.net.URL;
import java.net.URLClassLoader;

public class DelegationClasses {
	public static void main(String[] args) {
		URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
		
		do{
			System.out.println("Class Loader: " + classLoader);
			
			for (URL url : classLoader.getURLs()) {
				System.out.printf("\t %s\n", url.getPath());
			}
			
		} while ((classLoader = (URLClassLoader) classLoader.getParent()) != null);
		
		System.out.println("Class Loader: Bootstrap classLoader");
	}
}