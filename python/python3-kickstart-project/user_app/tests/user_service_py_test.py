from unittest.mock import Mock

import pytest

from model.user import User
from user_app.user_service import UserService, DuplicateUserException


test_user = User('test_user_name', 'test_password')


@pytest.fixture
def mocked_user_repository():
    return Mock()


@pytest.fixture
def user_service(mocked_user_repository):
    return UserService(mocked_user_repository)


def test_raise_exception_when_adding_existing_user(mocked_user_repository, user_service):
    """This is an example of a test using pytest with mocks checking for an exception"""
    mocked_user_repository.get.return_value = User('', '')

    with pytest.raises(DuplicateUserException):
        user_service.create_user(test_user)

    mocked_user_repository.get.assert_called_once_with(test_user.username)


def test_add_user(mocked_user_repository, user_service):
    """This is an example of a test using pytest with mocks"""
    expected_id = 1
    mocked_user_repository.get.return_value = None
    mocked_user_repository.add.return_value = expected_id

    assert user_service.create_user(test_user) == expected_id
    mocked_user_repository.get.assert_called_once_with(test_user.username)
    mocked_user_repository.add.assert_called_once_with(test_user)
