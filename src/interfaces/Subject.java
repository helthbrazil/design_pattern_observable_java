package interfaces;

public interface Subject {
	public void subscribe(Observable o);

	public void unSubscribe(Observable o);

	public void notificate(String mensagem);
}
