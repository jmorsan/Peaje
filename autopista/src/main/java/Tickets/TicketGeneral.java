package Tickets;
/**
 * Clase para crear Ticket Generales.
 */
public class TicketGeneral extends Ticket
{
	
	
	
	/** 
	 * Constructor Ticket Generales
	**/
	public TicketGeneral(double entrada, double preciokm)
	{
		super(entrada, preciokm);
		
	}
	
	/**
	 * Metodo para calcular la tarifa y mostrar el ticket de salid
	 */
	@Override
	public double calcularTarifa(double salida)
	{
		double tarifa=0.0;
		double totalkm=salida-this.getEntrada();
		totalkm=Math.abs(totalkm);
		double reduccion=0.1;
		
		
		if(totalkm>500)
		{
			tarifa=(totalkm*this.getPreciokm())-((totalkm*this.getPreciokm())*reduccion);
			
		}else
		{
			tarifa=(totalkm*this.getPreciokm());
		}
		
		mostrarTicketSalida(tarifa, salida);
		
		return tarifa;
	}

	public void mostrarTicketSalida(double tarifa, double salida){
		
		System.out.println("\n Entrada: "+ this.getEntrada() +"\n Salida: " + salida + "\n Total a pagar: " + tarifa); 

	}

	/*
	 * Metodo sobreescrito para mostrar el ticket de entrada
	 */
	@Override
	public String toString() {
		
		return super.toString();
	}
	
	/*
	 * Metodo equals para comparar tickets entre si.
	 */
	@Override
	public boolean equals(Object o)
	{
		
		Ticket tmpTicket=(Ticket)o;
		
		
		if(o instanceof TicketGeneral)
		{
			if(this.getEntrada()==tmpTicket.getEntrada() && this.getPreciokm()==tmpTicket.getPreciokm() )
			{

			return true;
			
			}
			
		}
		
		return false;
		
	}
	
	
	

}
