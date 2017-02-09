# Errai & Gradle Demo

Errai demo running on a Wildfly server.

### General

A showcase on how GWT & Errai can be setup using Gradle.
The Gradle compilation outputs an exploded WAR which is then mounted by a dockerized Wildfly instance.

This demo only depends on build-in gradle plugins.
It tries to explain what inputs are required for GWT and Errai to generate the required outputs.
The main purpose of this demo is to understand the full build process.

### Dependencies

* JDK 8
* Docker >= 1.13.0
* docker-compose >= 1.10.0

### Build and Deploy

Clone the repository

    % git clone https://github.com/chvndb/errai-gradle-demo.git

    % cd errai-gradle-demo

Compile the source code, start the application server and deploy:

    % ./gradlew start

    % open http://localhost:8080/errai-gradle-demo

Stop and clean up the application server:

    % ./gradlew stop

### Development

Any code changes can be redeployed without restarting the application server.
Start coding and redeploy with:

    % ./gradlew redeploy

Compilation is separated in front-end (client) and back-end (server).
To avoid long recompilation, only the parts that changed will be recompiled.

### Super dev mode

When only working on the front-end code, it is possible to enable super dev mode of GWT for quick front-end redeployment.
Run the following blocking command:

    % ./gradlew gwtDev

Redeployment happens automatically on browser page refresh.
