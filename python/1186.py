matriz = []
j = 12
num = 0
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
    j = j - i
    while j < 12:
        if i == 0:
            matriz[i][j] = matriz[i][j]
        else:
            soma = soma + matriz[i][j]
            j = j + 1
            
    i = i + 1
    
    
if entrada == 'S' and num != 0:
    print('{:.1f}'.format(soma))
    
elif entrada == 'M':
    media = soma / 66
    print('{:.1f}'.format(media))    
