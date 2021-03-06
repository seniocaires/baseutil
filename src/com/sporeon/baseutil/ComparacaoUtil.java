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

import java.math.BigDecimal;

/**
 * Classe base para utilitários de comparação.
 * @author Senio Caires
 */
public final class ComparacaoUtil {

	/* ------------------------------
	 * CONTRUTORES
	 * ------------------------------
	 */

	/**
	 * Construtor padrão privado.
	 * @author Senio Caires
	 */
	private ComparacaoUtil() { }

	/* ------------------------------
	 * POSITIVO
	 * ------------------------------
	 */

	/**
	 * Verifica se um Integer é Positivo. <br/>
	 * Retorna true se for positivo. <br/>
	 * Se for nulo, retorna false.
	 * @author Senio Caires
	 * @param valorInteger - Valor
	 * @return boolean
	 */
	public static boolean isPositivo(final Integer valorInteger) {
		return valorInteger != null && valorInteger > 0;
	}

	/**
	 * Verifica se um Long é Positivo. <br/>
	 * Retorna true se for positivo. <br/>
	 * Se for nulo, retorna false.
	 * @author Senio Caires
	 * @param valorLong - Valor
	 * @return boolean
	 */
	public static boolean isPositivo(final Long valorLong) {
		return valorLong != null && valorLong > 0L;
	}

	/**
	 * Verifica se um Float é Positivo. <br/>
	 * Retorna true se for positivo. <br/>
	 * Se for nulo, retorna false.
	 * @author Senio Caires
	 * @param valorFloat - Valor
	 * @return boolean
	 */
	public static boolean isPositivo(final Float valorFloat) {
		return valorFloat != null && valorFloat > 0.0F;
	}

	/**
	 * Verifica se um Double é Positivo. <br/>
	 * Retorna true se for positivo. <br/>
	 * Se for nulo, retorna false.
	 * @author Senio Caires
	 * @param valorDouble - Valor
	 * @return boolean
	 */
	public static boolean isPositivo(final Double valorDouble) {
		return valorDouble != null && valorDouble > 0.0;
	}

	/**
	 * Verifica se um BigDecimal é Positivo. <br/>
	 * Retorna true se for positivo. <br/>
	 * Se for nulo, retorna false.
	 * @author Senio Caires
	 * @param valorBigDecimal - Valor
	 * @return boolean
	 */
	public static boolean isPositivo(final BigDecimal valorBigDecimal) {
		return valorBigDecimal != null && valorBigDecimal.compareTo(BigDecimal.ZERO) > 0;
	}

	/* ------------------------------
	 * NULO OU VAZIO
	 * ------------------------------
	 */

	/**
	 * Verifica se é um Integer nulo ou com valor zero. <br/>
	 * Retorna true se o parâmetro for nulo ou zero.
	 * @author Senio Caires
	 * @param valorInteger - Valor
	 * @return boolean
	 */
	public static boolean isVazio(final Integer valorInteger) {
		return valorInteger == null || valorInteger == 0;
	}

	/**
	 * Verifica se é um Long nulo ou com valor zero. <br/>
	 * Retorna true se o parâmetro for nulo ou zero.
	 * @author Senio Caires
	 * @param valorLong - Valor
	 * @return boolean
	 */
	public static boolean isVazio(final Long valorLong) {
		return valorLong == null || valorLong == 0;
	}

	/**
	 * Verifica se é um Double nulo ou com valor zero. <br/>
	 * Retorna true se o parâmetro for nulo ou zero.
	 * @author Senio Caires
	 * @param valorDouble - Valor
	 * @return boolean
	 */
	public static boolean isVazio(final Double valorDouble) {
		return valorDouble == null || Double.doubleToRawLongBits(valorDouble) == 0L;
	}

	/**
	 * Verifica se é um BigDecimal nulo ou com valor zero. <br/>
	 * Retorna true se o parâmetro for nulo ou zero.
	 * @author Senio Caires
	 * @param valorBigDecimal - Valor
	 * @return boolean
	 * @see java.lang.Comparable#compareTo(Object)
	 */
	public static boolean isVazio(final BigDecimal valorBigDecimal) {
		return valorBigDecimal == null || valorBigDecimal.compareTo(BigDecimal.ZERO) == 0;
	}

	/**
	 * Verifica se é uma String nula ou vazia. <br/>
	 * Retorna true se o parâmetro for nulo, vazio (""), ou preenchido somente com espaços em branco (" ").
	 * @author Senio Caires
	 * @param valorString - Valor
	 * @return boolean
	 * @see ConversaoUtil#nuloParaVazio(String)
	 */
	public static boolean isVazio(final String valorString) {
		return "".equals(ConversaoUtil.nuloParaVazio(valorString).trim());
	}

	/**
	 * Verifica se é um Character nulo ou vazio. <br/>
	 * Retorna true se o parâmetro for nulo ou  (' ').
	 * @author Senio Caires
	 * @param valorCharacter - Valor
	 * @return boolean
	 * @see ConversaoUtil#nuloParaVazio(Character)
	 */
	public static boolean isVazio(final Character valorCharacter) {
		return ' ' == ConversaoUtil.nuloParaVazio(valorCharacter);
	}

	/**
	 * Retorna true se for um CPF ou CNPJ válido.
	 * @author Senio Caires
	 * @param cpfOuCnpj - CPF ou CNPJ
	 * @return true se for um CPF ou CNPJ valido
	 */
	public static boolean isCpfOuCnpjValido(final String cpfOuCnpj) {

		String cpfOuCnpjTemporario = cpfOuCnpj;
		final int tamanhoCpf = 11;
		final int tamanhoCnpj = 14;

		cpfOuCnpjTemporario = ManipulacaoUtil.substituirString(cpfOuCnpjTemporario, ".", "");
		cpfOuCnpjTemporario = ManipulacaoUtil.substituirString(cpfOuCnpjTemporario, "-", "");
		cpfOuCnpjTemporario = ManipulacaoUtil.substituirString(cpfOuCnpjTemporario, "/", "");

		// Rotina para CPF
		if (cpfOuCnpjTemporario.length() == tamanhoCpf) {

			int d1 = 0;
			int d2 = 0;
			int digito1 = 0;
			int digito2 = 0;
			int resto = 0;
			int digitoCpf;

			for (int numeroContador = 1; numeroContador < cpfOuCnpjTemporario.length() - 1; numeroContador++) {

				digitoCpf = Integer.valueOf(cpfOuCnpjTemporario.substring(numeroContador - 1, numeroContador)).intValue();

				// Multiplique a ultima casa por 2 a seguinte por 3 a seguinte por 4 e assim por diante.
				d1 = d1 + (tamanhoCpf - numeroContador) * digitoCpf;

				// Para o segundo digito repita o procedimento incluindo o primeiro digito calculado no passo anterior.
				d2 = d2 + ((tamanhoCpf + 1) - numeroContador) * digitoCpf;
			}

			// Primeiro resto da divisão por 11.
			resto = (d1 % tamanhoCpf);

			// Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
			if (resto < 2) {
				digito1 = 0;
			} else {
				digito1 = tamanhoCpf - resto;
			}

			d2 += 2 * digito1;

			// Segundo resto da divisão por 11.
			resto = (d2 % tamanhoCpf);

			// Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
			if (resto < 2) {
				digito2 = 0;
			} else {
				digito2 = tamanhoCpf - resto;
			}

			// Digito verificador do CPF que está sendo validado.
			String numeroDigitoVerificador = cpfOuCnpjTemporario.substring(cpfOuCnpjTemporario.length() - 2, cpfOuCnpjTemporario.length());

			// Concatenando o primeiro resto com o segundo.
			String numeroDigitoResult = String.valueOf(digito1) + String.valueOf(digito2);

			// Comparar o digito verificador do cpf com o primeiro resto + o segundo resto.
			return numeroDigitoVerificador.equals(numeroDigitoResult);

		} else if (cpfOuCnpjTemporario.length() == tamanhoCnpj) {
			// Rotina para CNPJ

			int soma = 0;
			int dig = 0;
			char[] chrCnpj = cpfOuCnpjTemporario.toCharArray();
			String resultadoCalcCnpj = "0";
			final int numeroQuatro = 4;
			final int numeroQuarentaOito = 48;
			final int numeroNove = 9;
			final int numeroSeis = 6;
			final int numeroOito = 8;
			final int numeroDez = 10;
			final int numeroOnze = 11;
			final int numeroCinco = 5;
			final int numeroSete = 7;

			// Primeira parte
			for (int i = 0; i < numeroQuatro; i++) {
				if (chrCnpj[i] - numeroQuarentaOito >= 0 && chrCnpj[i] - numeroQuarentaOito <= numeroNove) {
					soma += (chrCnpj[i] - numeroQuarentaOito) * (numeroSeis - (i + 1));
				}
			}

			for (int i = 0; i < numeroOito; i++) {
				if (chrCnpj[i + numeroQuatro] - numeroQuarentaOito >= 0 && chrCnpj[i + numeroQuatro] - numeroQuarentaOito <= numeroNove) {
					soma += (chrCnpj[i + numeroQuatro] - numeroQuarentaOito) * (numeroDez - (i + 1));
				}
			}

			dig = numeroOnze - (soma % numeroOnze);

			if (dig == numeroDez || dig == numeroOnze) {
				resultadoCalcCnpj = "0";
			} else {
				resultadoCalcCnpj = Integer.toString(dig);
			}

			String cnpjCalc = cpfOuCnpjTemporario.substring(0, (tamanhoCnpj - 2));
			cnpjCalc += resultadoCalcCnpj;

			// Segunda parte
			soma = 0;

			for (int i = 0; i < numeroCinco; i++) {
				if (chrCnpj[i] - numeroQuarentaOito >= 0 && chrCnpj[i] - numeroQuarentaOito <= numeroNove) {
					soma += (chrCnpj[i] - numeroQuarentaOito) * (numeroSete - (i + 1));
				}
			}

			for (int i = 0; i < numeroOito; i++) {
				if (chrCnpj[i + numeroCinco] - numeroQuarentaOito >= 0 && chrCnpj[i + numeroCinco] - numeroQuarentaOito <= numeroNove) {
					soma += (chrCnpj[i + numeroCinco] - numeroQuarentaOito) * (numeroDez - (i + 1));
				}
			}

			dig = numeroOnze - (soma % numeroOnze);

			if (dig == numeroDez || dig == numeroOnze) {
				resultadoCalcCnpj = "0";
			} else {
				resultadoCalcCnpj = Integer.toString(dig);
			}
			cnpjCalc += resultadoCalcCnpj;

			return cpfOuCnpjTemporario.equals(cnpjCalc);

		} else {
			return false;
		}
	}
}
