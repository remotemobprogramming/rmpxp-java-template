# 'The Remote Mob Programming Experience' Java Template

## Installation

- 'mob' tool https://mob.sh
- JDK 11 https://adoptopenjdk.net/
- An IDE of your choice (IntelliJ IDEA is recommended)
- OPTIONAL (only necessary for React development): Node.js 14

## Project

- Java 11
- JUnit 5
- Maven 3
- OPTIONAL (only necessary for React development): Node.js 14 in folder `react-app`

## Check that everything works on your machine:

1. Run `mob moo` on your console. It should moo.
2. Run `./mvnw test` in the checked out git repository. The one and only test should be green.
3. Import the project in your IDE and run the tests.
4. OPTIONAL (only necessary for React development): inside the `react-app` folder run `yarn` to download the internet in your `node_modules` folder. Run the tests with `yarn test --watchAll=false`.