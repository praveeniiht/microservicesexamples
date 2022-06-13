# microservicesexamples

Steps for running the microservices

Step - 1 : Download all the services from the git and import it into your IDE.

Step- 2: Start the Eureka Service by running the public static void main for servicediscovery project.

Step -3: Start the Gateway service by running the public static void main for netflixgateway project.

Step - 4: Start the noteservice and comment service by running the respective projects.

Step - 5: Once all the services are up and running you can check it from eureka server by visiting the eureka server dasboard with url;

http://localhost:8761

Step - 6: once the gateway is started, you can call the services through the gateway only.

eg> http://localhost:8761/note-service/notes/all
    http://localhost:8761/comment-service/comments/all
    
 You can check the controller class for each service for exact rest end point to call.
 
 

