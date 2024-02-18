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
target_person = None
for person in people:
    if person.id == target_id:
        target_person = person
        break

if target_person:
    print(f"Found person with ID {target_id}: {target_person.name}")
else:
    print(f"No person found with ID {target_id}")
