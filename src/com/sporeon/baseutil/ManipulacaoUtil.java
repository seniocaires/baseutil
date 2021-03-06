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
 * Classe base para utilitários de manipulação.
 * @author Senio Caires
 */
public final class ManipulacaoUtil {

	/* ------------------------------
	 * CONTRUTORES
	 * ------------------------------
	 */

	/**
	 * Construtor padrão privado.
	 * @author Senio Caires
	 */
	private ManipulacaoUtil() { }

	/* ------------------------------
	 * MÉTODOS
	 * ------------------------------
	 */

	/**
	 * Método para preencher uma string com Zeros à esquerda até o tamanho passado como parâmetro. <br/>
	 * Se o tamanho da string for maior do que o tamanho passado como parâmetro, retorna a string original. <br/>
	 * Se a string for nula, retorna null.
	 * @author Senio Caires
	 * @param string - String
	 * @param tamanho - Tamanho
	 * @return string
	 * @see java.lang.StringBuilder
	 */
	public static String adicionarZeroEsquerda(final String string, final int tamanho) {

		if (string == null) {
			return null;
		}

		if (tamanho <= string.length()) {
			return string;
		}

		StringBuilder resultado = new StringBuilder(string);

		for (int i = string.length(); i <= (tamanho - 1); i++) {
			resultado.insert(0, "0");
		}

		return resultado.toString();
	}

	/**
	 * Método para preencher uma string com Zeros à direita até o tamanho passado como parâmetro. <br/>
	 * Se o tamanho da string for maior do que o tamanho passado como parâmetro, retorna a string original. <br/>
	 * Se a string for nula, retorna null.
	 * @author Senio Caires
	 * @param string - String
	 * @param tamanho - Tamanho
	 * @return string
	 * @see java.lang.StringBuilder
	 */
	public static String adicionarZeroDireita(final String string, final int tamanho) {

		if (string == null) {
			return null;
		}

		if (tamanho <= string.length()) {
			return string;
		}

		StringBuilder resultado = new StringBuilder(string);

		for (int i = string.length(); i <= (tamanho - 1); i++) {
			resultado.append('0');
		}

		return resultado.toString();
	}

	/**
	 * Método para preencher uma string com Espaços à esquerda até o tamanho passado como parâmetro. <br/>
	 * Se o tamanho da string for maior do que o tamanho passado como parâmetro, retorna a string original. <br/>
	 * Se a string for nula, retorna null.
	 * @author Senio Caires
	 * @param string - String
	 * @param tamanho - Tamanho
	 * @return string
	 * @see java.lang.StringBuilder
	 */
	public static String adicionarEspacoEsquerda(final String string, final int tamanho) {

		if (string == null) {
			return null;
		}

		if (tamanho <= string.length()) {
			return string;
		}

		StringBuilder resultado = new StringBuilder(string);

		for (int i = string.length(); i <= (tamanho - 1); i++) {
			resultado.insert(0, " ");
		}

		return resultado.toString();
	}

	/**
	 * Método para preencher uma string com Espaços à direita até o tamanho passado como parâmetro. <br/>
	 * Se o tamanho da string for maior do que o tamanho passado como parâmetro, retorna a string original. <br/>
	 * Se a string for nula, retorna null.
	 * @author Senio Caires
	 * @param string - String
	 * @param tamanho - Tamanho
	 * @return string
	 * @see java.lang.StringBuilder
	 */
	public static String adicionarEspacoDireita(final String string, final int tamanho) {

		if (string == null) {
			return null;
		}

		if (tamanho <= string.length()) {
			return string;
		}

		StringBuilder resultado = new StringBuilder(string);

		for (int i = string.length(); i <= (tamanho - 1); i++) {
			resultado.append(' ');
		}

		return resultado.toString();
	}

	/**
	 * Método remover espaço à direita da string passada como parâmetro. <br/>
	 * Se a string for nula, retorna null.
	 * @author Senio Caires
	 * @param string - String
	 * @return String
	 */
	public static String removerEspacoDireita(final String string) {

		if (string == null) {
			return null;
		}

		String resultado = "";

		for (int indice = string.length() - 1; indice >= 0; --indice) {

			if (string.charAt(indice) != ' ') {

				resultado = string.substring(0, indice + 1);
				break;
			}
		}

		return resultado;
	}

	/**
	 * Método remover espaço à esquerda da string passada como parâmetro. <br/>
	 * Se a string for nula, retorna null.
	 * @author Senio Caires
	 * @param string - String
	 * @return String
	 */
	public static String removerEspacoEsquerda(final String string) {

		if (string == null) {
			return null;
		}

		String resultado = "";

		for (int indice = 0; indice < string.length(); indice++) {

			if (string.charAt(indice) != ' ') {

				resultado = string.substring(indice, string.length());
				break;
			}
		}

		return resultado;
	}

	/**
	 * Adiciona um caracter (String) em um texto (String).
	 * @author Senio Caires
	 * @param caracter - Caractere
	 * @param tamanhoMaximo - Tamanho máximo
	 * @param texto - Texto
	 * @param noInicio - No início
	 * @return texto
	 */
	public static String adicionarChar(final char caracter, final int tamanhoMaximo, final String texto, final boolean noInicio) {

		StringBuilder resultado = new StringBuilder();
		StringBuilder caracterAdd = new StringBuilder();

		if (texto != null && !("".equals(texto))) {
			resultado.append(texto.trim());
		}

		if (resultado.length() <= tamanhoMaximo) {
			for (int i = 0; i < (tamanhoMaximo - resultado.length()); i++) {
				caracterAdd.append(caracter);
			}
		} else {
			return ConversaoUtil.nuloParaVazio(texto).substring(0, tamanhoMaximo);
		}

		if (noInicio) {
			resultado = new StringBuilder(caracterAdd + resultado.toString());
		} else {
			resultado.append(caracterAdd);
		}

		return resultado.toString();
	}

	/**
	 * Método para remover o char passado como parâmetro da string.
	 * @author Senio Caires
	 * @param string - String
	 * @param character - Caractere
	 * @return string
	 */
	public static String removerCharEsquerda(final String string, final char character) {

		String resultado = "";

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != character) {
				resultado += string.substring(i);
				return resultado;
			}
		}

		return resultado;
	}

	/**
	 * Remove todas as quebras de linhas contidas em uma string.
	 * @author Senio Caires
	 * @param string - String
	 * @return String
	 */
	public static String removerQuebraDeLinha(final String string) {
		return string.replaceAll("(\n|\r)+", "");
	}

	/**
	 * Substitui todas as stringAhSerSubstituida por stringSubstituta que est�o na stringCompleta.
	 * @author Senio Caires
	 * @param stringCompleta - String completa
	 * @param stringAhSerSubstituida - String a ser substituida
	 * @param stringSubstituta - String substituta
	 * @return String
	 */
	public static String substituirString(final String stringCompleta, final String stringAhSerSubstituida, final String stringSubstituta) {

		if (stringCompleta == null || stringAhSerSubstituida == null || stringSubstituta == null) {
			return null;
		}

		StringBuilder conteudo = new StringBuilder(stringCompleta);
		StringBuilder conteudoTemp = new StringBuilder();

		boolean replace = true;

		do {

			int posicao = conteudo.indexOf(stringAhSerSubstituida);

			if (posicao == -1) {
				replace = false;
			} else {
				conteudoTemp = new StringBuilder(conteudo.subSequence(0, posicao));
				conteudoTemp.append(stringSubstituta);
				conteudoTemp.append(conteudo.subSequence(posicao + stringAhSerSubstituida.length(), conteudo.length()));

				conteudo = conteudoTemp;
			}

		} while (replace);

		return conteudo.toString();
	}

	/**
	 * Retorna uma String sql sem Order By.
	 * @author Senio Caires
	 * @param sql - SQL
	 * @return String
	 */
	public static String removerOrderBy(final String sql) {

		StringBuilder resultado = new StringBuilder(sql);

		int posicao = resultado.toString().toLowerCase().indexOf("order by");

		if (posicao != -1) {
			resultado = resultado.replace(posicao, resultado.length(), "");
		}

		return resultado.toString();
	}

	/**
	 * Retorna o Order By de uma string Sql.
	 * @author Senio Caires
	 * @param sql - SQL
	 * @return String
	 */
	public static String getOrderBy(final String sql) {

		StringBuilder resultado = new StringBuilder(sql);

		int posicao = resultado.toString().toLowerCase().indexOf("order by");

		if (posicao != -1) {
			resultado = resultado.replace(0, posicao, "");
		}

		if (posicao == -1) {
			resultado = resultado.replace(0, resultado.length(), "");
		}

		return resultado.toString();
	}
}
