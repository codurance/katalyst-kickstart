#include <User.h>
#include <UserRepository.h>
#include <UserService.h>

int UserService::CreateNewUser(User& newUser)
{
    User* existingUser = userRepository.GetUser(newUser.GetUserName());
    if (existingUser != NULL)
    {
        throw DuplicateUserException;
    }

    return userRepository.Add(newUser);
}

void UserService::SetUserRepository(UserRepository userRepository)
{
    userRepository = userRepository;
}