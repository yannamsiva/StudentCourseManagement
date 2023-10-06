FROM openjdk11
copy target/StudentCourseManagement.jar /usr/app/
WORKDIR /usr/app/
# Entry point for running MySQL
ENTRYPOINT ["java","-jar","StudentCourseManagement.jar"]
