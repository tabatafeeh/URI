from math import ceil

while True:
    try:
        n1, n2, n3 = input().split(" ")
        b = int(n2)
        c = int(n3)
        p = 0
        char = 0
        l = 0
        texto = input().split(" ")
        tam = len(texto)

        while True:
            l = 1
            for i in texto:
                if len(i) + char <= c:
                    char = char + len(i) + 1
                else:
                    char = 0
                    char = char + 1 + len(i)
                    l = l + 1
            break
        p = ceil(l / b)
        print(p)

    except EOFError:
        break
