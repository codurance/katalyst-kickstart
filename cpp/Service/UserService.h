#ifndef USER_SERVICE_H
#define USER_SERVICE_H

#include "../Model/User.h"
#include "../Repository/UserRepository.h"
#include <iostream>

using namespace std;

class UserService
{
  private:
    UserRepository* m_repository;

  public:
    int CreateNewUser(User newUser);
    void SetUserRepository(UserRepository* userRepository);
};

#endif