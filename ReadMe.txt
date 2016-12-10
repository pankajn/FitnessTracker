Use SPRING 3.2.3.RELEASE and above if using jdk1.8 else the deployed application won't work and 
the Context initialization get failed with java.lang.IllegalArgumentException

- Use Spring 4 with java8 or spring 3 with java7.

Also update the Apache Tomcat from 7.0.0 to 7.0.73 in 
Eclipse->Windows->Preferences->server->Runtime Environment and updated the tomcat installation 
directory.
Fix for Issue: 
java.io.ObjectInputStream cannot be resolved. It is indirectly referenced from required .class files 

Updated xstream jar from 1.3.1 to 1.4.9. As the old jar does not have class com.thoughtworks.xstream.io.naming.NameCoder
