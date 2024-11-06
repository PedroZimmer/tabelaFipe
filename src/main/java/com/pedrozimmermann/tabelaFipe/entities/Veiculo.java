package com.pedrozimmermann.tabelaFipe.entities;

import jakarta.persistence.Entity;

@Entity
public class Veiculo {

	private String marca;
	private String modelo;
	private String ano;
	private String valor;

	public Veiculo() {
	}

	public Veiculo(String marca, String modelo, String ano, String valor) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getAno() {
		return ano;
	}

	public String getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", valor=" + valor + "]";
	}


}
