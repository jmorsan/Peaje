package Tickets;

import java.util.Scanner;
/**
 * Clase para crear Ticket Especiales.
 */
public class TicketEspecial extends Ticket
{
	private int pasajeros;

	/** 
	 * Constructor Ticket Generales
	**/
	public TicketEspecial(Double entrada, Double preciokm,int pasajeros)
	{
		super(entrada, preciokm);

		this.pasajeros=pasajeros;
		
	}
	/**
	 * Metodo para obtener el numerode pasajeros.
	 * @return numero de pasajeros.
	 */
	public int getPasajeros() {
		return pasajeros;
	}

	
	/**
	 * Metodo para calcular la tarifa
	 */
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
		
		
		if(o instanceof TicketEspecial)
		{

			TicketEspecial tmpTicketEspecial=(TicketEspecial)o;

			if(this.getEntrada() == tmpTicketEspecial.getEntrada() && this.getPreciokm() == tmpTicketEspecial.getPreciokm() && this.getPasajeros()==tmpTicketEspecial.getPasajeros() )
			{

				return true;

			}	
			
		} 
		
		return false;
		
	}



	
	

}
