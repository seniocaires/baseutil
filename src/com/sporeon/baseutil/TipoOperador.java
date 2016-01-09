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

/**
 * Classe Enum para definir os tipos de operador.
 * @author Senio Caires
 */
public enum TipoOperador {

	/* ------------------------------
	 * DEFINIÇÃO
	 * ------------------------------
	 */

	/**
	 * DATA.
	 * @author Senio Caires
	 */
	DATA("Data"),

	/**
	 * FUNÇÃO.
	 * @author Senio Caires
	 */
	FUNCAO("Função"),

	/**
	 * SQL.
	 * @author Senio Caires
	 */
	SQL("Sql");

	/* ------------------------------
	 * ATRIBUTOS
	 * ------------------------------
	 */

	/**
	 * Descrição da enumeração.
	 * @author Senio Caires
	 */
	private String descricao;

	/* ------------------------------
	 * CONSTRUTORES
	 * ------------------------------
	 */

	/**
	 * Construtor padrão.
	 * @author Senio Caires
	 * @param descricaoEnumeracao - Descreve a enumeração
	 */
	private TipoOperador(final String descricaoEnumeracao) {
		this.descricao = descricaoEnumeracao;
	}

	/* ------------------------------
	 * GET
	 * ------------------------------
	 */

	/**
	 * Retorna a descrição.
	 * @author Senio Caires
	 * @return descricao
	 */
	public final String getDescricao() {
		return this.descricao;
	}
}
