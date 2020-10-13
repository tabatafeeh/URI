i = 0

vezes = int(input(""))
lista = []

while i < vezes:
    txt = list(input(""))

    tresP = ''
    tresP1 = ''
    final = ''
    apresentar = ''
    
    tam = len(txt)
    metade = int(tam / 2)
        
    for c in txt:
        asc = ord(c)
        if asc >= 65 and asc <= 90 or asc >= 97 and asc <= 122:
            tresP += chr(ord(c) + 3)
        else:
            tresP += chr(ord(c))
    
    
    aux = list(tresP)
    aux.reverse()
    
    aux2 = list(aux)
    del(aux2[metade:])
    
    for c in aux2:
        tresP1 += chr(ord(c))
    
    for c in aux[metade:]:
        final += chr(ord(c) - 1)
    
    i = i + 1

    lista.append(tresP1 + final)
    
    if i == vezes:
        break
    
i = 0
while i < len(lista):
    print(lista[i])
    i = i + 1