v = int(input())
i = 0

while i < v:
    n, m = input().split(" ")
    n = int(n)
    m = int(m)
    tam = n ** m
    tam = str(tam)
    tam = list(tam)
    print(len(tam))
    
    i = i + 1