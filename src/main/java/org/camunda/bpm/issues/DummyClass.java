package org.camunda.bpm.issues;

import jakarta.inject.Named;

@Named("dummyClass")
public class DummyClass {

    /**
     * Not recognized by bpmn
     *
     * @param args
     * @return
     */
    public String prepare(String... args) {
        return String.join(", ", args);
    }

    /**
     * Recognized
     *
     * @param arg1
     * @param arg2
     */
/*    public String prepare(String arg1, String arg2) {
        return arg1 + ", " + arg2;
    }*/
}
