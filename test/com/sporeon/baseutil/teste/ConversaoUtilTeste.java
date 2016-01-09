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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
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
	private static Logger logger = Logger.getLogger(ConversaoUtilTeste.class);

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
		logger.info("------------------------------");
		logger.info("Inicializando classe.");
	}

	/**
	 * Método executado antes de inicializar cada caso de teste.
	 * @author Senio Caires
	 */
	@Before
	public final void executarAntesDeCadaTeste() {
		logger.info("Inicializando teste.");
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

		logger.info("Testando naoPositivoParaNuloInteger().");

		final int numeroPositivo = 100;

		assertEquals(null, ConversaoUtil.naoPositivoParaNulo(-1));

		assertEquals(null, ConversaoUtil.naoPositivoParaNulo(0));

		Integer testeNulo = null;

		assertEquals(null, ConversaoUtil.naoPositivoParaNulo(testeNulo));

		assertEquals(new Integer(numeroPositivo), ConversaoUtil.naoPositivoParaNulo(numeroPositivo));
	}

	/**
	 * Testa o método {@link ConversaoUtil#naoPositivoParaNulo(Long)}.
	 * @author Senio Caires
	 */
	@Test
	public final void naoPositivoParaNuloLong() {

		logger.info("Testando naoPositivoParaNuloLong().");

		final long numeroPositivo = 100;

		assertEquals(null, ConversaoUtil.naoPositivoParaNulo(-1L));

		assertEquals(null, ConversaoUtil.naoPositivoParaNulo(0L));

		Long testeNulo = null;

		assertEquals(null, ConversaoUtil.naoPositivoParaNulo(testeNulo));

		assertEquals(new Long(numeroPositivo), ConversaoUtil.naoPositivoParaNulo(numeroPositivo));
	}

	/**
	 * Testa o método {@link ConversaoUtil#naoPositivoParaNulo(Float)}.
	 * @author Senio Caires
	 */
	@Test
	public final void naoPositivoParaNuloFloat() {

		logger.info("Testando naoPositivoParaNuloFloat().");

		final float numeroPositivo = 100;

		assertEquals(null, ConversaoUtil.naoPositivoParaNulo(-1F));

		assertEquals(null, ConversaoUtil.naoPositivoParaNulo(0F));

		Float testeNulo = null;

		assertEquals(null, ConversaoUtil.naoPositivoParaNulo(testeNulo));

		assertEquals(new Float(numeroPositivo), ConversaoUtil.naoPositivoParaNulo(numeroPositivo));
	}

	/**
	 * Testa o método {@link ConversaoUtil#naoPositivoParaNulo(Double)}.
	 * @author Senio Caires
	 */
	@Test
	public final void naoPositivoParaNuloDouble() {

		logger.info("Testando naoPositivoParaNuloDouble().");

		final double numeroPositivo = 100;

		assertEquals(null, ConversaoUtil.naoPositivoParaNulo(-1D));

		assertEquals(null, ConversaoUtil.naoPositivoParaNulo(0D));

		Double testeNulo = null;

		assertEquals(null, ConversaoUtil.naoPositivoParaNulo(testeNulo));

		assertEquals(new Double(numeroPositivo), ConversaoUtil.naoPositivoParaNulo(numeroPositivo));
	}

	/**
	 * Testa o método {@link ConversaoUtil#naoPositivoParaNulo(BigDecimal)}.
	 * @author Senio Caires
	 */
	@Test
	public final void naoPositivoParaNuloBigDecimal() {

		logger.info("Testando naoPositivoParaNuloBigDecimal().");

		final BigDecimal numeroPositivo = new BigDecimal(100);

		assertEquals(null, ConversaoUtil.naoPositivoParaNulo(new BigDecimal(-1)));

		assertEquals(null, ConversaoUtil.naoPositivoParaNulo(new BigDecimal(0)));

		BigDecimal testeNulo = null;

		assertEquals(null, ConversaoUtil.naoPositivoParaNulo(testeNulo));

		assertEquals(numeroPositivo, ConversaoUtil.naoPositivoParaNulo(numeroPositivo));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaFalse(Boolean)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaFalse() {

		logger.info("Testando nuloParaFalse().");

		assertFalse(ConversaoUtil.nuloParaFalse(null));

		assertFalse(ConversaoUtil.nuloParaFalse(false));

		assertTrue(ConversaoUtil.nuloParaFalse(true));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaTrue(Boolean)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaTrue() {

		logger.info("Testando nuloParaTrue().");

		assertTrue(ConversaoUtil.nuloParaTrue(null));

		assertFalse(ConversaoUtil.nuloParaTrue(false));

		assertTrue(ConversaoUtil.nuloParaTrue(true));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaZero(Integer)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaZeroInteger() {

		logger.info("Testando nuloParaZeroInteger().");

		Integer testeNulo = null;

		assertEquals(new Integer(0), ConversaoUtil.nuloParaZero(testeNulo));

		assertEquals(new Integer(0), ConversaoUtil.nuloParaZero(0));

		assertEquals(new Integer(-1), ConversaoUtil.nuloParaZero(-1));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaZero(Long)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaZeroLong() {

		logger.info("Testando nuloParaZeroLong().");

		Long testeNulo = null;

		assertEquals(new Long(0), ConversaoUtil.nuloParaZero(testeNulo));

		assertEquals(new Long(0), ConversaoUtil.nuloParaZero(0L));

		assertEquals(new Long(-1), ConversaoUtil.nuloParaZero(-1L));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaZero(Float)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaZeroFloat() {

		logger.info("Testando nuloParaZeroFloat().");

		Float testeNulo = null;

		assertEquals(new Float(0), ConversaoUtil.nuloParaZero(testeNulo));

		assertEquals(new Float(0), ConversaoUtil.nuloParaZero(0F));

		assertEquals(new Float(-1), ConversaoUtil.nuloParaZero(-1F));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaZero(Double)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaZeroDouble() {

		logger.info("Testando nuloParaZeroDouble().");

		Double testeNulo = null;

		assertEquals(new Double(0), ConversaoUtil.nuloParaZero(testeNulo));

		assertEquals(new Double(0), ConversaoUtil.nuloParaZero(0D));

		assertEquals(new Double(-1), ConversaoUtil.nuloParaZero(-1D));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaZero(BigDecimal)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaZeroBigDecimal() {

		logger.info("Testando nuloParaZeroBigDecimal().");

		BigDecimal testeNulo = null;

		assertEquals(new BigDecimal(0), ConversaoUtil.nuloParaZero(testeNulo));

		assertEquals(new BigDecimal(0), ConversaoUtil.nuloParaZero(BigDecimal.ZERO));

		assertEquals(new BigDecimal(1), ConversaoUtil.nuloParaZero(BigDecimal.ONE));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaVazio(String)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaVazioString() {

		logger.info("Testando nuloParaVazioString().");

		String stringNula = null;

		assertEquals("", ConversaoUtil.nuloParaVazio(stringNula));

		assertFalse(" ".equals(ConversaoUtil.nuloParaVazio(stringNula)));

		assertFalse("teste".equals(ConversaoUtil.nuloParaVazio(stringNula)));

		assertFalse(ConversaoUtil.nuloParaVazio(stringNula) == null);

		assertFalse("teste".equals(ConversaoUtil.nuloParaVazio("TESTE")));
	}

	/**
	 * Testa o método {@link ConversaoUtil#nuloParaVazio(Character)}.
	 * @author Senio Caires
	 */
	@Test
	public final void nuloParaVazioCharacter() {

		logger.info("Testando nuloParaVazioCharacter().");

		Character characterNulo = null;

		assertTrue(ConversaoUtil.nuloParaVazio(characterNulo) == ' ');

		assertFalse(ConversaoUtil.nuloParaVazio(characterNulo) == null);

		assertFalse(ConversaoUtil.nuloParaVazio('T') == null);
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
		logger.info("Sucesso!");
	}

	/**
	 * Método executado após finalizar todos os casos teste. <br/>
	 * Executado apenas uma vez.
	 * @author Senio Caires
	 */
	@AfterClass
	public static void executarDepoisDeTudo() {
		logger.info("Finalizando classe.");
	}
}
