# Java
<h1>Java school courses with the use of Bean Session, GlassFish, API QUery and PostgreSQL.</h1>

Implementation of Java Beans, Bean Session with Stateful and Stateless, for the understanding of the difference between Stateful and Stateless Beans, Object Serialization, API Query, SQL in Java, EJB. Furthermore, I introduced my self to the building of a Java app : .jar compression, java compilator, PostgreSQL database and GlassFish server.


<h2>TP 1</h2>    

** In "Server" dir  
// Compile files in "Server" File  
javac *a  

// Create an archive (example)  
mkdir META-INF  
jar cvf Exo1.jar *s META-INF  

// Watch an archive without opening it  
jar tvf Exo1.jar  
    
// Start asadmin  
asadmin start-domain    

//deploy an archive
asadmin deploy --force Exo1.jar

** In "Client" dir 
// Compile Client  (example):  
javac -classpath Exo1.jar Client.java  
java -cp "%CLASSPATH%;Exo1.jar" --add-opens java.base/java.lang=ALL-UNNAMED Client    

<h2>TP 2</h2>     

** In "Server" dir  
javac biblio\\*a  
del emprunt\*_*
jar cvf TP2.jar biblio\\*s META-INF\\\*xml    

** In "Client" dir  
Copy the TP2.jar to the client directory 
asadmin deploy --force TP3.jar 
javac -classpath TP2.jar Client.java  
java -cp "%CLASSPATH%;TP2.jar" --add-opens java.base/java.lang=ALL-UNNAMED Client    


<h2>TP 3</h2>    
** In "Server" directory 
javac emprunt\\*a  
del emprunt\\\*_*  
jar cvf TP3.jar emprunt\\*s META-INF\\\*xml  
  

** In "Client" directory  
Copy the TP3.jar to the client directory  
asadmin deploy --force TP3.jar  
javac -classpath TP3.jar Client.java  
java -cp "%CLASSPATH%;TP3.jar" --add-opens java.base/java.lang=ALL-UNNAMED Client    
