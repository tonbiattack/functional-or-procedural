let scores: Map<string, number> = new Map([
  ["Alice", 90],
  ["Bob", 80],
  ["Charlie", 85],
]);

// 条件に一致するキーの値を更新した新しいMapを作成する
let updatedScores: Map<string, number> = new Map(
  Array.from(scores.entries()).map(([key, value]) => {
    return [key, key === "Bob" ? value + 5 : value];
  })
);

console.log("Updated scores:", updatedScores);
