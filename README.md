# mkj_challenge
Challenge problems - solved in Java.

## How to run:
1. Build step: 
    - Run the following command in the root directory: ``mvn clean install``
    - If you do not have Maven installed, you can use the included maven wrapper plugin: ``./mvnw clean install`` for UNIX systems and 
      ``.\mvnw.cmd clean install`` for Windows (_Note that this command downloads required jar files for the project, which may take some time. 
      The downloaded files will be located by default in ~/.m2/repository for UNIX systems and C:\Users\username\\.m2\repository for Windows systems_)
2. Run step:
    - Navigate into the target folder after the build step is completed and run ``java -jar mkj_challenge-1.0-SNAPSHOT.jar`` for interactive console output.
