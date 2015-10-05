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
	 * @param string - String
	 * @param tamanho - Tamanho
	 * @return string
	 * @author Senio Caires
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
	 * @param string - String
	 * @param tamanho - Tamanho
	 * @return string
	 * @author Senio Caires
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
			resultado.append("0");
		}

		return resultado.toString();
	}

	/**
	 * Método para preencher uma string com Espaços à esquerda até o tamanho passado como parâmetro. <br/>
	 * Se o tamanho da string for maior do que o tamanho passado como parâmetro, retorna a string original. <br/>
	 * Se a string for nula, retorna null.
	 * @param string - String
	 * @param tamanho - Tamanho
	 * @return string
	 * @author Senio Caires
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
	 * @param string - String
	 * @param tamanho - Tamanho
	 * @return string
	 * @author Senio Caires
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
			resultado.append(" ");
		}

		return resultado.toString();
	}

	/**
	 * Método remover espaço à direita da string passada como parâmetro. <br/>
	 * Se a string for nula, retorna null.
	 * @param string - String
	 * @return String
	 * @author Senio Caires
	 */
	public static String removerEspacoDireita(final String string) {

		if (string == null) {
			return null;
		}

		String resultado = "";

		try {

			if (string != null) {

				for (int indice = string.length() - 1; indice >= 0; --indice) {

					if (string.charAt(indice) != ' ') {

						resultado = string.substring(0, indice + 1);
						break;
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultado;
	}

	/**
	 * Método remover espaço à esquerda da string passada como parâmetro. <br/>
	 * Se a string for nula, retorna null.
	 * @param string - String
	 * @return String
	 * @author Senio Caires
	 */
	public static String removerEspacoEsquerda(final String string) {

		if (string == null) {
			return null;
		}

		String resultado = "";

		try {

			if (string != null) {

				for (int indice = 0; indice < string.length(); indice++) {

					if (string.charAt(indice) != ' ') {

						resultado = string.substring(indice, string.length());
						break;
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultado;
	}

	/**
	 * Adiciona um caracter (String) em um texto (String).
	 * @param caracter - Caractere
	 * @param tamanhoMaximo - Tamanho máximo
	 * @param texto - Texto
	 * @param noInicio - No início
	 * @return texto
	 * @author Senio Caires
	 */
	public static String adicionarChar(final char caracter, final int tamanhoMaximo, final String texto, final boolean noInicio) {

		StringBuilder resultado = new StringBuilder();
		StringBuilder caracterAdd = new StringBuilder();

		try {
			if (texto != null && !("".equals(texto))) {
				resultado.append(texto.trim());
			}

			if (resultado.length() <= tamanhoMaximo) {
				for (int i = 0; i < (tamanhoMaximo - resultado.length()); i++) {
					caracterAdd.append(caracter);
				}
			} else {
				return texto.substring(0, tamanhoMaximo);
			}

			if (noInicio) {
				resultado = new StringBuilder(caracterAdd + resultado.toString());
			} else {
				resultado.append(caracterAdd);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	/**
	 * Método para remover o char passado como parâmetro da string.
	 * @param string - String
	 * @param character - Caractere
	 * @return string
	 * @author Senio Caires
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
	 * @param string - String
	 * @return String
	 * @author Senio Caires
	 */
	public static String removerQuebraDeLinha(final String string) {
		return string.replaceAll("(\n|\r)+", "");
	}

	/**
	 * Substitui todas as stringAhSerSubstituida por stringSubstituta que est�o na stringCompleta.
	 * @param stringCompleta - String completa
	 * @param stringAhSerSubstituida - String a ser substituida
	 * @param stringSubstituta - String substituta
	 * @return String
	 * @author Senio Caires
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
	 * @param sql - SQL
	 * @return String
	 * @author Senio Caires
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
	 * @param sql - SQL
	 * @return String
	 * @author Senio Caires
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
