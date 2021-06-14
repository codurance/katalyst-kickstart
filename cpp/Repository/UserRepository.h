#ifndef USER_REPOSITORY_H
#define USER_REPOSITORY_H

#include "../Model/User.h"
#include <iostream>

using namespace std;

class UserRepository
{
  public:
    virtual User* GetUser(string& username) = 0;
    virtual int Add(User* newUser) = 0;
};

#endif