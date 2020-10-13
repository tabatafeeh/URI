a, b = input().split(" ")
a = int(a)
b = int(b)
i = 0

rq = divmod(a, abs(b))

if b < 0:
    print(-(rq[0]), (rq[1]))
else:
    print(rq[0], rq[1])