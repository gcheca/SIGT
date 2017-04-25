public abstract class Vehiculo
{
    // instance variables - replace the example below with your own
    private String matricula;

    //Constructor por Parámetros
    public Vehiculo(String matricula)
    {
        this.matricula=matricula;
    }
    //Constructor default
    public Vehiculo()
    {
        this.matricula=new String ("****XXX");
    }
    
     /**
     * Getter & Setter de Matricula
     */
    public String getmatricuka()
    {
        return matricula;
    }
    
    public void setmatricula(String matricula)
    {
        this.matricula=matricula;
    }
   
}
