Example: Create Git Repository and Commit a Simple Java Project
===============================================================================


Create a simple Java project
----------------------------

```
$ mkdir -p src/org/se/lab
$ mkdir build
```

```
$ vi src/org/se/lab/Hello.java
package org.se.lab;

import java.lang.System;

public class Hello
{
    public static void main(String... args)
    {
        System.out.println("Hello World!");
    }
}
```
```
$ javac -d build src/org/se/lab/Hello.java

$ tree
	.
	├── build
	│   └── org
	│       └── se
	│           └── lab
	│               └── Hello.class
	└── src
	    └── org
	        └── se
	            └── lab
	                └── Hello.java

$ java -cp build/ org.se.lab.Hello 
Hello World!
```

Create a Git repository
-----------------------

```
$ git init
Initialized empty Git repository in /home/student/git/hello/.git/

$ ll -a
total 20
drwxrwxr-x.  5 student student 4096 Mar 21 14:35 .
drwxrwxr-x. 19 student student 4096 Mar 21 14:33 ..
drwxrwxr-x.  3 student student 4096 Mar 21 14:34 build
drwxrwxr-x.  7 student student 4096 Mar 21 14:35 .git
drwxrwxr-x.  3 student student 4096 Mar 21 14:33 src

$ git status
On branch master

Initial commit

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	build/
	src/
```
	
Commit the project files to the repository
------------------------------------------

```
$ git add src/

$ git status
On branch master

Initial commit

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

	new file:   src/org/se/lab/Hello.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	build/
```

```
$ vi .gitignore
build/
```

```
$ git status
On branch master

Initial commit

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

	new file:   src/org/se/lab/Hello.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	.gitignore

$ git add .gitignore 

$ git status
On branch master

Initial commit

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

	new file:   .gitignore
	new file:   src/org/se/lab/Hello.java
```

```
$ git commit -m "Initial import."
[master (root-commit) 1e10e10] Initial import.
 2 files changed, 13 insertions(+)
 create mode 100644 .gitignore
 create mode 100644 src/org/se/lab/Hello.java

 $ git status
On branch master
nothing to commit, working directory clean
```
