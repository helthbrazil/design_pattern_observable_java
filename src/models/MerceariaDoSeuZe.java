package models;

import interfaces.Observable;
import interfaces.Subject;

public class MerceariaDoSeuZe implements Subject {

	private static final String NOME = "Mercearia do Zé";

	@Override
	public void subscribe(Observable o) {
		if (o != null) {
			o.subscribe(this);
		}
	}

	@Override
	public void unSubscribe(Observable o) {
		if (o != null) {
			o.unSubscribe(this);
		}
	}

	@Override
	public void notificate(String msg) {
		System.out.println(this.NOME + " " + msg);
	}

}
