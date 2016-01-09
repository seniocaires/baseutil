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

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.beanutils.BeanComparator;

/**
 * Classe base para utilitarios de ordenação.
 * @author Senio Caires
 */
public final class OrdenacaoUtil {

	/* ------------------------------
	 * CONTRUTORES
	 * ------------------------------
	 */

	/**
	 * Construtor padrão privado.
	 * @author Senio Caires
	 */
	private OrdenacaoUtil() { }

	/* ------------------------------
	 * LISTA
	 * ------------------------------
	 */

	/**
	* Método responsável por retorna uma lista de Object ordenada pelo nome do campo informado. <br/>
	* Ordena em ordem crescente.
	* @param lista - Lista
	* @param campo - Campo
	* @return lista ordenada
	* @author Senio Caires
	*/
	@SuppressWarnings("rawtypes")
	public static List ordenarLista(final List lista, final String campo) {
		return ordenarLista(lista, campo, TipoOrdenacao.CRESCENTE);
	}

	/**
	* Método responsável por retorna uma lista de Object ordenada pelo nome do campo informado.
	* @param lista - Lista
	* @param campo - Campo
	* @param tipoOrdenacao - Tipo de ordenação
	* @return lista ordenada
	* @author Senio Caires
	*/
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List ordenarLista(final List lista, final String campo, final TipoOrdenacao tipoOrdenacao) {

		if (lista != null && !lista.isEmpty() && campo != null && !(campo.trim().length() == 0)) {

			BeanComparator ordem = new BeanComparator(campo, new Comparator() {

				public int compare(final Object o1, final Object o2) {

					int resultado = 0;
					final int maximoCaracteres = 20;

					if (o1 instanceof Integer) {
						resultado = ((String) ManipulacaoUtil.adicionarChar('0', maximoCaracteres, o2.toString(), true)).compareToIgnoreCase((String) ManipulacaoUtil.adicionarChar('0', maximoCaracteres, o1.toString(), true));
					} else {
						resultado = ((String) o2.toString()).compareToIgnoreCase((String) o1.toString());
					}

					return resultado;
				}
			}
					);

			Collections.sort(lista, ordem);

			if (TipoOrdenacao.CRESCENTE.equals(tipoOrdenacao)) {
				Collections.reverse(lista);
			}
		}

		return lista;
	}
}
