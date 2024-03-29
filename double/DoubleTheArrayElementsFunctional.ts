function doubleTheArrayElementsFunctional(numbers: number[]): number[] {
  return numbers.map((number) => number * 2);
}

const numbers = [1, 2, 3, 4, 5];
const doubledNumbers = doubleTheArrayElementsFunctional(numbers);
console.log(doubledNumbers);
