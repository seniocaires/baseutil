package com.sporeon.baseutil;

import java.util.List;

/**
 * Classe base para utilitarios de operador.
 * @author Senio Caires
 */
public final class OperadorUtil {

	/* ------------------------------
	 * CONTRUTORES
	 * ------------------------------
	 */

	/**
	 * Construtor padrão privado.
	 * @author Senio Caires
	 */
	private OperadorUtil() { }

	/* ------------------------------
	 * OUTROS
	 * ------------------------------
	 */

	/**
	 * Substitui os operadores contidos na string pelo seu respectivo valor.
	 * @author Senio Caires
	 * @param operadores - Operadores
	 * @param string - String
	 * @return String
	 */
	public static String replaceOperador(final List<Operador> operadores, final String string) {

		StringBuilder resultado = new StringBuilder(string);

		for (Operador operador : operadores) {
			resultado = new StringBuilder(ManipulacaoUtil.substituirString(resultado.toString(), operador.getNome(), operador.getValor()));
		}

		return resultado.toString();
	}
}
