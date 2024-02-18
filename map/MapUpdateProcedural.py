scores = {
    "Alice": 90,
    "Bob": 80,
    "Charlie": 85
}

# キーをチェックし、条件に一致する場合は値を更新する
if "Bob" in scores:
    scores["Bob"] += 5

print("Updated scores:", scores)
