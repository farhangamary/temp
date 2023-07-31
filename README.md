# Camunda Platform - Issues

This is the process application as a minimal sample for the [issue #3583](https://github.com/camunda/camunda-bpm-platform/issues/3583).

Adjust the **persistence.xml** file and build the project using `mvn clean install`. The built artifact should get deployed in Wildfly running camunda 7.19.0 or a higher version.

After deploying, just start the dummy_one_process to see the error.

Process application has only one class with two similar methods one is recognized by bpmn the other one isn't; However 
prior to camunda version 7.19 both methods were okay.
