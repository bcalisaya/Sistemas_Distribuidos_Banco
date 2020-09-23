import java.util.Random;

public class Banco2 extends Thread {
	Random rd = new Random();
	public void atencion() {
		
	}
	
	public synchronized void run() {
		while(Arreglo.contador<Arreglo.ArregloPersonas.length)
		{
		System.out.println("Cajero2  iteracion"+Arreglo.contador);
		
		int num = Arreglo.contador;
		if(Arreglo.ArregloPersonas[num].getPrioridad() == 0 && Arreglo.ArregloPersonas[num].isStatus() ==false) {
			try {
				Arreglo.ArregloPersonas[num].setStatus(true);
				sleep(rd.nextInt(195)*5);
				Arreglo.contador++;
				System.out.println(Arreglo.ArregloPersonas[num].getPrioridad()+"-"+Arreglo.ArregloPersonas[num].isStatus()+"-"+Arreglo.contador);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			Arreglo.contador++;
			System.out.println("Cajero1 Cliente con "+Arreglo.ArregloPersonas[num].getPrioridad()+"--cont-"+Arreglo.contador);
			}
		}
	}
		
		
		
		/*for(int i=0;i<2000;i++) {
			System.out.print(Arreglo.ArregloPersonas[i]);
		}	*/	
}
