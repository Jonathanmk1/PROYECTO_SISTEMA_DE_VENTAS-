
package Proyecto_paradigmasSV;

public abstract class Principal extends Object implements Total, java.io.Serializable {
    private int id;
    private float monto;

    public Principal(int id, float monto) {
        this.id = id;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMonto() {
        //float suma=0;
        //return suma= suma + monto;
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    @Override
    public String toString() {
        return String.format("%-5d %-10.2f", id, monto);
    }
 
}
