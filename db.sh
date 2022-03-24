#!/usr/bin/env bash

set -euo pipefail

cd "$(dirname "$0")"

docker run \
  --detach \
  --rm \
  -it \
  --name postgres \
  --env POSTGRES_PASSWORD=verys3cret \
  --publish 5432:5432 postgres
