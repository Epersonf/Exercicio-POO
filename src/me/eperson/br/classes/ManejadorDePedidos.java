package me.eperson.br.classes;

import java.io.IOException;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import me.eperson.br.file.Utility;

public class ManejadorDePedidos {
	Pedido[] listaDePedidos;
	
	public Pedido[] getListaDePedidos() {
		return listaDePedidos;
	}
	
	public void carregaPedidos() throws IOException {
		Utility.getFile("pedidos.txt", (in) -> {
			
			int amtDePedidos = in.nextInt();
			listaDePedidos = new Pedido[amtDePedidos];
			
			for (int p = 0; p < amtDePedidos; p++) {
				int amt = in.nextInt();
				listaDePedidos[p] = new Pedido();
				for (int i = 0; i < amt; i++) {
					float price = in.nextFloat();
					int qtd = in.nextInt();
					String nome = in.nextLine();
					Item newItem = new Item(nome, price, qtd);
					listaDePedidos[p].addItem(newItem);
				}
			}
		});
	}
	
	public Map<String, Float> getPercent() {
		Map<String, Float> map = new HashMap<String, Float>();
		int amt = 0;
		for (Pedido p : listaDePedidos) {
			for (Item i : p.getItems()) {
				String key = i.getPrato().getNome();
				if (!map.containsKey(key)) {
					map.put(key, 1f);
				} else {
					map.put(key, map.get(key) + 1f);
				}
				amt++;
			}
		}
		for (Map.Entry<String, Float> entry : map.entrySet()) {
			entry.setValue((entry.getValue() / amt) * 100);
		}
		return map;
	}
}
