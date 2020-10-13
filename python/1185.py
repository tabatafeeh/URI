matriz = []
j = 0
y = 11
num = 0
pm = 0
soma = 0
media = 0
i = 0

entrada = input()

for c in range(12):
    linha = []
    for d in range (12):
        num = float(input())
        linha.append(num)
    matriz.append(linha)

while i <= 11:
    while j < y:
        soma = soma + matriz[i][j]
        j = j + 1
    i = i + 1
    y = y - 1
    j = 0
    
if entrada == 'S' and num != 0:
    print('{:.1f}'.format(soma))
    
elif entrada == 'M':
    media = soma / 66
    print('{:.1f}'.format(media))    
