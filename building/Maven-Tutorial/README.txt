How to run Maven from the command line?
-------------------------------------------------------------------------------

$ mvn package

[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building Maven-Tutorial 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Maven-Tutorial ---
[INFO] skip non existing resourceDirectory /home/student/git/teiniker-lectures-configurationmanagement/building/Maven-Tutorial/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Maven-Tutorial ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/student/git/teiniker-lectures-configurationmanagement/building/Maven-Tutorial/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Maven-Tutorial ---
[INFO] skip non existing resourceDirectory /home/student/git/teiniker-lectures-configurationmanagement/building/Maven-Tutorial/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Maven-Tutorial ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ Maven-Tutorial ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ Maven-Tutorial ---
[INFO] Building jar: /home/student/git/teiniker-lectures-configurationmanagement/building/Maven-Tutorial/target/Maven-Tutorial-0.0.1-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.358 s
[INFO] Finished at: 2017-04-27T11:26:33+02:00
[INFO] Final Memory: 13M/31M
[INFO] ------------------------------------------------------------------------

$ tree
.
├── pom.xml
├── README.txt
├── src
│   └── main
│       └── java
│           └── org
│               └── se
│                   └── lab
│                       └── Hello.java
└── target
    ├── classes
    │   └── org
    │       └── se
    │           └── lab
    │               └── Hello.class
    ├── generated-sources
    ├── maven-archiver
    ├── maven-status
    └── Maven-Tutorial-0.0.1-SNAPSHOT.jar


How to find help?
-------------------------------------------------------------------------------

$ mvn --help

usage: mvn [options] [<goal(s)>] [<phase(s)>]

Options:
 -am,--also-make                        If project list is specified, also
                                        build projects required by the
                                        list
 -amd,--also-make-dependents            If project list is specified, also
                                        build projects that depend on
                                        projects on the list
 -B,--batch-mode                        Run in non-interactive (batch)
                                        mode
 -b,--builder <arg>                     The id of the build strategy to
                                        use.
 -C,--strict-checksums                  Fail the build if checksums don't
                                        match
 -c,--lax-checksums                     Warn if checksums don't match
 -cpu,--check-plugin-updates            Ineffective, only kept for
                                        backward compatibility
 -D,--define <arg>                      Define a system property
 -e,--errors                            Produce execution error messages
 -emp,--encrypt-master-password <arg>   Encrypt master security password
 -ep,--encrypt-password <arg>           Encrypt server password
 -f,--file <arg>                        Force the use of an alternate POM
                                        file (or directory with pom.xml).
 -fae,--fail-at-end                     Only fail the build afterwards;
                                        allow all non-impacted builds to
                                        continue
 -ff,--fail-fast                        Stop at first failure in
                                        reactorized builds
 -fn,--fail-never                       NEVER fail the build, regardless
                                        of project result
 -gs,--global-settings <arg>            Alternate path for the global
                                        settings file
 -gt,--global-toolchains <arg>          Alternate path for the global
                                        toolchains file
 -h,--help                              Display help information
 -l,--log-file <arg>                    Log file where all build output
                                        will go.
 -llr,--legacy-local-repository         Use Maven 2 Legacy Local
                                        Repository behaviour, ie no use of
                                        _remote.repositories. Can also be
                                        activated by using
                                        -Dmaven.legacyLocalRepo=true
 -N,--non-recursive                     Do not recurse into sub-projects
 -npr,--no-plugin-registry              Ineffective, only kept for
                                        backward compatibility
 -npu,--no-plugin-updates               Ineffective, only kept for
                                        backward compatibility
 -nsu,--no-snapshot-updates             Suppress SNAPSHOT updates
 -o,--offline                           Work offline
 -P,--activate-profiles <arg>           Comma-delimited list of profiles
                                        to activate
 -pl,--projects <arg>                   Comma-delimited list of specified
                                        reactor projects to build instead
                                        of all projects. A project can be
                                        specified by [groupId]:artifactId
                                        or by its relative path.
 -q,--quiet                             Quiet output - only show errors
 -rf,--resume-from <arg>                Resume reactor from specified
                                        project
 -s,--settings <arg>                    Alternate path for the user
                                        settings file
 -T,--threads <arg>                     Thread count, for instance 2.0C
                                        where C is core multiplied
 -t,--toolchains <arg>                  Alternate path for the user
                                        toolchains file
 -U,--update-snapshots                  Forces a check for missing
                                        releases and updated snapshots on
                                        remote repositories
 -up,--update-plugins                   Ineffective, only kept for
                                        backward compatibility
 -V,--show-version                      Display version information
                                        WITHOUT stopping build
 -v,--version                           Display version information
 -X,--debug                             Produce execution debug output

 
How to execute the program?
-------------------------------------------------------------------------------

$ java -cp target/Maven-Tutorial-0.0.1-SNAPSHOT.jar org.se.lab.Hello

Hello Kapfenberg!
Anzahl der ausgegebenen Zeichen: 17


We can also use the Maven "maven-jar-plugin" plugin to add a manifest file to 
the build JAR file.

	<plugin>
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-jar-plugin</artifactId>
		<configuration>
			<archive>
				<manifestFile>src/main/resources/META-INF/MANIFEST.MF</manifestFile>
			</archive>
		</configuration>
	</plugin>

			
$ java -jar target/Maven-Tutorial-0.0.1-SNAPSHOT.jar

Hello Kapfenberg!
Anzahl der ausgegebenen Zeichen: 17
			
