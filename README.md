# WORK IN PROGRESS

# Errai Demo

This application demonstrates how Errai can be setup using Gradle and Docker. 
The Gradle compilation outputs an exploded WAR which is then mounted by a dockerized Wildfly instance.

## Prerequisites

* docker
* docker-compose

## Build and Deploy

Start the application server and compile the source code:

    % ./gradlew start
    
    % open http://localhost:8080/app

Stop the application server:

    % ./gradlew stop

## Code and Refresh

Start coding and redeploy using:

    % ./gradlew deploy
