def main():
  print('''
Inserte una de las siguinetes opciones:
  (1) Insertar
  (2) Actualizar
  (3) Eliminar
  (4) Salir
  ''')
  inp = int(input())
  
  if inp == 1:
    insert()
  elif inp == 2:
    update()
  elif inp == 3:
    delete()
  elif inp == 4:
    print("Adios")
    return
  else:
    print("Valor no valido intente de nuevo")
  main()

def insert():
  print("Deveria insertar")

def update():
  print("Deveria actualizar")

def delete():
  print("Deveria borrar")

main()
