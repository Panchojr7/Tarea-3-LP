package Clases;
public class MesaMediana extends Mesa {
  private int capacidad = 10;
  private static int cantidadMesasMedianas=0;
  private double costoMesaMediana=2000.0;


  /******** Metodo: comprarMesa ********************
    Descripcion: compra una mesa mediana para el local, disminuyendo el dinero y aumentando la cantidad
                de mesas

    Parametros:
    local Local

    Retorno: metodo void sin retorno
    ************************************************/
  public void comprarMesa(Local local)
  {
    if (cantidadMesa<=9)
    {
      local.setDineroActual(local.getDineroActual()- costoMesaMediana); //se agrega la compra a los costos del dia
      cantidadMesa+=1; //se aumenta en 1 la cantidad de mesas del local
      cantidadMesasMedianas+=1; //se aumenta en 1 la cantidad de mesas chicas compradas
      System.out.println("Se ha comprado una mesa mediana, actualmente hay " + cantidadMesasMedianas + " mesas medianas");
    }
    else
    {
      System.out.println("No se pueden comprar mas mesas");
    }

  }

  /******** Metodo: getCantidadMesasMedianas ********************
    Descripcion: retorna la cantidad de mesas medianas del local

    Parametros:
    Sin Parametros

    Retorno: retorna la variable cantidadMesasMedianas de tipo int
    ************************************************/
  public int getCantidadMesasMedianas() {
    return cantidadMesasMedianas;
  }


  /******** Metodo: venderMesa ********************
    Descripcion: vende una mesa mediana del local, aumentando el dinero y disminuyendo la cantidad
                de mesas

    Parametros:
    local Local

    Retorno: metodo void sin retorno
    ************************************************/
  public void venderMesa(Local local)
  {
    if(cantidadMesa>0)
    {
      local.setDineroActual(local.getDineroActual()+costoMesaMediana-200); //se quita una compra a los costos del dia
      cantidadMesa-=1;//se dsiminuye en 1 la cantidad de mesas del local
      cantidadMesasMedianas-=1; //se disminuye en 1 la cantidad de mesas chicas compradas
      System.out.println("Se ha vendido una mesa mediana, actualmente hay " + cantidadMesasMedianas + " mesas medianas");
    }

    else
    {
      System.out.println("No se pueden vender mas mesas");
    }
  }

  /******** Metodo: contabilizar ********************
    Descripcion: modifica la cantidad de clientes sentados

    Parametros:
    dia Dia

    Retorno: metodo void sin retorno
    ************************************************/
  public void contabilizar(Dia dia)
  {
    dia.setClientesSentados(dia.getClientesSentados()+(cantidadMesasMedianas*capacidad*10));
  }

  /******** Metodo: getCapacidad ********************
    Descripcion: retorna la capacidad de la mesa mediana

    Parametros:
    Sin Parametros

    Retorno: retorna la variable capacidad de tipo int
    ************************************************/
  public int getCapacidad() {
        return capacidad;
    }

  public double getCostoMesa() {
    return costoMesaMediana;
  }
}
