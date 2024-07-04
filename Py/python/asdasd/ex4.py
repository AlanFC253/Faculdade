x=1
n=0
while x <= 5:
    numero=int(input("digite um numero "))
    n= numero + n
    x = x + 1
print("A soma dos numeros sao: {}".format(n/(x-1)))