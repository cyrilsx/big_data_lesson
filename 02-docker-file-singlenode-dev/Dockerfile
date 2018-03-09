FROM debian:latest

RUN apt-get update \
     && DEBIAN_FRONTEND=noninteractive apt-get install -y --no-install-recommends  openjdk-8-jre-headless ca-certificates-java curl \
     && rm -rf /var/lib/apt/lists/*

ENV JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64/

ENV HADOOP_VERSION 3.0.0
ENV HADOOP_URL https://www.apache.org/dist/hadoop/common/hadoop-$HADOOP_VERSION/hadoop-$HADOOP_VERSION.tar.gz

RUN curl -fSL "$HADOOP_URL" -o /tmp/hadoop.tar.gz \
    && curl -fSL "$HADOOP_URL.asc" -o /tmp/hadoop.tar.gz.asc \
    && tar -xvf /tmp/hadoop.tar.gz -C /opt/ \
    && rm /tmp/hadoop.tar.gz* \
    && ln -s /opt/hadoop-$HADOOP_VERSION/etc/hadoop /etc/hadoop \
    && mkdir /opt/hadoop-$HADOOP_VERSION/logs \
    && mkdir /hadoop-data \
    && rm -Rf /opt/hadoop-$HADOOP_VERSION/share/doc/hadoop

ENV HADOOP_HOME=/opt/hadoop-$HADOOP_VERSION
ENV HADOOP_CONF_DIR=/etc/hadoop
ENV MULTIHOMED_NETWORK=1

ENV USER=root
ENV PATH $HADOOP_HOME/bin/:$PATH

ADD map-reduce-app/countword.jar /app/map-reduce-app/countword.jar
ADD data/master_description /data/in/master_description
ADD run_and_print_result.sh /app/run_and_print_result.sh

RUN chmod +x /app/run_and_print_result.sh

ENTRYPOINT ["/app/run_and_print_result.sh"]
