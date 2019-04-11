package Clases;
public class Trago {

  private double precioVenta;
  private double costoPreparacion;


  /******** Metodo: Trago ********************
    Descripcion: constructor de la clase Trago

    Parametros:
    Sin parametros

    Retorno: Sin retorno
    ************************************************/
  public Trago(){
    precioVenta=40.0;
    costoPreparacion=10.0;
  }

  /******** Metodo: getPrecioVenta ********************
    Descripcion: retorna el precio de venta de la Trago

    Parametros:
    Sin parametros

    Retorno: retorna el precio de venta, de tipo double
    ************************************************/
  public double getPrecioVenta() {
      return precioVenta;
  }

  /******** Metodo: getCostoPreparacion ********************
    Descripcion: retorna el costo de preparacion de la Trago

    Parametros:
    Sin parametros

    Retorno: retorna el costo de preparacion, de tipo double
    ************************************************/
  public double getCostoPreparacion() {
      return costoPreparacion;
  }

  /******** Metodo: setPrecioVenta ********************
    Descripcion: modifica el precio de venta de la clase Trago

    Parametros:
    precioVenta double

    Retorno: metodo void sin retorno
    ************************************************/
  public void setPrecioVenta(double precioVenta){
      this.precioVenta=precioVenta;
  }

  /******** Metodo: setCostoPreparacion ********************
    Descripcion: modifica el costo de preparacion del plato de Trago

    Parametros:
    costoPreparacion double

    Retorno: metodo void sin retorno
    ************************************************/
  public void setCostoPreparacion(double costoPreparacion){
      this.costoPreparacion=costoPreparacion;
  }



}
