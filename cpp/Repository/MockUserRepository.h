#ifndef REPO_MOCK_USER_REPOSITORY_H_
#define REPO_MOCK_USER_REPOSITORY_H_

#include <User.h>
#include <UserRepository.h>
#include <gmock/gmock.h>

class MockUserRepository : public UserRepository
{
  public:
    MOCK_METHOD1(GetUser, User*(string& username));
    MOCK_METHOD1(Add, int(User& newUser));
};

#endif