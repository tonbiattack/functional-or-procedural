class Person {
  constructor(public id: number, public name: string) {}
}

const people: Person[] = [
  new Person(1, "Alice"),
  new Person(2, "Bob"),
  new Person(3, "Charlie"),
];

const targetId = 2;
let targetPerson: Person | undefined;

for (const person of people) {
  if (person.id === targetId) {
    targetPerson = person;
    break;
  }
}

if (targetPerson) {
  console.log(`Found person with ID ${targetId}: ${targetPerson.name}`);
} else {
  console.log(`No person found with ID ${targetId}`);
}
