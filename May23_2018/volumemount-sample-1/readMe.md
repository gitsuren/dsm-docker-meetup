using Named volume option can be easily help you to update the database version on the container :

For Instance:
from postgres Dockerfile:
VOLUME /var/lib/postgresql/data

Now we can do:

Previous version: 9.6
docker container run -d --name psql -v psql:/var/lib/postgresql/data postgres:9.6

Update to 10.4
docker container run -d --name psql2 -v psql:/var/lib/postgresql/data postgres:10.4

You can validate:
~ docker volume ls

DRIVER      VOLUME NAME
local       psql