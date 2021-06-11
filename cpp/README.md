# C++ Mock-Driven Unit Testing with Google Test

This repository will require some manual configuration for your environments.

## Getting Started

Please make sure you have C++ compiler available in your environment path, as well as `cmake`. If
you satisfy this requirement, then you can simply run the following to build and kick-off the tests.

### CMaking
Simply `cd` to wherever you have cloned this code, and run `cmake -S . -B build`.

### Testing
Once `cmake` has done it's, and you have a `build` folder present in this directory, simply run
`ctest --test-dir build` and you _should_ see a failing test, as expected.