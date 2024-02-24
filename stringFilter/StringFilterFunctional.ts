const names: string[] = ["Alice", "Bob", "Charlie", "David"];
const filteredNames: string[] = names.filter((name: string) =>
  name.startsWith("C")
);
console.log("Names starting with 'C':", filteredNames);
