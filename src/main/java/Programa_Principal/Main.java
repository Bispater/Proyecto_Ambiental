package Programa_Principal;
import Manejo_Csv.CSVFile;
import Usuarios.Admin;
import Usuarios.Usuario;
import VistaMain.Principal;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner entrada;

    public static void main(String[] args){
        int opcion;
        int value = 0;
        FileReader archCSV = null;


        // LECTURA ARCHIVO
        CSVFile archivo = new CSVFile();
        archivo.leerArchivo("src/main/resources/CSVTEST.csv");
        //ESCRIBIR EN ARCHIVO CSV
        /*
        CSVManage ob = new CSVManage();
        String[] header = { "Nombre", "Apellido"};
        ob.writeCSV("src/main/resources/CSVTEST.csv", header);
        */


        entrada = new Scanner(System.in);

        do{
            //INICIA LA INTERFAZ CON LAS OPCIONES ANTES HECHAS POR CONSOLA.
            
            Principal VistaPrincipal = new Principal();
            VistaPrincipal.setVisible(true);
            
            System.out.println("============================");
            System.out.println("1.- ADMINISTRADOR");
            System.out.println("2.- USUARIO NORMAL");
            System.out.println("0.- EXIT");
            System.out.println("============================");
            System.out.print("ESCOGA UNA OPCION: ");
            opcion=entrada.nextInt();
            //Prueba

            Admin adminDefecto = new Admin(); //Admin por defecto para poder ingresar

            Usuario usuarioDefecto = new Usuario();
            //administradores.add(adm1);
            //PuntoReciclaje pto1 = new PuntoReciclaje();
            //pto1.CrearPuntoReciclaje();
            //puntosReciclaje.add(pto1);
            //-----------------
            try {
                switch (opcion) {
                    case 1:
                        adminDefecto.MenuAdministrador();
                        break;
                    case 2:
                        usuarioDefecto.MenuUsuario();
                        break;
                    case 0:
                        return;
                    default:
                        throw new Exception("No se puede ejecutar esa opcion ");

                }
            }catch(Exception e )
                {
                    e.printStackTrace();

                }

        }while(true);
    }
}