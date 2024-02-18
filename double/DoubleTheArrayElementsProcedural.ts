function doubleTheArrayElementsProcedural(numbers: number[]): number[] {
  const doubledNumbers: number[] = [];
  for (const number of numbers) {
    doubledNumbers.push(number * 2);
  }
  return doubledNumbers;
}

const numbers = [1, 2, 3, 4, 5];
const doubledNumbers = doubleTheArrayElementsProcedural(numbers);
console.log(doubledNumbers);
