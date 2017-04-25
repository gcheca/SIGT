public class Empresa extends Clientes
{
    // Además de las heredadas. Meteremos el CIF 
    //que será igual al Id pero sin letra y el nombre de la empresa
    String nombreempresa;
    String cif;
    
    //Constructor por parámetros para empresa
    public Empresa(String id, String telf, String email, String nombreempresa, String cif)
    {
      super(id, telf, email);
      this.nombreempresa=nombreempresa;
      this.cif=cif;
    }
    
    //Constructor default para empresa
    /*public Empresa()
    {
        this.nombreempresa=new String ("Nueva empresa");
        this.cif=new String ("xxxxxxxx");       
    }*/
}
