class Person:
    def __init__(self, id, name):
        self.id = id
        self.name = name


people = [
    Person(1, "Alice"),
    Person(2, "Bob"),
    Person(3, "Charlie")
]

target_id = 2
target_person = next(
    (person for person in people if person.id == target_id), None)

if target_person:
    print(f"Found person with ID {target_id}: {target_person.name}")
else:
    print(f"No person found with ID {target_id}")
