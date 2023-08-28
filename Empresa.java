import Clases.Clientes;
import Clases.Personas;
import java.util.Scanner;
import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {
        ArrayList<Clientes> listaPersonas = new ArrayList<Clientes>();
        boolean flag = true;
        String op;
        String nombre,email;
        int dni,telefono;
        Scanner s = new Scanner (System.in);
        do{
            Clases.Menues.MenuPrincipal();
            switch(s.nextLine()){
                case "1":
                do{
                    System.out.println("Ingrese los datos de la persona");
                    System.out.println("Nombre: \t");
                    nombre=s.nextLine();
                    System.out.println("E-Mail: \t");
                    email=s.nextLine();
                    System.out.println("DNI: \t");
                    dni=s.nextInt();
                    System.out.println("Teléfono: \t");
                    telefono=s.nextInt();
                    //listaPersonas.add(new Personas(nombre,dni,email,telefono));
                    listaPersonas.add(new Clientes(nombre,dni,email,telefono,Funciones.Generadores.CodCliente(),10000));
                    op = s.nextLine();
                    op = Clases.Validaciones.SiNo(op);
                    break;
                    } while (op.equals("s"));
                case "2":
                    for (Clientes aux : listaPersonas ){
                        System.out.println(aux.toArchivo());
                    }
                    break;
                case "debug":
                    break;

            }
        } while(flag);
    }
}
