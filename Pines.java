
package Proyecto_paradigmasSV;

public class Pines extends Principal implements java.io.Serializable{
    private String nompin;
    private long numtelf;
    private String correo;

    public Pines(int id, String nompin, long numtelf, String correo, float monto) {
        super(id, monto);
        this.nompin = nompin;
        this.numtelf = numtelf;
        this.correo = correo;
    }

    public String getNompin() {
        return nompin;
    }

    public void setNompin(String nompin) {
        this.nompin = nompin;
    }

    public long getNumtelf() {
        return numtelf;
    }

    public void setNumtelf(long numtelf) {
        this.numtelf = numtelf;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Override
    public String toString() {
           System.out.printf("%-10s %-10s %-10s %-10s %-10s", "id", "Nombre_Pin", "Telefono","Correo", "Monto\n");
        return String.format("%-10d %-15s %-10d %-15s %-10.2f", super.getId(),nompin, numtelf, correo, super.getMonto());
    }
    //puse el metodo TotalaPagar y regreso el monto introducido en consola
    @Override
    public float TotalAPagar() {
        return super.getMonto();
    }
    
    
}
