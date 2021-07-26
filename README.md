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

⚠️ As the database used is in-memory, changes are not persistent across runs of the program.
 
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
ℹ️ ID is not needed, but can be added in the body. ID is used as a key and is auto-generated.
Therefore it is ignored if given by the user.  

## UPDATE EMPLOYEE RECORD BY ID NUMBER
```
curl -s --header "Content-Type: application/json" \
  --request PUT \
  --data '{"firstName":"Emily","lastName":"Winkleman","role":"Software Engineer II"}' \
  localhost:8090/employees/4
  
  {"id":4,"firstName":"Emily","lastName":"Winkleman","role":"Software Engineer II"}
```
ℹ️ UPDATE EMPLOYEE implemented as a PUT `not` a PATCH method so all the data fields should be provided in the same 
manner as ADD EMPLOYEE. 

# Installation

Issue the command `git clone https://github.com/Itari10/employee-rest` to clone this repository to a Linux system with Docker installed. 

# Execution
After performing the clone, the program's docker container may be started via running the `build-exercise-emily` script found in the 
`build-exercise-emily` directory. You may check that the docker container is running via `docker ps`

```
CONTAINER ID   IMAGE                     COMMAND                  CREATED          STATUS          PORTS                                       NAMES
c21998d6dc5f   exercise-emily-w:latest   "java -jar /exercise…"   25 seconds ago   Up 24 seconds   0.0.0.0:8090->8090/tcp, :::8090->8090/tcp   exciting_pare
```

From there you may use Curl or Postman to interact with the employee API program. When finished with the application you can close the terminal window where the build script was ran from.  Alternatively you can open a new window, run docker ps, find the ID, then docker kill the appropriate container ID.



