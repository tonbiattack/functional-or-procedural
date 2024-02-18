const numbers = [1, 2, 3, 4, 5];

const sum = numbers.reduce((acc, current) => acc + current, 0);
const average = sum / numbers.length;

console.log("Average:", average);