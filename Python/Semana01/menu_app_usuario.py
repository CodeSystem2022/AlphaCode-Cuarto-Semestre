from capa_datos_persona.usuario_dao import UsuarioDAO
from logger_base import log
Opcion = None
while opcion != 5:
    print('Opciones: ')
    print('1. Listar Usuario')
    print('2. Agregar Usuario')
    print('3. Modificar Usuario')
    print('4. Eliminar Usuario')
    print('5. Salir')
    opcion = int(input('Digite la opcion (1-5): '))
    if opcion == 1:
        usuarios = UsuarioDAO.seleccionar()
        for usuario in usuarios:
            log.info(usuario)
    elif opcion == 2:
        username_var = input('Digite el nombre de usuario: ')
        password_var = input('Digite su contraseña: ')
        usuario = Usuario(username=username_var, password=password_var)
        usuario_insertado = usuarioDAO.insertar(usuario)
        log.info(f'Usuario insertado: {usuario_insertado}')
else:
    log.info('Salimos de la aplicacion, Hasta pronto!!!')