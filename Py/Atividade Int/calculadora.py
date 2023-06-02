escolha=int(input("Digite 1 para converte decimal para Binário, Octal e Hexadecimal ou digite 2 para calculadora de binario: "))
if escolha==0:
    print("Opção invalido")
else:
    if escolha==1:
        valor=int(input("Entre com o valor em decimal: "))
        print(bin(valor))
        print(oct(valor))
        print(hex(valor))
    else:
        if escolha == 2:
            num1=(input("Entre com o primeiro valor binario: "))
            num2=(input("Entre com o segundo valor: "))
            operador=input("Agora entre com o tipo de opeção que deseja realizar: ")
            if operador == "+":
                sum = bin(int(num1, 2) + int(num2, 2)) 
                print("o resultado da soma é de: "+sum[2:])
            elif operador=="-":
                sum = bin(int(num1, 2) - int(num2, 2)) 
                print("o resultado da subtração é de: "+sum[2:])
            elif operador=="*":
                sum = bin(int(num1, 2) * int(num2, 2)) 
                print("o resultado da multiplicação é de: "+sum[2:])
            elif operador=="/":
                sum = bin(int(num1, 2) // int(num2, 2)) 
                print("o resultado da divisão é de: "+sum[2:])
