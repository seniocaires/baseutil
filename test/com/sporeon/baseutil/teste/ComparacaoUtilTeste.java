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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sporeon.baseutil.ComparacaoUtil;

/**
 * Classe de teste unitário para testar a classe {@link ComparacaoUtil}.
 * @author Senio Caires
 */
public class ComparacaoUtilTeste {

	/* ------------------------------
	 * CONSTANTES
	 * ------------------------------
	 */

	/**
	 * Logger.
	 * @author Senio Caires
	 */
	private static Logger logger = Logger.getLogger(ComparacaoUtilTeste.class);

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
	 * Testa o método {@link ComparacaoUtil#isPositivo(Integer)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isPositivoInteger() {

		logger.info("Testando isPositivoInteger().");

		Integer integerNulo = null;

		assertFalse(ComparacaoUtil.isPositivo(integerNulo));

		assertFalse(ComparacaoUtil.isPositivo(-1));

		assertFalse(ComparacaoUtil.isPositivo(0));

		assertTrue(ComparacaoUtil.isPositivo(1));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isPositivo(Long)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isPositivoLong() {

		logger.info("Testando isPositivoLong().");

		Long longNulo = null;

		assertFalse(ComparacaoUtil.isPositivo(longNulo));

		assertFalse(ComparacaoUtil.isPositivo(-1L));

		assertFalse(ComparacaoUtil.isPositivo(0L));

		assertTrue(ComparacaoUtil.isPositivo(1L));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isPositivo(Float)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isPositivoFloat() {

		logger.info("Testando isPositivoFloat().");

		Float floatNulo = null;

		assertFalse(ComparacaoUtil.isPositivo(floatNulo));

		assertFalse(ComparacaoUtil.isPositivo(-1F));

		assertFalse(ComparacaoUtil.isPositivo(0F));

		assertTrue(ComparacaoUtil.isPositivo(1F));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isPositivo(Double)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isPositivoDouble() {

		logger.info("Testando isPositivoDouble().");

		Double doubleNulo = null;

		assertFalse(ComparacaoUtil.isPositivo(doubleNulo));

		assertFalse(ComparacaoUtil.isPositivo(-1D));

		assertFalse(ComparacaoUtil.isPositivo(0D));

		assertTrue(ComparacaoUtil.isPositivo(1D));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isPositivo(BigDecimal)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isPositivoBigDecimal() {

		logger.info("Testando isPositivoBigDecimal().");

		BigDecimal bigDecimalNulo = null;

		assertFalse(ComparacaoUtil.isPositivo(bigDecimalNulo));

		assertFalse(ComparacaoUtil.isPositivo(new BigDecimal(-1D)));

		assertFalse(ComparacaoUtil.isPositivo(BigDecimal.ZERO));

		assertTrue(ComparacaoUtil.isPositivo(BigDecimal.ONE));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isVazio(Integer)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isVazioInteger() {

		logger.info("Testando isVazioInteger().");

		Integer integerNulo = null;

		assertTrue(ComparacaoUtil.isVazio(integerNulo));

		assertTrue(ComparacaoUtil.isVazio(0));

		assertTrue(ComparacaoUtil.isVazio(new Integer(0)));

		assertFalse(ComparacaoUtil.isVazio(1));

		assertFalse(ComparacaoUtil.isVazio(-1));

		assertFalse(ComparacaoUtil.isVazio(new Integer(1)));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isVazio(Long)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isVazioLong() {

		logger.info("Testando isVazioLong().");

		Long longNulo = null;

		assertTrue(ComparacaoUtil.isVazio(longNulo));

		assertTrue(ComparacaoUtil.isVazio(0L));

		assertTrue(ComparacaoUtil.isVazio(new Long(0)));

		assertFalse(ComparacaoUtil.isVazio(1L));

		assertFalse(ComparacaoUtil.isVazio(-1L));

		assertFalse(ComparacaoUtil.isVazio(new Long(1)));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isVazio(Double)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isVazioDouble() {

		logger.info("Testando isVazioDouble().");

		Double doubleNulo = null;

		assertTrue(ComparacaoUtil.isVazio(doubleNulo));

		assertTrue(ComparacaoUtil.isVazio(0.0));

		assertTrue(ComparacaoUtil.isVazio(new Double(0.0)));

		assertFalse(ComparacaoUtil.isVazio(1.0));

		assertFalse(ComparacaoUtil.isVazio(-1.0));

		assertFalse(ComparacaoUtil.isVazio(new Double(1.0)));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isVazio(BigDecimal)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isVazioBigDecimal() {

		logger.info("Testando isVazioBigDecimal().");

		BigDecimal bigDecimalNulo = null;

		assertTrue(ComparacaoUtil.isVazio(bigDecimalNulo));

		assertTrue(ComparacaoUtil.isVazio(BigDecimal.ZERO));

		assertTrue(ComparacaoUtil.isVazio(new BigDecimal(0)));

		assertFalse(ComparacaoUtil.isVazio(BigDecimal.ONE));

		assertFalse(ComparacaoUtil.isVazio(new BigDecimal(-1)));

		assertFalse(ComparacaoUtil.isVazio(new BigDecimal(1)));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isVazio(String)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isVazioString() {

		logger.info("Testando isVazioString().");

		String stringNula = null;

		assertTrue(ComparacaoUtil.isVazio(stringNula));

		assertTrue(ComparacaoUtil.isVazio(""));

		assertTrue(ComparacaoUtil.isVazio("    "));

		assertFalse(ComparacaoUtil.isVazio("Não está vazio"));

		assertFalse(ComparacaoUtil.isVazio("  Não está vazio  "));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isVazio(Character)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isVazioCharacter() {

		logger.info("Testando isVazioCharacter().");

		Character characterNulo = null;

		assertTrue(ComparacaoUtil.isVazio(characterNulo));

		assertTrue(ComparacaoUtil.isVazio(' '));

		assertFalse(ComparacaoUtil.isVazio('N'));
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
