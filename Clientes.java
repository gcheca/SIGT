public abstract class Clientes extends UsuarioSistema
{
    // Además del Id heredado, los valores en común serán teléfono/correo-e
    private String telfcontact;
    private String correoecontact;

    //Contructor por parámetros para Clientes.
    public Clientes(String telfcontact, String correoecontact)
    {
        this.telfcontact=telfcontact;
        this.correoecontact=correoecontact; 
    }
    //Constructor default para clientes
    public Clientes()
    {
        this.telfcontact="xxx-xxx-xxx";
        this.correoecontact="xxxxx@***.**";
    }
}
