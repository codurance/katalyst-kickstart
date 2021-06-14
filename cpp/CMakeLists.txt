cmake_minimum_required(VERSION 3.20.3)

project(Katalyst VERSION 0.1.0)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED True)

include(FetchContent)
FetchContent_Declare(
  googletest
  URL https://github.com/google/googletest/archive/609281088cfefc76f9d0ce82e1ff6c30cc3591e5.zip
)
set(gtest_force_shared_crt ON CACHE BOOL "" FORCE)
FetchContent_MakeAvailable(googletest)

enable_testing()

set(
  SOURCES
  Model/User.cpp
  Model/User.h
  Repository/UserRepository.h
  # Service/UserService.cpp
  Service/UserService.h
  main.cpp
)

add_executable(ServiceTests "${SOURCES}")
target_link_libraries(ServiceTests gtest_main gmock_main)

include(GoogleTest)
gtest_discover_tests(ServiceTests)