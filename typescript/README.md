# Typescript basic usage

## Node

You will need to install node to use this repository, I recommend using `nvm`, which can be installed
with `brew install nvm` (this starter assumes you're using node version 17).

## Package manager

In order to test and install dependencies you will need to have installed either `npm` or `yarn` in personal laptop.
before starting run `yarn` or `npm install` to download the dependencies.

## Usage scripts

- `yarn test`: this will run all your tests, if you want to have output for passing tests use `yarn test --verbose`.

- `yarn lint`: this will run the linter in your whole project and let you know if you have compliance issues with the
  code standard.

- `yarn add -D <dependency_name>`: this will let you install a development dependency at a project level, if you want
  production dependencies remove the `-D` flag.
