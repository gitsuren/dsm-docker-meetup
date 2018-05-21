Simple Dockerfile
===================
FROM alpine:3.4
MAINTAINER Surendra Bajracharya bajracharya.surendra@gmail.com

RUN apk update
RUN apk add vim
RUN apk add curl


* TO optimize above steps - RUN can be reduced to one stem using && 
 RUN apk update && \
    apk add vim && \
    apk add curl

 OR even for above case, we can do following
 RUN apk update && \
     apk add vim curl


* After rebuilding same image, it leaves the dangling image behind AND we can filter them as :
 docker images --filter "dangling=true"

 To remove all the dangling images:
 docker rmi $(docker images -q --filter "dangling=true") ==> here -q will just give the images unique id

 ----------------- NOTE -----------------------

 If we change the order of the commands in Dockerfile, it will rebuild the image and thus COULD NOT TAKE BENEFITS from docker image cache

 * BEST PRACTICE:
 Those system level command which won’t change much while rebuilding the image - stays on the top
 And variable commands after that stays in the bottom so that we can take advantage


* Let's say we have COPY command to copy any file to container BEFORE RUN command
 if the content of file is changing in every build, then it is going to build RUN again NOT from CACHE
 COPY ./anyTextFile.txt /usr/src/anyTextFile.txt

 Thus good to have COPY after RUN :)

 * ANOTHER TIPS
 you can always go to hub.docker.com and find any official docker image and READ its dockerfile

  * For reference to various commands in dockerfile
 https://docs.docker.com/engine/reference/builder/