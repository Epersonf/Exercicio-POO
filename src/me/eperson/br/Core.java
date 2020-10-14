package me.eperson.br;

import java.io.IOException;
import java.util.Map;
import me.eperson.br.classes.ManejadorDePedidos;

public class Core {
	
	public static void main(String[] args) throws IOException {
		ManejadorDePedidos mng = new ManejadorDePedidos();
		mng.carregaPedidos();
		for (Map.Entry<String, Float> entry : mng.getPercent().entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
