How to build the application?
-------------------------------------------------------------------------------

$ mvn package

[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building Maven-CommonsLang 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Maven-CommonsLang ---
[INFO] skip non existing resourceDirectory /home/student/workspace-swd16-ConfigurationManagement/Maven-CommonsLang/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Maven-CommonsLang ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/student/workspace-swd16-ConfigurationManagement/Maven-CommonsLang/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Maven-CommonsLang ---
[INFO] skip non existing resourceDirectory /home/student/workspace-swd16-ConfigurationManagement/Maven-CommonsLang/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Maven-CommonsLang ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ Maven-CommonsLang ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ Maven-CommonsLang ---
[INFO] Building jar: /home/student/workspace-swd16-ConfigurationManagement/Maven-CommonsLang/target/Maven-CommonsLang-0.0.1-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.465 s
[INFO] Finished at: 2017-04-27T11:23:29+02:00
[INFO] Final Memory: 13M/32M
[INFO] ------------------------------------------------------------------------


How to execute a program that uses jar files?
-------------------------------------------------------------------------------

$ java -cp ~/.m2/repository/org/apache/commons/commons-lang3/3.5/commons-lang3-3.5.jar:./target/Maven-CommonsLang-0.0.1-SNAPSHOT.jar org.se.lab.ArrayExample

Note that the order of JAR files in the classpath is essential!



How to execute a program using Maven?
-------------------------------------------------------------------------------
We can use the "exec-maven-plugin" plugin:

$ mvn exec:java

[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building Maven-Tutorial 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] >>> exec-maven-plugin:1.2.1:java (default-cli) > validate @ Maven-Tutorial >>>
[INFO] 
[INFO] <<< exec-maven-plugin:1.2.1:java (default-cli) < validate @ Maven-Tutorial <<<
[INFO] 
[INFO] --- exec-maven-plugin:1.2.1:java (default-cli) @ Maven-Tutorial ---
{one,two,three}
{one,two,three,four}
found "two" in the array.
{four,three,two,one}
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.431 s
[INFO] Finished at: 2017-04-27T11:19:02+02:00
[INFO] Final Memory: 5M/15M
[INFO] ------------------------------------------------------------------------
