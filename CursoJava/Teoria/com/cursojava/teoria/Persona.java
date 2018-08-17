/**
 * Derechos reservados a bitcubico.com
 */
package com.cursojava.teoria;

import java.time.LocalDateTime;

public class Persona implements AutoCloseable{
	private int numeroIdentificacion;
	private String nombres;
	private String apellidos;
	private LocalDateTime fechaNacimiento;
	private String tipoSangre;
	private short estatura;
	private short peso;

	public Persona(int numeroIdentificacion, String nombres, String apellidos) {
		this.numeroIdentificacion = numeroIdentificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		try {
			String separador = "|--> ";
			String tabulador =  "\t";
			String saltoLinea = "\n";
			sb.append("Persona\n");
			sb.append(separador).append("N�mero de Identificación:").append(tabulador).append(numeroIdentificacion).append(saltoLinea);
			sb.append(separador).append("Nombres:").append(tabulador).append(tabulador).append(tabulador).append(nombres).append(saltoLinea);
			sb.append(separador).append("Apellidos:").append(tabulador).append(tabulador).append(tabulador).append(apellidos).append(saltoLinea);
			
			sb.append(separador).append("Fecha de nacimiento:").append(tabulador);
			if(fechaNacimiento != null)
				sb.append(fechaNacimiento.toString());
			
			sb.append(saltoLinea);
			sb.append(separador).append("Tipo de sangre:");
			if(tipoSangre != null && !tipoSangre.isEmpty())
				sb.append(tabulador).append(tabulador).append(tipoSangre);
			
			sb.append(saltoLinea);
			sb.append(separador).append("Estatura:");
			if(estatura > 0)
				sb.append(tabulador).append(tabulador).append(tabulador).append(estatura);
			
			sb.append(saltoLinea);
			sb.append(separador).append("Peso Corporal:");
			if(peso > 0)
				sb.append(tabulador).append(tabulador).append(peso);
			
			return sb.toString();
		} finally {
			System.gc();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroIdentificacion;
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
		Persona other = (Persona) obj;
		if (numeroIdentificacion != other.numeroIdentificacion)
			return false;
		return true;
	}

	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public short getEstatura() {
		return estatura;
	}

	public void setEstatura(short estatura) {
		this.estatura = estatura;
	}

	public short getPeso() {
		return peso;
	}

	public void setPeso(short peso) {
		this.peso = peso;
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
