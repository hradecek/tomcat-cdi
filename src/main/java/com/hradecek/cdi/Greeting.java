package com.hradecek.cdi;

/**
 * Make a simple greeting.
 *
 * @author <a href="mailto:ivohradek@gmail.com">Ivo Hradek</a>
 */
public interface Greeting {

    /**
     * Create a greet with name.
     *
     * @param name to be greet
     * @return final greet
     */
    String greet(String name);
}
