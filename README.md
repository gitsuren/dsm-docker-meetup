# dsm-docker-meetup

DOCKER MEETUP - DSM May 23 2018

Attempt to Deeper dive to Dockerfile
=====================================

* The Dockerfile is a text file that (mostly) contains the instructions that you would execute on the command line to create an image - docker build and you can run this image to start containers with docker run
* A Dockerfile is a step by step set of instructions.
* Docker provides a set of standard instructions to be used in the Dockerfile, like FROM, COPY, RUN, ENV, EXPOSE, CMD,ADD, WORKDIR, VOLUME just to name a few basic ones.
* Docker will build a Docker image automatically by reading these instructions from the Dockerfile.


Let’s create your first image
=============================

1. Create the Dockerfile
2. Define the base image with FROM
  Eg: FROM alpline:latest
  You can also start FROM scratch, scratch is an emtpy container
3. Alpine does not have any other apps installed for eg: vim, git etc
   You can add more lines to customize image based on your requirement
  Eg RUN apl update RUN apk add vim
4. Build your image => docker build -t gitsuren/custom-alpine:1.0 .
5. Docker images => for listing all the docker images
6. RUN THE IMAGE =>
  Docker run --rm --ti gitsuren/custom-alpine:1.0 /bin/sh
  To verify vim is installed - run vim --v
7. Rebuilding same IMAGE = Image Cache in Action


If we change the order of the commands in Dockerfile, it will rebuild the image and thus COULD NOT TAKE BENEFITS from docker image cache

BEST PRACTICE:
Those system level command which won’t change much while rebuilding the image - stays on the top
And variable commands after that stays in the bottom so that we can take advantage

Reference:
https://docs.docker.com/engine/reference/builder/#impact-on-build-caching
https://takacsmark.com/dockerfile-tutorial-by-example-dockerfile-best-practices-2018/#overview

If you are really new to DOCKER:
Docker has a very nice place to learn it:
https://training.play-with-docker.com/

Docker public registry/private:
https://hub.docker.com/
https://store.docker.com/
