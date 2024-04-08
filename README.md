# Unit Testing Tasks

Welcome, dear student! In this repository, you will find 5 simple tasks designed to help you grasp the fundamentals of unit testing. These tasks are inspired by real-life scenarios extracted from larger projects.

## Purpose
The main objective of these tasks is to familiarize you with the workings of unit testing. Through completing them, you will gain insight into:

- Writing effective unit tests
- Creating meaningful and informative test names
- Debugging errors in tests
- Getting knowledge about code-coverage.

## Tasks Overview
Below is a brief overview of the tasks:

1. **Task 1:** Implement and correct unit tests for a basic calculator class.
2. **Task 2:** Refctor existing tests in order to get them "green". Tests are written against the rules (wrong names, testing all methods in one test etc...)
3. **Task 3:** Refactoring tests in order to remove redundant code using JUnit annotations - @BeforeEach, and @AfterEach.
4. **Task 4:** Implement tests that check if tested class throws exception when given wrong input data.
5. **Task 5:** Adding tests in order to get all tested class covered by unit tests. 

## Getting Started
You can do tasks in two ways. If you dont feel confident with git, follow first step. However,  if you want to learn a little bit more - follow second step. Choice is yours :)

### 1. Work in your own IDE, and check if tests are passing. 

You can do it by executing `mvn test -Dtest="NameOfTestClass"` command in console or simply clicking "play" buttons.

![image](https://github.com/ursus164/ProjectJPWP/assets/101526933/af2a9fba-22c5-423c-a288-2ca852a362ca)


### 2. Work with testing automation based on GitHub workflows - as in real life.
  
After completing each task, you can check if tests are "green". However, usually in production repository, some sort of integration workflow will be implemented. For example, we can add extra verification by GIT if some bugfix or commit is pushed into the branch - better not trust "Mr. Smith" that every test passes succesfully. Automatic code verification is more trustworthy. If your code passes that verification it can be automaticlly merged into main branch (after approval). 

`To get started, fork this repository to your local machine and navigate to the project directory. `

![image](https://github.com/ursus164/ProjectJPWP/assets/101526933/9f70c5c7-8c66-4bac-b5d9-f8dc03bcc17f)

Create a new branch when working on each task (e.g `git checkout -b task_1_fix` , `git checkout -b task_2_fix` ...). - you can do it in the project folder via IDE terminal.When you think that task is finished, do commands below:

![image](https://github.com/ursus164/ProjectJPWP/assets/101526933/457d17ad-b9d9-4909-a35e-66c5f3165d74)


Now, you can check if your solution is correct by making pull request to the main repository -  `git add .` , then `git commit -am "solution"` and `git push --set-upstream origin "name_of_your_branch"`. 

![image](https://github.com/ursus164/ProjectJPWP/assets/101526933/3de7e9c1-4e82-4787-87cd-98d5075c8393)


In console you will see link to create `pull request` - click on it. 

When `pull request` is created, and accepted by me (repository owner) GitHub will show you if all tests pass ("are green") .

![image](https://github.com/ursus164/ProjectJPWP/assets/101526933/e5b6be46-c760-4392-b9f8-29d8d61075c3)

![image](https://github.com/ursus164/ProjectJPWP/assets/101526933/65483407-3ebc-467f-9595-e1d9435fc297)

If your solution is correct, it will be seen as valid for merging into main branch.

`Note that below informations are showed only to the repository owner. However, I can share screen and you can see if your solution is correct :)`

![image](https://github.com/ursus164/ProjectJPWP/assets/101526933/a4235f08-ce93-44b3-823e-569d720ab446)

Feel free to reach out if you have any questions.

`Using IntelliJ is recommended, but you can use any IDE you want`

## How to Run Tests
The tests for each task are provided in the `tests` folder within each task's directory. To run the tests, follow these steps:

1. Navigate to the task folder (e.g., `task1`, `task2`, etc.)
2. Open a terminal or command prompt in that folder
3. Run the command to execute the tests (e.g., `mvn test -Dtest="NameOfTestClass"`)

## Need Help?
If you encounter any difficulties or have questions, do not hesitate to ask! Feel free to create an issue in this repository, and I'll be happy to assist you.

Good luck with the tasks, and happy testing! 🚀
