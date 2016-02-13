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
import java.text.NumberFormat;
import java.text.ParseException;

import org.apache.log4j.Logger;

/**
 * Classe base para utilitários de conversão.
 * @author Senio Caires
 */
public final class ConversaoUtil {

	/* ------------------------------
	 * CONSTANTES
	 * ------------------------------
	 */

	/**
	 * Logger.
	 * @author Senio Caires
	 */
	private static final Logger LOGGER = Logger.getLogger(ConversaoUtil.class);

	/* ------------------------------
	 * CONTRUTORES
	 * ------------------------------
	 */

	/**
	 * Construtor padrão privado.
	 * @author Senio Caires
	 */
	private ConversaoUtil() { }

	/* ------------------------------
	 * NULO PARA VAZIO
	 * ------------------------------
	 */

	/**
	 * Retorna uma String vazia ("") se o parâmetro passado for nulo. <br/>
	 * Se o parâmetro não for nulo, retorna ele mesmo.
	 * @author Senio Caires
	 * @param valorString - Valor
	 * @return vazio ("") ou valorString.
	 */
	public static String nuloParaVazio(final String valorString) {

		String retorno;

		if (valorString == null) {
			retorno = "";
		} else {
			retorno = valorString;
		}

		return retorno;
	}

	/**
	 * Retorna um Character vazio (' ') se o parâmetro passado for nulo. <br/>
	 * Se o parâmetro não for nulo, retorna ele mesmo.
	 * @author Senio Caires
	 * @param valorCharacter - Valor
	 * @return vazio (' ') ou valorCharacter.
	 */
	public static Character nuloParaVazio(final Character valorCharacter) {

		Character retorno;

		if (valorCharacter == null) {
			retorno = ' ';
		} else {
			retorno = valorCharacter;
		}

		return retorno;
	}

	/* ------------------------------
	 * NULO PARA ZERO
	 * ------------------------------
	 */

	/**
	 * Retorna zero se o Integer for nulo. <br/>
	 * Se não for nulo, retorna o valor original.
	 * @author Senio Caires
	 * @param valorInteger - Valor
	 * @return zero ou valorInteger.
	 */
	public static Integer nuloParaZero(final Integer valorInteger) {

		Integer retorno;

		if (valorInteger == null) {
			retorno = 0;
		} else {
			retorno = valorInteger;
		}

		return retorno;
	}

	/**
	 * Retorna zero se o Long for nulo. <br/>
	 * Se não for nulo, retorna o valor original.
	 * @author Senio Caires
	 * @param valorLong - Valor
	 * @return zero ou valorLong.
	 */
	public static Long nuloParaZero(final Long valorLong) {

		Long retorno;

		if (valorLong == null) {
			retorno = 0L;
		} else {
			retorno = valorLong;
		}

		return retorno;
	}

	/**
	 * Retorna zero se o Float for nulo. <br/>
	 * Se não for nulo, retorna o valor original.
	 * @author Senio Caires
	 * @param valorFloat - Valor
	 * @return zero ou valorFloat.
	 */
	public static Float nuloParaZero(final Float valorFloat) {

		Float retorno;

		if (valorFloat == null) {
			retorno = 0.0F;
		} else {
			retorno = valorFloat;
		}

		return retorno;
	}

	/**
	 * Retorna zero se o Double for nulo. <br/>
	 * Se não for nulo, retorna o valor original.
	 * @author Senio Caires
	 * @param valorDouble - Valor
	 * @return zero ou valorDouble.
	 */
	public static Double nuloParaZero(final Double valorDouble) {

		Double retorno;

		if (valorDouble == null) {
			retorno = 0.0;
		} else {
			retorno = valorDouble;
		}

		return retorno;
	}

	/**
	 * Retorna zero se o BigDecimal for nulo. <br/>
	 * Se não for nulo, retorna o valor original.
	 * @author Senio Caires
	 * @param valorBigDecimal - Valor
	 * @return zero ou valorBigDecimal.
	 */
	public static BigDecimal nuloParaZero(final BigDecimal valorBigDecimal) {

		BigDecimal retorno;

		if (valorBigDecimal == null) {
			retorno = BigDecimal.ZERO;
		} else {
			retorno = valorBigDecimal;
		}

		return retorno;
	}

	/* ------------------------------
	 * NULO PARA TRUE/FALSE
	 * ------------------------------
	 */

	/**
	 * Retorna false se o valorBoolean for nulo. <br/>
	 * Se o valorBoolean não for nulo, retorna ele mesmo.
	 * @author Senio Caires
	 * @param valorBoolean - Valor
	 * @return false ou o valorBoolean.
	 */
	public static Boolean nuloParaFalse(final Boolean valorBoolean) {

		Boolean retorno;

		if (valorBoolean == null) {
			retorno = false;
		} else {
			retorno = valorBoolean;
		}

		return retorno;
	}

	/**
	 * Retorna true se o valorBoolean for nulo. <br/>
	 * Se o valorBoolean não for nulo, retorna ele mesmo.
	 * @author Senio Caires
	 * @param valorBoolean - Valor
	 * @return true ou o valorBoolean.
	 */
	public static Boolean nuloParaTrue(final Boolean valorBoolean) {

		Boolean retorno;

		if (valorBoolean == null) {
			retorno = true;
		} else {
			retorno = valorBoolean;
		}

		return retorno;
	}

	/* ------------------------------
	 * NAO POSITIVO PARA NULO
	 * ------------------------------
	 */

	/**
	 * Retorna nulo se o Integer não for Positivo. <br/>
	 * Se for positivo, retorna ele o valor original.
	 * @author Senio Caires
	 * @param valorInteger - Valor
	 * @return nulo ou valorInteger.
	 * @see ComparacaoUtil#isPositivo(Integer)
	 */
	public static Integer naoPositivoParaNulo(final Integer valorInteger) {

		Integer retorno;

		if (ComparacaoUtil.isPositivo(valorInteger)) {
			retorno = valorInteger;
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Retorna nulo se o Long não for Positivo. <br/>
	 * Se for positivo, retorna ele o valor original.
	 * @author Senio Caires
	 * @param valorLong - Valor
	 * @return nulo ou valorLong.
	 * @see ComparacaoUtil#isPositivo(Long)
	 */
	public static Long naoPositivoParaNulo(final Long valorLong) {

		Long retorno;

		if (ComparacaoUtil.isPositivo(valorLong)) {
			retorno = valorLong;
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Retorna nulo se o Float não for Positivo. <br/>
	 * Se for positivo, retorna ele o valor original.
	 * @author Senio Caires
	 * @param valorFloat - Valor
	 * @return nulo ou valorFloat.
	 * @see ComparacaoUtil#isPositivo(Float)
	 */
	public static Float naoPositivoParaNulo(final Float valorFloat) {

		Float retorno;

		if (ComparacaoUtil.isPositivo(valorFloat)) {
			retorno = valorFloat;
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Retorna nulo se o Double não for Positivo. <br/>
	 * Se for positivo, retorna ele o valor original.
	 * @author Senio Caires
	 * @param valorDouble - Valor
	 * @return nulo ou valorDouble.
	 * @see ComparacaoUtil#isPositivo(Double)
	 */
	public static Double naoPositivoParaNulo(final Double valorDouble) {

		Double retorno;

		if (ComparacaoUtil.isPositivo(valorDouble)) {
			retorno = valorDouble;
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Retorna nulo se o BigDecimal não for Positivo. <br/>
	 * Se for positivo, retorna ele o valor original.
	 * @author Senio Caires
	 * @param valorBigDecimal - Valor
	 * @return nulo ou valorBigDecimal.
	 * @see ComparacaoUtil#isPositivo(BigDecimal)
	 */
	public static BigDecimal naoPositivoParaNulo(final BigDecimal valorBigDecimal) {

		BigDecimal retorno;

		if (ComparacaoUtil.isPositivo(valorBigDecimal)) {
			retorno = valorBigDecimal;
		} else {
			retorno = null;
		}

		return retorno;
	}

	/**
	 * Converte uma string para BigDecimal.
	 * @author Senio Caires
	 * @param valor - Valor
	 * @return BigDecimal
	 */
	public static BigDecimal stringParaBigDecimal(final String valor) {

		final NumberFormat nf = NumberFormat.getInstance();

		try {

			nf.setMinimumFractionDigits(2);
			nf.setMaximumFractionDigits(2);

			return new BigDecimal(nf.parse(nuloParaVazio(valor)).toString()).setScale(2, 1);

		} catch (final ParseException e) {

			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("Erro ao converter. Retornando 0.00. " + e.getMessage());
			}

			return new BigDecimal("0.00").setScale(2, 1);
		}
	}

	/**
	 * Converte uma string para int.
	 * @author Senio Caires
	 * @param valor - Valor
	 * @return int
	 */
	public static int stringParaInteger(final String valor) {

		int resultado = 0;

		try {

			if (!ComparacaoUtil.isVazio(valor)) {
				resultado  = Integer.valueOf(valor.trim());
			}

		} catch (NumberFormatException e) {
			LOGGER.error(e.getMessage());
		}

		return resultado;
	}
}
