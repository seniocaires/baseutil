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
	private static final Logger LOGGER = Logger.getLogger(ComparacaoUtilTeste.class);

	/* ------------------------------
	 * CONTRUTORES
	 * ------------------------------
	 */

	/**
	 * Construtor padrão privado.
	 * @author Senio Caires
	 */
	private ComparacaoUtilTeste() { }

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
	 * Testa o método {@link ComparacaoUtil#isPositivo(Integer)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isPositivoInteger() {

		LOGGER.info("Testando isPositivoInteger().");

		final Integer integerNulo = null;

		Assert.assertFalse(ComparacaoUtil.isPositivo(integerNulo));

		Assert.assertFalse(ComparacaoUtil.isPositivo(-1));

		Assert.assertFalse(ComparacaoUtil.isPositivo(0));

		Assert.assertTrue(ComparacaoUtil.isPositivo(1));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isPositivo(Long)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isPositivoLong() {

		LOGGER.info("Testando isPositivoLong().");

		final Long longNulo = null;

		Assert.assertFalse(ComparacaoUtil.isPositivo(longNulo));

		Assert.assertFalse(ComparacaoUtil.isPositivo(-1L));

		Assert.assertFalse(ComparacaoUtil.isPositivo(0L));

		Assert.assertTrue(ComparacaoUtil.isPositivo(1L));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isPositivo(Float)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isPositivoFloat() {

		LOGGER.info("Testando isPositivoFloat().");

		final Float floatNulo = null;

		Assert.assertFalse(ComparacaoUtil.isPositivo(floatNulo));

		Assert.assertFalse(ComparacaoUtil.isPositivo(-1F));

		Assert.assertFalse(ComparacaoUtil.isPositivo(0F));

		Assert.assertTrue(ComparacaoUtil.isPositivo(1F));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isPositivo(Double)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isPositivoDouble() {

		LOGGER.info("Testando isPositivoDouble().");

		final Double doubleNulo = null;

		Assert.assertFalse(ComparacaoUtil.isPositivo(doubleNulo));

		Assert.assertFalse(ComparacaoUtil.isPositivo(-1D));

		Assert.assertFalse(ComparacaoUtil.isPositivo(0D));

		Assert.assertTrue(ComparacaoUtil.isPositivo(1D));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isPositivo(BigDecimal)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isPositivoBigDecimal() {

		LOGGER.info("Testando isPositivoBigDecimal().");

		final BigDecimal bigDecimalNulo = null;

		Assert.assertFalse(ComparacaoUtil.isPositivo(bigDecimalNulo));

		Assert.assertFalse(ComparacaoUtil.isPositivo(BigDecimal.valueOf(-1D)));

		Assert.assertFalse(ComparacaoUtil.isPositivo(BigDecimal.ZERO));

		Assert.assertTrue(ComparacaoUtil.isPositivo(BigDecimal.ONE));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isVazio(Integer)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isVazioInteger() {

		LOGGER.info("Testando isVazioInteger().");

		final Integer integerNulo = null;

		Assert.assertTrue(ComparacaoUtil.isVazio(integerNulo));

		Assert.assertTrue(ComparacaoUtil.isVazio(0));

		Assert.assertTrue(ComparacaoUtil.isVazio(Integer.valueOf(0)));

		Assert.assertFalse(ComparacaoUtil.isVazio(1));

		Assert.assertFalse(ComparacaoUtil.isVazio(-1));

		Assert.assertFalse(ComparacaoUtil.isVazio(Integer.valueOf(1)));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isVazio(Long)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isVazioLong() {

		LOGGER.info("Testando isVazioLong().");

		final Long longNulo = null;

		Assert.assertTrue(ComparacaoUtil.isVazio(longNulo));

		Assert.assertTrue(ComparacaoUtil.isVazio(0L));

		Assert.assertTrue(ComparacaoUtil.isVazio(Long.valueOf(0)));

		Assert.assertFalse(ComparacaoUtil.isVazio(1L));

		Assert.assertFalse(ComparacaoUtil.isVazio(-1L));

		Assert.assertFalse(ComparacaoUtil.isVazio(Long.valueOf(1)));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isVazio(Double)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isVazioDouble() {

		LOGGER.info("Testando isVazioDouble().");

		final Double doubleNulo = null;

		Assert.assertTrue(ComparacaoUtil.isVazio(doubleNulo));

		Assert.assertTrue(ComparacaoUtil.isVazio(0.0));

		Assert.assertTrue(ComparacaoUtil.isVazio(Double.valueOf(0.0)));

		Assert.assertFalse(ComparacaoUtil.isVazio(1.0));

		Assert.assertFalse(ComparacaoUtil.isVazio(-1.0));

		Assert.assertFalse(ComparacaoUtil.isVazio(Double.valueOf(1.0)));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isVazio(BigDecimal)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isVazioBigDecimal() {

		LOGGER.info("Testando isVazioBigDecimal().");

		final BigDecimal bigDecimalNulo = null;

		Assert.assertTrue(ComparacaoUtil.isVazio(bigDecimalNulo));

		Assert.assertTrue(ComparacaoUtil.isVazio(BigDecimal.ZERO));

		Assert.assertTrue(ComparacaoUtil.isVazio(BigDecimal.valueOf(0)));

		Assert.assertFalse(ComparacaoUtil.isVazio(BigDecimal.ONE));

		Assert.assertFalse(ComparacaoUtil.isVazio(BigDecimal.valueOf(-1)));

		Assert.assertFalse(ComparacaoUtil.isVazio(BigDecimal.valueOf(1)));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isVazio(String)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isVazioString() {

		LOGGER.info("Testando isVazioString().");

		final String stringNula = null;

		Assert.assertTrue(ComparacaoUtil.isVazio(stringNula));

		Assert.assertTrue(ComparacaoUtil.isVazio(""));

		Assert.assertTrue(ComparacaoUtil.isVazio("    "));

		Assert.assertFalse(ComparacaoUtil.isVazio("Não está vazio"));

		Assert.assertFalse(ComparacaoUtil.isVazio("  Não está vazio  "));
	}

	/**
	 * Testa o método {@link ComparacaoUtil#isVazio(Character)}.
	 * @author Senio Caires
	 */
	@Test
	public final void isVazioCharacter() {

		LOGGER.info("Testando isVazioCharacter().");

		final Character characterNulo = null;

		Assert.assertTrue(ComparacaoUtil.isVazio(characterNulo));

		Assert.assertTrue(ComparacaoUtil.isVazio(' '));

		Assert.assertFalse(ComparacaoUtil.isVazio('N'));
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
