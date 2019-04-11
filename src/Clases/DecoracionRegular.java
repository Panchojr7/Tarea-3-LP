package Clases;

import java.util.Calendar;

public class DecoracionRegular extends  Decoracion {

    private static int costoDecoracionRegular=500;
    private static double popularidad = 0.25;
    private static int cantidadDR=0;

    /******** Metodo: venderDecoracion ********************
      Descripcion: vende una decoracion regular, aumentando el dinero y reduce la popularidad

      Parametros:
      local Local

      Retorno: metodo void sin retorno
      ************************************************/
    public void venderDecoracion(Local local) {
        local.setDineroActual(local.getDineroActual()+costoDecoracionRegular-75);
        local.setPopularidad(local.getPopularidad()-popularidad);
        cantidadDR= cantidadDR-1;
    }

    /******** Metodo: comprarDecoracion ********************
      Descripcion: compra una decoracion regular, disminuyendo el dinero y aumentando la popularidad

      Parametros:
      local Local

      Retorno: metodo void sin retorno
      ************************************************/
    public void comprarDecoracion(Local local) {
        local.setDineroActual(local.getDineroActual()-costoDecoracionRegular);
        local.setPopularidad(local.getPopularidad()+popularidad);
        cantidadDR=cantidadDR+1;
    }


    /******** Metodo: getCantidadDR ********************
      Descripcion: retorna la cantidad de decoraciones regulares

      Parametros:
      Sin Parametros

      Retorno: retorna la variable cantidadDR de tipo int
      ************************************************/
    public  int getCantidadDR() {
        return cantidadDR;
    }


    /******** Metodo: setCantidadDR ********************
      Descripcion: modifica la cantidad de decoraciones regulares

      Parametros:
      cantidadDR int

      Retorno: metodo void sin retorno
      ************************************************/
    public  void setCantidadDR(int cantidadDR) {
        DecoracionRegular.cantidadDR = cantidadDR;
    }

    public static int getCostoDecoracion() {
        return costoDecoracionRegular;
    }
}
