package models;

import interfaces.Observable;
import interfaces.Subject;

public class MerceariaDoJoao implements Subject {
	
	private static final String NOME = "Mercearia do João";

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
