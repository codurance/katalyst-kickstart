import unittest
from unittest.mock import Mock


from model.user import User
from user_app.user_service import DuplicateUserException, UserService


class UserServiceShould(unittest.TestCase):

    def setUp(self):
        self.mocked_user_repository = Mock()
        self.user_service = UserService(self.mocked_user_repository)
        self.test_user = User('test_name', 'test_password')

    def test_add_user(self):
        """This is an example of a test using pytest with mocks"""
        expected_id = 1
        self.mocked_user_repository.get.return_value = None
        self.mocked_user_repository.add.return_value = expected_id

        self.assertEqual(self.user_service.create_user(self.test_user), expected_id)
        self.mocked_user_repository.get.assert_called_once_with(self.test_user.username)
        self.mocked_user_repository.add.assert_called_once_with(self.test_user)

    def test_raise_exception_when_adding_existing_user(self):
        """This is an example of a test using unittest with mocks checking for an exception"""
        self.mocked_user_repository.get.return_value = User('', '')

        with self.assertRaises(DuplicateUserException):
            self.user_service.create_user(self.test_user)
        self.mocked_user_repository.get.assert_called_once_with(self.test_user.username)

