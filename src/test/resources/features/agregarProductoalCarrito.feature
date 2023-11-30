#language: es
  Característica: Agregar producto al carrito


    @addProduct
    Escenario: Agregar un producto al carrito de compras de forma exitosa
      Dado que el Usuario abre el navegador y busca un producto
      Cuando el usuario podra seleccionar un producto de forma aleatoria y agregarlo al carrito
      Entonces el usuario podrá visualizar el producto dentro del carrito de compras
