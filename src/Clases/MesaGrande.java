package Clases;
public class MesaGrande extends Mesa {
  private static int capacidad = 15;
  private static int cantidadMesasGrandes=0;
  private double costoMesaGrande=4000.0;



  /******** Metodo: comprarMesa ********************
    Descripcion: compra una mesa grande para el local, disminuyendo el dinero y aumentando la cantidad
                de mesas

    Parametros:
    local Local

    Retorno: metodo void sin retorno
    ************************************************/
  public void comprarMesa(Local local)
  {
    if (cantidadMesa<=9)
    {
      local.setDineroActual(local.getDineroActual()- costoMesaGrande); //se agrega la compra a los costos del dia
      cantidadMesa+=1; //se aumenta en 1 la cantidad de mesas del local
      cantidadMesasGrandes+=1; //se aumenta en 1 la cantidad de mesas chicas compradas
      System.out.println("Se ha comprado una mesa grande, actualmente hay " + cantidadMesasGrandes + " mesas grandes");
    }
    else
    {
      System.out.println("No se pueden comprar mas mesas");
    }

  }


  /******** Metodo: venderMesa ********************
    Descripcion: vende una mesa grande del local, aumentando el dinero y disminuyendo la cantidad
                de mesas

    Parametros:
    local Local

    Retorno: metodo void sin retorno
    ************************************************/
  public void venderMesa(Local local)
  {
    if(cantidadMesa>0)
    {
      local.setDineroActual(local.getDineroActual()+costoMesaGrande-300); //se quita una compra a los costos del dia
      cantidadMesa-=1;//se dsiminuye en 1 la cantidad de mesas del local
      cantidadMesasGrandes-=1; //se disminuye en 1 la cantidad de mesas chicas compradas
      System.out.println("Se ha vendido una mesa grande, actualmente hay " + cantidadMesasGrandes + " mesas grandes");
    }

    else
    {
      System.out.println("No se pueden vender mas mesas");
    }
  }

  /******** Metodo: getCantidadMesasGrandes ********************
    Descripcion: retorna la cantidad de mesas grandes del local

    Parametros:
    Sin Parametros

    Retorno: retorna la variable cantidadMesasGrandes de tipo int
    ************************************************/

  public int getCantidadMesasGrandes() {
    return cantidadMesasGrandes;
  }

  /******** Metodo: contabilizar ********************
    Descripcion: modifica la cantidad de clientes sentados

    Parametros:
    dia Dia

    Retorno: metodo void sin retorno
    ************************************************/
  public void contabilizar(Dia dia)
  {
    dia.setClientesSentados(dia.getClientesSentados()+(cantidadMesasGrandes*capacidad*10));
  }


  /******** Metodo: getCapacidad ********************
    Descripcion: retorna la capacidad de la mesa grande

    Parametros:
    Sin Parametros

    Retorno: retorna la variable capacidad de tipo int
    ************************************************/
  public static int getCapacidad() {
        return capacidad;
    }

  public double getCostoMesa() {
    return costoMesaGrande;
  }
}
