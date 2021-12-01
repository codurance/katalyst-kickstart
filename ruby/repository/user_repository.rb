# frozen_string_literal: true

require_relative '../model/user'

class UserRepository
  def self.get(username)
    raise NotImplementedError
  end

  def self.add(user)
    raise NotImplementedError
  end
end
