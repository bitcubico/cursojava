/**
 * Derechos reservados a bitcubico.com
 */
package com.cursojava.practica.enumeraciones;

import com.cursojava.teoria.DiasEnum;
import com.cursojava.teoria.MesesEnum;

/**
 * Esta clase describe los elementos básicos para la conformacióde una
 * enumerción de meses
 * 
 * @author Mauricio Montoya Medrano
 * @version 1.0.0
 */
public class EnumeracionesPractica {

	public static void main(String[] args) {
		Imprimir("-------------- DÍAS DE LA SEMANA ----------------");
		GetNumeroDiaSemana(DiasEnum.LUNES);
		GetNumeroDiaSemana(DiasEnum.MARTES);
		GetNumeroDiaSemana(DiasEnum.MIERCOLES);
		GetNumeroDiaSemana(DiasEnum.JUEVES);
		GetNumeroDiaSemana(DiasEnum.VIERNES);
		GetNumeroDiaSemana(DiasEnum.SABADO);
		GetNumeroDiaSemana(DiasEnum.DOMINGO);
		
		Imprimir("-------------- TOTAL DÍAS DEL MES ----------------");
		GetNumeroDiasMes(MesesEnum.ENERO);
		GetNumeroDiasMes(MesesEnum.FEBRERO);
		GetNumeroDiasMes(MesesEnum.MARZO);
		GetNumeroDiasMes(MesesEnum.ABRIL);
		GetNumeroDiasMes(MesesEnum.MAYO);
		GetNumeroDiasMes(MesesEnum.JUNIO);
		GetNumeroDiasMes(MesesEnum.JULIO);
		GetNumeroDiasMes(MesesEnum.AGOSTO);
		GetNumeroDiasMes(MesesEnum.SEPTIEMBRE);
		GetNumeroDiasMes(MesesEnum.OCTUBRE);
		GetNumeroDiasMes(MesesEnum.NOVIEMBRE);
		GetNumeroDiasMes(MesesEnum.DICIEMBRE);
	}

	public static void GetNumeroDiaSemana(DiasEnum dia) {
		String mensaje = "día de la semana " + dia.toString();
		switch (dia) {
		case LUNES:
			Imprimir("Primer " + mensaje);
			break;
		case MARTES:
			Imprimir("Segundo " + mensaje);
			break;
		case MIERCOLES:
			Imprimir("Tercer " + mensaje);
			break;
		case JUEVES:
			Imprimir("Cuarto " + mensaje);
			break;
		case VIERNES:
			Imprimir("Quinto " + mensaje);
			break;
		case SABADO:
			Imprimir("Sexto " + mensaje);
			break;
		case DOMINGO:
			Imprimir("Séptimo " + mensaje);
			break;
		default:
			Imprimir("No existe este " + mensaje);
			break;
		}
	}
	
	public static void GetNumeroDiasMes(MesesEnum mes) {
		String mensaje = "El mes " + mes.toString() + " tiene: ";
		switch (mes) {
		case ENERO:
		case MARZO:
		case MAYO:
		case JULIO:
		case AGOSTO:
		case OCTUBRE:
		case DICIEMBRE:
			Imprimir(mensaje + "31 días");
			break;
		case FEBRERO:
			Imprimir(mensaje + "28 ó 29 días");
			break;
		case ABRIL:
		case JUNIO:
		case SEPTIEMBRE:
		case NOVIEMBRE:
			Imprimir(mensaje + "30 días");
			break;
		default:
			Imprimir("No existe este mes");
			break;
		}
	}

	public static void Imprimir(String mensaje) {
		System.out.println(mensaje);
	}
}
