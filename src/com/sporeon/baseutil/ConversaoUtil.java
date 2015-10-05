package com.sporeon.baseutil;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * Classe base para utilitários de conversão.
 * @author Senio Caires
 */
public final class ConversaoUtil {

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
	 * @param valorString - Valor
	 * @return vazio ("") ou valorString.
	 * @author Senio Caires
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
	 * @param valorCharacter - Valor
	 * @return vazio (' ') ou valorCharacter.
	 * @author Senio Caires
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
	 * @param valorInteger - Valor
	 * @return zero ou valorInteger.
	 * @author Senio Caires
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
	 * @param valorLong - Valor
	 * @return zero ou valorLong.
	 * @author Senio Caires
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
	 * @param valorFloat - Valor
	 * @return zero ou valorFloat.
	 * @author Senio Caires
	 */
	public static Float nuloParaZero(final Float valorFloat) {

		Float retorno;

		if (valorFloat == null) {
			retorno = 0.0f;
		} else {
			retorno = valorFloat;
		}

		return retorno;
	}

	/**
	 * Retorna zero se o Double for nulo. <br/>
	 * Se não for nulo, retorna o valor original.
	 * @param valorDouble - Valor
	 * @return zero ou valorDouble.
	 * @author Senio Caires
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
	 * @param valorBigDecimal - Valor
	 * @return zero ou valorBigDecimal.
	 * @author Senio Caires
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
	 * @param valorBoolean - Valor
	 * @return false ou o valorBoolean.
	 * @author Senio Caires
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
	 * @param valorBoolean - Valor
	 * @return true ou o valorBoolean.
	 * @author Senio Caires
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
	 * @param valorInteger - Valor
	 * @return nulo ou valorInteger.
	 * @author Senio Caires
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
	 * @param valorLong - Valor
	 * @return nulo ou valorLong.
	 * @author Senio Caires
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
	 * @param valorFloat - Valor
	 * @return nulo ou valorFloat.
	 * @author Senio Caires
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
	 * @param valorDouble - Valor
	 * @return nulo ou valorDouble.
	 * @author Senio Caires
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
	 * @param valorBigDecimal - Valor
	 * @return nulo ou valorBigDecimal.
	 * @author Senio Caires
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
	 * @param valor - Valor
	 * @return BigDecimal
	 * @author Senio Caires
	 */
	public static BigDecimal stringParaBigDecimal(final String valor) {

		final NumberFormat nf = NumberFormat.getInstance();

		try {

			nf.setMinimumFractionDigits(2);
			nf.setMaximumFractionDigits(2);

			return new BigDecimal(nf.parse(valor).toString()).setScale(2, 1);

		} catch (final Exception e) {
			return new BigDecimal("0.00").setScale(2, 1);
		}
	}

	/**
	 * Converte uma string para int.
	 * @param valor - Valor
	 * @return int
	 * @author Senio Caires
	 */
	public static int stringParaInteger(final String valor) {

		int resultado = 0;

		try {

			if (!ComparacaoUtil.isVazio(valor)) {
				resultado  = new Integer(valor.trim());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultado;
	}
}
