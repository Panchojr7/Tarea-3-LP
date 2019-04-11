package Clases;
public class Dia {
    private double clientesPotenciales;
    private int clientesSentados;
    private int clientesAtendidos;
    private int clientesRecibidos;
    private int clientesFelices;
    private double sueldo;
    private double ingreso;
    private double costo;
    private double resultado;

    public Dia(){
        clientesAtendidos=0;
        clientesSentados=0;
        clientesFelices=0;
        clientesPotenciales=0.0;
        clientesRecibidos=0;
        costo=0.0;
        ingreso=0.0;
        sueldo=0.0;
        resultado=0.0;
    }

    /******** Metodo: getClientesAtendidos ********************
     Descripcion: getter de Clientes Atendidos

     Parametros:
     Sin parametros

     Retorno: numero de clientes atendidos
     ************************************************/
    public int getClientesAtendidos() {
        return clientesAtendidos;
    }

    /******** Metodo: getClientesAFelices ********************
     Descripcion: getter de Clientes Felices

     Parametros:
     Sin parametros

     Retorno: numero de clientes Felices
     ************************************************/

    public int getClientesFelices() {
        return clientesFelices;
    }

    /******** Metodo: getClientesPotenciales ********************
     Descripcion: getter de Clientes Potenciales
     Parametros:
     Sin parametros

     Retorno: numero de clientes Potenciales
     ************************************************/
    public double getClientesPotenciales() {
        return clientesPotenciales;
    }

    /******** Metodo: getClientesRecibidos ********************
     Descripcion: getter de Clientes Recibidos

     Parametros:
     Sin parametros

     Retorno: numero de clientes que recibieron su plato de trago
     ************************************************/
    public int getClientesRecibidos() {
        return clientesRecibidos;
    }
    /******** Metodo: getClientesSentados ********************
     Descripcion: getter de Clientes Sentados

     Parametros:
     Sin parametros

     Retorno: numero de clientes sentados
     ************************************************/
    public int getClientesSentados(){
        return clientesSentados;
    }

    /******** Metodo: getCosto ********************
     Descripcion: getter de Costo

     Parametros:
     Sin parametros

     Retorno: numero de costos del día
     ************************************************/
    public double getCosto() {
        return this.costo;
    }

    /******** Metodo: getIngreso ********************
     Descripcion: getter de  Ingreso

     Parametros:
     Sin parametros

     Retorno: numero de ingresos del día
     ************************************************/
    public double getIngreso() {
        return ingreso;
    }

    /******** Metodo: getResultado ********************
     Descripcion: getter de Resultado

     Parametros:
     Sin parametros

     Retorno: numero de resultado de= ingreso-costo
     ************************************************/
    public double getResultado() {
        return resultado;
    }

    /******** Metodo: getSueldo ********************
     Descripcion: getter de Clientes Atendidos

     Parametros:
     Sin parametros

     Retorno: numero de Sueldos a pagar del dia
     ************************************************/


    public double getSueldo() {
        return sueldo;
    }

    /******** Metodo: setClientesAtendidos ********************
     Descripcion: setter de Clientes Atendidos

     Parametros:
     Clientes Atendidos

     Retorno: Sin Retorno
     ************************************************/
    public void setClientesAtendidos(int clientesAtendidos) {
        this.clientesAtendidos = clientesAtendidos;
    }
    /******** Metodo: setClientesFelices ********************
     Descripcion: setter de Clientes Atendidos, asigna el minimo entre los 4 tipos de clientes

     Parametros:
     Sin parametro

     Retorno: Sin Retorno
     ************************************************/
    public void setClientesFelices() {
        this.clientesFelices = Math.min((int)clientesPotenciales,Math.min(clientesAtendidos,Math.min(clientesRecibidos,clientesSentados)));
    }
    /******** Metodo: setClientesPotenciales ********************
     Descripcion: setter de Clientes Atendidos

     Parametros:
     Clientes Potenciales

     Retorno: Sin Retorno
     ************************************************/
    public void setClientesPotenciales(double clientesPotenciales) {
        this.clientesPotenciales = clientesPotenciales;
    }
    /******** Metodo: setClientesRecibidos ********************
     Descripcion: setter de Clientes Recibidos

     Parametros:
     Clientes Recibidos

     Retorno: Sin Retorno
     ************************************************/
    public void setClientesRecibidos(int clientesRecibidos) {
        this.clientesRecibidos = clientesRecibidos;
    }
    /******** Metodo: setClientesSentados ********************
     Descripcion: setter de Clientes Sentados

     Parametros:
     Clientes Sentados

     Retorno: Sin Retorno
     ************************************************/
    public void setClientesSentados(int clientesSentados) {
        this.clientesSentados = clientesSentados;
    }
    /******** Metodo: setCosto ********************
     Descripcion: setter de costo, calcula costos del día

     Parametros:
     Trago

     Retorno: Sin Retorno
     ************************************************/
    public void setCosto(Trago trago)
    {
        this.costo=clientesAtendidos*trago.getCostoPreparacion()+sueldo;
    }
    /******** Metodo: setIngreso ********************
     Descripcion: setter de ingreso, calcula los ingresos del día

     Parametros:
     Trago

     Retorno: Sin Retorno
     ************************************************/
    public void setIngreso(Trago trago)
    {
        this.ingreso=clientesFelices*trago.getPrecioVenta();
    }
    /******** Metodo: setResultado********************
     Descripcion: setter de Resultado, calcula resultado del dia en base a ingreso y costo

     Parametros:
     Sin Parametro

     Retorno: Sin Retorno
     ************************************************/
    public void setResultado() {
        this.resultado = ingreso-costo;
    }
    /******** Metodo: setSueldo ********************
     Descripcion: setter de Sueldo

     Parametros:
     Sueldo

     Retorno: Sin Retorno
     ************************************************/
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


}
