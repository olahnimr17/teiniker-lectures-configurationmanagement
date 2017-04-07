Example: Branching and Merging in a Local Repository
===================================================


Use an existing repository
---------------------------

```
$ cd sandbox/hello-world
```

```
$ git status
On branch master
```

Crate a new feature in a separate branch
----------------------------------------

```
$ git branch new-feature

$ git checkout new-feature
Switched to branch 'new-feature'
```

```
$ git status
On branch new-feature
nothing to commit, working directory clean
```

```
$ git branch
  master
* new-feature
```

Implement the new feature
-------------------------

```
$ vi src/org/se/lab/Hello.java 

  5 public class Hello
  6 {
  7     public static void main(String... args)
  8     {
  9         printToConsole("Hello Kapfenberg!");
 10     }
 11 
 12     public static void printToConsole(String message)
 13     {
 14         System.out.println(">>" + message);
 15     }
 16 }
```

```
$ javac -d build/ src/org/se/lab/Hello.java 
```

```
$ git status
On branch new-feature
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   src/org/se/lab/Hello.java

no changes added to commit (use "git add" and/or "git commit -a")
```
```
$ git commit -a -m "Added new method."
[new-feature e6c7273] Added new method.
 1 file changed, 6 insertions(+), 1 deletion(-)
```

Go back to the master branch and merge changes from new-feature branch
----------------------------------------------------------------------

```
$ git checkout master
Switched to branch 'master'
* master
new-feature
```

```
$ git merge new-feature
Updating 53f4a42..e6c7273
Fast-forward
 src/org/se/lab/Hello.java | 7 ++++++-
 1 file changed, 6 insertions(+), 1 deletion(-)
```

```
$ cat src/org/se/lab/Hello.java 
package org.se.lab;

import java.lang.System;

public class Hello
{
    public static void main(String... args)
    {
        printToConsole("Hello Kapfenberg!");
    }

    public static void printToConsole(String message)
    {
        System.out.println(">>" + message);
    }
}
```

```
$ git status
On branch master
nothing to commit, working directory clean
```

Remove the new-feature branch
-----------------------------

```
$ git branch
* master
  new-feature
```

```
$ git branch -d new-feature
Deleted branch new-feature (was e6c7273).
```

```
$ git branch
* master
```
