# -*- coding: utf-8 -*-

while True:
    try:
        sentence = input()
        sentence = list(sentence)
        a = True
        
        for i in range(0, len(sentence)):
            
                if a == True:
                    sentence[i] = sentence[i].upper()
                    #se o anterior for minusculo(true) o atual vira maiusculo
                else:
                    sentence[i] = sentence[i].lower()
                
                    
                if sentence[i] == " ":
                    i = i
        
                else:
                    if sentence[i].islower():
                        a = True
                    else:
                        a = False
                    
        
        for i in range(0, len(sentence)):
            print(sentence[i], end="")
        print()
    
    except EOFError:
        break
        