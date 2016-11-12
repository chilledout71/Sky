Building the application
1) navigate to the catalogueService directory
2) type mvn package

the to run the application
1) java -jar \target\catalogueService-0.0.1-SNAPSHOT.jar
2) in the browser navigate to 

http://localhost:8080/?custId=lonCust	- for a london customer
http://localhost:8080/?custId=liverCust  - for a liverpool customer
http://localhost:8080/?custId=			 - for a non location customer

To ShutDown the application in a terminal run the following 
 curl -X POST localhost:8080/shutdown

