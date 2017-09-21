package com.hradecek.cdi;

/**
 * Make a polite greeting.
 *
 * @author <a href="mailto:ivohradek@gmail.com">Ivo Hradek</a>
 */
public class HelloGreeting implements Greeting {

    /**
     * Get an informal greeting.
     *
     * @param name to be greet
     * @return polite and informal greeting
     */
    public String greet(String name) {
        return "Hello " + name;
    }
}
