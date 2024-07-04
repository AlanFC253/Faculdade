slinicial = 1000
aumento = 1.5*1000/100
ano = 2007

while ano <= 2022:
    salario = slinicial + aumento 
    aumento = aumento * 2
    slinicial = salario 
    print(f"o salario no ano {ano}", "eh de R$", salario)
    ano = ano + 1
