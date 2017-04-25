public abstract class Empleados extends UsuarioSistema 
{
    //Además del id heredado... los campos en común serán...¿?
    private String nombre;
    private String apellido;

    //Constructor por parametros Empleado
    public Empleados(String id, String nombre, String apellido)
    {
        super(id);
        this.nombre=nombre;
        this.apellido=apellido;
    }
    
    /**
     * Getter & Setter de nombre
     */
    public String getnombre()
    {
        return nombre;
    }
    
    public void setnombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    /**
     * Getter & Setter de apellido
     */
    public String getapellido()
    {
        return apellido;
    }
    
    public void setapellido(String apellido)
    {
        this.apellido=apellido;
    }
    
  }
