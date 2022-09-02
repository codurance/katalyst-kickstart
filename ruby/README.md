# Ruby Usage Basics

## Install Ruby

You'll need to install ruby into your environment. The recommended strategy is to use some form of ruby version manager. Most Rubyists are familiar with rvm or rbenv, which each have their pro's and con's. This project was set up with ruby 2.7.4.

- https://github.com/rbenv/rbenv
- https://rvm.io/

## Install Dependencies

Dependencies in ruby are managed with the gem (package) called bundler, which comes packaged in modern ruby installs by default. If your ruby environment is sufficiently configured, you should be able to simply use the command `bundle` to install the dependencies described in the Gemfile.

In case bundler is not available to you out of the box, use the command `sudo gem install bundler` to get it installed.

## Execute Tests

The command `rspec`, will automatically look in the "spec" folder for test files which name ends in "\_spec" and executes them.

## Code Quality Checks

Most rubyists are familiar with Rubocop for ensuring a baseline of code quality. The command `rubocop` will identify any code quality issues, while the command `rubocop -A` will automatically fix most issues, though at the risk of potentially damaging your code, so be sure to check that it still works after the changes have been made. 
