package Clases;
public class Barman implements Empleado {
    private static int Sueldo=1000;
    private static int CantidadDeBarmans=0;

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
        dia.setClientesRecibidos(dia.getClientesRecibidos()+135);
    }

    /******** Metodo: getCantidadDeBarmans ********************
      Descripcion: retorna la cantidad de Barmans presentes

      Parametros:
      Sin parametros

      Retorno: retorna la la variable CantidadDeBarmans, de tipo int
      ************************************************/
    public int getCantidadDeBarmans() {
        return CantidadDeBarmans;
    }

    /******** Metodo: setCantidadDeBarmans ********************
      Descripcion: modifica la cantidad de Barmans presentes

      Parametros:
      cantidadBarmans int

      Retorno: metodo void sin retorno
      ************************************************/
    public void setCantidadDeBarmans(int cantidadBarmans) {
        CantidadDeBarmans = cantidadBarmans;
    }
}
