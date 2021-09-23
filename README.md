# Github action test
Exercises to practice CI/CD with github actions

## Setup
First of all, fork this repository, after that clone into your local machine.
```bash
git clone https://github.com/your-user-name/github-action-test.git
```

You'll find a java application that exponse a REST API which divides two numbers passed as parameters. Also, you'll find an example of a github action file in [here](examples/ci.yml), take a look before starting.

> *Anyway, you can use your microservice or microfronted instead of the java application.*

## Requirements

* Docker
* Git 

## TODO

- [ ] Code simple unit test for the service
- [ ] Create a docker image for this service 
- [ ] Create a pipeline with github action which includes:
    - [ ] Checkout the code from the repository
    - [ ] Build the docker image
    - [ ] Run unit tests
    - [ ] Run vulnerabililty scan of your code with trivy
    - [ ] Compile your application
    - [ ] Print the name of the generated jar file



