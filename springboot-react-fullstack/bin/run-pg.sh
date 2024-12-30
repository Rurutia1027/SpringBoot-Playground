#!/bin/sh

# first, create network for project1's database
# docker network create pj1-db

if [ ! -e ./db-data ]; then
  mkdir ./db-data
fi

cd ./db-data

docker run --name db -p 5432:5432 --network=pj1-db \
-v "${PWD}:/var/lib/postgresql/data" -e POSTGRES_PASSWORD=admin \
-d postgres:latest