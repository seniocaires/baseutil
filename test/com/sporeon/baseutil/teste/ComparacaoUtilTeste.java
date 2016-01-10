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

	/* ------------------------------
	 * CONTRUTORES
	 * ------------------------------
	 */

	/**
	 * Construtor padrão.
	 * @author Senio Caires
	 */
	public ComparacaoUtilTeste() {
		// JUnit requer um construtor público.
	}

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

		Assert.assertFalse(ComparacaoUtil.isPositivo(INTEGER_NULO));

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

		Assert.assertFalse(ComparacaoUtil.isPositivo(LONG_NULO));

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

		Assert.assertFalse(ComparacaoUtil.isPositivo(FLOAT_NULO));

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

		Assert.assertFalse(ComparacaoUtil.isPositivo(DOUBLE_NULO));

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

		Assert.assertFalse(ComparacaoUtil.isPositivo(BIGDECIMAL_NULO));

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

		Assert.assertTrue(ComparacaoUtil.isVazio(INTEGER_NULO));

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

		Assert.assertTrue(ComparacaoUtil.isVazio(LONG_NULO));

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

		Assert.assertTrue(ComparacaoUtil.isVazio(DOUBLE_NULO));

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

		Assert.assertTrue(ComparacaoUtil.isVazio(BIGDECIMAL_NULO));

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

		Assert.assertTrue(ComparacaoUtil.isVazio(STRING_NULA));

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

		Assert.assertTrue(ComparacaoUtil.isVazio(CHARACTER_NULO));

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
