# frozen_string_literal: true

require_relative '../model/user'
require_relative '../repository/user_repository'

class DuplicateUserException < StandardError; end

class UserService
  def initialize(user_repository)
    @user_repository = user_repository
  end

  def create_user(user)
    if @user_repository.get(user.username)
      raise DuplicateUserException,
            "#{user.username} already exists in our system"
    end

    @user_repository.add(user)
  end
end
