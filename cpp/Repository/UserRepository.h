#ifndef REPO_USER_REPOSITORY_H_
#define REPO_USER_REPOSITORY_H_

#include <User.h>

class UserRepository
{
  public:
    virtual User* GetUser(string& username);
    virtual int Add(User& newUser);
};

#endif