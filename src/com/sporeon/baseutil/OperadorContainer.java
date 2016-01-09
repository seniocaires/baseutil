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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Container dos operadores.
 * @author Senio Caires
 */
public final class OperadorContainer {

	/* ------------------------------
	 * ATRIBUTOS
	 * ------------------------------
	 */

	/**
	 * Lista de operadores.
	 * @author Senio Caires
	 */
	private List<Operador> operadores;

	/* ------------------------------
	 * CONTRUTORES
	 * ------------------------------
	 */

	/**
	 * Cria um novo com a lista de operadores padrão.
	 * @author Senio Caires
	 */
	public OperadorContainer() {
		setOperadorPadrao();
	}

	/**
	 * Constrói informando a lista operadores.
	 * @author Senio Caires
	 * @param operadoresParametro - Operadores
	 */
	public OperadorContainer(final List<Operador> operadoresParametro) {
		setOperadores(operadoresParametro);
	}

	/* ------------------------------
	 * GET / SET
	 * ------------------------------
	 */

	/**
	 * Retorna o operador.
	 * @author Senio Caires
	 * @return operador
	 */
	public List<Operador> getOperadores() {

		if (operadores == null) {
			operadores = new ArrayList<Operador>();
		}

		return operadores;
	}

	/**
	 * Altera o operador.
	 * @author Senio Caires
	 * @param operadoresParametro - Operadores
	 */
	public void setOperadores(final List<Operador> operadoresParametro) {
		this.operadores = operadoresParametro;
	}

	/* ------------------------------
	 * OUTROS
	 * ------------------------------
	 */

	/**
	 * Atualiza a lista de operadores sql para a lista de operadores padrão.
	 * @author Senio Caires
	 */
	private void setOperadorPadrao() {

		List<Operador> operadorPadrao = new ArrayList<Operador>();

		/*
		 * SQL
		 */
		operadorPadrao.add(new Operador(":=", "like", "LIKE", TipoOperador.SQL));
		operadorPadrao.add(new Operador(":e", "and", "AND", TipoOperador.SQL));
		operadorPadrao.add(new Operador(":é", "is", "IS", TipoOperador.SQL));
		operadorPadrao.add(new Operador(":ou", "or", "OR", TipoOperador.SQL));
		operadorPadrao.add(new Operador(":nao", "not", "NOT", TipoOperador.SQL));
		operadorPadrao.add(new Operador(":entre", "between", "BETWEEN", TipoOperador.SQL));
		operadorPadrao.add(new Operador(":nulo", "null", "NULL", TipoOperador.SQL));
		operadorPadrao.add(new Operador(":vazio", "is null", "IS NULL", TipoOperador.SQL));
		operadorPadrao.add(new Operador(":preenchido", "is not null", "IS NOT NULL", TipoOperador.SQL));
		operadorPadrao.add(new Operador(":contem", "in", "IN", TipoOperador.SQL));
		operadorPadrao.add(new Operador(":existe", "exists", "EXISTS", TipoOperador.SQL));
		operadorPadrao.add(new Operador(":dia", "Day", "DAY", TipoOperador.SQL));
		operadorPadrao.add(new Operador(":mes", "Month", "MONTH", TipoOperador.SQL));
		operadorPadrao.add(new Operador(":ano", "Year", "YEAR", TipoOperador.SQL));
		operadorPadrao.add(new Operador(":ordenar", "order by", "ORDER BY", TipoOperador.SQL));

		/*
		 * DATA
		 */
		operadorPadrao.add(new Operador(":dataCorrente", "Data atual", DataUtil.dateParaString(new Date()), TipoOperador.DATA));
		operadorPadrao.add(new Operador(":diaCorrente", "Dia atual", String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH)), TipoOperador.DATA));
		operadorPadrao.add(new Operador(":mesCorrente", "Mês atual", String.valueOf(Integer.valueOf(Calendar.getInstance().get(Calendar.MONTH) + 1)), TipoOperador.DATA));
		operadorPadrao.add(new Operador(":anoCorrente", "Ano atual", String.valueOf(Calendar.getInstance().get(Calendar.YEAR)), TipoOperador.DATA));

		/*
		 * FUNÇÃO
		 */
		operadorPadrao.add(new Operador(":ultimoDia(mes)", "Último dia do mês."));

		setOperadores(operadorPadrao);
	}

	/**
	 * Retorna uma lista de operadores do tipo SQL.
	 * @author Senio Caires
	 * @return operadores do tipo SQL (java.util.List)
	 */
	public List<Operador> getOperadorSql() {

		List<Operador> resultado = new ArrayList<Operador>();

		for (Operador operador : getOperadores()) {
			if (operador.isTipoSql()) {
				resultado.add(operador);
			}
		}

		return resultado;
	}

	/**
	 * Retorna uma lista de operadores do tipo DATA.
	 * @author Senio Caires
	 * @return operadores do tipo DATA (java.util.List)
	 */
	public List<Operador> getOperadorData() {

		List<Operador> resultado = new ArrayList<Operador>();

		for (Operador operador : getOperadores()) {
			if (operador.isTipoData()) {
				resultado.add(operador);
			}
		}

		return resultado;
	}

	/**
	 * Retorna uma lista de operadores do tipo FUNÇÃO.
	 * @author Senio Caires
	 * @return operadores do tipo FUNCAO (java.util.List)
	 */
	public List<Operador> getOperadorFuncao() {

		List<Operador> resultado = new ArrayList<Operador>();

		resultado.addAll(getOperadorFuncaoUltimoDia());

		return resultado;
	}

	/**
	 * Retorna uma lista de operadores do tipo SQL preparados para consulta.
	 * @author Senio Caires
	 * @return operadores do tipo SQL (java.util.List)
	 */
	public List<Operador> getOperadorSqlPreparado() {

		List<Operador> resultado = new ArrayList<Operador>();

		for (Operador operador : getOperadores()) {
			if (operador.isTipoSql()) {
				resultado.add(new Operador(" " + operador.getNome() + " ", operador.getDescricao(), " " + operador.getValor() + " "));
			}
		}

		return resultado;
	}

	/**
	 * Retorna uma lista de operadores do tipo DATA preparados para consulta.
	 * @author Senio Caires
	 * @return operadores do tipo DATA (java.util.List)
	 */
	public List<Operador> getOperadorDataPreparado() {

		List<Operador> resultado = new ArrayList<Operador>();

		for (Operador operador : getOperadores()) {
			if (operador.isTipoData()) {

				String dataString;

				if (":dataCorrente".equals(operador.getNome())) {
					dataString = DataUtil.dateParaString(DataUtil.stringParaDate(operador.getValor()), "yyyy-MM-dd");
				} else {
					dataString = operador.getValor();
				}

				resultado.add(new Operador(operador.getNome(), operador.getDescricao(), dataString));
			}
		}

		return resultado;
	}

	/**
	 * Retorna uma lista de operadores do tipo FUNÇÃO preparados para consulta.
	 * @author Senio Caires
	 * @return operadores do tipo FUNCAO (java.util.List)
	 */
	public List<Operador> getOperadorFuncaoPreparado() {

		List<Operador> resultado = new ArrayList<Operador>();

		for (Operador operador : getOperadorFuncao()) {
			if (operador.isTipoFuncao()) {
				resultado.add(new Operador(operador.getNome(), operador.getDescricao(), operador.getValor()));
			}
		}

		return resultado;
	}

	/**
	 * Retorna uma lista de operador do tipo FUNÇÃO - ultimoDia.
	 * @author Senio Caires
	 * @return lista de operador do tipo FUNCAO - ultimoDia. (java.util.List))
	 */
	private List<Operador> getOperadorFuncaoUltimoDia() {

		List<Operador> resultado = new ArrayList<Operador>();

		resultado.add(new Operador(":ultimoDia(1)", "Último dia de Janeiro (31)", "31", TipoOperador.FUNCAO));
		resultado.add(new Operador(":ultimoDia(2)", "Último dia de Fevereiro (28 ou 29) do ano atual", String.valueOf(DataUtil.ultimoDiaDoMes(new Date())), TipoOperador.FUNCAO));
		resultado.add(new Operador(":ultimoDia(3)", "Último dia de Março (31)", "31", TipoOperador.FUNCAO));
		resultado.add(new Operador(":ultimoDia(4)", "Último dia de Abril (30)", "30", TipoOperador.FUNCAO));
		resultado.add(new Operador(":ultimoDia(5)", "Último dia de Maio (31)", "31", TipoOperador.FUNCAO));
		resultado.add(new Operador(":ultimoDia(6)", "Último dia de Junho (30)", "30", TipoOperador.FUNCAO));
		resultado.add(new Operador(":ultimoDia(7)", "Último dia de Julho (31)", "31", TipoOperador.FUNCAO));
		resultado.add(new Operador(":ultimoDia(8)", "Último dia de Agosto (31)", "31", TipoOperador.FUNCAO));
		resultado.add(new Operador(":ultimoDia(9)", "Último dia de Setembro (30)", "30", TipoOperador.FUNCAO));
		resultado.add(new Operador(":ultimoDia(10)", "Último dia de Outubro (31)", "31", TipoOperador.FUNCAO));
		resultado.add(new Operador(":ultimoDia(11)", "Último dia de Novembro (30)", "30", TipoOperador.FUNCAO));
		resultado.add(new Operador(":ultimoDia(12)", "Último dia de Dezembro (31)", "31", TipoOperador.FUNCAO));

		return resultado;
	}
}
