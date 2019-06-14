package models;

import java.util.ArrayList;
import java.util.List;

import interfaces.Observable;
import interfaces.Subject;

public class MartMinas implements Observable {

	private List<Subject> consumidores;

	public MartMinas() {
		this.consumidores = new ArrayList<>();
	}

	@Override
	public void subscribe(Subject subject) {
		if (!this.consumidores.contains(subject)) {
			this.consumidores.add(subject);
		}
	}

	public void descarregarCerveja() {
		this.notificate();
	}

	@Override
	public void unSubscribe(Subject subject) {
		if (this.consumidores.contains(subject)) {
			this.consumidores.remove(subject);
		}
	}

	@Override
	public void notificate() {
		if (!this.consumidores.isEmpty()) {
			this.consumidores.forEach(consumidor -> {
				consumidor.notificate("A Cerveja Chegou !!!");
			});
		} else {
			System.out.println("O MartMinas não possui nenhum consumidor para notificar");
		}
	}

}
