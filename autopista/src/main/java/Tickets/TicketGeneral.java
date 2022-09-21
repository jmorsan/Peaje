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
		double totalkm=salida-getEntrada();
		totalkm=Math.abs(totalkm);
		double reduccion=0.05;
		
		
		if(totalkm>500)
		{
			tarifa=(totalkm*getPreciokm())-((totalkm*getPreciokm())*reduccion);
			
		}
		
		
		return tarifa;
	}


	@Override
	public String toString() {
		return "Total a pagar ";
	}
	
	
	

}
