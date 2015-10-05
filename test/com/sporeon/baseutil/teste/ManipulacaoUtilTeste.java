package com.sporeon.baseutil.teste;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
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
	private static Logger logger = Logger.getLogger(ManipulacaoUtilTeste.class);

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
	 * Testa o método {@link ManipulacaoUtil#adicionarZeroEsquerda(String, int)}.
	 * @author Senio Caires
	 */
	@Test
	public final void adicionarZeroEsquerda() {

		logger.info("Testando adicionarZeroEsquerda().");

		final String string = "123";
		final int seisDigitos = 6;
		final int tresDigitos = 3;

		assertEquals("000123", ManipulacaoUtil.adicionarZeroEsquerda(string, seisDigitos));

		assertEquals("123", ManipulacaoUtil.adicionarZeroEsquerda(string, tresDigitos));

		assertEquals("123", ManipulacaoUtil.adicionarZeroEsquerda(string, 0));

		assertEquals("000", ManipulacaoUtil.adicionarZeroEsquerda("", tresDigitos));

		assertEquals(null, ManipulacaoUtil.adicionarZeroEsquerda(null, seisDigitos));

		assertEquals("123", ManipulacaoUtil.adicionarZeroEsquerda(string, -1));
	}

	/**
	 * Testa o método {@link ManipulacaoUtil#adicionarEspacoEsquerda(String, int)}.
	 * @author Senio Caires
	 */
	@Test
	public final void adicionarEspacoEsquerda() {

		logger.info("Testando adicionarEspacoEsquerda().");

		final String string = "123";
		final int seisDigitos = 6;
		final int tresDigitos = 3;

		assertEquals("   123", ManipulacaoUtil.adicionarEspacoEsquerda(string, seisDigitos));

		assertEquals("123", ManipulacaoUtil.adicionarEspacoEsquerda(string, tresDigitos));

		assertEquals("123", ManipulacaoUtil.adicionarEspacoEsquerda(string, 0));

		assertEquals("   ", ManipulacaoUtil.adicionarEspacoEsquerda("", tresDigitos));

		assertEquals(null, ManipulacaoUtil.adicionarEspacoEsquerda(null, seisDigitos));

		assertEquals("123", ManipulacaoUtil.adicionarEspacoEsquerda(string, -1));
	}

	/**
	 * Testa o método {@link ManipulacaoUtil#adicionarZeroDireita(String, int)}.
	 * @author Senio Caires
	 */
	@Test
	public final void adicionarZeroDireita() {

		logger.info("Testando adicionarZeroDireita().");

		final String string = "123";
		final int seisDigitos = 6;
		final int tresDigitos = 3;

		assertEquals("123000", ManipulacaoUtil.adicionarZeroDireita(string, seisDigitos));

		assertEquals("123", ManipulacaoUtil.adicionarZeroDireita(string, tresDigitos));

		assertEquals("123", ManipulacaoUtil.adicionarZeroDireita(string, 0));

		assertEquals("000", ManipulacaoUtil.adicionarZeroDireita("", tresDigitos));

		assertEquals(null, ManipulacaoUtil.adicionarZeroDireita(null, seisDigitos));

		assertEquals("123", ManipulacaoUtil.adicionarZeroDireita(string, -1));
	}

	/**
	 * Testa o método {@link ManipulacaoUtil#adicionarEspacoDireita(String, int)}.
	 * @author Senio Caires
	 */
	@Test
	public final void adicionarEspacoDireita() {

		logger.info("Testando adicionarEspacoDireita().");

		final String string = "123";
		final int seisDigitos = 6;
		final int tresDigitos = 3;

		assertEquals("123   ", ManipulacaoUtil.adicionarEspacoDireita(string, seisDigitos));

		assertEquals("123", ManipulacaoUtil.adicionarEspacoDireita(string, tresDigitos));

		assertEquals("123", ManipulacaoUtil.adicionarEspacoDireita(string, 0));

		assertEquals("   ", ManipulacaoUtil.adicionarEspacoDireita("", tresDigitos));

		assertEquals(null, ManipulacaoUtil.adicionarEspacoDireita(null, seisDigitos));

		assertEquals("123", ManipulacaoUtil.adicionarEspacoDireita(string, -1));
	}

	/**
	 * Testa o método {@link ManipulacaoUtil#removerEspacoEsquerda(String)}.
	 * @author Senio Caires
	 */
	@Test
	public final void removerEspacoEsquerda() {

		logger.info("Testando removerEspacoEsquerda().");

		String string = "    123    ";

		assertEquals("123    ", ManipulacaoUtil.removerEspacoEsquerda(string));

		assertEquals("", ManipulacaoUtil.removerEspacoEsquerda("   "));

		assertEquals(null, ManipulacaoUtil.removerEspacoEsquerda(null));
	}

	/**
	 * Testa o método {@link ManipulacaoUtil#removerEspacoDireita(String)}.
	 * @author Senio Caires
	 */
	@Test
	public final void removerEspacoDireita() {

		logger.info("Testando removerEspacoDireita().");

		String string = "    123    ";

		assertEquals("    123", ManipulacaoUtil.removerEspacoDireita(string));

		assertEquals("", ManipulacaoUtil.removerEspacoDireita("   "));

		assertEquals(null, ManipulacaoUtil.removerEspacoDireita(null));
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
