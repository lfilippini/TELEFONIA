package ar.edu.unlam.pbii.grupo01;


public class ClienteBandaAncha extends Cliente implements Comparable <Cliente>{//numeroDeCliente / nombre / mail

	private String mail="";
	
	public ClienteBandaAncha(Integer numeroDeCliente, String nombreDelCliente, String mail) {
		super(numeroDeCliente,nombreDelCliente);
		this.mail=mail;
	}

	public Object getEMail() {
		return this.mail;
	}

	@Override
	public int compareTo(Cliente otroCliente) {
		return this.numeroDeCliente.compareTo(otroCliente.numeroDeCliente);
	}
}
