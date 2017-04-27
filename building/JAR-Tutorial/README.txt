How to compile and run the Java programm?
-------------------------------------------------------------------------------

$ mkdir build

$ javac -d build/ src/org/se/lab/*.java 
$ tree
.
├── build
│   └── org
│       └── se
│           └── lab
│               └── Hello.class
├── README.txt
└── src
    └── org
        └── se
            └── lab
                └── Hello.java


$ java -cp build/ org.se.lab.Hello 
Hello Kapfenberg!
Anzahl der ausgegebenen Zeichen: 17


How to create a JAR file?
-------------------------------------------------------------------------------

$ cd build

$ vi MANIFEST.MF
Manifest-Version: 1.0
Main-Class: org.se.lab.Hello

$ jar -cvmf MANIFEST.MF Hello.jar ./
added manifest
adding: org/(in = 0) (out= 0)(stored 0%)
adding: org/se/(in = 0) (out= 0)(stored 0%)
adding: org/se/lab/(in = 0) (out= 0)(stored 0%)
adding: org/se/lab/Hello.class(in = 842) (out= 499)(deflated 40%)

$ java -jar Hello.jar 
Hello Kapfenberg!
Anzahl der ausgegebenen Zeichen: 17


How to review a JAR file?
-------------------------------------------------------------------------------

$ jar tf Ant-Tutorial.jar 
META-INF/
META-INF/MANIFEST.MF
org/
org/se/
org/se/lab/
org/se/lab/Hello.class

  
How to extract a JAR file?
-------------------------------------------------------------------------------
  
$ jar -xf Ant-Tutorial.jar 
[student@localhost tmp]$ tree
.
├── Ant-Tutorial.jar
├── META-INF
│   └── MANIFEST.MF
└── org
    └── se
        └── lab
            └── Hello.class

$ cat META-INF/MANIFEST.MF 
Manifest-Version: 1.0
Ant-Version: Apache Ant 1.9.7
Created-By: 1.8.0_101-b13 (Oracle Corporation)
Main-Class: org.se.lab.Hello
  
  