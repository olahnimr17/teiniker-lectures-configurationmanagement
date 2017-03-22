Example: Modify an Existing Project
===================================


Modify a file and undo changes 
------------------------------
```
$ vi src/org/se/lab/Hello.java
```
Do some modifications...

```
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   src/org/se/lab/Hello.java

no changes added to commit (use "git add" and/or "git commit -a")

$ git status -s
 M src/org/se/lab/Hello.java
```
```
$ git diff
diff --git a/src/org/se/lab/Hello.java b/src/org/se/lab/Hello.java
index 2e55f4c..1dd6d19 100644
--- a/src/org/se/lab/Hello.java
+++ b/src/org/se/lab/Hello.java
@@ -6,6 +6,6 @@ public class Hello
 {
     public static void main(String... args)
     {
-        System.out.println("Hello World!");
+        System.out.println("Hello KBerg!");
     }
 }
```
```
$ git checkout src/org/se/lab/Hello.java

$ git status
On branch master
nothing to commit, working directory clean
```


Modify a file and commit changes 
--------------------------------

```
$ vi src/org/se/lab/Hello.java
```
Do some modifications...

```
$ git diff
diff --git a/src/org/se/lab/Hello.java b/src/org/se/lab/Hello.java
index 2e55f4c..0d34fb7 100644
--- a/src/org/se/lab/Hello.java
+++ b/src/org/se/lab/Hello.java
@@ -6,6 +6,6 @@ public class Hello
 {
     public static void main(String... args)
     {
-        System.out.println("Hello World!");
+        System.out.println("Hello Egon!");
     }
 }
```

```
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   src/org/se/lab/Hello.java

no changes added to commit (use "git add" and/or "git commit -a")
```

```
$ git commit -a -m "Changed text output."
[master 755e60d] Changed text output.
 1 file changed, 1 insertion(+), 1 deletion(-)

$ git status
On branch master
nothing to commit, working directory clean
```

```
$ git log
commit 755e60dfeee33bcb552ead4f72ed721bce61a52a
Author: teiniker <egon.teiniker@fh-joanneum.at>
Date:   Tue Mar 21 15:38:10 2017 +0100

    Changed text output.

commit 1e10e10b060c7e8dcf9d37466997af1031901784
Author: teiniker <egon.teiniker@fh-joanneum.at>
Date:   Tue Mar 21 14:44:08 2017 +0100

    Initial import.
```