import FizzBuzz from "./index";

describe("Should be a test FizzBuzz", () => {
  test("should be a null (pass nothing to params)", () => {
    expect(FizzBuzz()).toBe(null);
  });

  test("should be a null (pass undefined to params)", () => {
    expect(FizzBuzz(undefined)).toBe(null);
  });

  test("should be a null (pass null to params)", () => {
    expect(FizzBuzz(null)).toBe(null);
  });

  test("should be a number", () => {
    expect(FizzBuzz(1)).toBe(1);
  });

  test("should be a Fizz", () => {
    expect(FizzBuzz(3)).toBe("Fizz");
  });

  test("should be a Buzz", () => {
    expect(FizzBuzz(5)).toBe("Buzz");
  });

  test("should be a FizzBuzz", () => {
    expect(FizzBuzz(15)).toBe("FizzBuzz");
  });
});
