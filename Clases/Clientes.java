package Clases;

public class Clientes extends Personas {
    private String codigoCliente;
    private int credito;

    //Constructores
    public Clientes(String n,int dn, String em, int tel, String codC, int cred){
        /*this.nombre = n;
        this.dni = dn;
        this.email = em;
        this.telefono = tel;*/
            super(n,dn,em,tel);
        // ¿Por qué el código de cliente es un número aleatorio?
        // ¿Por qué? No hay porque,
        this.codigoCliente=Funciones.Generadores.CodCliente();
        //this.credito=cred; 
            this.credito=10000;
    }

    //getters
    public int getCredito(){return this.credito;}
    public String getCodigoCliente(){return this.codigoCliente;}

    public String toString(){
        return "El cliente " + super.getNombre() + ", DNI " + super.getDNI() + ", tiene como número de cliente " + this.codigoCliente + " y tiene un crédito de " + this.credito + " \n Datos de contacto: " + super.getEmail() + "\t" + super.getTelefono();
    }

    public String toArchivo(){
        return 
        "{\n" + 
        super.getNombre() + "\n" +
        super.getDNI() + "\n" + 
        this.getCodigoCliente() + "\n" + 
        this.getCredito() + "\n" + 
        super.getEmail() + "\n" + 
        super.getTelefono() + "\n}";
    }
}
