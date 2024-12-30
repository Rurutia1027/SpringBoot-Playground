#!/bin/sh

# here instead of using -h localhost we use db
# because current shell script is gonna create a new container which shares the same docker network with the name of pj1-db
# and trys to connect to another docker which setup by given the name of db
# that's why we use -h db rather than using localhost
# there are two active container trying to create connection through the same network pj1-db
# rather than creating two process and let them communicating locally.
docker run -it --rm --network=pj1-db postgres:latest \
psql -h db -U postgres