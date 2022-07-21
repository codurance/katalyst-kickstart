# Katalyst Kickstarter 🚀

This repository contains a starting project in multiple languages in order for you to get started with your TDD learning
or practicing. If you see a language missing that you would like us to add
please [raise an issue](https://github.com/codurance/katalyst-kickstart/issues), and we will happily add it (or just
raise a [pull request](https://github.com/codurance/katalyst-kickstart/pulls) with the desired template).

## What's in the templates?

- A "blank" project to get you up and running quickly 💨
- Test runner setup and example tests 👩🏽‍💻

### How to use the templates

This repository can get quite large, and pulling down all the starters is not ideal, if you don't want to `git clone`
the whole project you can follow the following steps:

1. Run a filtered clone that pulls nothing that you are not using:
    ```
   git clone \
    --depth 1 \
    --filter=blob:none \
    --sparse \
    git@github.com:codurance/katalyst-kickstart.git
   ```
2. Once you've cloned the repo go into it by `cd katalyst-kickstart`.
3. To pull the starter of your desired language simply run `git sparse-checkout set <directory>`. eg: if I want to
   download the C# starter I would run `git sparse-checkout set csharp` as `csharp` is the name of the directory.
4. Once you've done this, you can go into the directory and start crafting ⚒️

## Looking for a good kata? 🥋

**Katalyst** refers to [katalyst.codurance.com](https://katalyst.codurance.com/), a website providing katas for
learning, teaching and practicing test-driven-development.

Obviously you can use the templates in this repo for any TDD practice. If you want some recommendations check out these:

- [**FizzBuzz**](https://katalyst.codurance.com/fizzbuzz) – a perfect intro to classic TDD
- [**Roman Numerals**](https://katalyst.codurance.com/roman-numerals) – another classic kata for mastering TDD
  fundamentals
- [**Gilded Rose**](https://katalyst.codurance.com/gilded-rose) – designed to practice introducing tests and features to
  legacy code
- [**Mars Rover**](https://katalyst.codurance.com/mars-rover) – a great kata to practice solving a state based problem
- [**Bank Kata**](https://katalyst.codurance.com/bank) – often cited as the kata for practicing Outside-In TDD
- [And more...](https://katalyst.codurance.com/browse) 
