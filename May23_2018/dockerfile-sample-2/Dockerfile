# this same shows how we can extend/change an existing official image from Docker Hub

FROM nginx:latest
# highly recommend you always pin versions for anything beyond dev/learn

WORKDIR /usr/share/nginx/html
# change working directory to root of nginx webhost
# using WORKDIR is prefered to using 'RUN cd /some/path'

COPY index.html index.html

# I don't have to specify EXPOSE or CMD because they're in my FROM
# docker build -t gitsuren/custom-nginx:1.0 .
# docker container run -d --name mynginx -p 8080:80 gitsuren/custom-nginx:1.0

# for local development - we can use bind volume and then map that file to host machine 
# and see the changes updated on container USING -v 
#
# docker container run -d --name mynginx2 -p 8081:80 -v $(pwd):/usr/share/nginx/html gitsuren/custom-nginx:1.0

