q = float(input( "Qual a quantidade de quilowatt que a casa usa? "))
salario = float(input("quanto esta sendo o salario minimo? "))
valorQui= salario/5
valorApagar= q*valorQui
descontoApagar = valorApagar-(valorApagar*15/100)

print(f"o valor de cada quilowatt é de : {valorQui:5.2f}")
print(f"o valor a paga por essa  residencia sera: {valorApagar:5.2f}")
print(f"o valor a ser pago com desconto de 15%: {descontoApagar:5.2f}")
