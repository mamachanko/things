# things ☕️🍚☀️
> The simplest API ever.

Start it:
```shell
# With an in-memory db
./gradlew bootrun

# With Postgres
./db.sh && SPRING_PROFILES_ACTIVE=postgres ./gradlew bootrun
```

Get things:
```shell
curl localhost:8080/things
```

Returns
```json
{
  "_embedded" : {
    "things" : [ {
      "name" : "Coffee",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/things/1"
        },
        "thing" : {
          "href" : "http://localhost:8080/things/1"
        }
      }
    }, {
      "name" : "Rice",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/things/2"
        },
        "thing" : {
          "href" : "http://localhost:8080/things/2"
        }
      }
    }, {
      "name" : "Sun",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/things/3"
        },
        "thing" : {
          "href" : "http://localhost:8080/things/3"
        }
      }
    } ]
  },
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/things"
    },
    "profile" : {
      "href" : "http://localhost:8080/profile/things"
    }
  },
  "page" : {
    "size" : 20,
    "totalElements" : 3,
    "totalPages" : 1,
    "number" : 0
  }
}
```
