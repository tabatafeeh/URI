a, b, c = input().split(" ")
a = int(a)
b = int(b)
c = int(c)

if b < a:
    if c >= b:
        print(":)")

if b > a:
    if c <= b:
        print(":(")

if b > a:
    dif = b - a
    if c > b:
        dif2 = c - b
        if dif2 < dif:
            print(":(")

if b > a:
    dif = b - a
    if c > b:
        dif2 = c - b
        if dif2 >= dif:
            print(":)")
            
if b < a:
    dif = a - b
    if c < b:
        dif2 = b - c
        if dif2 < dif:
            print(":)")

if b < a:
    dif = a - b
    if c < b:
        dif2 = b - c
        if dif2 >= dif:
            print(":(")
        
if b == a:
    if c > b:
        print(":)")
    elif c <= b:
        print(":(")


