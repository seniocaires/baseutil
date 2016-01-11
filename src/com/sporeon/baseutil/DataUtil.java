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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Classe base para utilitários de datas.
 * @author Senio Caires
 */
public final class DataUtil {

	/* ------------------------------
	 * CONSTANTES
	 * ------------------------------
	 */

	/**
	 * Logger.
	 * @author Senio Caires
	 */
	private static final Logger LOGGER = Logger.getLogger(DataUtil.class);

	/* ------------------------------
	 * CONTRUTORES
	 * ------------------------------
	 */

	/**
	 * Construtor padrão privado.
	 * @author Senio Caires
	 */
	private DataUtil() { }

	/* ------------------------------
	 * OUTROS
	 * ------------------------------
	 */

	/**
	 * Método Converte uma String (dd/mm/yyyy) em uma Data Válida.
	 * @param data - Data
	 * @return data - String
	 * @author Senio Caires
	 */
	public static Date stringParaDate(final String data) {

		Date resultado = null;

		if (data == null || data.equals("")) {
			return null;
		}

		DateFormat dataEntrada = new SimpleDateFormat("dd/MM/yyyy");

		try {
			resultado = dataEntrada.parse(data);
		} catch (ParseException e) {
			LOGGER.error(e.getMessage());
		}

		return resultado;
	}

	/**
	 * Método Converte uma String (formatoDeEntrada) em uma Data Válida.
	 * @param data - Data
	 * @param formatoDeEntrada - Formato de entrada
	 * @return data - String
	 * @author Senio Caires
	 */
	public static Date stringParaDate(final String data, final String formatoDeEntrada) {

		Date resultado = null;

		DateFormat dataEntrada = new SimpleDateFormat(formatoDeEntrada);
		DateFormat dataSaida = new SimpleDateFormat("dd/MM/yyyy");

		try {
			resultado = dataSaida.parse(dataSaida.format(dataEntrada.parse(data)));
		} catch (ParseException e) {
			LOGGER.error(e.getMessage());
		}

		return resultado;
	}

	/**
	 * Método Converte uma String (formatoDeEntrada) em uma Data Válida.
	 * @param data - Data
	 * @param formatoDeEntrada - Formato de entrada
	 * @param formatoDeSaida - Formato de saída
	 * @return data - String
	 * @author Senio Caires
	 */
	public static Date stringParaDate(final String data, final String formatoDeEntrada, final String formatoDeSaida) {

		Date resultado = null;

		DateFormat dataEntrada = new SimpleDateFormat(formatoDeEntrada);
		DateFormat dataSaida = new SimpleDateFormat(formatoDeSaida);

		try {
			resultado = dataSaida.parse(dataSaida.format(dataEntrada.parse(data)));
		} catch (ParseException e) {
			LOGGER.error(e.getMessage());
		}

		return resultado;
	}

	/**
	 * Método Converte uma Data válida numa String de data : dd/MM/yyyy.
	 * @param data - Data
	 * @return data - String
	 * @author Senio Caires
	 */
	public static String dateParaString(final Date data) {

		String resultado = new String("");

		DateFormat dataSaida = new SimpleDateFormat("dd/MM/yyyy");

		if (data != null) {
			resultado = dataSaida.format(data);
		}

		return resultado;
	}

	/**
	 * Método Converte uma Data válida em uma String de data de acordo formato de Saída.
	 * The year
	 *	formatter = new SimpleDateFormat("yy"); // 02
		formatter = new SimpleDateFormat("yyyy"); // 2002

	 * The month
		formatter = new SimpleDateFormat("M"); // 1
		formatter = new SimpleDateFormat("MM"); // 01
		formatter = new SimpleDateFormat("MMM"); // Jan
		formatter = new SimpleDateFormat("MMMM"); // January

	 * The day
		formatter = new SimpleDateFormat("d"); // 9
		formatter = new SimpleDateFormat("dd"); // 09

	 * The day in week
		formatter = new SimpleDateFormat("E"); // Wed
		formatter = new SimpleDateFormat("EEEE"); // Wednesday

	 * Time
	 * Format("yyyy.MM.dd.HH.mm.ss")

	 * @param data - Data
	 * @param formatoDeSaida - Formato de saída
	 * @return data - String
	 * @author Senio Caires
	 */
	public static String dateParaString(final Date data, final String formatoDeSaida) {

		String resultado = new String("");

		if (data == null) {
			return resultado;
		}

		DateFormat dataSaida = new SimpleDateFormat(ConversaoUtil.nuloParaVazio(formatoDeSaida));

		resultado = dataSaida.format(data);

		return resultado;
	}

	/**
	 * Método Converte uma Data válida numa String de data : dd/MM/yyyy às HH:mm.
	 * @author Senio Caires
	 * @param data - Data
	 * @return data - String
	 */
	public static String dataHoraParaString(final Date data) {

		StringBuilder resultado = new StringBuilder("");

		DateFormat formatoSaida = new SimpleDateFormat("dd/MM/yyyy à's' HH:mm");

		if (data != null) {
			resultado.append(formatoSaida.format(data));
		}

		return resultado.toString();
	}

	/**
	 * Método para formatar data.
	 * @param data - Data
	 * @param formatoDeEntrada - Formato de entrada
	 * @return data
	 * @author Senio Caires
	 */
	public static String formatarData(final String data, final String formatoDeEntrada) {

		String resultado = "";

		if (data == null) {
			return "";
		}

		DateFormat dataEntrada = new SimpleDateFormat(formatoDeEntrada);
		DateFormat dataSaida = new SimpleDateFormat("dd/MM/yyyy");

		try {

			Date dataValida = dataEntrada.parse(data);
			resultado = dataSaida.format(dataValida);

		} catch (ParseException e) {
			LOGGER.error(e.getMessage());
		}

		return resultado;
	}

	/**
	 * Método para formatar data yyyy-MM-dd em dd/MM/yyyy.
	 * @param data - Data
	 * @return data
	 * @author Senio Caires
	 */
	public static String formatarData(final String data) {

		String resultado = new String("");
		DateFormat dataEntrada = new SimpleDateFormat("yyyy-MM-dd");

		DateFormat dataSaida = new SimpleDateFormat("dd/MM/yyyy");

		try {

			Date dataValida = dataEntrada.parse(data);

			resultado = dataSaida.format(dataValida);

		} catch (ParseException e) {
			LOGGER.error(e.getMessage());
		}

		return resultado;
	}

	/**
	 * Método para formatar data.
	 * @param data - Data
	 * @param formatoDeEntrada - Formato de entrada
	 * @param formatoDeSaida - Formato de saída
	 * @author Senio Caires
	 */
	public static String formatarData(final String data, final String formatoDeEntrada, final String formatoDeSaida) {

		String resultado = "";
		DateFormat dataEntrada = new SimpleDateFormat(formatoDeEntrada);

		DateFormat dataSaida = new SimpleDateFormat(formatoDeSaida);

		try {

			Date dataValida = dataEntrada.parse(data);

			resultado = dataSaida.format(dataValida);

		} catch (ParseException e) {
			LOGGER.error(e.getMessage());
		}

		return resultado;
	}

	/**
	 * Retorna data atual no formato especificado.
	 * @param formatoDeSaida - Formato de saída
	 * @return data
	 * @author Senio Caires
	 */
	public static String getDataAtualFormatada(final String formatoDeSaida) {

		String resultado = "";
		Date dataHoje = new Date();
		DateFormat dataSaida = new SimpleDateFormat(ConversaoUtil.nuloParaVazio(formatoDeSaida));

		resultado = dataSaida.format(dataHoje);

		return resultado;
	}

	/**
	 * Método que retorna o último dia do mês de uma data.
	 * @param data - Data
	 * @return ultimo dia do mês
	 * @author Senio Caires
	 */
	public static int ultimoDiaDoMes(final Date data) {

		Calendar calendar = new GregorianCalendar();

		calendar.setTime(data);

		int resultado = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		calendar = null;

		return resultado;
	}

	/**
	 * Método que retorna o último dia do mês.
	 * @param ano - Ano
	 * @param mes - Mês
	 * @return ultimo dia do mes
	 * @author Senio Caires
	 */
	public static int ultimoDiaDoMes(final Integer ano, final Integer mes) {

		int mesReal = mes - 1;

		Calendar calendar = new GregorianCalendar(ano, mesReal , 1);

		int resultado = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		return resultado;
	}

	/**
	 * Método para verificar se é uma data válida.
	 * @param data - Data
	 * @return boolean
	 * @author Senio Caires
	 */
	public static boolean isDataValida(final String data) {

		try {

			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
			df.setLenient(false);
			Date dt2 = df.parse(data);

			String dataMaior = "31/12/9999";

			String dataMenor = "01/01/1753";

			if (dt2.after(stringParaDate(dataMaior)) || dt2.before(stringParaDate(dataMenor))) {
				return false;
			}

			return true;

		} catch (ParseException e) {
			LOGGER.error("ParseException" + e.getMessage());
			return false;
		} catch (IllegalArgumentException iae) {
			LOGGER.error("IllegalArgumentException" + iae.getMessage());
			return false;
		}
	}

	/**
	 * Método para verificar se é uma data válida.
	 * @param data - Data
	 * @return boolean
	 * @author Senio Caires
	 */
	public static boolean isDataValida(final Date data) {

		try {

			String dataMaior = "31/12/9999";

			String dataMenor = "01/01/1753";

			if (data.after(stringParaDate(dataMaior)) || data.before(stringParaDate(dataMenor))) {
				return false;
			}

			return true;
		} catch (IllegalArgumentException iae) {
			LOGGER.error("IllegalArgumentException" + iae.getMessage());
			return false;
		}
	}

	/**
	 * Verifica se a data é valida.
	 * @param data - Data
	 * @return true se a data for valida
	 * @author Senio Caires
	 */
	public boolean isDataFormatoValido(final String data) {

		boolean resultado = false;

		DateFormat dataEntrada = new SimpleDateFormat("dd/MM/yyyy");

		try {
			dataEntrada.parse(data);
			resultado = true;
		} catch (ParseException e) {
			LOGGER.error(e.getMessage());
			resultado = false;
		}

		return resultado;
	}

	/**
	 * Adicionar uma quantidade de dias a uma data.
	 * @param data - Data
	 * @param quantidadeDeDias - Quantidade de dias
	 * @return data
	 * @author Senio Caires
	 */
	public static Date adicionarDias(final Date data, final int quantidadeDeDias) {

		Calendar calendar = new GregorianCalendar();

		calendar.setTime(data);

		calendar.add(Calendar.DATE, quantidadeDeDias);

		return calendar.getTime();
	}

	/**
	 * Remover uma quantidade de dias de uma data.
	 * @param data - Data
	 * @param quantidadeDeDias - Quantidade de dias
	 * @return data
	 * @author Senio Caires
	 */
	public static Date removerDias(final Date data, final int quantidadeDeDias) {

		GregorianCalendar calendar = new GregorianCalendar();

		calendar.setTime(data);

		calendar.add(Calendar.DATE, (quantidadeDeDias * -1));

		return calendar.getTime();
	}

	/**
	 * Adicionar uma quantidade de meses a uma data.
	 * @param data - Data
	 * @param quantidadeDeMeses - Quantidade de meses
	 * @return data
	 * @author Senio Caires
	 */
	public static Date adicionarMeses(final Date data, final int quantidadeDeMeses) {

		Calendar calendar = new GregorianCalendar();

		calendar.setTime(data);

		calendar.add(Calendar.MONTH, quantidadeDeMeses);

		return calendar.getTime();
	}

	/**
	 * Remover uma quantidade de meses a uma data.
	 * @param data - Data
	 * @param quantidadeDeMeses - Quantidade de mese
	 * @return data
	 * @author Senio Caires
	 */
	public static Date removerMeses(final Date data, final int quantidadeDeMeses) {

		Calendar calendar = new GregorianCalendar();

		calendar.setTime(data);

		calendar.add(Calendar.MONTH, quantidadeDeMeses * -1);

		return calendar.getTime();
	}

	/**
	 * Adicionar uma quantidade de anos a uma data.
	 * @param data - Data
	 * @param quantidadeDeAnos - Quantidade de anos
	 * @return data
	 * @author Senio Caires
	 */
	public static Date adicionarAnos(final Date data, final int quantidadeDeAnos) {

		Calendar calendar = new GregorianCalendar();

		calendar.setTime(data);

		calendar.add(Calendar.YEAR, quantidadeDeAnos);

		return calendar.getTime();
	}

	/**
	 * Remover uma quantidade de anos a uma data.
	 * @param data - Data
	 * @param quantidadeDeAnos - Quantidade de anos
	 * @return data
	 * @author Senio Caires
	 */
	public static Date removerAnos(final Date data, final int quantidadeDeAnos) {

		Calendar calendar = new GregorianCalendar();

		calendar.setTime(data);

		calendar.add(Calendar.YEAR, quantidadeDeAnos * -1);

		return calendar.getTime();
	}

	/**
	 * Converte os parâmetros em uma data.
	 * @param dia - Dia
	 * @param mes - Mês
	 * @param ano - Ano
	 * @return data
	 * @author Senio Caires
	 */
	public static Date getData(final int dia, final int mes, final int ano) {

		Calendar calendar = new GregorianCalendar();

		calendar.set(ano, mes, dia);

		return calendar.getTime();
	}

	/**
	 * Retorna o número do mês, com dois dígitos.
	 * @param mes - Mês
	 * @return mes
	 * @author Senio Caires
	 */
	public static String getMesComDoisDigitos(final Integer mes) {
		return  ManipulacaoUtil.adicionarChar('0', 2, String.valueOf(ConversaoUtil.nuloParaZero(mes)), true);
	}

	/**
	 * Retorna uma lista de String com as horas do dia. <br/>
	 * Intervalo de 30 minutos.
	 * @return String
	 * @author Senio Caires
	 */
	public static List<String> getHorasList() {

		List<String> resultado = new ArrayList<String>();
		final int ultimaHora = 23;
		final int intervaloMinutos = 30;

		for (Integer hora = 0; hora <= ultimaHora; hora++) {
			for (Integer minuto = 0; minuto <= intervaloMinutos; minuto += intervaloMinutos) {
				resultado.add(ManipulacaoUtil.adicionarZeroEsquerda(hora.toString(), 2) + ":" + ManipulacaoUtil.adicionarZeroEsquerda(minuto.toString(), 2));
			}
		}

		return resultado;
	}

	/**
	 * Método que retorna uma lista de anos, sendo o ano Corrente mais quantidadeRetroativa e Posterior.
	 * @param quantidadeRetroativa - Quantidade retroativa
	 * @param quantidadePosterior - Quantidade posterior
	 * @return lista de anos
	 * @author Senio Caires
	 */
	public static List<String> anoList(final int quantidadeRetroativa, final int quantidadePosterior) {

		List<String> resultado = new ArrayList<String>();
		int anoCorrente = Integer.parseInt(dateParaString(new Date(), "yyyy"));

		for (int indice = quantidadeRetroativa; indice >= 1; indice--) {
			resultado.add(new Integer(anoCorrente - indice).toString());
		}

		resultado.add(String.valueOf(anoCorrente));

		for (int indice = 1; indice <= quantidadePosterior; indice++) {
			resultado.add(new Integer(anoCorrente + indice).toString());
		}

		return resultado;
	}

	/**
	 * Método que retorna uma lista de anos, sendo o ano Inicial (Null para o Ano corrente) mais quantidadeRetroativa e Posterior.
	 * @param anoInicial - Ano inicial
	 * @param quantidadeRetroativa - Quantidade retroativa
	 * @param quantidadePosterior - Quantidade posterior
	 * @return lista de anos
	 * @author Senio Caires
	 */
	public static List<Integer> anoList(final Integer anoInicial, final int quantidadeRetroativa, final int quantidadePosterior) {

		Integer anoInicialTemporario = anoInicial;
		List<Integer> resultado = new ArrayList<Integer>();

		if (anoInicialTemporario == null) {
			anoInicialTemporario = Integer.parseInt(dateParaString(new Date(), "yyyy"));
		}

		for (int i = quantidadeRetroativa; i >= 1; i--) {
			resultado.add(new Integer(anoInicialTemporario - i));
		}

		resultado.add(anoInicialTemporario);

		for (int i = 1; i <= quantidadePosterior; i++) {
			resultado.add(new Integer(anoInicialTemporario + i));
		}

		return resultado;
	}

	/**
	 * Retorna uma lista de mês.
	 * @return lista de mes
	 * @author Senio Caires
	 */
	public static List<String> mesPorExtensoList() {

		List<String> resultado = new ArrayList<String>();
		final int mesInicial = 1;
		final int mesFinal = 12;

		for (int i = mesInicial; i <= mesFinal; i++) {
			resultado.add(getMesPorExtenso(i));
		}

		return resultado;
	}

	/**
	 * Retorna uma lista de dias.
	 * @return lista de dias
	 * @author Senio Caires
	 */
	public static List<String> diaList() {

		List<String> resultado = new ArrayList<String>();
		final int diaInicial = 1;
		final int diaFinal = 31;

		for (Integer i = diaInicial; i <= diaFinal; i++) {
			resultado.add(ManipulacaoUtil.adicionarChar('0', 2, i.toString(), true));
		}

		return resultado;
	}

	/**
	 * Método que retorna o nome do mês, de acordo com o número do mês passado por parâmetro.
	 * @param mes - Mês
	 * @return nome do mes
	 * @author Senio Caires
	 */
	public static String getMesPorExtenso(final Integer mes) {

		String resultado = new String("");
		final int numeroMesJaneiro = 1;
		final int numeroMesFevereiro = 2;
		final int numeroMesMarco = 3;
		final int numeroMesAbril = 4;
		final int numeroMesMaio = 5;
		final int numeroMesJunho = 6;
		final int numeroMesJulho = 7;
		final int numeroMesAgosto = 8;
		final int numeroMesSetembro = 9;
		final int numeroMesOutubro = 10;
		final int numeroMesNovembro = 11;
		final int numeroMesDezembro = 12;

		switch (mes.intValue()) {

			case numeroMesJaneiro: resultado = "Janeiro";
				break;
			case numeroMesFevereiro: resultado = "Fevereiro";
				break;
			case numeroMesMarco: resultado = "Março";
				break;
			case numeroMesAbril: resultado = "Abril";
				break;
			case numeroMesMaio: resultado = "Maio";
				break;
			case numeroMesJunho: resultado = "Junho";
				break;
			case numeroMesJulho: resultado = "Julho";
				break;
			case numeroMesAgosto: resultado = "Agosto";
				break;
			case numeroMesSetembro: resultado = "Setembro";
				break;
			case numeroMesOutubro: resultado = "Outubro";
				break;
			case numeroMesNovembro: resultado = "Novembro";
				break;
			case numeroMesDezembro: resultado = "Dezembro";
				break;
			default: resultado = "Dezembro";
				break;
		}

		return resultado;
	}

	/**
	 * Método que retorna o número do mês, de acordo com a descrição do mês passado por parâmetro.
	 * @param mesDescricao - Descrição do mês
	 * @return numero do mes
	 * @author Senio Caires
	 */
	public static String getNumeroMes(final String mesDescricao) {

		if (mesDescricao.equalsIgnoreCase("Janeiro")) {
			return "01";
		}

		if (mesDescricao.equalsIgnoreCase("Fevereiro")) {
			return "02";
		}

		if (mesDescricao.equalsIgnoreCase("Março")) {
			return "03";
		}

		if (mesDescricao.equalsIgnoreCase("Abril")) {
			return "04";
		}

		if (mesDescricao.equalsIgnoreCase("Maio")) {
			return "05";
		}

		if (mesDescricao.equalsIgnoreCase("Junho")) {
			return "06";
		}

		if (mesDescricao.equalsIgnoreCase("Julho")) {
			return "07";
		}

		if (mesDescricao.equalsIgnoreCase("Agosto")) {
			return "08";
		}

		if (mesDescricao.equalsIgnoreCase("Setembro")) {
			return "09";
		}

		if (mesDescricao.equalsIgnoreCase("Outubro")) {
			return "10";
		}

		if (mesDescricao.equalsIgnoreCase("Novembro")) {
			return "11";
		}

		if (mesDescricao.equalsIgnoreCase("Dezembro")) {
			return "12";
		}

		return "";
	}

	/**
	 * Retorna a quantidade de dias entre as datas passadas como parâmetro.
	 * @param dataInicial - Data inicial
	 * @param dataFinal - Data final
	 * @return quantidade de dias
	 * @author Senio Caires
	 */
	public static Integer diasEntreDatas(final Date dataInicial, final Date dataFinal) {

		Long diferencaDias = new Long(0);
		final int horas = 24;
		final int minutos = 60;
		final int segundos = 60;
		final int milisegundos = 1000;

		if (dataInicial != null && dataFinal != null) {

			long diferencaMilisegundos = dataFinal.getTime() - dataInicial.getTime();

			diferencaDias = diferencaMilisegundos / (horas * minutos * segundos * milisegundos);
		}

		if (diferencaDias < 0) {
			diferencaDias = new Long(0);
		}

		return new Integer(diferencaDias.intValue());
	}

	/**
	 * Retorna a diferença entre as datas passadas como parâmetro.
	 * @param dataInicial - Data inicial
	 * @param dataFinal - Data final
	 * @return diferença
	 * @author Senio Caires
	 */
	public static Long diferencaEntreDatas(final Date dataInicial, final Date dataFinal) {

		Long diferenca = new Long(0);

		if (dataInicial != null && dataFinal != null) {
			diferenca = dataFinal.getTime() - dataInicial.getTime();
		}

		return diferenca;
	}

	/**
	 * Método para retornar a idade, em anos.
	 * @param data - Data
	 * @param dataDeNascimento - Data de nascimento
	 * @param diaOuMes - Dia ou mês
	 * @return idade
	 * @author Senio Caires
	 */
	public static int getIdade(final Date data, final Date dataDeNascimento, final String diaOuMes) {

		int idade = 0;

		if (dataDeNascimento != null) {

			idade = data.getYear() - dataDeNascimento.getYear();

			if (data.getMonth() < dataDeNascimento.getMonth()) {
				idade--;
			}
		}

		return idade;
	}

	/**
	 * Método para retornar a idade, em anos.
	 * @param dataAtual - Data atual
	 * @param dataDeNascimento - data de nascimento
	 * @return idade
	 * @author Senio Caires
	 */
	public static int getIdade(final Date dataAtual, final Date dataDeNascimento) {

		int idade = 0;

		if (dataDeNascimento != null && dataAtual != null) {

			idade = dataAtual.getYear() - dataDeNascimento.getYear();

			if (dataAtual.getMonth() < dataDeNascimento.getMonth()) {
				idade--;
			}
		}

		return idade;
	}

	/**
	 * Retorna a data atual.
	 * @return data atual
	 * @author Senio Caires
	 */
	public static Date getDataAtual() {

		Date resultado;

		resultado = stringParaDate(Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + "/" + (Calendar.getInstance().get(Calendar.MONTH) + 1) + "/" + Calendar.getInstance().get(Calendar.YEAR));

		return resultado;
	}

	/**
	 * Converte uma data dd/MM/yy ou dd/MM/yyyy em yyyy/MM/dd.
	 * @param data - Data
	 * @return data
	 * @author Senio Caires
	 */
	public static String converterDataParaAnoMesDia(final String data) {

		String resultado = "";
		DateFormat dataEntrada = null;
		DateFormat dataSaida = null;
		final int tamanhoData = 8;

		try {

			if (data != null && !data.equals("")) {

				if (data.length() == tamanhoData) {
					dataEntrada = new SimpleDateFormat("dd/MM/yy");
				} else {
					dataEntrada = new SimpleDateFormat("dd/MM/yyyy");
				}

				dataSaida = new SimpleDateFormat("yyyy/MM/dd");

				Date dataValida = dataEntrada.parse(data);

				resultado = dataSaida.format(dataValida);
			}

		} catch (ParseException e) {
			LOGGER.error(e.getMessage());
		}

		return resultado;
	}
}
