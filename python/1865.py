num = int(input())
resp = []
i = 0

while i < num:
    nome, forca = input().split(" ")
    if nome == "Thor":
        resp.append("Y")
    else:
        resp.append("N")
    
    i = i + 1
    
for x in resp:
    print(x)