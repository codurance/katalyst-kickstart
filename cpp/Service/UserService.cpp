#include "UserService.h"

int UserService::CreateNewUser(User newUser)
{
    string username = newUser.GetUsername();

    User* existingUser = this->m_repository->GetUser(username);
    if (existingUser != NULL)
    {
        return -1;
    }

    this->m_repository->Add(&newUser);

    return 0;
}

void UserService::SetUserRepository(UserRepository* repository)
{
    this->m_repository = repository;
}