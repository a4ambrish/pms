# Developer Machine Setup Guide

This guide will help you set up your development environment on an Ubuntu 22.04 machine. The following tools are required for application development:

- Java
- Docker
- Maven
- HTTPie

## Prerequisites

Ensure your system is up to date:

```sh
sudo apt update
sudo apt upgrade
```

## Install Java

Install OpenJDK:

```sh
sudo apt install openjdk-11-jdk
```

Verify the installation:

```sh
java -version
```

## Install Docker

Install Docker:

```sh
sudo apt install docker.io
```

Start and enable Docker:

```sh
sudo systemctl start docker
sudo systemctl enable docker
```

Verify the installation:

```sh
sudo docker --version
```

## Install Maven

Install Maven:

```sh
sudo apt install maven
```

Verify the installation:

```sh
mvn -version
```

## Install HTTPie

Install HTTPie:

```sh
sudo apt install httpie
```

Verify the installation:

```sh
http --version
```
## Install Visual Studio Code

Install the necessary dependencies:

```sh
sudo apt install software-properties-common apt-transport-https wget
```

Import the Microsoft GPG key:

```sh
wget -q https://packages.microsoft.com/keys/microsoft.asc -O- | sudo apt-key add -
```

Enable the Visual Studio Code repository:

```sh
sudo add-apt-repository "deb [arch=amd64] https://packages.microsoft.com/repos/vscode stable main"
```

Install Visual Studio Code:

```sh
sudo apt update
sudo apt install code
```

Verify the installation:

```sh
code --version
```

## Set Up Remote Development with SSH

Install the Remote Development extension pack in Visual Studio Code on your Windows host.

On your Ubuntu machine, generate an SSH key if you don't have one:

```sh
ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
```

Copy the SSH key to your Windows host:

```sh
ssh-copy-id user@windows-host
```

In Visual Studio Code on your Windows host, open the Command Palette (F1) and select `Remote-SSH: Connect to Host...`. Enter the SSH connection details for your Ubuntu machine.

Your development environment is now set up with Java, Docker, Maven, HTTPie, and Visual Studio Code configured for remote development.


Your development environment is now set up with Java, Docker, Maven, and HTTPie.

## Run PostgreSQL

Before running the microservice, ensure that PostgreSQL is running via Docker on port 5655. Use the following command to start PostgreSQL with the default password set to `postgres`:

```sh
sudo docker run --name postgres-db -e POSTGRES_PASSWORD=postgres -p 5655:5432 -d postgres
```