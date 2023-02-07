#!/usr/bin/env bash
mvn -U io.quarkus:quarkus-maven-plugin:create \
        -DprojectGroupId=com.geek237.quarkus \
        -DprojectArtifactId=customer \
        -DclassName="com.geek237.quarkus.jdbc.CustomerResource" \
        -Dpath="/api/customer" \
        -Dextensions="jdbc-mariadb, hibernate-orm, resteasy-jsonb"
