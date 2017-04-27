How to build the application?
-------------------------------------------------------------------------------

$ ant 
Buildfile: /home/student/workspace-swd16-ConfigurationManagement/Ant-CommonsLang/build.xml

init:
    [mkdir] Created dir: /home/student/workspace-swd16-ConfigurationManagement/Ant-CommonsLang/build-ant

compile:
    [javac] Compiling 1 source file to /home/student/workspace-swd16-ConfigurationManagement/Ant-CommonsLang/build-ant

jar:
      [jar] Building jar: /home/student/workspace-swd16-ConfigurationManagement/Ant-CommonsLang/Ant-CommonsLang.jar

BUILD SUCCESSFUL


How to execute a program that uses jar files?
-------------------------------------------------------------------------------

$ java -cp ./Ant-CommonsLang.jar:lib/commons-lang/commons-lang3-3.5.jar org.se.lab.ArrayExample

Note that we can use either -jar or -cp, we can't combine the two!
If we want to put additional JARs on the classpath then we can either put them 
in the main JAR's 
manifest and then use java -jar or we put the full classpath (including the main 
JAR and its dependencies) in -cp and name the main class explicitly on the 
command line.

How to execute a program using Ant?
-------------------------------------------------------------------------------

We can use Ant's <java> task to execute java classes:

	<target name="run">
        <java classname="org.se.lab.ArrayExample"
              fork="yes"
              classpathref="libs"
              failonerror="true">
        </java>
    </target>

    
$ ant run
Buildfile: /home/student/workspace-swd16-ConfigurationManagement/Ant-CommonsLang/build.xml

run:
     [java] {one,two,three}
     [java] {one,two,three,four}
     [java] found "two" in the array.
     [java] {four,three,two,one}

BUILD SUCCESSFUL
    