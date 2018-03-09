Install single node cluster
---
This module will provide the basic to run your hadoop map reduce app
in a single machine cluster.

Build the image
---
```
docker build  -t hadoop-single .
```
Run the image
```
docker run -it --name hadoop-single hadoop-single
```
