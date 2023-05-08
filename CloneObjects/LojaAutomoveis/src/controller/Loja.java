package controller;

import model.Automovel;

public class Loja {
	public static void main(String[] args) throws CloneNotSupportedException {
		Automovel a = new Automovel();
		a.setMarca("Chevrolet");
		a.setModelo("Subaru");
		a.setTipo("Passeio");
		System.out.println("Marca: " + a.getMarca() + " Modelo: " + a.getModelo() + " Tipo: " + a.getTipo());
	
		Automovel b = a.clone();
		
		b.setModelo("Montana");
		System.out.println("Marca: " + a.getMarca() + " Modelo: " + a.getModelo() + " Tipo: " + a.getTipo());
	}
}
