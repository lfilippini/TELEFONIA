package ar.edu.unlam.pbii.grupo01;


public class ClienteTelefonia extends Cliente implements Comparable <Cliente>{
	
	private String telefono="";
	private String codigoDeArea="";
	
	public ClienteTelefonia(Integer numeroDeCliente, String nombreDelCliente, String codigoDeArea, String telefono) {
		super(numeroDeCliente,nombreDelCliente);
		this.telefono=telefono;
		this.codigoDeArea=codigoDeArea;
	}

	public Object getCodigoDeArea() {
		return this.codigoDeArea;
	}

	public Object getTelefono() {
		return this.telefono;
	}

	@Override
	public int compareTo(Cliente otroCliente) {
		return this.numeroDeCliente.compareTo(otroCliente.numeroDeCliente);
	}
	

}
