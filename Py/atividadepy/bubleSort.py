lista=[4,2,6,7,1,9,10,3,5,8]
lista2=[0,0,0,0,0,0,0,0,0,0]


print(lista)

aux=0
cont=0
cont1= 0
while cont1 < 10:
    while cont<9:
        if lista[cont] > lista[cont+1]:
            aux=lista[cont]
            lista[cont]=lista[cont+1]
            lista[cont+1]=aux
        else:
            lista2=lista
            cont=cont+1
    cont=0        
    cont1+=1
print(lista2)


