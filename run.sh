#!/bin/sh

docker build --pull --no-cache --tag 'quarkus-bug-54696' .
docker run --rm -it \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v "${HOME}/.m2:/root/.m2" \
  quarkus-bug-54696
