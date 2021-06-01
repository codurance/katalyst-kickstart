using System;

namespace Calculator
{
    public class SimpleCalculator
    {
        public int Sum(params int[] numbers)
        {
            int result = 0;
            foreach (var num in numbers)
            {
                result += num;
            }

            return result;
        }
    }
}
