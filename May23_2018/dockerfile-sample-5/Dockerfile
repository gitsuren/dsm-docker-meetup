FROM alpine

COPY ./docker-entrypoint.sh /

ENTRYPOINT ["/docker-entrypoint.sh"]

CMD ["ping", "8.8.8.8"]


# Prefer ENTRYPOINT to CMD when building executable Docker image and you need a command always to be executed. Additionally use CMD if you need to provide extra default arguments that could be overwritten from command line when docker container runs.

# Choose CMD if you need to provide a default command and/or arguments that can be overwritten from command line when docker container runs.