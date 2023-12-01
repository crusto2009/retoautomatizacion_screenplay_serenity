#language: es
  Característica: Agregar producto al carrito

    Antecedentes: Inicio de sesion en la pagina web del exito
      Dado que el usuario se encuentre en la pagina web
      Cuando el usuario ingresa email y contrasena
      Y de clic en el boton entrar


    @addProduct
    Escenario: Agregar un producto al carrito de compras de forma exitosa
      Dado  busca un producto en la pagina
      Cuando el usuario seleccione un producto y lo agregue al carrito
      Entonces el usuario podrá visualizar el producto dentro del carrito de compras
