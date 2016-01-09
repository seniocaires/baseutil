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
public class ConversaoUtilTeste {

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

		final Integer testeNulo = null;

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(testeNulo));

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

		final Long testeNulo = null;

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(testeNulo));

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

		final Float testeNulo = null;

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(testeNulo));

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

		final Double testeNulo = null;

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(testeNulo));

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

		final BigDecimal testeNulo = null;

		Assert.assertEquals(null, ConversaoUtil.naoPositivoParaNulo(testeNulo));

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

		final Integer testeNulo = null;

		Assert.assertEquals(Integer.valueOf(0), ConversaoUtil.nuloParaZero(testeNulo));

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

		final Long testeNulo = null;

		Assert.assertEquals(Long.valueOf(0), ConversaoUtil.nuloParaZero(testeNulo));

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

		final Float testeNulo = null;

		Assert.assertEquals(Float.valueOf(0), ConversaoUtil.nuloParaZero(testeNulo));

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

		final Double testeNulo = null;

		Assert.assertEquals(Double.valueOf(0), ConversaoUtil.nuloParaZero(testeNulo));

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

		final BigDecimal testeNulo = null;

		Assert.assertEquals(BigDecimal.ZERO, ConversaoUtil.nuloParaZero(testeNulo));

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

		final String stringNula = null;

		Assert.assertEquals("", ConversaoUtil.nuloParaVazio(stringNula));

		Assert.assertFalse(" ".equals(ConversaoUtil.nuloParaVazio(stringNula)));

		Assert.assertFalse("teste".equals(ConversaoUtil.nuloParaVazio(stringNula)));

		Assert.assertFalse(ConversaoUtil.nuloParaVazio(stringNula) == null);

		Assert.assertFalse("teste".equals(ConversaoUtil.nuloParaVazio("TESTE")));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaVazio(Character)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaVazioCharacter() {

		LOGGER.info("Testando nuloParaVazioCharacter().");

		final Character characterNulo = null;

		Assert.assertTrue(ConversaoUtil.nuloParaVazio(characterNulo) == ' ');

		Assert.assertFalse(ConversaoUtil.nuloParaVazio(characterNulo) == null);

		Assert.assertFalse(ConversaoUtil.nuloParaVazio('T') == null);
	}

	/**
	 * Testa o método {@link ConversaoUtil#stringParaBigDecimal(String)}.
	 * @author Senio Caires
	 */
	@Test
	public final void stringParaBigDecimal() {

		LOGGER.info("Testando stringParaBigDecimal(String).");

		final String stringNula = null;
		final String stringNaoNumerica = "a";

		Assert.assertTrue(BigDecimal.ZERO.setScale(2, 1).equals(ConversaoUtil.stringParaBigDecimal(stringNula)));

		Assert.assertTrue(BigDecimal.ZERO.setScale(2, 1).equals(ConversaoUtil.stringParaBigDecimal(stringNaoNumerica)));
	}

	/**
	 * Testa o método {@link ConversaoUtil#stringParaInteger(String)}.
	 * @author Senio Caires
	 */
	@Test
	public final void stringParaInteger() {

		LOGGER.info("Testando stringParaInteger(String).");

		final String stringNula = null;
		final String stringNaoNumerica = "a";

		Assert.assertTrue(ConversaoUtil.stringParaInteger(stringNula) == 0);

		Assert.assertTrue(ConversaoUtil.stringParaInteger(stringNaoNumerica) == 0);
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
