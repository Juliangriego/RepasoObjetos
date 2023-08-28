package Clases;

public class Personas{
    private String nombre;
    private int dni;
    private String email;
    private int telefono;

    //Constructores
/*    public Personas(String n,int dn){this.nombre = n;this.dni = dn;}
    public Personas(String n,int dn, String em){this.nombre = n;this.dni = dn;this.email = em;}
    public Personas(String n,int dn, int tel){this.nombre = n;this.dni = dn;this.telefono = tel;}*/
    public Personas(String n,int dn, String em, int tel){
        this.nombre = n;
        this.dni = dn;
        this.email = em;
        this.telefono = tel;}
    public Personas(){}

    //Setters y getters
        public void setNombre       (String nom)    {this.nombre=nom;}
        public void setDNI          (int num )      {this.dni=num;} 
        public void setEmail        (String e)      {this.email=e;} 
        public void setTelefono     (int telf)      {this.telefono=telf;}

        public String getNombre     ()              {return this.nombre;}
        public int getDNI           ()              {return this.dni;}
        public String getEmail      ()              {return this.email;}
        public int getTelefono      ()              {return this.telefono;}
}