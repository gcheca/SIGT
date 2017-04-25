class Mecanicos extends Empleados
{
    /*
     * Decido diferenciarlos por experiencia para según qué labores:
     * Practicas - Para asignarle revisiones rutinarias
     * Junior - Para asignarle revisiones a fondo o reparaciones sencillas
     * Senior - Para asignarle trabajos complejos
     */
    private String exp;
    private String dpto;

    /**
     * Constructor for objects of class Mecanicos
     */
   public Mecanicos(String id, String nombre, String apellido, String exp, String dpto)
   {
        super(id, nombre, apellido);
        this.exp=exp;
        this.dpto=new String ("Mecanico");
   }
   public Mecanicos(String id, String nombre, String apellido, String dpto)
   {
        super(id, nombre, apellido);
        this.exp=new String("Experiencia");
        this.dpto=new String ("Mecanico");
   }

    /**
     * 
    public int AsignaVehiculo()
    {
        // put your code here
        return;
    }*/
}
