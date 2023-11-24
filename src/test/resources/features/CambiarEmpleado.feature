#language:es

  Característica: Cambio de nombre del empleado
    Cambiar el nombre del empleado en cualquiera de las ordenes de compra:

    Antecedentes:Inicio de sesión exitoso
      Dado que es usuario abre el navegador
      Cuando ingrese las credenciales
      Y de clic en el boton iniciar sesion

  Escenario:Cambiar el nombre empleado en cualquiera  orden de compra de manera exitosa
    Cuando de clic en open orders
    Y seleccione cualquiera de las ordenes
    Y seleccione un nuevo empleado
    Y de clic en guardo los cambios
    Entonces visualizo mensaje de actualizacion