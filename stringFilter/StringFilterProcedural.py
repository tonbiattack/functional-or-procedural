names = ["Alice", "Bob", "Charlie", "David"]
filtered_names = []
for name in names:
    if name.startswith("C"):
        filtered_names.append(name)
print("Names starting with 'C':", filtered_names)
