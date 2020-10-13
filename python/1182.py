matriz = []
num = 0
soma = 0
media = 0
j = 0

i = int(input())
op = input()

# criando a matriz

for c in range(12):
    linha = []
    for d in range (12):
        num = float(input())
        linha.append(num)
    matriz.append(linha)




while j <= 11:
    soma = soma + matriz[i][j]
    j = j + 1

    
if op == 'S' and num != 0:
    print('{:.1f}'.format(soma))
    
elif op == 'M':
    media = soma / 12
    print('{:.1f}'.format(media))    
