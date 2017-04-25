public class Comercial extends Empleados
{
    // Variable departamento
    private String dpto;
    
    /**
     * Constructor for objects of class Comercial
     */
    public Comercial(String id, String nombre, String apellido)
    {
        super(id, nombre, apellido);
        this.dpto=new String("Comercial");
    }
    
    //Setter&Getter
    public String getdpto()
    {return dpto;}
    public void setdpto(String dpto)
    {this.dpto=new String ("Comercial");}
    
    //toString
    public String toString()
    {
        String e="Empleado: ";
        e=e.concat(this.id+", ");
        e=e.concat(this.nombre+", ");
        e=e.concat(this.apellido+", ");
        e=e.concat(this.dpto+".\n");
        return e;
    }
}
