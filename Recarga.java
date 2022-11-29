
package Proyecto_paradigmasSV;

public class Recarga extends Principal implements java.io.Serializable{
    private long numero;
    private String compania;

    public Recarga(int id, long numero, String compania, float monto) {
        super(id, monto);
        this.numero = numero;
        this.compania = compania;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
    
    @Override
    public String toString() {
        System.out.printf("%-10s %-10s %-10s %-10s", "id", "numero", "compania", "Monto\n");
        return String.format("%-10d %-10d %-10s %-10.2f", super.getId(),numero, compania, super.getMonto());
    }

    @Override
    public float TotalAPagar() {
        return super.getMonto();
    }
   
}
