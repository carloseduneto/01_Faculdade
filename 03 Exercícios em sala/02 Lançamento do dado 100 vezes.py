print('#percentual de faces "6"')
dado=100
vetorDado=[]
lado1=0
lado2=0
lado3=0
lado4=0
lado5=0
lado6=0
ladoNenhum=0


for d in range (dado):
    from random import randint
    faceDado=(randint(1,6))
    vetorDado.append(faceDado)

    if faceDado==1:
        lado1+=1

    elif faceDado==2:
        lado2+=1

    elif faceDado==3:
        lado3+=1
    
    elif faceDado==4:
        lado4+=1
    
    elif faceDado==5:
        lado5+=1
    
    elif faceDado==6:
        lado6+=1

    else:
        ladoNenhum+=1

total=lado1 + lado2 + lado3 + lado4 + lado5 + lado6
media= (lado6/total)*100

print(f"O percentual é {media:.0f}% de faces 6 ")


import random as rnd #importa uma biblioteca ("as" dá um apelido) 
VetorFaces=[] #vetores para colchetes

for i in range (300):
    numero=rnd.randint(1,6)
    VetorFaces.append(numero)
    print(f"Sorteados: {VetorFaces}")
print("<3"*30)

ocorrencias=[]
for i in range (1,7):
    quantidade=VetorFaces.count(i)
    ocorrencias.append(quantidade)
    print(f"Número {i}", end=" ")
    print("▦"*quantidade)

