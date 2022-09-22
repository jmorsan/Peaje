package Tickets;

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
	 * Metodo para calcular la tarifa y mostrar el ticket de salid
	 */
	@Override
	public double calcularTarifa(double salida)
	{
		double tarifa=0.0;
		double totalkm=salida-getEntrada();
		totalkm=Math.abs(totalkm);
		
		
		
		if(totalkm>Constants.REDUCCION_ESPECIAL_KM_MIN)
		{
			tarifa=(double)(totalkm*getPreciokm()*this.pasajeros)-((totalkm*getPreciokm())* Constants.REDUCCION_ESPECIAL_PORCENTAJE);
			
		}else
		{
			tarifa=(totalkm*this.getPreciokm()*this.pasajeros);
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
