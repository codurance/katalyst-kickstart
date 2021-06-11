#ifndef USER_H
#define USER_H

#include <iostream>

using namespace std;

class User
{
  private:
    string _username;
    string _password;

  public:
    string GetUserName()
    {
        return _username;
    };
    void SetUserName(string userName)
    {
        _username = userName;
    };
    string GetPassword()
    {
        return _password;
    };
    void SetPassword(string password)
    {
        _password = password;
    };
};

#endif