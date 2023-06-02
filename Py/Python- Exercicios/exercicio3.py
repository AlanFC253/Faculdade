carteira=float(input("Quantos reais voce tem? R$"))
dolar=carteira/5.80
marcoAlemão=carteira/3.0
libraEsterlina=carteira/6.57
print("Em dolares voce tem: US${:.2f}".format(dolar))
print("Em marco alemão: BAM{:.2f}".format(marcoAlemão))
print("Em libra esterlina: £{:.2f}".format(libraEsterlina))