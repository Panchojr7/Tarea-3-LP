package Clases;
import java.io.IOException;
import java.util.ArrayList;

public class Local {
    private int numeroEstrellas=1;
    private DecoracionRegular cDR= new DecoracionRegular();
    private DecoracionBonita cDB= new DecoracionBonita();
    private DecoracionEspectacular cDE= new DecoracionEspectacular();
    private Garzon cGarzon=new Garzon();
    private Barman cBarman=new Barman();
    private MesaChica cMesaChica = new MesaChica();
    private MesaMediana cMesaMediana = new MesaMediana();
    private MesaGrande cMesaGrande = new MesaGrande();
    private Trago tragoDeLocal = new Trago();
    private double popularidad;
    private double popularidadBase;
    private double dineroActual;

    private ArrayList<Dia> listaDias;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Mesa> listaMesas;
    private ArrayList<Decoracion> listaDecoraciones;

    /******** Metodo: Local ********************
      Descripcion: Constructor de la clase Local

      Parametros:
      Sin Parametros

      Retorno: Sin retorno
      ************************************************/
    public Local()
    {
    dineroActual=100000.0;
    popularidad = 0.0;
    popularidadBase = 2.0;
    listaDias = new ArrayList<Dia>();
    listaEmpleados = new ArrayList<Empleado>();
    listaMesas = new ArrayList<Mesa>();
    listaDecoraciones = new ArrayList<Decoracion>();
    }

    /******** Metodo: getPopularidad ********************
      Descripcion: retorna la popularidad del local

      Parametros:
      Sin Parametros

      Retorno: retorna la variable popularidad de tipo double
      ************************************************/
    public double getPopularidad() {
      return popularidad;
    }

    /******** Metodo: getDineroActual ********************
      Descripcion: retorna lel dinero actial del local

      Parametros:
      Sin Parametros

      Retorno: retorna la variable dineroActual de tipo double
      ************************************************/
    public double getDineroActual() {
      return dineroActual;
    }

    /******** Metodo: setPopularidad ********************
      Descripcion: modifica la popularidad del local

      Parametros:
      popularidad double

      Retorno: Sin retorno
      ************************************************/
    public void setPopularidad(double popularidad){
      this.popularidad=popularidad+popularidadBase;
    }

    /******** Metodo: getDiaActual ********************
      Descripcion: retorna el dia actual de la lista dia

      Parametros:
      Sin Parametros

      Retorno: retorna el dia actual, de tipo Dia
      ************************************************/
    public Dia getDiaActual( ){
      return listaDias.get(listaDias.size()-1);
    }

    /******** Metodo: setDineroActual ********************
      Descripcion: modifica el dinero actual del local

      Parametros:
      dineroActual double

      Retorno: Sin retorno
      ************************************************/
    public void setDineroActual(double dineroActual){
      this.dineroActual=dineroActual;
    }

    /******** Metodo: setDineroActual ********************
      Descripcion: recorre la lista de empleados para el pago del sueldo

      Parametros:
      Sin Parametros

      Retorno: Sin retorno
      ************************************************/
    private void pagarAEmpleados(){
      for(int i= 0; i<listaEmpleados.size();i++){
          listaEmpleados.get(i).pagoSueldo(getDiaActual());
      }
    }

    /******** Metodo: supervisarEmpleo ********************
      Descripcion: recorre la lista de empleados para realizar el empleo

      Parametros:
      Sin Parametros

      Retorno: Sin retorno
      ************************************************/
    private void supervisarEmpleo(){
      for(int i=0;i<listaEmpleados.size();i++){
          listaEmpleados.get(i).realizarEmpleo(getDiaActual());
      }
    }

    /******** Metodo: contarMesas ********************
      Descripcion: recorre la lista de mesas para contabilizarlas

      Parametros:
      Sin parametro

      Retorno: Sin retorno
      ************************************************/
    private void contarMesas(){
      for(int i=0;i<listaMesas.size();i++){
          listaMesas.get(i).contabilizar(getDiaActual());
      }
    }

    /******** Metodo: aumentarNivel ********************
      Descripcion: aumenta el nivel del local, verificando que hayan sido mas de 5 dias los clientes
                  felices que potenciales

      Parametros:
      Sin parametro

      Retorno: Sin retorno
      ************************************************/
    public  void aumentarNivel(){
      if(listaDias.size()>5*numeroEstrellas){
        int contador=listaDias.size()-1;
        boolean flag=true;
        while(contador>listaDias.size()-7 && flag){
          Dia dia = listaDias.get(contador);
          contador--;
          if (!(dia.getClientesPotenciales()*0.8<=(double)dia.getClientesFelices())){
                flag=false;
          }
        }
        if (flag){
          numeroEstrellas++;
          popularidadBase=popularidadBase*2;
        }
      }
    }

    /******** Metodo: mejorarTrago ********************
      Descripcion: aumenta el precio de venta y costo de preparacion de la Trago del local

      Parametros:
      Sin parametros

      Retorno: Sin retorno
      ************************************************/
    public void mejorarTrago(){
        tragoDeLocal.setPrecioVenta(tragoDeLocal.getPrecioVenta()+ 20.0);
        tragoDeLocal.setCostoPreparacion(tragoDeLocal.getCostoPreparacion()+ 10.0);
        System.out.println("Se ha mejorado la Trago del local, ahora se vende a : " + tragoDeLocal.getPrecioVenta()+" pesos");
    }

    /******** Metodo: contratarGarzon ********************
      Descripcion: contrata un Garzon, agregandolo a la lista correspondiente

      Parametros:
      Sin parametros

      Retorno: retorna true si se agregaron correctamente los Garzones
      ************************************************/
    public boolean contratarGarzon(){
        try {
            Empleado a=new Garzon();
            listaEmpleados.add(a);
            cGarzon.setCantidadDeGarzones(cGarzon.getCantidadDeGarzones()+1);
            return true;
        }catch (RuntimeException e){
            return false;
        }

    }
    /******** Metodo: cantidadGarzones ********************
      Descripcion: retorna la cantidad de Garzones contratados en el local

      Parametros:
      Sin parametros

      Retorno: retorna la variable de cantidad de Garzones del local, de tipo int
      ************************************************/
    public int cantidadGarzones(){
      return cGarzon.getCantidadDeGarzones();
    }

    /******** Metodo: cantidadMesasGrandes ********************
      Descripcion: retorna la cantidad de mesas grandes presentes en el local

      Parametros:
      Sin parametros

      Retorno: retorna la variable de cantidad de mesas grandes del local, de tipo int
      ************************************************/
    public int cantidadMesasGrandes() {
        return cMesaGrande.getCantidadMesasGrandes();
    }

    /******** Metodo: cantidadMesasMedianas ********************
      Descripcion: retorna la cantidad de mesas medianas presentes en el local

      Parametros:
      Sin parametros

      Retorno: retorna la variable de cantidad de mesas medianas del local, de tipo int
      ************************************************/
    public int cantidadMesasMedianas() {
        return cMesaMediana.getCantidadMesasMedianas();
    }

    /******** Metodo: cantidadMesasChicas ********************
      Descripcion: retorna la cantidad de mesas chicas presentes en el local

      Parametros:
      Sin parametros

      Retorno: retorna la variable de cantidad de mesas chicas del local, de tipo int
      ************************************************/
    public int cantidadMesasChicas() {
        return cMesaChica.getCantidadMesasChicas();
    }


    /******** Metodo: contratarBarman ********************
      Descripcion: contrata un Barman, agregandolo a la lista correspondiente

      Parametros:
      Sin parametros

      Retorno: retorna true si se agregaron correctamente los Barmans
      ************************************************/
    public boolean contratarBarman(){
        try {
            Empleado b=new Barman();
            listaEmpleados.add(b);
            cBarman.setCantidadDeBarmans(cBarman.getCantidadDeBarmans()+1);
            return true;
          }catch (RuntimeException e) {
              return false;
            }
    }

    public int cantidadBarmans(){
      return cBarman.getCantidadDeBarmans();
    }


    /******** Metodo: despedirGarzon ********************
      Descripcion: despide un Garzon, quitandolo de la lista correspondiente

      Parametros:
      Sin parametros

      Retorno: retorna true si se quitaron correctamente los Garzones
      ************************************************/
    public boolean despedirGarzon(){
        if (cGarzon.getCantidadDeGarzones()>0){
            int con=0;
            while (!(listaEmpleados.get(0) instanceof Garzon)){
                con++;
            }
            if (listaEmpleados.get(con) instanceof Garzon){
                listaEmpleados.remove(con);
                cGarzon.setCantidadDeGarzones(cGarzon.getCantidadDeGarzones()-1);
                return true;
            }


        }
        return false;
    }

    /******** Metodo: despedirBarman ********************
      Descripcion: despide un Barman, quitandolo de la lista correspondiente

      Parametros:
      Sin parametros

      Retorno: retorna true si se quitaron correctamente los Barmans
      ************************************************/
    public boolean despedirBarman(){
        if (cBarman.getCantidadDeBarmans()>0){
            int con=0;
            while (!(listaEmpleados.get(0) instanceof Barman)){
                con++;
            }
            if (listaEmpleados.get(con) instanceof Barman){
                listaEmpleados.remove(con);
                cBarman.setCantidadDeBarmans(cBarman.getCantidadDeBarmans()-1);
                return true;
            }


        }
        return false;

    }

    /******** Metodo: comprarMesaChica ********************
      Descripcion: compra una mesa chica, agregandola a la lista de mesas

      Parametros:
      Sin parametros

      Retorno: retorna true si se agregaron correctamente las mesas
      ************************************************/
    public boolean comprarMesaChica(){
        if(cMesaChica.getCantidadMesa()<9){
            Mesa nueva= new MesaChica();
            nueva.comprarMesa(this);
            listaMesas.add(nueva);
            return true;
        }
        return false;
    }

    /******** Metodo: comprarMesaMediana ********************
      Descripcion: compra una mesa mediana, agregandola a la lista de mesas

      Parametros:
      Sin parametros

      Retorno: retorna true si se agregaron correctamente las mesas
      ************************************************/
    public boolean comprarMesaMediana(){
        if(cMesaMediana.getCantidadMesa()<9){
            Mesa nueva= new MesaMediana();
            nueva.comprarMesa(this);
            listaMesas.add(nueva);
            return true;
        }
        return false;
    }

    /******** Metodo: comprarMesaGrande ********************
      Descripcion: compra una mesa grande, agregandola a la lista de mesas

      Parametros:
      Sin parametros

      Retorno: retorna true si se agregaron correctamente las mesas
      ************************************************/
    public boolean comprarMesaGrande(){
        if(cMesaGrande.getCantidadMesa()<9){
            Mesa nueva= new MesaGrande();
            nueva.comprarMesa(this);
            listaMesas.add(nueva);
            return true;
        }
        return false;
    }


    /******** Metodo: venderMesaChica ********************
      Descripcion: vende una mesa chica, quitandola de la lista de mesas

      Parametros:
      Sin parametros

      Retorno: retorna true si se quitaron correctamente las mesas
      ************************************************/
    public boolean venderMesaChica(){
        if (cMesaChica.getCantidadMesasChicas()>0){
            int con=0;
            while (!(listaMesas.get(0) instanceof MesaChica)){
                con++;
            }
            if (listaMesas.get(con) instanceof MesaChica){
                listaMesas.get(con).venderMesa(this);
                listaMesas.remove(con);
                return true;
            }
        }
        return false;
    }

    /******** Metodo: venderMesaMediana********************
      Descripcion: vende una mesa mediana, quitandola de la lista de mesas

      Parametros:
      Sin parametros

      Retorno: retorna true si se quitaron correctamente las mesas
      ************************************************/

    public boolean venderMesaMediana(){
        if (cMesaMediana.getCantidadMesasMedianas()>0){
            int con=0;
            while (!(listaMesas.get(0) instanceof MesaMediana)){
                con++;
            }
            if (listaMesas.get(con) instanceof MesaMediana){
                listaMesas.get(con).venderMesa(this);
                listaMesas.remove(con);
                return true;
            }
        }
        return false;
    }


    /******** Metodo: venderMesaGrande********************
      Descripcion: vende una mesa grande, quitandola de la lista de mesas

      Parametros:
      Sin parametros

      Retorno: retorna true si se quitaron correctamente las mesas
      ************************************************/
    public boolean venderMesaGrande(){
        if (cMesaGrande.getCantidadMesasGrandes()>0){
            int con=0;
            while (!(listaMesas.get(0) instanceof MesaGrande)){
                con++;
            }
            if (listaMesas.get(con) instanceof MesaGrande){
                listaMesas.get(con).venderMesa(this);
                listaMesas.remove(con);
                return true;
            }
        }
        return false;
    }


    /******** Metodo: comprarDecoracionRegular********************
      Descripcion: compra una decoracion regular, agregandola a la lista de decoraciones

      Parametros:
      Sin parametros

      Retorno: retorna true si se agregaron correctamente las decoraciones
      ************************************************/
    public boolean comprarDecoracionRegular(){
        try {
            Decoracion a=new DecoracionRegular();
            a.comprarDecoracion(this);

            listaDecoraciones.add(a);

            return true;
        }catch (RuntimeException e){
            return false;
        }
    }

    /******** Metodo: comprarDecoracionBonita********************
      Descripcion: compra una decoracion bonita, agregandola a la lista de decoraciones

      Parametros:
      Sin parametros

      Retorno: retorna true si se agregaron correctamente las decoraciones
      ************************************************/
    public boolean comprarDecoracionBonita(){
        try {
            Decoracion a=new DecoracionBonita();
            a.comprarDecoracion(this);
            listaDecoraciones.add(a);

            return true;
        }catch (RuntimeException e){
            return false;
        }
    }

    /******** Metodo: comprarDecoracionEspectacular********************
      Descripcion: compra una decoracion espectacular, agregandola a la lista de decoraciones

      Parametros:
      Sin parametros

      Retorno: retorna true si se agregaron correctamente las decoraciones
      ************************************************/
    public boolean comprarDecoracionEspectacular(){
        try {
            Decoracion a=new DecoracionEspectacular();
            a.comprarDecoracion(this);
            listaDecoraciones.add(a);

            return true;
        }catch (RuntimeException e){
            return false;
        }
    }

    /******** Metodo: venderDecoracionRegular********************
      Descripcion: vende una decoracion regular, quitandola de la lista de decoraciones

      Parametros:
      Sin parametros

      Retorno: retorna true si se quitaron correctamente las decoraciones
      ************************************************/
    public boolean venderDecoracionRegular(){
        if (cDR.getCantidadDR()>0){
            int con=0;
            while (!(listaDecoraciones.get(0) instanceof DecoracionRegular)){
                con++;
            }
            if (listaDecoraciones.get(con) instanceof DecoracionRegular){
                listaDecoraciones.get(con).venderDecoracion(this);
                listaDecoraciones.remove(con);

                return true;
            }
        }
        return false;
    }

    /******** Metodo: venderDecoracionBonita********************
      Descripcion: vende una decoracion bonita, quitandola de la lista de decoraciones

      Parametros:
      Sin parametros

      Retorno: retorna true si se quitaron correctamente las decoraciones
      ************************************************/
    public boolean venderDecoracionBonita(){
        if (cDB.getCantidadDB()>0){
            int con=0;
            while (!(listaDecoraciones.get(0) instanceof DecoracionBonita)){
                con++;
            }
            if (listaDecoraciones.get(con) instanceof DecoracionBonita){
                listaDecoraciones.get(con).venderDecoracion(this);
                listaDecoraciones.remove(con);

                return true;
            }


        }
        return false;
    }

    /******** Metodo: venderDecoracionEspectacular********************
      Descripcion: vende una decoracion espectacular, quitandola de la lista de decoraciones

      Parametros:
      Sin parametros

      Retorno: retorna true si se quitaron correctamente las decoraciones
      ************************************************/
    public boolean venderDecoracionEspectacular(){
        if (cDE.getCantidadDE()>0){
            int con=0;
            while (!(listaDecoraciones.get(0) instanceof DecoracionEspectacular)){
                con++;
            }
            if (listaDecoraciones.get(con) instanceof DecoracionEspectacular){
                listaDecoraciones.get(con).venderDecoracion(this);
                listaDecoraciones.remove(con);

                return true;
            }
        }
        return false;
    }


    /******** Metodo: venderDecoracionRegular********************
      Descripcion: Crea una nueva instancia de dia, agregandola a la lista dias

      Parametros:
      Sin parametros

      Retorno: Funcion void sin retorno
      ************************************************/
    public void nuevoDia(){
        Dia dia=new Dia();
        listaDias.add(dia);
    }


    /******** Metodo: venderDecoracionRegular********************
      Descripcion: llama a las funciones necesarias para realizar el dia trabajado

      Parametros:
      Sin parametros

      Retorno: Sin retorno
      ************************************************/
    public void realizarDia(){
      nuevoDia();
      Dia diaActual=getDiaActual();
      diaActual.setClientesPotenciales((popularidad+popularidadBase)*30);
      dineroActual=dineroActual+diaActual.getResultado();
      contarMesas();
      supervisarEmpleo();
      diaActual.setClientesFelices();
      pagarAEmpleados();
      diaActual.setIngreso(tragoDeLocal);
      diaActual.setCosto(tragoDeLocal);
      diaActual.setResultado();
      dineroActual=dineroActual+diaActual.getResultado();
      aumentarNivel();

    }
    /******** Metodo: getNumeroMesaChica ********************
        Descripcion: retorna la cantidad de mesas chicas presentes en el local

        Parametros:
        Sin parametros

        Retorno: retorna la variable de cantidad de mesas chicas del local, de tipo int
        ************************************************/

      public int getNumeroMesaChica(){
          return cMesaChica.getCantidadMesasChicas();
      }

      /******** Metodo: getNumeroMesaMediana ********************
        Descripcion: retorna la cantidad de mesas medianas presentes en el local

        Parametros:
        Sin parametros

        Retorno: retorna la variable de cantidad de mesas medianas del local, de tipo int
        ************************************************/

      public int getNumeroMesaMediana(){
          return cMesaMediana.getCantidadMesasMedianas();
      }

      /******** Metodo: getNumeroMesaGrande ********************
        Descripcion: retorna la cantidad de mesas grandes presentes en el local

        Parametros:
        Sin parametros

        Retorno: retorna la variable de cantidad de mesas grandes del local, de tipo int
        ************************************************/

      public int getNumeroMesaGrande(){
          return cMesaGrande.getCantidadMesasGrandes();
      }


      /******** Metodo: getNumeroDecoracionRegular ********************
        Descripcion: retorna la cantidad decoraciones regulares presentes en el local

        Parametros:
        Sin parametros

        Retorno: retorna la variable de cantidad de decoraciones regulares del local, de tipo int
        ************************************************/

      public int getNumeroDecoracionRegular(){
          return cDR.getCantidadDR();
      }

      /******** Metodo: getNumeroDecoracionBonita ********************
        Descripcion: retorna la cantidad decoraciones bonitas presentes en el local

        Parametros:
        Sin parametros

        Retorno: retorna la variable de cantidad de decoraciones bonitas del local, de tipo int
        ************************************************/
      public int getNumeroDecoracionBonita(){
          return cDB.getCantidadDB();
      }

      /******** Metodo: getNumeroDecoracionEspectacular ********************
        Descripcion: retorna la cantidad decoraciones espectaculares presentes en el local

        Parametros:
        Sin parametros

        Retorno: retorna la variable de cantidad de decoraciones espectaculares del local, de tipo int
        ************************************************/
      public int getNumeroDecoracionEspectacular(){
          return cDE.getCantidadDE();
      }

      /******** Metodo: getNumeroDia ********************
        Descripcion: retorna la cantidad de dias que han transcurrido en el juego

        Parametros:
        Sin parametros

        Retorno: retorna el largo de la lista de dias, de tipo int
        ************************************************/
      public int getNumeroDia(){
          return listaDias.size();
      }

      /******** Metodo: getNumeroEstrellas ********************
        Descripcion: retorna la cantidad de estrellas del local

        Parametros:
        Sin parametros

        Retorno: retorna el numero de estrellas del local, de tipo int
        ************************************************/
      public int getNumeroEstrellas(){
          return numeroEstrellas;
      }

      /******** Metodo: getPrecioTrago ********************
        Descripcion: retorna el precio de la Trago del local

        Parametros:
        Sin parametros

        Retorno: retorna el precio de venta de la Trago del local, de tipo int
        ************************************************/
      public int getPrecioTrago(){
          return (int)tragoDeLocal.getPrecioVenta();
      }

      /******** Metodo: getCostoTrago********************
        Descripcion: retorna el costo de preparacion de la Trago del local

        Parametros:
        Sin parametros

        Retorno: retorna el costo que tiene preparar la Trago del local, de tipo int
        ************************************************/
      public int getCostoTrago(){
          return (int)tragoDeLocal.getCostoPreparacion();
      }

      /******** Metodo: getPrecioMesaChica ********************
        Descripcion: retorna el precio de la mesa chica presente en el local

        Parametros:
        Sin parametros

        Retorno: retorna el costo de la mesa chica del local, de tipo int
        ************************************************/
      public int getPrecioMesaChica(){
          return (int)cMesaChica.getCostoMesa();
      }

      /******** Metodo: getPrecioMesaMediana ********************
        Descripcion: retorna el precio de la mesa mediana presente en el local

        Parametros:
        Sin parametros

        Retorno: retorna el costo de la mesa mediana del local, de tipo int
        ************************************************/
      public int getPrecioMesaMediana(){
          return (int)cMesaMediana.getCostoMesa();
      }

      /******** Metodo: getPrecioMesaChica ********************
        Descripcion: retorna el precio de la mesa chica presente en el local

        Parametros:
        Sin parametros

        Retorno: retorna el costo de la mesa chica del local, de tipo int
        ************************************************/
      public int getPrecioMesaGrande(){
          return (int)cMesaGrande.getCostoMesa();
      }
      public int getPrecioDeRe(){
          return (int)cDR.getCostoDecoracion();
      }
    public int getPrecioDeBo(){
        return (int)cDB.getCostoDecoracion();
    }
    public int getPrecioDeEs(){
        return (int)cDE.getCostoDecoracion();
    }






















}
