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
package com.sporeon.baseutil.teste;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sporeon.baseutil.ConversaoUtil;

/**
 * Classe de teste unitário para testar a classe {@link ConversaoUtil}.
 * @author Senio Caires
 */
public final class ConversaoUtilTeste {

	/* ------------------------------
	 * CONSTANTES
	 * ------------------------------
	 */

	/**
	 * Logger.
	 * @author Senio Caires
	 */
	private static final Logger LOGGER = Logger.getLogger(ConversaoUtilTeste.class);

	/**
	 * Número inteiro positivo.
	 * @author Senio Caires
	 */
	private static final int INT_POSITIVO = 100;

	/**
	 * Número long positivo.
	 * @author Senio Caires
	 */
	private static final long LONG_POSITIVO = 100L;

	/**
	 * Número float positivo.
	 * @author Senio Caires
	 */
	private static final float FLOAT_POSITIVO = 100F;

	/**
	 * Número double positivo.
	 * @author Senio Caires
	 */
	private static final double DOUBLE_POSITIVO = 100D;

	/**
	 * Número inteiro nulo.
	 * @author Senio Caires
	 */
	private static final Integer INTEGER_NULO = null;

	/**
	 * Número long nulo.
	 * @author Senio Caires
	 */
	private static final Long LONG_NULO = null;

	/**
	 * Número float nulo.
	 * @author Senio Caires
	 */
	private static final Float FLOAT_NULO = null;

	/**
	 * Número double nulo.
	 * @author Senio Caires
	 */
	private static final Double DOUBLE_NULO = null;

	/**
	 * Número BigDecimal nulo.
	 * @author Senio Caires
	 */
	private static final BigDecimal BIGDECIMAL_NULO = null;

	/**
	 * String nula.
	 * @author Senio Caires
	 */
	private static final String STRING_NULA = null;

	/**
	 * Character nulo.
	 * @author Senio Caires
	 */
	private static final Character CHARACTER_NULO = null;

	/**
	 * String não númerica.
	 * @author Senio Caires
	 */
	private static final String STRING_NAO_NUMERICA = "a";

	/* ------------------------------
	 * CONTRUTORES
	 * ------------------------------
	 */

	/**
	 * Construtor padrão privado.
	 * @author Senio Caires
	 */
	private ConversaoUtilTeste() { }

	/* ------------------------------
	 * ANTES
	 * ------------------------------
	 */

	/**
	 * Método executado antes de inicializar qualquer um dos casos teste. <br/>
	 * Executado apenas uma vez.
	 * @author Senio Caires
	 */
	@BeforeClass
	public static void executarAntesDeTudo() {
		LOGGER.info("------------------------------");
		LOGGER.info("Inicializando classe.");
	}

	/**
	 * Método executado antes de inicializar cada caso de teste.
	 * @author Senio Caires
	 */
	@Before
	public final void executarAntesDeCadaTeste() {
		LOGGER.info("Inicializando teste.");
	}

	/* ------------------------------
	 * TESTES
	 * ------------------------------
	 */

	/**
	 * Testa o método {@link ConversaoUtil#naoPositivoParaNulo(Integer)}.
	 * @author Senio Caires
	 */
	@Test
	public final void naoPositivoParaNuloInteger() {

		LOGGER.info("Testando naoPositivoParaNuloInteger().");

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(-1));

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(0));

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(INTEGER_NULO));

		Assert.assertEquals(Integer.valueOf(INT_POSITIVO), ConversaoUtil.naoPositivoParaNulo(INT_POSITIVO));
	}

	/**
	 * Testa o método {@link ConversaoUtil#naoPositivoParaNulo(Long)}.
	 * @author Senio Caires
	 */
	@Test
	public final void naoPositivoParaNuloLong() {

		LOGGER.info("Testando naoPositivoParaNuloLong().");

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(-1L));

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(0L));

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(LONG_NULO));

		Assert.assertEquals(Long.valueOf(LONG_POSITIVO), ConversaoUtil.naoPositivoParaNulo(LONG_POSITIVO));
	}

	/**
	 * Testa o método {@link ConversaoUtil#naoPositivoParaNulo(Float)}.
	 * @author Senio Caires
	 */
	@Test
	public final void naoPositivoParaNuloFloat() {

		LOGGER.info("Testando naoPositivoParaNuloFloat().");

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(-1F));

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(0F));

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(FLOAT_NULO));

		Assert.assertEquals(Float.valueOf(FLOAT_POSITIVO), ConversaoUtil.naoPositivoParaNulo(FLOAT_POSITIVO));
	}

	/**
	 * Testa o método {@link ConversaoUtil#naoPositivoParaNulo(Double)}.
	 * @author Senio Caires
	 */
	@Test
	public final void naoPositivoParaNuloDouble() {

		LOGGER.info("Testando naoPositivoParaNuloDouble().");

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(-1D));

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(0D));

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(DOUBLE_NULO));

		Assert.assertEquals(Double.valueOf(DOUBLE_POSITIVO), ConversaoUtil.naoPositivoParaNulo(DOUBLE_POSITIVO));
	}

	/**
	 * Testa o método {@link ConversaoUtil#naoPositivoParaNulo(BigDecimal)}.
	 * @author Senio Caires
	 */
	@Test
	public final void naoPositivoParaNuloBigDecimal() {

		LOGGER.info("Testando naoPositivoParaNuloBigDecimal().");

		final BigDecimal numeroPositivo = new BigDecimal(100);

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(BigDecimal.valueOf(-1)));

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(BigDecimal.ZERO));

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(BIGDECIMAL_NULO));

		Assert.assertEquals(numeroPositivo, ConversaoUtil.naoPositivoParaNulo(numeroPositivo));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaFalse(Boolean)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaFalse() {

		LOGGER.info("Testando nuloParaFalse().");

		Assert.assertFalse(ConversaoUtil.nuloParaFalse(null));

		Assert.assertFalse(ConversaoUtil.nuloParaFalse(false));

		Assert.assertTrue(ConversaoUtil.nuloParaFalse(true));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaTrue(Boolean)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaTrue() {

		LOGGER.info("Testando nuloParaTrue().");

		Assert.assertTrue(ConversaoUtil.nuloParaTrue(null));

		Assert.assertFalse(ConversaoUtil.nuloParaTrue(false));

		Assert.assertTrue(ConversaoUtil.nuloParaTrue(true));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaZero(Integer)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaZeroInteger() {

		LOGGER.info("Testando nuloParaZeroInteger().");

		Assert.assertEquals(Integer.valueOf(0), ConversaoUtil.nuloParaZero(INTEGER_NULO));

		Assert.assertEquals(Integer.valueOf(0), ConversaoUtil.nuloParaZero(0));

		Assert.assertEquals(Integer.valueOf(-1), ConversaoUtil.nuloParaZero(-1));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaZero(Long)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaZeroLong() {

		LOGGER.info("Testando nuloParaZeroLong().");

		Assert.assertEquals(Long.valueOf(0), ConversaoUtil.nuloParaZero(LONG_NULO));

		Assert.assertEquals(Long.valueOf(0), ConversaoUtil.nuloParaZero(0L));

		Assert.assertEquals(Long.valueOf(-1), ConversaoUtil.nuloParaZero(-1L));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaZero(Float)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaZeroFloat() {

		LOGGER.info("Testando nuloParaZeroFloat().");

		Assert.assertEquals(Float.valueOf(0), ConversaoUtil.nuloParaZero(FLOAT_NULO));

		Assert.assertEquals(Float.valueOf(0), ConversaoUtil.nuloParaZero(0F));

		Assert.assertEquals(Float.valueOf(-1), ConversaoUtil.nuloParaZero(-1F));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaZero(Double)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaZeroDouble() {

		LOGGER.info("Testando nuloParaZeroDouble().");

		Assert.assertEquals(Double.valueOf(0), ConversaoUtil.nuloParaZero(DOUBLE_NULO));

		Assert.assertEquals(Double.valueOf(0), ConversaoUtil.nuloParaZero(0D));

		Assert.assertEquals(Double.valueOf(-1), ConversaoUtil.nuloParaZero(-1D));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaZero(BigDecimal)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaZeroBigDecimal() {

		LOGGER.info("Testando nuloParaZeroBigDecimal().");

		Assert.assertEquals(BigDecimal.ZERO, ConversaoUtil.nuloParaZero(BIGDECIMAL_NULO));

		Assert.assertEquals(BigDecimal.ZERO, ConversaoUtil.nuloParaZero(BigDecimal.ZERO));

		Assert.assertEquals(BigDecimal.ONE, ConversaoUtil.nuloParaZero(BigDecimal.ONE));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaVazio(String)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaVazioString() {

		LOGGER.info("Testando nuloParaVazioString().");

		Assert.assertEquals("", ConversaoUtil.nuloParaVazio(STRING_NULA));

		Assert.assertFalse(" ".equals(ConversaoUtil.nuloParaVazio(STRING_NULA)));

		Assert.assertFalse("teste".equals(ConversaoUtil.nuloParaVazio(STRING_NULA)));

		Assert.assertFalse(ConversaoUtil.nuloParaVazio(STRING_NULA) == null);

		Assert.assertFalse("teste".equals(ConversaoUtil.nuloParaVazio("TESTE")));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaVazio(Character)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaVazioCharacter() {

		LOGGER.info("Testando nuloParaVazioCharacter().");

		Assert.assertTrue(ConversaoUtil.nuloParaVazio(CHARACTER_NULO) == ' ');

		Assert.assertFalse(ConversaoUtil.nuloParaVazio(CHARACTER_NULO) == null);

		Assert.assertFalse(ConversaoUtil.nuloParaVazio('T') == null);
	}

	/**
	 * Testa o método {@link ConversaoUtil#stringParaBigDecimal(String)}.
	 * @author Senio Caires
	 */
	@Test
	public final void stringParaBigDecimal() {

		LOGGER.info("Testando stringParaBigDecimal(String).");

		Assert.assertTrue(BigDecimal.ZERO.setScale(2, 1).equals(ConversaoUtil.stringParaBigDecimal(STRING_NULA)));

		Assert.assertTrue(BigDecimal.ZERO.setScale(2, 1).equals(ConversaoUtil.stringParaBigDecimal(STRING_NAO_NUMERICA)));
	}

	/**
	 * Testa o método {@link ConversaoUtil#stringParaInteger(String)}.
	 * @author Senio Caires
	 */
	@Test
	public final void stringParaInteger() {

		LOGGER.info("Testando stringParaInteger(String).");

		Assert.assertTrue(ConversaoUtil.stringParaInteger(STRING_NULA) == 0);

		Assert.assertTrue(ConversaoUtil.stringParaInteger(STRING_NAO_NUMERICA) == 0);
	}

	/* ------------------------------
	 * DEPOIS
	 * ------------------------------
	 */

	/**
	 * Método executado após finalizar cada caso de teste.
	 * @author Senio Caires
	 */
	@After
	public final void executarDepoisDeCadaTeste() {
		LOGGER.info("Sucesso!");
	}

	/**
	 * Método executado após finalizar todos os casos teste. <br/>
	 * Executado apenas uma vez.
	 * @author Senio Caires
	 */
	@AfterClass
	public static void executarDepoisDeTudo() {
		LOGGER.info("Finalizando classe.");
	}
}
