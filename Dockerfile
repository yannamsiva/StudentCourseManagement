FROM openjdk:11
FROM mysql:8.0
copy target/StudentCourseManagement.jar /usr/app/
WORKDIR /usr/app/
ENTRYPOINT ["java","-jar","StudentCourseManagement.jar"]
