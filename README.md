#PaperCut Sample App
##Overview

This is a pure java project to build a stand-alone java application which takes a list of A4 print jobs and calculates the cost of each job.

##Prerequisites

You need the following installed and available in your $PATH:

- Java 1.6 or greater (http://java.oracle.com)
- Maven 3.0 or greater (https://maven.apache.org/)

##To build

To build the stand-alone java application, run this task:
mvn compile

This will resolve all required dependencies and store them in your local maven repository. 


##Unit test the application
mvn test

##Testing the Java Application
mvn exec:java -Dexec.args="Complete Path of the file having list of A4 print jobs"


