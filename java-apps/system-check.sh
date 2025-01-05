#!/bin/bash

# Function to check if a command exists
command_exists() {
    command -v "$1" >/dev/null 2>&1
}

# Function to check if a port is listening 
port_is_listening() { 
netstat -an | grep -w "LISTEN" | grep -q "$1"
}
# Check Java
if command_exists java; then
    echo "Java is installed"
else
    echo "Java is not installed"
fi

# Check Maven
if command_exists mvn; then
    echo "Maven is installed"
else
    echo "Maven is not installed"
fi

# Check VS Code
if command_exists code; then
    echo "VS Code is installed"
else
    echo "VS Code is not installed"
fi

# Check Docker
if command_exists docker; then
    echo "Docker is installed"
else
    echo "Docker is not installed"
fi

# Check Httpie
if command_exists http; then
    echo "Httpie is installed"
else
    echo "Httpie is not installed"
fi

# Check if port 5644 is listening 
if port_is_listening 5655; then 
	echo "Port 5655 is running. Please make sure it is a postgres instance " 
else 
	echo "Port 5655 is not listening. You can run postgres using docker \n $ docker run -p 5655:5432 --name postgres-db-pms -e POSTGRES_PASSWORD=postgres -d postgres" 
fi

