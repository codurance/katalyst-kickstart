#include <User.h>
#include <UserRepository.h>

using namespace std;

class UserService
{
  private:
    UserRepository userRepository;

  public:
    int CreateNewUser(User newUser)
    {
        User* existingUser = userRepository.GetUser(newUser.GetUserName());
        if (existingUser != NULL)
        {
            throw;
        }

        return userRepository.Add(newUser);
    }

    void SetUserRepository(UserRepository userRepository)
    {
        this->userRepository = userRepository;
    }
};