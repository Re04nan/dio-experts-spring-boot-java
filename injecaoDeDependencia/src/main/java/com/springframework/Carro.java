package com.springframework;

public class Carro implements Veiculo {
	
	@Override
	public void acao() {
		System.out.println("É um carro.");
	}

}
