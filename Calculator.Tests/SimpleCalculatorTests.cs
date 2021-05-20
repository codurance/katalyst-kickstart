using NUnit.Framework;

namespace Calculator.Tests
{
    public class SimpleCalculatorTests
    {
        [Test]
        public void Calculator_can_add_two_numbers()
        {
            var simpleCalculator = new SimpleCalculator();

            var result = simpleCalculator.Add(1, 1);

            Assert.AreEqual(result, 2);
        }
    }
}