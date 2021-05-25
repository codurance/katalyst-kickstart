using Calculator.Model;
using Calculator.Repository;

namespace Calculator.Service
{
    public class UserService
    {
        private IUserRepository userRepository;

        public int CreateNewUser(User newUser)
        {
            if (userRepository.GetUser(newUser.GetUserName()) != null)
            {
                throw new DuplicateUserException("User with name " + newUser.GetUserName() + " is already registered");
            }

            return userRepository.Add(newUser);
        }

        public void SetUserRepository(IUserRepository userRepository)
        {
            this.userRepository = userRepository;
        }
    }
}