#!/usr/bin/env bash
mvn -U io.quarkus:quarkus-maven-plugin:create \
        -DprojectGroupId=com.geek237.quarkus \
        -DprojectArtifactId=artist \
        -DclassName="com.geek237.quarkus.jdbc.ArtistResource" \
        -Dpath="/api/artist" \
        -Dextensions="jdbc-mysql, quarkus-agroal, resteasy-jsonb"
