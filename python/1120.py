x = []
control = 0

while 1:
    i = 0
    tecla, txt = input("").split(" ")
    
    if tecla == '0' and txt == '0':
        break
    
    x = list(txt)
    aux = list(txt)
    
    for um in x:
        if um == tecla:
            del(aux[i])
            i = i
        else:
            i = i + 1
        
    if len(aux) > 0:
        elemento = aux[0]
        
    i = 0
    for c in aux:
        if aux[i] == '0':
            i = i + 1
            control = 1
        else:
            break
    del(aux[0:i])
    
    if len(aux) == 0:
        aux.append(0)
        print(aux[0])
    elif len(aux) >= 1 and aux[0] != '0':
        print(*aux, sep = "")
    elif aux[0] == '0' and control == 0: 
        print(aux[0])
    