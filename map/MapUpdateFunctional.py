scores = {
    "Alice": 90,
    "Bob": 80,
    "Charlie": 85
}

# 条件に一致するキーの値を更新した新しい辞書を作成する
updated_scores = {key: value + 5 if key ==
                  "Bob" else value for key, value in scores.items()}

print("Updated scores:", updated_scores)
