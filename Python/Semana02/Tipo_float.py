# Profundizando en el tipo float
a = 3.0


# Constructor de tipo floar -> puede recibir int y str
a = float(10)_# Le pasamos un tipo entero (int)
a = float('10')
print(f'a: {a:.2f}')

#Notacion exponencial > valores positivos o negativos
a = 3e5
print(f'a: {a}')

a = 3e-5
print(f'a: {a:.5f}')

#Cualquier calculo que incluya un float, todo cambia a Float
a= 4.0 + 5
print(a)
print(type(a))
