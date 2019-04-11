package Clases;
public class  Garzon implements Empleado {

    private static int Sueldo=500;
    private static int cantidadDeGarzones=0;



    /******** Metodo: pagoSueldo ********************
    Descripcion: modifica el valor de tipo double "sueldo", atributo de la clase dia

    Parametros:
    dia Dia

    Retorno: metodo void sin retorno
    ************************************************/
    public void pagoSueldo(Dia dia) {
        dia.setSueldo(dia.getSueldo()+Sueldo);

    }

    /******** Metodo: realizarEmpleo ********************
    Descripcion: modifica el valor de clientesRecibidos, atributo de la clase dia

    Parametros:
    dia Dia

    Retorno: metodo void sin retorno
    ************************************************/
    public void realizarEmpleo(Dia dia) {
        dia.setClientesAtendidos(dia.getClientesAtendidos()+225);

    }

    /******** Metodo: getCantidadDeCocineros ********************
      Descripcion: retorna la cantidad de Garzones presentes

      Parametros:
      Sin parametros

      Retorno: retorna la la variable cantidadDeGarzones, de tipo int
      ************************************************/
    public int getCantidadDeGarzones() {
        return cantidadDeGarzones;
    }


    /******** Metodo: setCantidadDeCocineros ********************
      Descripcion: modifica la cantidad de Garzones presentes

      Parametros:
      cantidadDeGarzones int

      Retorno: metodo void sin retorno
      ************************************************/
    public void setCantidadDeGarzones(int cantidadDeGarzones) {
        Garzon.cantidadDeGarzones = cantidadDeGarzones;
    }
}
