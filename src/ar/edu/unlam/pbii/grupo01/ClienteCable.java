package ar.edu.unlam.pbii.grupo01;

public class ClienteCable extends Cliente implements Comparable <Cliente>{

	private String codigoDecodificador="";
	
	public ClienteCable(int numeroDeCliente, String nombre, String codigoDecodificador) {
		super(numeroDeCliente,nombre);
		this.codigoDecodificador=codigoDecodificador;
	}

	public String getCodigoDecodificador() {
		return this.codigoDecodificador;
	}
	
	@Override
	public int compareTo(Cliente otroCliente) {
		return this.numeroDeCliente.compareTo(otroCliente.numeroDeCliente);
	}

}
