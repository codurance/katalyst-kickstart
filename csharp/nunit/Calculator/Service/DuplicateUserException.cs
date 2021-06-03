namespace Calculator.Service
{
    public class DuplicateUserException : System.Exception
    {
        public DuplicateUserException(string s) : base(s)
        {
        }
    }
}