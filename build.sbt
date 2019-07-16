name := "Spring_Scala_Oracle_POC"

version := "0.1"

scalaVersion := "2.13.0"

// https://mvnrepository.com/artifact/org.scala-lang/scala-library
libraryDependencies += "org.scala-lang" % "scala-library" % "2.11.10"

// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa
libraryDependencies += "org.springframework.boot" % "spring-boot-starter-data-jpa" % "2.1.6.RELEASE"

// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web
libraryDependencies += "org.springframework.boot" % "spring-boot-starter-web" % "2.1.6.RELEASE"

// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-tomcat
libraryDependencies += "org.springframework.boot" % "spring-boot-starter-tomcat" % "2.1.6.RELEASE"

// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools
libraryDependencies += "org.springframework.boot" % "spring-boot-devtools" % "2.1.6.RELEASE"

// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test
//libraryDependencies += "org.springframework.boot" % "spring-boot-starter-test" % "2.1.6.RELEASE" % Test

// https://mvnrepository.com/artifact/mysql/mysql-connector-java
//libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.16"

// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-parent
libraryDependencies += "org.springframework.boot" % "spring-boot-starter-parent" % "2.1.6.RELEASE" pomOnly()

//https://mvnrepository.com/artifact/com.oracle/ojdbc7
//libraryDependencies += "com.oracle" % "ojdbc7" % "10.2.0.1"

// https://mvnrepository.com/artifact/com.opencsv/opencsv
libraryDependencies += "com.opencsv" % "opencsv" % "4.1"

// https://mvnrepository.com/artifact/org.hibernate/hibernate-core
libraryDependencies += "org.hibernate" % "hibernate-core" % "5.4.3.Final"

// https://mvnrepository.com/artifact/org.scala-lang/scala-reflect
libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.13.0"
