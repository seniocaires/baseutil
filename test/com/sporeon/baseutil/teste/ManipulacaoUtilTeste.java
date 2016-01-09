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

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sporeon.baseutil.ManipulacaoUtil;

/**
 * Classe de teste unitário para testar a classe {@link ManipulacaoUtil}.
 * @author Senio Caires
 */
public class ManipulacaoUtilTeste {

	/* ------------------------------
	 * CONSTANTES
	 * ------------------------------
	 */

	/**
	 * Logger.
	 * @author Senio Caires
	 */
	private static final Logger LOGGER = Logger.getLogger(ManipulacaoUtilTeste.class);

	/**
	 * 123.
	 * @author Senio Caires
	 */
	private static final String STRING_123 = "123";

	/**
	 * String com três espaços.
	 * @author Senio Caires
	 */
	private static final String STRING_3_ESPACOS = "   ";

	/**
	 * String com espaços na esquerda e na direita.
	 * @author Senio Caires
	 */
	private static final String STRING_ESPACOS_ESQUERDA_DIREITA = "    123    ";

	/**
	 * Número 6.
	 * @author Senio Caires
	 */
	private static final int NUMERO_6 = 6;

	/**
	 * Número 3.
	 * @author Senio Caires
	 */
	private static final int NUMERO_3 = 3;

	/* ------------------------------
	 * CONTRUTORES
	 * ------------------------------
	 */

	/**
	 * Construtor padrão.
	 * @author Senio Caires
	 */
	public ManipulacaoUtilTeste() { }

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
	 * Testa o método {@link ManipulacaoUtil#adicionarZeroEsquerda(String, int)}.
	 * @author Senio Caires
	 */
	@Test
	public final void adicionarZeroEsquerda() {

		LOGGER.info("Testando adicionarZeroEsquerda().");

		Assert.assertEquals("000123", ManipulacaoUtil.adicionarZeroEsquerda(STRING_123, NUMERO_6));

		Assert.assertEquals(STRING_123, ManipulacaoUtil.adicionarZeroEsquerda(STRING_123, NUMERO_3));

		Assert.assertEquals(STRING_123, ManipulacaoUtil.adicionarZeroEsquerda(STRING_123, 0));

		Assert.assertEquals("000", ManipulacaoUtil.adicionarZeroEsquerda("", NUMERO_3));

		Assert.assertEquals(null, ManipulacaoUtil.adicionarZeroEsquerda(null, NUMERO_6));

		Assert.assertEquals(STRING_123, ManipulacaoUtil.adicionarZeroEsquerda(STRING_123, -1));
	}

	/**
	 * Testa o método {@link ManipulacaoUtil#adicionarEspacoEsquerda(String, int)}.
	 * @author Senio Caires
	 */
	@Test
	public final void adicionarEspacoEsquerda() {

		LOGGER.info("Testando adicionarEspacoEsquerda().");

		Assert.assertEquals("   123", ManipulacaoUtil.adicionarEspacoEsquerda(STRING_123, NUMERO_6));

		Assert.assertEquals(STRING_123, ManipulacaoUtil.adicionarEspacoEsquerda(STRING_123, NUMERO_3));

		Assert.assertEquals(STRING_123, ManipulacaoUtil.adicionarEspacoEsquerda(STRING_123, 0));

		Assert.assertEquals(STRING_3_ESPACOS, ManipulacaoUtil.adicionarEspacoEsquerda("", NUMERO_3));

		Assert.assertEquals(null, ManipulacaoUtil.adicionarEspacoEsquerda(null, NUMERO_6));

		Assert.assertEquals(STRING_123, ManipulacaoUtil.adicionarEspacoEsquerda(STRING_123, -1));
	}

	/**
	 * Testa o método {@link ManipulacaoUtil#adicionarZeroDireita(String, int)}.
	 * @author Senio Caires
	 */
	@Test
	public final void adicionarZeroDireita() {

		LOGGER.info("Testando adicionarZeroDireita().");

		Assert.assertEquals("123000", ManipulacaoUtil.adicionarZeroDireita(STRING_123, NUMERO_6));

		Assert.assertEquals(STRING_123, ManipulacaoUtil.adicionarZeroDireita(STRING_123, NUMERO_3));

		Assert.assertEquals(STRING_123, ManipulacaoUtil.adicionarZeroDireita(STRING_123, 0));

		Assert.assertEquals("000", ManipulacaoUtil.adicionarZeroDireita("", NUMERO_3));

		Assert.assertEquals(null, ManipulacaoUtil.adicionarZeroDireita(null, NUMERO_6));

		Assert.assertEquals(STRING_123, ManipulacaoUtil.adicionarZeroDireita(STRING_123, -1));
	}

	/**
	 * Testa o método {@link ManipulacaoUtil#adicionarEspacoDireita(String, int)}.
	 * @author Senio Caires
	 */
	@Test
	public final void adicionarEspacoDireita() {

		LOGGER.info("Testando adicionarEspacoDireita().");

		Assert.assertEquals("123   ", ManipulacaoUtil.adicionarEspacoDireita(STRING_123, NUMERO_6));

		Assert.assertEquals(STRING_123, ManipulacaoUtil.adicionarEspacoDireita(STRING_123, NUMERO_3));

		Assert.assertEquals(STRING_123, ManipulacaoUtil.adicionarEspacoDireita(STRING_123, 0));

		Assert.assertEquals(STRING_3_ESPACOS, ManipulacaoUtil.adicionarEspacoDireita("", NUMERO_3));

		Assert.assertEquals(null, ManipulacaoUtil.adicionarEspacoDireita(null, NUMERO_6));

		Assert.assertEquals(STRING_123, ManipulacaoUtil.adicionarEspacoDireita(STRING_123, -1));
	}

	/**
	 * Testa o método {@link ManipulacaoUtil#removerEspacoEsquerda(String)}.
	 * @author Senio Caires
	 */
	@Test
	public final void removerEspacoEsquerda() {

		LOGGER.info("Testando removerEspacoEsquerda().");

		Assert.assertEquals("123    ", ManipulacaoUtil.removerEspacoEsquerda(STRING_ESPACOS_ESQUERDA_DIREITA));

		Assert.assertEquals("", ManipulacaoUtil.removerEspacoEsquerda(STRING_3_ESPACOS));

		Assert.assertEquals(null, ManipulacaoUtil.removerEspacoEsquerda(null));
	}

	/**
	 * Testa o método {@link ManipulacaoUtil#removerEspacoDireita(String)}.
	 * @author Senio Caires
	 */
	@Test
	public final void removerEspacoDireita() {

		LOGGER.info("Testando removerEspacoDireita().");

		Assert.assertEquals("    123", ManipulacaoUtil.removerEspacoDireita(STRING_ESPACOS_ESQUERDA_DIREITA));

		Assert.assertEquals("", ManipulacaoUtil.removerEspacoDireita("   "));

		Assert.assertEquals(null, ManipulacaoUtil.removerEspacoDireita(null));
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
