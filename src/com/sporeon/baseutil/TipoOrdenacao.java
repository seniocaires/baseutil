package com.sporeon.baseutil;

/**
 * Classe Enum para definir os tipos de ordenação.
 * @author Senio Caires
 */
public enum TipoOrdenacao {

	/* ------------------------------
	 * DEFINIÇÃO
	 * ------------------------------
	 */

	/**
	 * CRESCENTE.
	 * @author Senio Caires
	 */
	CRESCENTE("Crescente"),

	/**
	 * DECRESCENTE.
	 * @author Senio Caires
	 */
	DECRESCENTE("Decrescente");

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
	TipoOrdenacao(final String descricaoEnumeracao) {
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
