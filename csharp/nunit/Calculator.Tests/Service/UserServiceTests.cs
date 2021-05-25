using Moq;
using Calculator.Repository;
using Calculator.Service;
using Calculator.Model;
using NUnit.Framework;

namespace CalculatorTests.Service
{
    public class UserServiceTests
    {
        private Mock<IUserRepository> mockedUserRepository;
        private UserService userService;
        private User testUser;

        [SetUp]
        public void SetUp()
        {
            mockedUserRepository = new Mock<IUserRepository>();

            userService = new UserService();
            userService.SetUserRepository(mockedUserRepository.Object);

            testUser = new User();
            testUser.SetUserName("testName");
            testUser.SetPassword("testPassword");
        }

        /**
         * This test method demonstates how one can configure mocks and
         * how we can test if particular exception was thrown
         * @throws DuplicateUserException
         */
        [Test]
        public void Throws_expected_exception_when_adding_duplicate_user()
        {
            mockedUserRepository.Setup(repo => repo.GetUser(It.IsAny<string>())).Returns(new User());

            Assert.Throws<DuplicateUserException>(() => userService.CreateNewUser(testUser));
        }

        /**
         * This test method demonstrates mock configuration and how
         * one can verify that mock indeed was called
         */
        [Test]
        public void Can_add_new_user()
        {
            int expectedId = 1;

            mockedUserRepository.Setup(repo => repo.GetUser(It.IsAny<string>())).Returns<User>(null);

            mockedUserRepository.Setup(repo => repo.Add(testUser)).Returns(expectedId);

            int actualId = userService.CreateNewUser(testUser);

            Assert.AreEqual(expectedId, actualId);
            mockedUserRepository.Verify(repo => repo.Add(It.IsAny<User>()), Times.Once());
        }
    }
}