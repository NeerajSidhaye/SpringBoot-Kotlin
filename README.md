# Kotlin REST API with Spring-boot, Spring-Data, H2 In-Memory DB
This demo project explains REST API development with Kotlin with Spring Boot.

##### Needed gradle dependencies
```
	compile('com.fasterxml.jackson.module:jackson-module-kotlin')
	compile("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	compile("org.jetbrains.kotlin:kotlin-reflect")
```

![Project_Structure](img/project_str.PNG)

### Building the Application
 
> gradle clean build

### Running the application
Go to the build/libs folder and run below

> java -jar SpringBootKotlinRestAPI-0.0.1-SNAPSHOT.jar


Hit url 
http://localhost:8080/parkrun/

Response:
```
{
    "_links": {
        "runners": {
            "href": "http://localhost:8080/parkrun/runners"
        },
        "profile": {
            "href": "http://localhost:8080/parkrun/profile"
        }
    }
}
```

#### Explore other end points

GET - http://localhost:8080/parkrun/runners

POST - http://localhost:8080/parkrun/runners

Sample request body:
```
 {
        "firstName": "Andy",
        "lastName": "Tey",
        "gender": "M",
        "runningClub": "Swindon"
 }
```
GET - http://localhost:8080/parkrun/runners/2

DELETE - http://localhost:8080/parkrun/runners/2

### Find detailed explanation on this at my blog
https://extremeportal.blogspot.com
 
