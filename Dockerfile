FROM java-11-openjdk
copy target/StudentCourseManagement.jar /usr/app/
WORKDIR /usr/app/
# Entry point for running MySQL
ENTRYPOINT ["java","-jar","StudentCourseManagement.jar"]
