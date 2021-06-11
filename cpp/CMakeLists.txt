cmake_minimum_required(VERSION 3.20.3)

project(katalyst VERSION 0.0.1)

set(CMAKE_C_STANDARD 99)
set(CMAKE_CXX_STANDARD 11)
set(CMAKE_POSITION_INDEPENDENT_CODE ON)

enable_testing()

include_directories(.)
include_directories(Model)
include_directories(Repository)
include_directories(Service)

# now to include the Google test framework
include(FetchContent)
FetchContent_Declare(
  googletest
  URL https://github.com/google/googletest/archive/609281088cfefc76f9d0ce82e1ff6c30cc3591e5.zip
)
set(gtest_force_shared_crt ON CACHE BOOL "" FORCE)
FetchContent_MakeAvailable(googletest)

# we need to add our tests here, they can be aggregated by context if required
add_executable(ServiceTests UserServiceTests.cpp)
target_link_libraries(ServiceTests gtest_main)

include(GoogleTest)
gtest_discover_tests(ServiceTests)