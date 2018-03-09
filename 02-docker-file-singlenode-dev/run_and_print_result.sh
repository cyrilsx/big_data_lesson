#!/usr/bin/env bash

hadoop jar /app/map-reduce-app/countword.jar /data/in/master_description /data/out
cat /data/out/* >> /dev/tty