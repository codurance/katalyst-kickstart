import NumberToRomanize from "./index";

describe("Should be a test Numeral to Roman", () => {
  test("should be IV", () => {
    expect(NumberToRomanize(4)).toBe("IV");
  });
  test("should be IX", () => {
    expect(NumberToRomanize(9)).toBe("IX");
  });
  test("should XXIX", () => {
    expect(NumberToRomanize(29)).toBe("XXIX");
  });
  test("should LXXX", () => {
    expect(NumberToRomanize(80)).toBe("LXXX");
  });
  test("should CCXCIV", () => {
    expect(NumberToRomanize(294)).toBe("CCXCIV");
  });
  test("should MMXIX", () => {
    expect(NumberToRomanize(2019)).toBe("MMXIX");
  });
});
