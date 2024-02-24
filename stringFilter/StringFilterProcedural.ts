const names: string[] = ["Alice", "Bob", "Charlie", "David"];
const filteredNames: string[] = [];
for (const name of names) {
  if (name.startsWith("C")) {
    filteredNames.push(name);
  }
}
console.log("Names starting with 'C':", filteredNames);
