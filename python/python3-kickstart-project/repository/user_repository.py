from model.user import User


class UserRepository:

    def get(self, username: str) -> User:
        raise NotImplementedError

    def add(self, user: User):
        raise NotImplementedError
