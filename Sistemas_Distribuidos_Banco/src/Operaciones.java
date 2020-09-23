
public class Operaciones {
	
	public void Cajeros(){
		System.out.println("Clase Cajerito ga");
		Banco1 Jhon= new Banco1(1);
		Banco1 Rambo= new Banco1(1);
		Banco1 Popeye= new Banco1(1);
		/*Banco1 hilo_11= new Banco1();
		Banco2 hilo2= new Banco2();
		Banco3 hilo3= new Banco3();*/
				Jhon.start();			
				Rambo.start();
				Popeye.start();
				try {
					Jhon.join();
					Rambo.join();
					Popeye.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		Banco1 mario= new Banco1(2);
		Banco1 bros= new Banco1(2);
		Banco1 gonsales= new Banco1(2);
		/*Banco1 hilo_11= new Banco1();
		Banco2 hilo2= new Banco2();
		Banco3 hilo3= new Banco3();*/
		mario.start();			
		bros.start();
		gonsales.start();
		try {
			mario.join();
			bros.join();
			gonsales.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Banco1 terry= new Banco1(3);
		Banco1 crew= new Banco1(3);
		Banco1 gaaaa= new Banco1(3);
		/*Banco1 hilo_11= new Banco1();
		Banco2 hilo2= new Banco2();
		Banco3 hilo3= new Banco3();*/
		terry.start();			
		crew.start();
		gaaaa.start();
		try {
			terry.join();
			crew.join();
			gaaaa.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
