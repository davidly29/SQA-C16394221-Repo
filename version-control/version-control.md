# Team Version Control
Version control assists us in the management anc change to documents as well as providing us with a trackable timeline of the projects lifecycle. The version control using in this project was **Github**. When discussing Github it is important to talk about the **Gitflow** and how this helps to assist the development process.

## Git Flow
Git flow is the process of branching in a git project. This process is very useful in collaboration projects and has been adapted and encouraged as a software development "standard practice".

## Advantages of Git Flow
- Allows for parallel development
- Supports fixes
- Develop in isolation
- Promotes the use of a staging area

## Use of Git Flow in this Project

- The creation of a new feature/fix is created on a new branch (This is branched of the main develop branch).
- Upon completion of the branch, a merge request is opened to ask for that branched to be merged into the develop branch.
- Upon review, the branch is then merged into the develop branch, (Note: from here all future branches will be branched of develop as well).
- When the project is ready for release a new branch is created from develop for release. It important to note that no new features should be added to the branch at this stage, and all commits here should only be relating to the deployment of the branch.

Note: the develop branch serves as the main line of "development" and feature production, so in most cases all features should branch from develop (Except in specific circumstances), and similarly all feature branches must be merge back into develop upon completion.

## Branches Created in this Project

All branches created followed the above steps in their lifecycle process

- test-driven-development - [Test Driven Development](https://github.com/davidly29/SQA-C16394221-Repo/tree/test-driven-development)
- test-coverage-doc - [Test Coverage](https://github.com/davidly29/SQA-C16394221-Repo/tree/test-coverage-doc)
- get-all-survey-feature - [Get All Feature](https://github.com/davidly29/SQA-C16394221-Repo/tree/get-all-survey-feature)
- new-question-feature - [New Question Feature](https://github.com/davidly29/SQA-C16394221-Repo/tree/new-question-feature)
- calculation-feature - [Calculation Feature](https://github.com/davidly29/SQA-C16394221-Repo/tree/calculation-feature)
- get-survey-feature - [Get Survey Feature](https://github.com/davidly29/SQA-C16394221-Repo/tree/get-survey-feature)
- survey-response-feature - [Survey Response Feature](https://github.com/davidly29/SQA-C16394221-Repo/tree/survey-response-feature)
- survey-creation-feature - [Survey Creation Feature](https://github.com/davidly29/SQA-C16394221-Repo/tree/survey-creation-feature)
- sprint-planning - [Sprint Planning](https://github.com/davidly29/SQA-C16394221-Repo/tree/sprint-planning)

