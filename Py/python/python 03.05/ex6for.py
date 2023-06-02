salario= 1000.00
per=1.5
for x in range(2005, 2023, 1):
    print(f"ano {x} salario {salario:6.2f}")
    salario=salario+(salario*(per/100))
    per= per *2