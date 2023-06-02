t=int(input("Qual posição da sequencia vc quer ve? "))
aux=4
n1=2
n2=7
n3=3

if t == 0:
    print("!!!!!ERROOOO!!!!!")
elif t == 1:
    print("Numero de posição 1: {}".format(n1))
elif t == 2:
    print("Numero de posição 1: {}".format(n1))
    print("Numero de posição 2: {}".format(n2))
elif t == 3:
    print("Numero de posição 1: {}".format(n1))
    print("Numero de posição 2: {}".format(n2))
    print("Numero de posição 3: {}".format(n3))
else:
    print("Numero de posição 1: {}".format(n1))
    print("Numero de posição 2: {}".format(n2))
    print("Numero de posição 3: {}".format(n3))
while aux <= t:
    if aux<=t:
        n1=n1*2
        print("Numero de posição {}: {}".format(aux,n1))
        aux=aux+1
        if aux<=t:
            n2=n2*3
            print("Numero de posição {}: {}".format(aux,n2))
            aux=aux+1
            if aux<=t:
                n3=n3*4
                print("Numero de posição {}: {}".format(aux,n3))
                aux=aux+1
            else:
                break
        else:
            break
    else:
        break