const NumberToRomanize = (num) => {
  const library = {
    M: 1000,
    CM: 900,
    D: 500,
    CD: 400,
    C: 100,
    XC: 90,
    L: 50,
    XL: 40,
    X: 10,
    IX: 9,
    V: 5,
    IV: 4,
    I: 1,
  };
  let roman = "";
  let i;

  for (i in library) {
    while (num >= library[i]) {
      roman += i;
      num -= library[i];
    }
  }
  return roman;
};

export default NumberToRomanize