#PaperCut Sample App
##Overview

This is a pure java project to build a stand-alone java application which takes a list of A4 print jobs and calculates the cost of each job.

##Prerequisites

You need the following installed and available in your $PATH:

- Java 1.6 or greater (http://java.oracle.com)
- Maven 3.0 or greater (https://maven.apache.org/)

##To build

To build the stand-alone java application, run this task:

Go to the root directory of the project and run:
mvn compile
This will resolve all required dependencies and store them in your local maven repository. 

###Sample output of the compile run
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building papercut 1.0
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ papercut ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\pgandhi\workspace\personal\papercut\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:2.0.2:compile (default-compile) @ papercut ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.493 s
[INFO] Finished at: 2016-01-24T18:29:42+11:00
[INFO] Final Memory: 6M/154M
[INFO] ------------------------------------------------------------------------

##Unit test the application
mvn test

###Sample output of the Junit Run
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building papercut 1.0
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ papercut ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\pgandhi\workspace\personal\papercut\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:2.0.2:compile (default-compile) @ papercut ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ papercut ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:2.0.2:testCompile (default-testCompile) @ papercut ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ papercut ---
[INFO] Surefire report directory: C:\Users\pgandhi\workspace\personal\papercut\target\surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.reducingwaste.papercut.PrintingCostCalculatorTest
JOB Details:
Paper Type: A4
Printing Type: Single Sided
Number of Colored Pages: 10
Number of Black and White Pages: 15
Cost: 4.75
\====================================
JOB Details:
Paper Type: A4
Printing Type: Double Sided
Number of Colored Pages: 13
Number of Black and White Pages: 42
Cost: 6.800000000000001
\====================================
JOB Details:
Paper Type: A4
Printing Type: Double Sided
Number of Colored Pages: 22
Number of Black and White Pages: 480
Cost: 52.4
====================================
JOB Details:
Paper Type: A4
Printing Type: Single Sided
Number of Colored Pages: 0
Number of Black and White Pages: 1
Cost: 0.15
====================================
Total Cost of Jobs: 64.10000000000001
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.019 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.347 s
[INFO] Finished at: 2016-01-24T18:30:42+11:00
[INFO] Final Memory: 7M/154M
[INFO] ------------------------------------------------------------------------

##Testing the Java Application
mvn exec:java -Dexec.args="<Complete Path of the file having list of A4 print jobs>"

###Sample output of the Application run

[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building papercut 1.0
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- exec-maven-plugin:1.4.0:java (default-cli) @ papercut ---
JOB Details:
Paper Type: A4
Printing Type: Single Sided
Number of Colored Pages: 10
Number of Black and White Pages: 15
Cost: 4.75
====================================
JOB Details:
Paper Type: A4
Printing Type: Double Sided
Number of Colored Pages: 13
Number of Black and White Pages: 42
Cost: 6.800000000000001
====================================
JOB Details:
Paper Type: A4
Printing Type: Double Sided
Number of Colored Pages: 22
Number of Black and White Pages: 480
Cost: 52.4
====================================
JOB Details:
Paper Type: A4
Printing Type: Single Sided
Number of Colored Pages: 0
Number of Black and White Pages: 1
Cost: 0.15
====================================
Total Cost of Jobs: 64.10000000000001
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.629 s
[INFO] Finished at: 2016-01-24T18:34:40+11:00
[INFO] Final Memory: 7M/154M
[INFO] ------------------------------------------------------------------------



