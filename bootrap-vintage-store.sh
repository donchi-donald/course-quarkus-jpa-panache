#!/usr/bin/env bash
mvn -U io.quarkus:quarkus-maven-plugin:create \
        -DprojectGroupId=com.geek237.quarkus \
        -DprojectArtifactId=vintage-store \
        -DclassName="com.geek237.quarkus.panache.VintageResource" \
        -Dpath="/api/vintage" \
        -Dextensions="jdbc-postgresql, hibernate-orm-panache, resteasy-jsonb"
