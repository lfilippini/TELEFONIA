package ar.edu.unlam.pbii.grupo01;

public abstract class Cliente {

	
	
	protected String nombre;
	protected Integer numeroDeCliente;
	
	public Cliente(Integer numeroDeCliente, String nombreDelCliente) {
		
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getnumeroDeCliente() {
		return this.numeroDeCliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDeCliente == null) ? 0 : numeroDeCliente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (numeroDeCliente == null) {
			if (other.numeroDeCliente != null)
				return false;
		} else if (!numeroDeCliente.equals(other.numeroDeCliente))
			return false;
		return true;
	}

	

}

