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
You can do tasks in two ways:

1. Work in your own IDE, and check if tests are passing. You can do it by executing `mvn test -Dtest="NameOfTestClass"` command in console.

2. Work with testing automation based on GitHub workflows - as in real life. After completing each task, you can check if tests are "green". However, usually in production repository some sort of workflow will be implemented. For example addtional verification if code provided by each programmer is correct. If so, it can be automaticlly merged into main branch (after approval). To get started, fork this repository to your local machine and navigate to the project directory. Create a new branch when working on each task (e.g `git checkout -b task_1_fix` , `git checkout -b task_2_fix` ...). - you can do it in the project folder via IDE terminal. Each task is in its respective folder along with instructions on what to do. 
When you complete the task, you can check if your solution is correct by making pull request to the main repository -  `git add .` , then `git commit -am "bugfix"` and `git push`. In console you will see link to create `pull request` - click on it. When `pull request` is created GitHub will show you if all tests pass ("are green") .Feel free to reach out if you have any questions.

`Using IntelliJ is recommended, but you can use any IDE you want`

## How to Run Tests
The tests for each task are provided in the `tests` folder within each task's directory. To run the tests, follow these steps:

1. Navigate to the task folder (e.g., `task1`, `task2`, etc.)
2. Open a terminal or command prompt in that folder
3. Run the command to execute the tests (e.g., `mvn test -Dtest="NameOfTestClass"`)

## Need Help?
If you encounter any difficulties or have questions, do not hesitate to ask! Feel free to create an issue in this repository, and I'll be happy to assist you.

Good luck with the tasks, and happy testing! 🚀
