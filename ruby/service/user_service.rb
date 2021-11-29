require_relative "../model/user.rb"
require_relative "../repository/user_repository.rb"


class DuplicateUserException < StandardError; end


class UserService

    def initialize(user_repository)
        @user_repository = user_repository
    end

    def create_user(user)
        raise DuplicateUserException, "#{user.username} already exists in our system" if @user_repository.get(user.username)

        @user_repository.add(user)
    end
end