from unittest import TestCase
from python3_kickstart import greetings_package

class Test_Greetings_Package(TestCase):
    def test_hello(self):
        greeting = greetings_package.hello()
        self.assertEqual(greeting, "helooo")