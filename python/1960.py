num = int(input())
fin = []

while num > 0:
    while num >= 1000:
        num = num - 1000
        fin.append('M')
    while num >= 500:
        if num >= 900:
            fin.append('CM')
            num = num - 900
        else:
            num = num - 500
            fin.append('D')
    while num >= 100:
        if num >= 400:
            fin.append('CD')
            num = num - 400
        else:
            num = num - 100
            fin.append('C')
    while num >= 50:
        if num >= 90:
            fin.append('XC')
            num = num - 90
        else:
            num = num - 50
            fin.append('L')
    while num >= 10:
        if num >= 40:
            fin.append('XL')
            num = num - 40
        else:
            num = num - 10
            fin.append('X')
    while num >= 5:
        if num == 9:
            fin.append('IX')
            num = num - 9
        else:
            num = num - 5
            fin.append('V')
    while num >= 1:
        if num == 4:
            num = num - 4
            fin.append('IV')
        else:    
            num = num - 1 
            fin.append('I')

for i in fin:
    print(i, end='')
print()