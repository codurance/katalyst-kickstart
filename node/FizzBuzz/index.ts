const FizzBuzz: any = (number: number) => {
  if (number === undefined || number === null) {
    return null;
  }

  if (number % 3 === 0 && number % 5 === 0) {
    return "FizzBuzz";
  }
  if (number % 3 === 0) {
    return "Fizz";
  }

  if (number % 5 === 0) {
    return "Buzz";
  }
  return number;
};

export default FizzBuzz;
