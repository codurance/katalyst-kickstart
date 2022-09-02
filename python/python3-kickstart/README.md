# Python Basic Usage

## Install Python 
First, we need to have Python in our environment. Depending on the environment, there is more than one way to install Python.

#### Mac OS/Linux
Python is preinstall on Mac and Linux, but it is likely to be outdated.

We can check the currently installed version with the following command 

```
$ python --version
3.10.6
```

Python can be upgraded to the latest version with the help of `brew` package manager.
```
brew upgrade python
```

#### Windows
There are a couple of ways to get Python installed on Windows.
* Microsoft Store
* Running `Chocolatey` command, a package manager for windows\
  `choco install python`

## Packaging and Dependency management
**Python Pip** is a default package manager for Python and it is used to install the packages that do not comes with Python.

**Poetry** is another packaging and dependency management tool in Python. It offers sophisticated features that "pip" lacks such as dependency management.  

## Execute Tests
`pytest` command automatically looks for the tests and executes them.