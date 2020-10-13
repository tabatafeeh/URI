# -*- coding: utf-8 -*-

i = 0
r = 0
while i <= 9999:
    senha = int(input(""))
    r = senha - 1
    print(r)
    if senha == 9999:
        break
