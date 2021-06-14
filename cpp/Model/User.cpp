#include "User.h"

string User::GetUsername()
{
    return this->m_username;
}

void User::SetUsername(string username)
{
    this->m_username = username;
}

string User::GetPassword()
{
    return this->m_password;
}

void User::SetPassword(string password)
{
    this->m_password = password;
}