package Clases;
public abstract class Mesa {
    static int cantidadMesa=0;
    private static int capacidad=9;

    public abstract void contabilizar(Dia dia);
    public abstract void comprarMesa(Local local);
    public abstract void venderMesa(Local local);

    public int getCantidadMesa() {
        return cantidadMesa;
    }
}
