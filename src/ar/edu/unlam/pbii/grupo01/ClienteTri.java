package ar.edu.unlam.pbii.grupo01;

public class ClienteTri extends Cliente implements Comparable <Cliente>{// numeroDeCliente , nombreDelCliente, codigoDeArea, telefono,
											// codigoDecodificador, mail

	private String codigoDeArea="";
	private String telefono="";
	private String codigoDecodificador="";
	private String mail="";
	
	public ClienteTri(Integer numeroDeCliente, String nombreDelCliente, String codigoDeArea, String telefono,
			String codigoDecodificador, String mail) {
		
		super(numeroDeCliente,nombreDelCliente);
		this.codigoDeArea=codigoDeArea;
		this.telefono=telefono;
		this.codigoDecodificador=codigoDecodificador;
		this.mail=mail;	
	}

	public Object getCodigoDeArea() {
		return this.codigoDeArea;
	}

	public Object getEMail() {
		return this.mail;
	}

	public Object getCodigoDecodificador() {
		return this.codigoDecodificador;
	}
	
	public String getTelefono() {
		return telefono;
	}

	public String getMail() {
		return mail;
	}

	@Override
	public int compareTo(Cliente otroCliente) {
		return this.numeroDeCliente.compareTo(otroCliente.numeroDeCliente);
	}
}
