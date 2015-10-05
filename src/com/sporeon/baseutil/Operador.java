package com.sporeon.baseutil;

/**
 * Classe que define um operador.
 * @author Senio Caires
 */
public class Operador {

	/* ------------------------------
	 * ATRIBUTOS
	 * ------------------------------
	 */

	/**
	 * Nome do operador.
	 * @author Senio Caires
	 */
	private String nome = "";

	/**
	 * Descrição do operador.
	 * @author Senio Caires
	 */
	private String descricao = "";

	/**
	 * Valor do operador.
	 * @author Senio Caires
	 */
	private String valor = "";

	/**
	 * Tipo do operador.
	 * @author Senio Caires
	 */
	private TipoOperador tipo;

	/* ------------------------------
	 * CONTRUTORES
	 * ------------------------------
	 */

	/**
	 * Construtor padrão privado.
	 * @author Senio Caires
	 */
	public Operador() { }

	/**
	 * Constrói informando o nome e a descrição.
	 * @author Senio Caires
	 * @param nomeParametro - Nome
	 * @param descricaoParametro - Descrição
	 */
	public Operador(final String nomeParametro, final String descricaoParametro) {
		setNome(nomeParametro);
		setDescricao(descricaoParametro);
		setValor(descricaoParametro);
	}

	/**
	 * Constrói informando o nome, a descrição, o valor e o tipo.
	 * @author Senio Caires
	 * @param nomeParametro - Nome
	 * @param descricaoParametro - Descrição
	 * @param valorParametro - Valor
	 * @param tipoParametro - Tipo
	 */
	public Operador(final String nomeParametro, final String descricaoParametro, final String valorParametro, final TipoOperador tipoParametro) {
		setNome(nomeParametro);
		setDescricao(descricaoParametro);
		setValor(valorParametro);
		setTipo(tipoParametro);
	}

	/**
	 * Constrói informando o nome, a descrição e o valor.
	 * @author Senio Caires
	 * @param nomeParametro - Nome
	 * @param descricaoParametro - Descrição
	 * @param valorParametro - Valor
	 */
	public Operador(final String nomeParametro, final String descricaoParametro, final String valorParametro) {
		setNome(nomeParametro);
		setDescricao(descricaoParametro);
		setValor(valorParametro);
	}

	/* ------------------------------
	 * GET / SET
	 * ------------------------------
	 */

	/**
	 * Retorna o nome.
	 * @author Senio Caires
	 * @return nome
	 */
	public final String getNome() {
		return nome;
	}

	/**
	 * Altera o nome.
	 * @author Senio Caires
	 * @param nomeParametro - Nome
	 */
	public final void setNome(final String nomeParametro) {
		this.nome = nomeParametro;
	}

	/**
	 * Retorna a descrição.
	 * @author Senio Caires
	 * @return descricao
	 */
	public final String getDescricao() {
		return descricao;
	}

	/**
	 * Altera a descrição.
	 * @author Senio Caires
	 * @param descricaoParametro - Descrição
	 */
	public final void setDescricao(final String descricaoParametro) {
		this.descricao = descricaoParametro;
	}

	/**
	 * Retorna o valor.
	 * @author Senio Caires
	 * @return valor
	 */
	public final String getValor() {
		return valor;
	}

	/**
	 * Altera o valor.
	 * @author Senio Caires
	 * @param valorParametro - Valor
	 */
	public final void setValor(final String valorParametro) {
		this.valor = valorParametro;
	}

	/**
	 * Retorna o tipo.
	 * @author Senio Caires
	 * @return tipo
	 */
	public final TipoOperador getTipo() {
		return tipo;
	}

	/**
	 * Altera o tipo.
	 * @author Senio Caires
	 * @param tipoParametro - Tipo
	 */
	private void setTipo(final TipoOperador tipoParametro) {
		this.tipo = tipoParametro;
	}

	/* ------------------------------
	 * OUTROS
	 * ------------------------------
	 */

	/**
	 * Retorna true se o tipo for SQL.
	 * Retorna false se o tipo não for SQL.
	 * @author Senio Caires
	 * @return true se o tipo for SQL.
	 */
	public final boolean isTipoSql() {
		return TipoOperador.SQL.equals(getTipo());
	}

	/**
	 * Retorna true se o tipo for DATA.
	 * Retorna false se o tipo não for DATA.
	 * @author Senio Caires
	 * @return true se o tipo for DATA.
	 */
	public final boolean isTipoData() {
		return TipoOperador.DATA.equals(getTipo());
	}

	/**
	 * Retorna true se o tipo for FUNÇÃO.
	 * Retorna false se o tipo não for FUNÇÃO.
	 * @author Senio Caires
	 * @return true se o tipo for FUNÇÃO.
	 */
	public final boolean isTipoFuncao() {
		return TipoOperador.FUNCAO.equals(getTipo());
	}
}
