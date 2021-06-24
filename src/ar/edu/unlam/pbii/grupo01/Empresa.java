package ar.edu.unlam.pbii.grupo01;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



public class Empresa {

	private String nombreDeLaEmpresa="";
	private Map<Integer,Cliente> lista = new TreeMap <Integer,Cliente>();
	
	public Empresa(String nombreDeLaEmpresa) {
		this.nombreDeLaEmpresa=nombreDeLaEmpresa;
	}

	public void agregarCliente(Cliente cliente) {
	
		lista.put(cliente.getnumeroDeCliente(),cliente);
	}

	public Integer getCantidadAbonados() {
		return lista.size();
	}

	public String getNombreDeLaEmpresa() {
		return nombreDeLaEmpresa;
	}

	public Map<Integer, Cliente> getLista() {
		return lista;
	}
	
	

//	public Hechizo buscar(String conjuro) {
//		return lista.get(conjuro);
//	}
}
