package Clases;
public class DecoracionBonita extends Decoracion{
    private static int costoDecoracionBonita=1000;
    private static double popularidad = 0.5;
    private static int cantidadDB=0;

    /******** Metodo: venderDecoracion ********************
      Descripcion: vende una decoracion bonita, aumentando el dinero y reduce la popularidad

      Parametros:
      local Local

      Retorno: metodo void sin retorno
      ************************************************/
    public void venderDecoracion(Local local) {
        local.setDineroActual(local.getDineroActual()+costoDecoracionBonita-150);
        cantidadDB=cantidadDB-1;
        local.setPopularidad(local.getPopularidad()-popularidad);
    }

    /******** Metodo: comprarDecoracion ********************
      Descripcion: compra una decoracion bonita, disminuyendo el dinero y aumentando la popularidad

      Parametros:
      local Local

      Retorno: metodo void sin retorno
      ************************************************/
    public void comprarDecoracion(Local local) {
       local.setDineroActual(local.getDineroActual()-costoDecoracionBonita);
        cantidadDB=cantidadDB+1;
       local.setPopularidad(local.getPopularidad()+popularidad);

    }

    /******** Metodo: getCantidadDB ********************
      Descripcion: retorna la cantidad de decoraciones bonitas

      Parametros:
      Sin Parametros

      Retorno: retorna la variable cantidadDB de tipo int
      ************************************************/
    public int getCantidadDB() {
        return cantidadDB;
    }

    /******** Metodo: setCantidadDB ********************
      Descripcion: modifica la cantidad de decoraciones bonitas

      Parametros:
      cantidadDB int

      Retorno: metodo void sin retorno
      ************************************************/
    public void setCantidadDB(int cantidadDB) {
        DecoracionBonita.cantidadDB = cantidadDB;
    }

    public static int getCostoDecoracion() {
        return costoDecoracionBonita;
    }
}
