using Calculator.Model;

namespace Calculator.Repository
{
    public interface IUserRepository
    {
        User GetUser(string userName);

        int Add(User newUser);
    }
}
