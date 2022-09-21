package Tickets;

import java.util.Scanner;

public class TicketEspecial extends Ticket
{
	private int pasajeros;

	public TicketEspecial(Double entrada, Double preciokm,int pasajeros)
	{
		super(entrada, preciokm);

		this.pasajeros=pasajeros;
		
	}

	public int getPasajeros() {
		return pasajeros;
	}

	

	@Override
	public double calcularTarifa(double salida)
	{
		
		
		double tarifa=0.0;
		double totalkm=salida-getEntrada();
		totalkm=Math.abs(totalkm);
		double reduccion=0.05;
		
		
		
		if(totalkm>100)
		{
			tarifa=(double)(totalkm*getPreciokm()*this.pasajeros)-((totalkm*getPreciokm())*reduccion);
			
		}else
		{
			tarifa=(totalkm*this.getPreciokm()*this.pasajeros);
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
		
		TicketEspecial tmpTicket=(TicketEspecial)o;
		
		
		if(o instanceof TicketEspecial)
		{
			
			return true;
		}else if(this.getEntrada()==tmpTicket.getEntrada() && this.getPreciokm()==tmpTicket.getPreciokm() && this.getPasajeros()==tmpTicket.getPasajeros() )
		{
			return true;
		}
		
		
		System.out.println();

		return false;
		
	}



	
	

}
