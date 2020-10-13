matriz = []
j = 1
num = 0
pm = 0
soma = 0
media = 0
i = 0

entrada = input()

for c in range(12):
    linha =[]
    for d in range (12):
        num = float(input())
        linha.append(num)
    matriz.append(linha)



while j <= 11:
    while i < j:
        soma = soma + matriz[i][j]
        i = i + 1
    j = j + 1
    i = 0
    
if entrada == 'S' and num != 0:
    print('{:.1f}'.format(soma))
    
elif entrada == 'M':
    media = soma / 66
    print('{:.1f}'.format(media))    