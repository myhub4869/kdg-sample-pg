import random

money = random.randint(1, 100)
love = random.randint(1, 100)
health = random.randint(1, 100)
total = int((money + love + health) / 3)

print(f"金　運: {money}")
print(f"恋愛運: {love}")
print(f"健康運: {health}")
print(f"総合運: {total}")
