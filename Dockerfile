FROM java-11-openjdk
FROM mysql:8.0
copy target/StudentCourseManagement.jar /usr/app/
WORKDIR /usr/app/
# Entry point for running MySQL
ENTRYPOINT ["docker-entrypoint.sh"]
ENTRYPOINT ["java","-jar","StudentCourseManagement.jar"]
