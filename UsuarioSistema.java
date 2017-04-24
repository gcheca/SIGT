public abstract class UsuarioSistema

{
    // El unico atributo padre será un id de usuario dentro del sistema
    private String idsys;

    //Constructor por parámetros para UsuarioSistema. Será DNI/CIF sin letra
    public UsuarioSistema(String idsys)
    {
        this.idsys=idsys;        
    }
    //Constructor default para UsuarioSistema
    public UsuarioSistema()
    {
        this.idsys=new String("xxxxxxxx");
    }
}

