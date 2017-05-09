Using JUnit to Automatically Testing Code
===============================================================================

$ tree
.
├── pom.xml
├── README.txt
├── src
│   ├── main
│   │   └── java
│   │       └── org
│   │           └── se
│   │               └── lab
│   │                   └── Service.java
│   └── test
│       └── java
│           └── org
│               └── se
│                   └── lab
│                       └── ReverseStringTest.java


How to run JUnit from command line?
-------------------------------------------------------------------------------

$ mvn test

[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building JUnit4-ReverseString 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ JUnit4-ReverseString ---
[INFO] skip non existing resourceDirectory /home/student/workspace-swd16-ConfigurationManagement/JUnit4-ReverseString/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ JUnit4-ReverseString ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/student/workspace-swd16-ConfigurationManagement/JUnit4-ReverseString/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ JUnit4-ReverseString ---
[INFO] skip non existing resourceDirectory /home/student/workspace-swd16-ConfigurationManagement/JUnit4-ReverseString/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ JUnit4-ReverseString ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/student/workspace-swd16-ConfigurationManagement/JUnit4-ReverseString/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ JUnit4-ReverseString ---
[INFO] Surefire report directory: /home/student/workspace-swd16-ConfigurationManagement/JUnit4-ReverseString/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.se.lab.ReverseStringTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.109 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.403 s
[INFO] Finished at: 2017-05-09T09:09:35+02:00
[INFO] Final Memory: 12M/31M
[INFO] ------------------------------------------------------------------------


$ tree
└── target
    ├── classes
    │   └── org
    │       └── se
    │           └── lab
    │               └── Service.class
    ├── surefire-reports
    │   ├── org.se.lab.ReverseStringTest.txt
    │   └── TEST-org.se.lab.ReverseStringTest.xml
    └── test-classes
        └── org
            └── se
                └── lab
                    └── ReverseStringTest.class


$ cat target/surefire-reports/org.se.lab.ReverseStringTest.txt 
-------------------------------------------------------------------------------
Test set: org.se.lab.ReverseStringTest
-------------------------------------------------------------------------------
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.122 sec


