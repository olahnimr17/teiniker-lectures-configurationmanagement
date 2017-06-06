Project Documentation (arc42 Template)
-------------------------------------------------------------------------------

Maven is shipped with full support of Site and APT. There is no need to add or
configure some plugins.

Project structure:
.
├── pom.xml
├── README.txt
└── src
    └── site
        ├── apt
        │   ├── arc42-sections.apt
        │   └── index.apt
        ├── resources
        │   └── images
        │       ├── 01-intro-and-goals.png
        │       ├── 02-constraints-overview.png
        │       ├── 03-context-overview.png
        │       ├── 05-building-block-overview.png
        │       ├── 06-runtime-overview.png
        │       ├── 07-deployment-overview.png
        │       ├── 08-concepts-overview.png
        │       ├── 09-decision-overview.png
        │       ├── 10-q-scenario-overview.png
        │       ├── 11-risk-overview.png
        │       └── 12-glossary-overview.png
        └── site.xml
 

To run the Maven Site build cycle type:

$ mvn site

Point your Browser to: target/site/index.html


References:
-------------------------------------------------------------------------------
Guide to creating a site
https://maven.apache.org/guides/mini/guide-site.html

The APT format
http://maven.apache.org/doxia/references/apt-format.html

Apache Commons Lang - Maven Site
https://github.com/apache/commons-lang/tree/master/src/site