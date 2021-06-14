#ifndef USER_H
#define USER_H

#include <iostream>

using namespace std;

class User
{
  private:
    string m_username;
    string m_password;

  public:
    User();
    User(string username, string password);
    ~User();
    string GetUsername();
    void SetUsername(string username);
    string GetPassword();
    void SetPassword(string password);
};

#endif