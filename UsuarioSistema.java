public abstract class UsuarioSistema

{
    // El unico atributo padre será un id de usuario dentro del sistema. 
    private String id;

    //Constructor por parámetros para UsuarioSistema. Será DNI/CIF sin letra
    public UsuarioSistema(String id)
    {
        this.id=id;        
    }
    //Constructor default para UsuarioSistema
    public UsuarioSistema()
    {
        this.id=new String("xxxxxxxx");
    }
    
    /**
     * Getter & Setter de Id
     */
    public String getid()
    {
        return id;
    }
    
    public void setid(String id)
    {
        this.id=id;
    }
    //Faltan metodos?
}
