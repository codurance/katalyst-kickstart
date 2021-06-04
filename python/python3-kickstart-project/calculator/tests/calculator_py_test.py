import pytest

from calculator.calculator import summarize


def test_sum_numbers():
    """This is an example of a simple unit test using pytest"""
    assert summarize(4, 2) == 6


@pytest.mark.parametrize(
    "x, y, result",
    [
        pytest.param(
            2, 3, 5
        ),
        pytest.param(
            6, 0, 6
        ),
        pytest.param(
            4, -2, 2
        ),
    ],
)
def test_sum_numbers__parametrized(x, y, result):
    """This is an example of a parametrized unit test using pytest"""
    assert summarize(x, y) == result


