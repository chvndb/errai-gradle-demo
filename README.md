# WORK IN PROGRESS

# Errai & Gradle Demo

Errai demo running on a Wildfly server.

## General

This application demonstrates how GWT & Errai can be setup using Gradle. 
The Gradle compilation outputs an exploded WAR which is then mounted by a dockerized Wildfly instance.

This demo only depends on build-in gradle plugins. 
The main reason is to explain how the gradle build system can be configured for a specific purpose.

## Dependencies

* JDK 8
* Docker >= 1.13.0
* docker-compose >= 1.10.0

## Build and Deploy

Start the application server and compile the source code:

    % ./gradlew start

    % open http://localhost:8080/app

Stop the application server:

    % ./gradlew stop

## Code and Refresh

Start coding and redeploy using:

    % ./gradlew deploy
