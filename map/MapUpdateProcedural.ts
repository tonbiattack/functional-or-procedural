let scores: Map<string, number> = new Map([
  ["Alice", 90],
  ["Bob", 80],
  ["Charlie", 85],
]);

// キーをチェックし、条件に一致する場合は値を更新する
scores.forEach((value, key) => {
  if (key === "Bob") {
    scores.set(key, value + 5);
  }
});

console.log("Updated scores:", scores);
