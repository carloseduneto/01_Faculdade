package Exercicio02;

public class Veiculo {

	String Placa;
	String Modelo;
	String Marca;
	int AnoFabricacao;
	double valor;
	int calculo;
	double calculoValor;
	int AnoAtual;
	double calculoSeguro;
	String mensagem;
	
	int idade(int anoFab, int Hoje) {
		AnoFabricacao = anoFab;
		AnoAtual = Hoje;
		calculo = AnoAtual - AnoFabricacao;
		return calculo;
	}
	
	String valorIPVA(double valorVeiculo, int anoFab) {
		AnoFabricacao = anoFab;
		if (AnoFabricacao > 1970) {
			valor = valorVeiculo;
			calculoValor = valor * 0.04;
			mensagem = "Valor do IPVA R$" + calculoValor;
		}else {
			mensagem = "Não paga IPVA!!!";
		}
		
		return mensagem;	
	}

	double valorSeguro(double valorVeiculo) {
		valor = valorVeiculo;
		calculoSeguro = valor * 0.06;
		return calculoSeguro;
	}
}
