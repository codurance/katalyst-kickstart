const LeapYear: any = (year: number) => {
  if (year === undefined || year === null) {
    return null;
  }
  if (year % 100 === 0 && year % 400 !== 0) {
    return false;
  }
  if (year % 400 === 0) {
    return true;
  }
  if (year % 4 !== 0) {
    return false;
  }
  if (year % 4 === 0) {
    return true;
  }
};

export default LeapYear;
