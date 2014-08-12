package no.web;

import java.io.PrintStream;
import javax.inject.Inject;

public class Hello {

    private HelloBuilder helloBuilder;

    @Inject
    public Hello(HelloBuilder helloBuilder) {
        this.helloBuilder = helloBuilder;
    }

    public void greet(PrintStream to, String name) {
        to.println(createGreeting(name));
    }

    public String createGreeting(String name) {
        return helloBuilder.buildPhrase("hello", name);
    }
}
