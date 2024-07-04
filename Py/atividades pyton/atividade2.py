x = float(input("Entre com a medida do lado 1 do triangulo: "))
y = float(input("Entre com a medida do lado 2 do triangulo: "))
z = float(input("Entre com a medida do lado 3 do triangulo: "))


if x<=0 or y<=0 or z<=0 :
    print("Erro, valores nulos não fazem um triangulo")
else:
    if x>=y+z or y>=z+x or z>=x+y :
        print("Triangulo inexistente.")
    else:
        if x==y and y==z :
            print("Sera um Triangulo equilatero.")
        elif x==y or y==z or z==x:
            print("Sera um Triangulo isosceles.")
        else:
            print("Sera um Triangulo escaleno.")