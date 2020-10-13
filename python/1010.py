# -*- coding: utf-8 -*-

a, b, c = input().split(" ")
a = int(a)
b = int(b)
c = float(c)
# b = int(input(""))
# c = float(input(""))
d, e, f = input().split(" ")
d = int(d)
e = int(e)
f = float(f)
# e = int(input(""))
# f = float(input(""))
tot = (b * c) + (e * f)

print("VALOR A PAGAR: R$ %.2f" %tot)