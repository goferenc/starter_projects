│   .gitignore
│   build.properties
│   plugin.xml
│   README.md
│
├───icons
│       eclipse128.png
│       eclipse16.png
│       eclipse256.png
│       eclipse32.png
│       eclipse48.png
│       eclipse512.png
│       eclipse64.png
│
├───lib
│       antlr-2.7.7.jar
│       byte-buddy-1.10.2.jar
│       classmate-1.5.1.jar
│       dom4j-2.1.1.jar
│       FastInfoset-1.2.15.jar
│       hibernate-commons-annotations-5.1.0.Final.jar
│       hibernate-core-5.4.10.Final.jar
│       hibernate-entitymanager-5.4.10.Final.jar
│       istack-commons-runtime-3.0.7.jar
│       jandex-2.1.1.Final.jar
│       javassist-3.24.0-GA.jar
│       javax.activation-api-1.2.0.jar
│       javax.persistence-api-2.2.jar
│       jaxb-api-2.3.1.jar
│       jaxb-runtime-2.3.1.jar
│       jboss-logging-3.3.2.Final.jar
│       jboss-transaction-api_1.2_spec-1.1.1.Final.jar
│       mssql-jdbc-8.2.2.jre8.jar
│       stax-ex-1.8.jar
│       txw2-2.3.1.jar
│
├───META-INF
│       MANIFEST.MF
│
└───src
    └───main
        ├───java
        │   └───gf
        │       ├───dao
        │       │       Dao.java
        │       │       EmployeeDao.java
        │       │
        │       ├───entities
        │       │       Employee.java
        │       │
        │       ├───rcp
        │       │       Activator.java
        │       │       Application.java
        │       │       ApplicationActionBarAdvisor.java
        │       │       ApplicationWorkbenchAdvisor.java
        │       │       ApplicationWorkbenchWindowAdvisor.java
        │       │       Perspective.java
        │       │       View.java
        │       │
        │       ├───services
        │       │       EmployeeService.java
        │       │
        │       └───util
        │               SessionUtil.java
        │
        └───resources
                hibernate.cfg.xml

Created by: Ferenc Gonda

Example:
Eclipse RCP + Hibernate