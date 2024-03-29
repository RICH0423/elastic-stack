#!/bin/bash

docker run -d \
  --name=filebeat \
  --user=root \
  --volume="$(pwd)/filebeat-docker.yml:/usr/share/filebeat/filebeat.yml:ro" \
  --volume="/var/lib/docker/containers:/var/lib/docker/containers:ro" \
  --volume="/var/run/docker.sock:/var/run/docker.sock:ro" \
  docker.elastic.co/beats/filebeat:7.1.1 filebeat -e -strict.perms=false
