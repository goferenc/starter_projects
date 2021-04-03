│   .gitignore
│   pom.xml
│   README.md
│
└───src
    ├───main
    │   ├───java
    │   └───resources
    │       ├───archetype-resources
    │       │       pom.xml
    │       │
    │       └───META-INF
    │           └───maven
    │                   archetype-metadata.xml
    │
    └───test
        ├───java
        └───resources

-----------------------------
How to use it:
-----------------------------

mvn archetype:generate                       ^
  -DarchetypeGroupId=gf                      ^
  -DarchetypeArtifactId=MyMavenArchetype     ^
  -DarchetypeVersion=0.0.1-SNAPSHOT     