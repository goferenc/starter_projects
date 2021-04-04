│   .gitignore
│   pom.xml
│   README.md
│
├───MyEARModule
│   │   .gitignore
│   │   pom.xml
│   │
│   └───src
│       └───main
│           └───application
├───MyEJBModule
│   │   .gitignore
│   │   pom.xml
│   │
│   └───src
│       ├───main
│       │   ├───java
│       │   │   │   MySingletonEJB.java
│       │   │   │   MyStatefulEJB.java
│       │   │   │   MyStatelessEJB.java
│       │   │   │
│       │   │   └───META-INF
│       │   │           beans.xml
│       │   │
│       │   └───resources
│       └───test
│           ├───java
│           └───resources
├───MyJARModule
│   │   .gitignore
│   │   pom.xml
│   │
│   └───src
│       └───main
│           └───java
│                   MyCounter.java
│
└───MyWARModule
    │   .gitignore
    │   .tern-project
    │   pom.xml
    │
    └───src
        └───main
            ├───java
            │       MyApplicationScopedBeanInWAR.java
            │       MyNoneScopedBeanInWAR.java
            │       MyRequestScopedBeanInWAR.java
            │       MySessionScopedBeanInWAR.java
            │       MyViewScopedBeanInWAR.java
            │
            └───webapp
                │   index.jsp
                │   MyJSFPage.xhtml
                │
                └───WEB-INF
                        beans.xml
                        faces-config.xml
                        web.xml

WildFly:

http://127.0.0.1:8080/MyWARModule/MyJSFPage.xhtml

DOCX/JSF_EAR_EJB_example_01_README.docx