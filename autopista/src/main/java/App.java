

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.IOException;

import Tickets.Ticket;
import Tickets.TicketEspecial;
import Tickets.TicketGeneral;

public class App 
{
    // El log para ESTA clase en particular
    private final static Logger LOGGER = Logger.getLogger("main.java.App");
    public static void main( String[] args )
    {

        try {
            // Los handler (manejadores) indican a donde mandar la salida ya sea consola o archivo
            // En este caso ConsoleHandler envia los logs a la consola
            Handler consoleHandler = new ConsoleHandler();
            // Con el manejador de archivo, indicamos el archivo donde se mandaran los logs
            // El segundo argumento controla si se sobre escribe el archivo o se agregan los logs al final
            // Para sobre escribir pase un true para agregar al final, false para sobre escribir
            // todo el archivo
            Handler fileHandler = new FileHandler("./ERROR.txt", false);

            // El formateador indica como presentar los datos, en este caso usaremos el formaro sencillo
            // el cual es mas facil de leer, si no usamos esto el log estara en formato xml por defecto
            SimpleFormatter simpleFormatter = new SimpleFormatter();

            // Se especifica que formateador usara el manejador (handler) de archivo
            fileHandler.setFormatter(simpleFormatter);

            // Asignamos los handles previamente declarados al log *raiz* esto es muy importante ya que
            // permitira que los logs de todas y cada una de las clases del programa que esten en ese paquete
            // o sus subpaquetes se almacenen en el archivo y aparescan en consola
            //LOGGER.addHandler(consoleHandler);
            LOGGER.addHandler(fileHandler);

            // Indicamos a partir de que nivel deseamos mostrar los logs, podemos especificar un nivel en especifico
            // para ignorar informacion que no necesitemos
            consoleHandler.setLevel(Level.ALL);
            fileHandler.setLevel(Level.ALL);

            LOGGER.log(Level.INFO, "Bitacora inicializada");

            

            // Estas llamadas se registraran en el log
            LOGGER.log(Level.INFO, "Llamadas a los componentes del sistema");


            LOGGER.log(Level.INFO, "Probando manejo de excepciones");

            
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, "Error de IO");
        } catch (SecurityException ex) {
            LOGGER.log(Level.SEVERE, "Error de Seguridad");
        }

        System.out.println( "BIENVENIDO A PEAJEPLUS" );
        
        System.out.println( "\n TARIFA GENERAL" );
        
        System.out.println( "\n RECOJA SU TICKET DE ENTRADA" );
        Ticket coche = new TicketGeneral(200,1);
        System.out.println(coche.toString());
        
        System.out.println( "\n RECOJA SU TICKET DE SALIDA" );
        
        coche.calcularTarifa(300);
        
        
        System.out.println( "BIENVENIDO A PEAJEPLUS" );
        
        System.out.println( "\n TARIFA ESPECIAL" );
        
        System.out.println( "\n RECOJA SU TICKET DE ENTRADA" );
        Ticket bus = new TicketEspecial(200.0,1.0,12);
        System.out.println(bus.toString());
        
        System.out.println( "\n RECOJA SU TICKET DE SALIDA" );
        
        bus.calcularTarifa(300);
        
        coche.equals(bus);
        
        
        
        
        
        
    }
}
