package Tickets;

public abstract class Ticket implements ITicket
{
	
	private final double entrada;
	private final double preciokm;
	
	
	
	protected Ticket(double entrada, double preciokm)
	{
		
		this.entrada = entrada;
		this.preciokm = preciokm;
		
	}
	
	

	public double getEntrada()
	{
		return entrada;
	}

	
	public double getPreciokm()
	{
		return preciokm;
	}



	public abstract double calcularTarifa(double salida);



	@Override
	public String toString() {
		return "Ticket [entrada=" + entrada + ", preciokm=" + preciokm + "]";
	}
	
	

}
