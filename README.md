# Github action test
Exercises to practice CI/CD with github actions

## Setup
First of all, fork this repository, after that clone into your local machine.
```bash
git clone https://github.com/your-user-name/github-action-test.git
```

You'll find a [java application](devops/src/main/java/com/nttdata/devops/controller/NumberController.java) that exponse a REST API which divides two numbers passed as parameters. Also, you'll find an example of a github action file in [here](examples/ci.yml), take a look before starting.

> *Anyway, you can use your microservice or microfronted instead of the java application.*

## Requirements

* Docker
* Dockerhub account
* Git 

## TODO

- [ ] Code simple unit test for the service
- [ ] Create a docker image for this service 
- [ ] Create a pipeline with github action which includes:
    - [ ] Checkout the code from the repository
    - [ ] Run unit tests
    - [ ] Run vulnerabililty scan of your code with trivy
    - [ ] Build the docker image
    - [ ] Push docker image to your docker registry
- [ ] Download the docker image from your docker registry and run into your local machine
- [ ] Do a request to your microservice
- [ ] Do a change in the code and push it to your repository
- [ ] Download from dockerhub the new image and test your new change
- [ ] Do a change in tests to force failing and push to your repository

### Tips

1. You've to create a dockerhub account, then you've to create two secrets in your github repository. See [this example](examples/ci.yml)
2. Remember to create in dockerhub the repository where you're going to upload your image, the name should be the same you've in your github action.
3. Your github repository should be public in order to activate Github Code Scanning
4. Remember to expose port 8080 when running your docker container

