package Tickets;

public class TicketGeneral extends Ticket
{
	
	
	

	public TicketGeneral(double entrada, double preciokm)
	{
		super(entrada, preciokm);
		
	}
	

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
		
		System.out.println("\n Entrada: "+ this.getEntrada() +"\n Salida: " + salida + "\n Total a pagar: " + tarifa );
		
		return tarifa;
	}


	@Override
	public String toString() {
		
		return super.toString();
	}
	
	@Override
	public boolean equals(Object o)
	{
		
		Ticket tmpTicket=(Ticket)o;
		
		
		if(o instanceof TicketEspecial)
		{
			
			return true;
		}else if(this.getEntrada()==tmpTicket.getEntrada() && this.getPreciokm()==tmpTicket.getPreciokm() )
		{
			return true;
		}
		
		return false;
		
	}
	
	
	

}
