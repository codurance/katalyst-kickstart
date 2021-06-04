import unittest

from calculator.calculator import summarize


class CalculatorShould(unittest.TestCase):
    """This is an example of a simple unit test using built-in unittest library"""

    def test_sum_numbers(self):
        self.assertEqual(summarize(4, 2), 6)
