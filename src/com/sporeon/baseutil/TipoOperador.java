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
