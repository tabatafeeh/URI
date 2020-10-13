n = int(input())

while n > 0:
    words = input()
    half = int(len(words) / 2)
    sepWord1 = words[0:half]
    sepWord2 = words[half:]
    sepWord1 = list(sepWord1)
    sepWord2 = list(sepWord2)
    
    sepWord1.reverse()
    sepWord2.reverse()
    
    for i in range(0, len(sepWord1)):
        print(sepWord1[i], end="")    
        
    for i in range(0, len(sepWord2)):
        print(sepWord2[i], end="")
    
    print()
    
    n -= 1

