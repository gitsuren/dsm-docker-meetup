#!/bin/sh
set -e

cat /etc/hosts
echo "ok i'm done, now let's ping'"

exec "$@"

# set -e - exit script if any command fails (non-zero value)
# exec "$@" is typically used to make the entrypoint a pass through that then runs the docker command.
#


