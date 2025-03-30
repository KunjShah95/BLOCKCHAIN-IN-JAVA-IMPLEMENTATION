# Contributing to Blockchain in Java

👍🎉 First off, thanks for taking the time to contribute! 🎉👍

The following is a set of guidelines for contributing to this Blockchain Implementation in Java project. These are mostly guidelines, not rules. Use your best judgment, and feel free to propose changes to this document in a pull request.

## Table of Contents

- [Code of Conduct](#code-of-conduct)
- [How Can I Contribute?](#how-can-i-contribute)
  - [Reporting Bugs](#reporting-bugs)
  - [Suggesting Enhancements](#suggesting-enhancements)
  - [Your First Code Contribution](#your-first-code-contribution)
  - [Pull Requests](#pull-requests)
- [Styleguides](#styleguides)
  - [Git Commit Messages](#git-commit-messages)
  - [Java Styleguide](#java-styleguide)
  - [Documentation Styleguide](#documentation-styleguide)
- [Development Setup](#development-setup)

## Code of Conduct

This project and everyone participating in it is governed by our Code of Conduct. By participating, you are expected to uphold this code. Please report unacceptable behavior to [your-email@example.com].

## How Can I Contribute?

### Reporting Bugs

This section guides you through submitting a bug report. Following these guidelines helps maintainers and the community understand your report 📝, reproduce the behavior 💻, and find related reports 🔎.

Before creating bug reports, please check the existing issues to see if the problem has already been reported. If it has and the issue is still open, add a comment to the existing issue instead of opening a new one.

> **Note:** If you find a **Closed** issue that seems like it is the same thing that you're experiencing, open a new issue and include a link to the original issue in the body of your new one.

#### How Do I Submit A (Good) Bug Report?

Bugs are tracked as GitHub issues. Create an issue and provide the following information:

* **Use a clear and descriptive title** for the issue to identify the problem.
* **Describe the exact steps which reproduce the problem** in as many details as possible.
* **Provide specific examples to demonstrate the steps**. Include links to files or GitHub projects, or copy/pasteable snippets, which you use in those examples.
* **Describe the behavior you observed after following the steps** and point out what exactly is the problem with that behavior.
* **Explain which behavior you expected to see instead and why.**
* **Include screenshots or animated GIFs** which show you following the described steps and clearly demonstrate the problem.
* **If the problem wasn't triggered by a specific action**, describe what you were doing before the problem happened.

### Suggesting Enhancements

This section guides you through submitting an enhancement suggestion, including completely new features and minor improvements to existing functionality.

#### How Do I Submit A (Good) Enhancement Suggestion?

Enhancement suggestions are tracked as GitHub issues. Create an issue and provide the following information:

* **Use a clear and descriptive title** for the issue to identify the suggestion.
* **Provide a step-by-step description of the suggested enhancement** in as many details as possible.
* **Provide specific examples to demonstrate the steps**.
* **Describe the current behavior** and **explain which behavior you expected to see instead** and why.
* **Explain why this enhancement would be useful** to most users.
* **List some other blockchain implementations or applications where this enhancement exists.**

### Your First Code Contribution

Unsure where to begin contributing? You can start by looking through these `beginner` and `help-wanted` issues:

* [Beginner issues](https://github.com/yourname/blockchain-java/labels/beginner) - issues which should only require a few lines of code, and a test or two.
* [Help wanted issues](https://github.com/yourname/blockchain-java/labels/help%20wanted) - issues which should be a bit more involved than `beginner` issues.

### Pull Requests

* Fill in the required template
* Do not include issue numbers in the PR title
* Include screenshots and animated GIFs in your pull request whenever possible
* Follow the [Java Styleguide](#java-styleguide)
* Include tests for new functionality
* Document new code based on the [Documentation Styleguide](#documentation-styleguide)
* End all files with a newline
* Avoid platform-dependent code

## Styleguides

### Git Commit Messages

* Use the present tense ("Add feature" not "Added feature")
* Use the imperative mood ("Move cursor to..." not "Moves cursor to...")
* Limit the first line to 72 characters or less
* Reference issues and pull requests liberally after the first line
* Consider starting the commit message with an applicable emoji:
    * 🎨 `:art:` when improving the format/structure of the code
    * 🐎 `:racehorse:` when improving performance
    * 🚱 `:non-potable_water:` when plugging memory leaks
    * 📝 `:memo:` when writing docs
    * 🐛 `:bug:` when fixing a bug
    * 🔥 `:fire:` when removing code or files
    * 💚 `:green_heart:` when fixing the CI build
    * ✅ `:white_check_mark:` when adding tests
    * 🔒 `:lock:` when dealing with security
    * ⬆️ `:arrow_up:` when upgrading dependencies
    * ⬇️ `:arrow_down:` when downgrading dependencies

### Java Styleguide

* Use the [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
* 4 spaces for indentation rather than tabs
* Use explicit imports (no wildcard imports)
* Maximum line length of 100 characters
* Always use braces for control statements, even single-line ones
* Comments should be meaningful and provide context, not just restate the code

### Documentation Styleguide

* Use [Javadoc](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html)
* Documentation for methods should include:
  * A brief description of what the method does
  * @param descriptions for each parameter
  * @return description of what is returned
  * @throws for any exceptions that can be thrown

## Development Setup

To set up this project for local development:

1. Fork the repository
2. Clone your fork locally:
   ```bash
   git clone https://github.com/your-username/blockchain-java.git
   cd blockchain-java
   ```
3. Set up the project in your preferred Java IDE
4. Run the tests to make sure everything is working properly:
   ```bash
   javac blockchain/*.java
   java blockchain.WalletTest
   ```

Happy coding! 