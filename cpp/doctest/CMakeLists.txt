cmake_minimum_required(VERSION 3.20.3)

project(katalyst VERSION 0.0.1)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

# always link the libs folder as this will be
# where our testing tools live
include_directories(libs)

enable_testing()

# we need to add our tests here, they can be aggregated
# by context if required
add_executable(main_test src/main.test.cpp)
add_test(NAME main COMMAND main_test)