#include "Model/User.h"
#include "Repository/UserRepository.h"
#include "Service/UserService.h"
#include "gmock/gmock.h"
#include "gtest/gtest.h"
#include <iostream>

using namespace std;
using namespace testing;

class MockUserRepository : public UserRepository
{
  public:
    MOCK_METHOD1(GetUser, User*(string& username));
    MOCK_METHOD1(Add, int(User* newUser));
};

TEST(ServiceTests, NoDuplicateUserTest)
{
    string username = "some_user";

    // Let's create our new user
    User newUser;
    newUser.SetUsername(username);

    // Set up our mock and intended behaviour
    User duplicateUser = User(username, "password");
    MockUserRepository mockRepository;
    EXPECT_CALL(mockRepository, GetUser(username)).Times(1).WillOnce(Return(&duplicateUser));

    // Now, invoke the action and...
    UserService service;
    service.SetUserRepository(&mockRepository);

    // assert we have the expected outcome
    int newUserResult = service.CreateNewUser(newUser);
    EXPECT_EQ(newUserResult, -1);
};