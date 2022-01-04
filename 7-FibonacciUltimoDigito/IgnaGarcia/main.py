import sys

memo = { 0: 1, 1: 1 }

def fibonacci(n):
    if memo.get(n) != None:
        memo[n]
    else:
        memo.update({n: fibonacci(n - 1) + fibonacci(n - 2)})

    return memo[n]


def main():
    if len(sys.argv) < 2:
        for j in range(0, 100):
            res = 0
            resList = []
            for i in range(0,j):
                res += fibonacci(i)
            print(f'{j} = {repr(res)[-1]}')
    else:
        n = int(sys.argv[1])
        res = 0
        for i in range(0,n):
            res += fibonacci(i)
        print(f'{n} = {repr(res)[-1]}')


main()