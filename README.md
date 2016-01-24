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


##Special Note
If there is any format issue with records in the file, then the application will annotate those records as Invalid and continue with other records and print them as expected. 

For instance, file with following records:

25, 10, false

55, , true


Application will output following 

Invalid Job record in a File, postion in the file [1]


55, , true


====================================

JOB Details:

Paper Type: A4

Printing Type: Single Sided

Number of Colored Pages: 10

Number of Black and White Pages: 15

Cost: 4.75

====================================

Total Cost of Jobs: 4.75
