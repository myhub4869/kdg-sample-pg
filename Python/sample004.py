namae = input("お名前は？：")

print("性別は？：")
print("1：男性")
print("2：女性")

seibetu = int(input())

if seibetu == 1:
  print(f"{namae}くん、こんにちは！")
elif seibetu == 2:
  print(f"{namae}ちゃん、こんにちは！")
