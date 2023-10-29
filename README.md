**How to deploy these microservices in your local?**

1. Clone or Download this repository.
2. Import all Projects in STS or Eclipse IDE.
3. Update Maven dependencies.(Remove all workspace error)
4. Build and Run the Projects in below sequence.
	1. 1st Deploy & Run **eureka-server**
	2. then Deploy & Run **emp-service**
	3. then Deploy & Run **staff-api**
	4. then Deploy & Run **staff-web**

---

**How to run these microservices in browser?**

These microservices having enabled **springdoc-openapi or Swagger UI**. You need to lunch **staff-web** project which runs in PORT:8090.
**[Link : http://localhost:8090/](http://localhost:8090/)**

You can see all ms running intances in Eureka Server. 
Link : **[http://localhost:8761/](http://localhost:8761/)**

Other MicroServices Swagger links are given below :

**emp-service** link **[link : http://localhost:8000/swagger-ui/index.html](http://localhost:8000/swagger-ui/index.html)**

**staff-api** link **[Link : http://localhost:8010/swagger-ui/index.html](http://localhost:8010/swagger-ui/index.html)**


[If any of your server PORT (8000, 8010, 8090, 8761) is block then change the PORT number inside 'application.properties' (server.port=....) file with respective application.]

---

## Project Design

 **[staff-web]** ----> **[staff-api]** ----> **[emp-service]**

The application **eureka-server** is service registry.

The application **emp-service** is core employee service with Mock data saved in H2 database.

The application **staff-api** is middle layer Staff Location API, consume data from **emp-service**.

The application **staff-web** is front-end UI application, developed using thymeleaf. It consumes data from **staff-api**

All microservices are connected (call other ms) using OpenFeign.[more details..](https://spring.io/projects/spring-cloud-openfeign)

Here Spring Cloud Sleuth provides Spring Boot auto-configuration for distributed tracing [more details...](https://spring.io/projects/spring-cloud-sleuth)

---

