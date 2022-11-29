
package Proyecto_paradigmasSV;

public class PagoS extends Principal implements java.io.Serializable {
    private String dependencia;
    private long referencia;

    public PagoS(int id, String dependencia, long referencia, float monto) {
        super(id, monto);
        this.dependencia = dependencia;
        this.referencia = referencia;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public long getReferencia() {
        return referencia;
    }

    public void setReferencia(long referencia) {
        this.referencia = referencia;
    }
    

    @Override
    public String toString() {
        System.out.printf("%-10s %-10s %-10s %-10s", "id", "dependencia", "referencia", "Monto\n");
        return String.format("%-10d %-15s %-18d %-10.2f", super.getId(), dependencia, referencia, super.getMonto());
    }
 
    @Override
    public float TotalAPagar() {
       return super.getMonto();
    }
       
}
