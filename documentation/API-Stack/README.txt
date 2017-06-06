API Documentation
-------------------------------------------------------------------------------
A larger software system will be decomposed into smaller sub-systems.
In the same way we hide information within objects by using private fields and 
methods we can also hide implementation classed within packages:

org.se.lab
	Stack		// public interface 		(API)
	StackImpl	// package-private class 	(implementation)
	Node		// package-private class 	(implementation)	

We can change the whole implementation of a subsystem as long as we don't touch 
the public API.

From a client's perspective, the API documentation defines the contract between 
the subsystem and itself. 
As a rule of thumb: It should be possible to implement proper JUnit tests for a 
subsystem based on its API documentation. 


How to generate JavaDocs with Maven?
-------------------------------------------------------------------------------
We generate JavaDoc as part of the Maven Site build cycle using the 
maven-javadoc-plugin:

	<plugin>
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-javadoc-plugin</artifactId>
		<version>2.10.4</version>				
	</plugin>

Note that this plugin will be executed within the maven site build cycle, so 
the plugin must be placed into the <reporting> <plugins> section of the pom.xml

To start the site build cycle type:

$ mvn site

see: target/site/apidocs/index.html


How to configure the report set?
-------------------------------------------------------------------------------
By default we get JavaDoc reports for both the main and test folder. 
We can configure the plugin to generate apidocs only (src/main/java):

	<plugin>
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-javadoc-plugin</artifactId>
		<version>2.10.4</version>				
		 <reportSets>
            <reportSet>
                <reports>
                    <report>javadoc</report>
                </reports>
            </reportSet>
        </reportSets>
	</plugin> 


How to add JUnit reports to Maven Site?
-------------------------------------------------------------------------------
To include the JUnit test reports into the generated Maven Site documentation
put the  maven-surfire-report-plugin into the <reporting> <plugins> section of 
your pom.xml

	<plugin>
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-surefire-report-plugin</artifactId>
		<version>2.20</version>
	</plugin>

see: target/site/surefire-report.html


References:
-------------------------------------------------------------------------------
How to Write Doc Comments for the Javadoc Tool
http://www.oracle.com/technetwork/articles/java/index-137868.html

Javadoc Tool
http://www.oracle.com/technetwork/java/javase/documentation/index-jsp-135444.html

Apache Maven Javadoc Plugin 
http://maven.apache.org/plugins/maven-javadoc-plugin/

Apache Maven Surefire Report Plugin
http://maven.apache.org/surefire/maven-surefire-report-plugin/

