soma = 0
i = 0
j = 0
pf = []
casos = int(input())

while i < casos:
    num = int(input())
    soma = 0
    j = 0
    while j < num:
        if j % 2 == 0:
            soma = soma + 1
        elif j % 2 != 0:
            soma = soma - 1
        j = j + 1
        
    pf.append(soma)
    
    i = i + 1
    
for c in pf:
    print(c)
    