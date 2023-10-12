# dar formato a un string

nombre = 'Ariel'
edad = 28
mensaje_con_formato = 'Mi nombre es %s y tengo %d años' % (nombre, edad)

# Creamos una tupla
persona = ('Carla', 'Gómez', 5000.00)
mensaje_con_formato = 'Hola %s %s .Tu sueldo es %.2f' # % persona # Aquí le pasamos el objeto que es tupla
print(mensaje_con_formato%persona)













mensaje = 'Nombre {n} Edad {e} Sueldo {s:.2f}'.format(n=nombre, e=edad, s=sueldo)
# print(mensaje)

diccionario = {'nombre': 'Ivan', 'edad': 35, 'sueldo': 8000.00}
mensaje = 'Nombre {dic[nombre]} Edad {dic[edad]} Sueldo {dic[sueldo]:.2f}'.format(dic=diccionario)
print(mensaje)
