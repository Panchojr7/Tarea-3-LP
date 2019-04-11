package Clases;
public class DecoracionEspectacular extends Decoracion {
    private static int costoDecoracionEspectacular=2000;
    private static double popularidad = 1.0;
    private static int cantidadDE=0;


    /******** Metodo: venderDecoracion ********************
      Descripcion: vende una decoracion espectacular, aumentando el dinero y reduce la popularidad

      Parametros:
      local Local

      Retorno: metodo void sin retorno
      ************************************************/
    public void venderDecoracion(Local local) {
        local.setDineroActual(local.getDineroActual()+costoDecoracionEspectacular-300);
        local.setPopularidad(local.getPopularidad()-popularidad);
        cantidadDE=cantidadDE-1;
    }

    /******** Metodo: comprarDecoracion ********************
      Descripcion: compra una decoracion espectacular, disminuyendo el dinero y aumentando la popularidad

      Parametros:
      local Local

      Retorno: metodo void sin retorno
      ************************************************/
    public void comprarDecoracion(Local local) {
        local.setDineroActual(local.getDineroActual()-costoDecoracionEspectacular);
        cantidadDE=cantidadDE+1;
        local.setPopularidad(local.getPopularidad()+popularidad);
    }


    /******** Metodo: getCantidadDE ********************
      Descripcion: retorna la cantidad de decoraciones espectaculares

      Parametros:
      Sin Parametros

      Retorno: retorna la variable cantidadDE de tipo int
      ************************************************/
    public int getCantidadDE() {
        return cantidadDE;
    }


    /******** Metodo: setCantidadDE ********************
      Descripcion: modifica la cantidad de decoraciones espectaculares

      Parametros:
      cantidadDE int

      Retorno: metodo void sin retorno
      ************************************************/
    public void setCantidadDE(int cantidadDE3) {
        DecoracionEspectacular.cantidadDE = cantidadDE3;
    }

    public static int getCostoDecoracion() {
        return costoDecoracionEspectacular;
    }
}
