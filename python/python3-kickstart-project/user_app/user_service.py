# public class UserService {
#
#     private UserRepository userRepository;
#
#     public int createNewUser(User newUser) throws DuplicateUserException {
#         if (userRepository.getUser(newUser.getUserName()) != null) {
#             throw new DuplicateUserException("User with name " + newUser.getUserName() + " is already registered");
#         }
#
#         return userRepository.add(newUser);
#     }
#
#     public void setUserRepository(UserRepository userRepository) {
#         this.userRepository = userRepository;
#     }
# }
from model.user import User
from repository.user_repository import UserRepository


class DuplicateUserException(Exception):
    pass


class UserService:

    def __init__(self, user_repository: UserRepository):
        self.user_repository = user_repository

    def create_user(self, user: User) -> int:
        if self.user_repository.get(user.username):
            raise DuplicateUserException(f'{user.username} already exists in our system')
        return self.user_repository.add(user)