# employee-rest
 Spring Boot Employee REST API
 
 This sample REST API for employee data was developed in Eclipse with spring boot and uses JPA to access an in memory H2 database. POSTMAN and Curl were 
 used during the development process.
 
 It supports the following 4 operations:
 1. GET ALL EMPLOYEES [HTTP GET]
 2. GET SPECIFIC EMPLOYEE BY ID NUMBER [HTTP GET]
 3. ADD EMPLOYEE [HTTP POST]
 4. UPDATE EMPLOYEE RECORD BY ID NUMBER [HTTP PUT]

The application is dockerized and runs on port 8090
 
## GET ALL EMPLOYEES

```
curl  -s localhost:8090/employees | jq
[
  {
    "id": 1,
    "firstName": "Emily",
    "lastName": "Winkleman",
    "role": "Full Stack Developer"
  },
  {
    "id": 2,
    "firstName": "Jing",
    "lastName": "Fang",
    "role": "Squad Architect"
  },
  {
    "id": 3,
    "firstName": "Todd",
    "lastName": "Schultz",
    "role": "Software Developer"
  }
]
```

## GET SPECIFIC EMPLOYEE BY ID NUMBER
```
 curl  -s localhost:8090/employees/2 | jq
{
  "id": 2,
  "firstName": "Jing",
  "lastName": "Fang",
  "role": "Squad Architect"
}

```

## ADD EMPLOYEE
```
curl -s --header "Content-Type: application/json" \
  --request POST \
  --data '{"firstName":"Emily","lastName":"Winkleman","role":"Software Engineer"}' \
  localhost:8090/employees
  
  {"id":4,"firstName":"Emily","lastName":"Winkleman","role":"Software Engineer"}
```
  
# Installation

Issue the command `git clone https://github.com/Itari10/employee-rest` to clone this repository to a Linux system with Docker installed. 
