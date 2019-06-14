package interfaces;

public interface Observable {

	public void subscribe(Subject subject);

	public void unSubscribe(Subject subject);

	public void notificate();

}
