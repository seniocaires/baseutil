/*
 * baseutil, api de utilitários Java.
 * Copyright (c) 2015 Senio Caires
 * e-mail: seniocaires@gmail.com
 * 
 * Este arquivo é parte da api baseutil
 * 
 * baseutil é um software livre; você pode redistribuí-lo e/ou
 * modificá-lo dentro dos termos da Licença Pública Geral GNU como
 * publicada pela Fundação do Software Livre (FSF); na versão 3 da
 * Licença, ou (na sua opinião) qualquer versão.
 * 
 * Este programa é distribuído na esperança de que possa ser  útil,
 * mas SEM NENHUMA GARANTIA; sem uma garantia implícita de ADEQUAÇÃO
 * a qualquer MERCADO ou APLICAÇÃO EM PARTICULAR. Veja a
 * Licença Pública Geral GNU para maiores detalhes.
 * 
 * Você deve ter recebido uma cópia da Licença Pública Geral GNU junto
 * com este programa, Se não, veja <http://www.gnu.org/licenses/>.
 */
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
