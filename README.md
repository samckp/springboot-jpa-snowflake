
# Spring Boot, JPA with Snowflake

Before running the application please update application.properties 
```
spring.datasource.url=jdbc:snowflake://yourcompany.snowflakecomputing.com/?db=DB_NAME&warehouse=WAREHOUSE_NAME&CLIENT_SESSION_KEEP_ALIVE=true&schema=SCHEMA_NAME
spring.datasource.username=USER_NAME
spring.datasource.password=USER_PWD
```

# In Snowflake create below to test 
```
CREATE TABLE STUDENT (STUDENT_ID NUMBER(4,0), STUDENT_NAME VARCHAR(25), CLASS_ID VARCHAR(10));
INSERT INTO STUDENT VALUES (1, 'RAM', '8');
INSERT INTO STUDENT VALUES (2, 'Mohan', '2');
INSERT INTO STUDENT VALUES (3, 'Biraj', '4');
INSERT INTO STUDENT VALUES (4, 'Sam', '9');
INSERT INTO STUDENT VALUES (5, 'Ravi', '9');
INSERT INTO STUDENT VALUES (6, 'Amit', '4');
```

## Running Locally

To build and run with maven do the following:

```
mvn clean install
mvn spring-boot:run
```

## Testing Local
```
http://localhost:8080/student?studentId={studentId}

Swagger UI: http://localhost:8080
```

## Snowflake references
https://docs.snowflake.net/manuals/user-guide-intro.html