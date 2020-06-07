package net.trantor.rest.war;

import net.trantor.rest.Library;

public class App {
    public String getGreeting() {
    	return Library.sayHi();
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
