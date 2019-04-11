package Clases;

public class MesaChica extends Mesa {
    private int capacidad = 5;
    private static int cantidadMesasChicas=0;
    private double costoMesaChica=500.0;

    /******** Metodo: comprarMesa ********************
      Descripcion: compra una mesa chica para el local, disminuyendo el dinero y aumentando la cantidad
                  de mesas

      Parametros:
      local Local

      Retorno: metodo void sin retorno
      ************************************************/
    public void comprarMesa(Local local)
    {
      if (cantidadMesa<=9)
      {
        local.setDineroActual(local.getDineroActual()- costoMesaChica);//se agrega la compra a los costos del dia
        cantidadMesa+=1; //se aumenta en 1 la cantidad de mesas del local
        cantidadMesasChicas+=1; //se aumenta en 1 la cantidad de mesas chicas compradas
        System.out.println("Se ha comprado una mesa chica, actualmente hay " + cantidadMesasChicas + " mesas chicas");
      }
      else
      {
        System.out.println("No se pueden comprar mas mesas");
      }

    }

    /******** Metodo: venderMesa ********************
      Descripcion: vende una mesa chica del local, aumentando el dinero y disminuyendo la cantidad
                  de mesas

      Parametros:
      local Local

      Retorno: metodo void sin retorno
      ************************************************/
    public void venderMesa(Local local)
    {
      if(cantidadMesa>0)
      {
        local.setDineroActual(local.getDineroActual()+costoMesaChica-100); //se quita una compra a los costos del dia
        cantidadMesa-=1;//se dsiminuye en 1 la cantidad de mesas del local
        cantidadMesasChicas-=1; //se disminuye en 1 la cantidad de mesas chicas compradas
        System.out.println("Se ha vendido una mesa chica, actualmente hay " + cantidadMesasChicas + " mesas chicas");
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
      dia.setClientesSentados(dia.getClientesSentados()+(cantidadMesasChicas*capacidad*10));
    }


    /******** Metodo: getCantidadMesasChicas ********************
      Descripcion: retorna la cantidad de mesas chicas del local

      Parametros:
      Sin Parametros

      Retorno: retorna la variable cantidadMesasChicas de tipo int
      ************************************************/
    public int getCantidadMesasChicas() {
        return cantidadMesasChicas;
    }

    /******** Metodo: getCapacidad ********************
      Descripcion: retorna la capacidad de la mesa chica

      Parametros:
      Sin Parametros

      Retorno: retorna la variable capacidad de tipo int
      ************************************************/
    public int getCapacidad() {
        return capacidad;
    }

    public double getCostoMesa() {
        return costoMesaChica;
    }
}
