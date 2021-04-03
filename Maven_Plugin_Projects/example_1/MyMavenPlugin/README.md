│   .gitignore
│   pom.xml
│   README.md
│
└───src
    ├───main
    │   ├───java
    │   │       MyMojo.java
    │   │
    │   └───resources
    └───test
        ├───java
        └───resources

-----------------------------
How to use it:
-----------------------------

<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>gf</groupId>
	<artifactId>MyFirst</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<build>
        <plugins>
        
            <plugin>
                <groupId>gf</groupId>
                <artifactId>MyMavenPlugin</artifactId>
                <version>0.0.1-SNAPSHOT</version>
                <configuration>
                    <!-- String myProperty -->
                    <myProperty>Hi from pom</myProperty>
                </configuration>
                <executions>
                    <execution>
                        <goals>
                            <goal>My_Maven_Plugin</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
            
        </plugins>
    </build>
</project>