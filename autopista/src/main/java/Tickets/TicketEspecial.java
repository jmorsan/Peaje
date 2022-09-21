package Tickets;

import java.util.Scanner;

public class TicketEspecial extends Ticket
{

	public TicketEspecial(Double entrada, Double preciokm)
	{
		super(entrada, preciokm);
		
	}

	@Override
	public double calcularTarifa(double salida)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca numero pasajeros: ");
		int numpasajeros=Integer.parseInt(sc.nextLine());
		
		double tarifa=0.0;
		double totalkm=salida-getEntrada();
		totalkm=Math.abs(totalkm);
		double reduccion=0.10;
		
		
		
		if(totalkm>100)
		{
			tarifa=(double)(totalkm*getPreciokm())-((totalkm*getPreciokm())*reduccion);
			
		}
		
		
		return tarifa;
	}

	
	

}
