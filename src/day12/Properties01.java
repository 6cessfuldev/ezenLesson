package day12;

import java.util.Properties;

public class Properties01 {

	public static void main(String[] args) {
		Properties sysPro = System.getProperties();
		System.out.println("java.version " + sysPro.getProperty("java.version"));
		System.out.println("user.language " + sysPro.getProperty("user.language"));
		System.out.println(sysPro);
	}

}
