In order to run this container, we will be using the one already created for us:
Jekyll - Static Site Generator (https://jekyllrb.com)

docker pull bretfisher/jekyll-serve 

OR 

cd dir/of/your/jekyll/site
docker run -p 80:4000 -v $(pwd):/site bretfisher/jekyll-serve
That's it!


SNEAK PEAK TO DOCKERFILE
==========================
FROM ruby:2.4-alpine

RUN apk add --no-cache build-base gcc bash cmake

RUN gem install jekyll

EXPOSE 4000

WORKDIR /site

# create new site by setting -e JEKYLL_NEW=true
ENV JEKYLL_NEW false

COPY docker-entrypoint.sh /usr/local/bin/

# on every container start we'l'
ENTRYPOINT [ "docker-entrypoint.sh" ]

CMD [ "bundle", "exec", "jekyll", "serve", "--force_polling", "-H", "0.0.0.0", "-P", "4000" ]

Reference from :
* https://hub.docker.com/r/bretfisher/jekyll-serve/~/dockerfile/