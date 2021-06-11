#include <User.h>
#include <UserService.h>
#include <gtest/gtest.h>

TEST(UserServiceTests, CanCallMock)
{
    // Please comment this code in when you have mitigated all
    // path/environment issues
    // MockUserRepository mockUserRepository = new MockUserRepository();

    // UserService* userService = new UserService();
    // userService->SetUserRepository(&mockUserRepository);

    // User* newUser = new User();
    // userService->CreateNewUser(&newUser);

    // Please ensure this test fails as expected
    EXPECT_STRNE("a", "a");
};