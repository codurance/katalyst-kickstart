#include <User.h>
#include <UserRepository.h>

using namespace std;

class UserService
{
  private:
    UserRepository* userRepository;

  public:
    int CreateNewUser(User& newUser);
    void SetUserRepository(UserRepository& userRepository);
};