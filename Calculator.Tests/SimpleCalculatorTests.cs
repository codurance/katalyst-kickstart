using NUnit.Framework;

namespace Calculator.Tests
{
    public class SimpleCalculatorTests
    {
        private SimpleCalculator calculator;

        [SetUp]
        public void SetUp()
        {
            calculator = new SimpleCalculator();
        }

        /**
         * This method demonstrates a very basic unit test
         */
        [Test]
        public void Calculator_should_add_simple_numbers()
        {
            Assert.AreEqual(6, calculator.Sum(4, 2));
        }

        /**
         * This method demonstrates a parametrized test case
         */
        [Test]
        [TestCase(1, 1, 2)]
        [TestCase(2, 2, 4)]
        [TestCase(3, 3, 6)]
        [TestCase(4, 4, 8)]
        public void Calculator_should_add_simple_numbers_parameterised(int num1, int num2, int result)
        {
            Assert.AreEqual(result, calculator.Sum(num1, num2));
        }
    }
}