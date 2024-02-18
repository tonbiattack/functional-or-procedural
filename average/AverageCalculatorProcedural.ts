const numbers: number[] = [1, 2, 3, 4, 5];

const sum: number = numbers.reduce(
  (acc: number, current: number) => acc + current,
  0
);
const average: number = sum / numbers.length;

console.log("Average:", average);
