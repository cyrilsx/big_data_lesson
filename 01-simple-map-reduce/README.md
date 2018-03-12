Prerequis
---
Install java8
Install gradle
```
$ sdk install gradle 4.6
```
Init gradle project
```
$ gradle init --type java-application
```
Initialization
---
Add MapReduce dependency.
```
compile 'org.apache.hadoop:hadoop-client:3.0.0'
```
Objective
---
Let's start with the traditional word count. You have ton of text in your hadoop cluster.
The goal is to count the number of occurrence for each word.

Explanation
---
How map reduce works ? First you need to understand the architecture of Hadoop