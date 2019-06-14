package principal;

import models.MartMinas;
import models.MerceariaDoJoao;
import models.MerceariaDoSeuZe;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		// ATACADISTA
		MartMinas atacadista = new MartMinas();

		// CONSUMIDORES
		MerceariaDoSeuZe consumidor1 = new MerceariaDoSeuZe();
		MerceariaDoJoao consumidor2 = new MerceariaDoJoao();

		// INSCREVER CONSUMIDORES PARA SEREM NOTIFICADOS
		consumidor1.subscribe(atacadista);
		consumidor2.subscribe(atacadista);

		// ESPERAR 2 SEGUNDOS
		Thread.sleep(1000);

		// NOTIFICAR CONSUMIDORES
		atacadista.descarregarCerveja();

		System.out.println();

		// O ZÉ NÃO QUER MAIS RECEBER MENSAGENS

		// ESPERAR 3 SEGUNDOS
		Thread.sleep(3000);

		consumidor1.unSubscribe(atacadista);

		// NOTIFICAR CONSUMIDORES, APENAS JOÃO
		atacadista.descarregarCerveja();

		System.out.println();

		consumidor2.unSubscribe(atacadista);

		// ESPERAR 3 SEGUNDOS
		Thread.sleep(3000);

		// NOTIFICAR CONSUMIDORES, NENHUM SERÁ ENCONTRADO
		atacadista.descarregarCerveja();

	}
}
