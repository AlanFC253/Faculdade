g1=int(input("qual a quantidade que o gato 1 come ao dia em gramas? "))
g2=int(input(" qual a quantidade que o gato 2 come ao dia em gramas? "))
saco=float(input("qual a quantidade em kilos? "))
g1= g1/1000
g2= g2/1000
somagatos = g1 + g2
em5dias= somagatos * 5
resto = saco - em5dias
print(f"em 5 dias a quantidade de ração restante sera de: {resto:5.2f}")