**The Data of "Auth-App" application**
1. Serving url: http://localhost:8080/api/users  (POST method)
2. Users data:
   1) login: petrova@gmail.com , password:  Irina111
   2) login: ivanov@gmail.com , password:  Ivan1111
3. The example of JSON request:
   {
   "login": "petrova@gmail.com",
   "password": "Irina111"
   }


**How to run "Auth-App" application**

To run the application by commandline:
1. Prerequisites: maven version 3.6.3 and above, jdk11
2. Installing: open a commandline in main folder that contains project pom.xml file and use following commands:

- **mvn clean**
- **mvn compile**
- **mvn package**

3. After previous paragraph you will get a war file in target folder:

-  **target/auth-app-1.0-SNAPSHOT.war**

4. To run the "auth-app-1.0-SNAPSHOT.war", enter in commandline:
```
java -jar target/auth-app-1.0-SNAPSHOT.war
```




