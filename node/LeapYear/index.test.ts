import LeapYear from "./index";

describe("Should be a test LeapYear", () => {
  test("should be a null (pass nothing to params)", () => {
    expect(LeapYear()).toBe(null);
  });
  test("should be a null (pass undefined to params)", () => {
    expect(LeapYear(undefined)).toBe(null);
  });
  test("should be a null (pass null to params)", () => {
    expect(LeapYear(null)).toBe(null);
  });

  test("should not be a leap year", () => {
    expect(LeapYear(1997)).toBe(false);
  });
  test("should be a leap year", () => {
    expect(LeapYear(1996)).toBe(true);
  });
  test("should be a leap year", () => {
    expect(LeapYear(1600)).toBe(true);
  });
  test("should not be a leap year", () => {
    expect(LeapYear(1800)).toBe(false);
  });
});
