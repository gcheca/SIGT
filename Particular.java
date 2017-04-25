import java.lang.String;
public class Particular extends Clientes
{
    //Además de las heredadas. Nombre, Apellidos, NIF
    String nombre;
    String apellido;
    String nif;

    //Contructor por parámetros de Particular
    public Particular(String id, String telf, String email, String nombre, String apellido, String nif)
    {
        super(id, telf, email);
        this.nombre=nombre;
        this.apellido=apellido;
        this.nif=nif;
    }
    //Constructor default de Particular
    /*public Particular()
    {
        super(id, telf, email);
        this.nombre="Nombre";
        this.apellido="Apellido";
        this.nif="xxxxxxxx";
    }*/
}
