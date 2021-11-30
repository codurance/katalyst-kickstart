# frozen_string_literal: true

require_relative '../../model/user'

RSpec.describe User do
  let(:username) { Faker::Name.name }
  let(:password) { Faker::DcComics.hero }

  subject { User.new(username, password) }

  describe 'attribute readers' do
    it 'exposes the username for reading' do
      expect(subject.username).to eq(username)
    end

    it 'exposes the password for reading' do
      expect(subject.password).to eq(password)
    end

    it 'does not expose the username for writing' do
      expect { subject.username = 'Bob' }.to raise_error NoMethodError
    end

    it 'does not expose the password for writing' do
      expect { subject.password = 'hacked' }.to raise_error NoMethodError
    end
  end
end
