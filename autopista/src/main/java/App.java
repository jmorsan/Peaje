

import Tickets.Ticket;
import Tickets.TicketEspecial;
import Tickets.TicketGeneral;

public class App 
{
    public static void main( String[] args )
    {
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
