import java.util.Random;

public class Banco1 extends Thread {
	
	public Banco1(int importancia) {
		super();
		this.importancia = importancia;
	}

	int importancia;
	Random rd = new Random();
	public void atencion() {
		
	}
	
	public synchronized void run() {
		int num = Arreglo.contador;
		while(Arreglo.contador<Arreglo.ArregloPersonas.length-2)
		{
		System.out.println("Cajero1 iteracion "+Arreglo.contador);
		num = Arreglo.contador;
		if(Arreglo.ArregloPersonas[num].getPrioridad() == this.importancia && Arreglo.ArregloPersonas[num].isStatus() ==false) {
			//try {
				
				Arreglo.ArregloPersonas[Arreglo.contador].setStatus(true);
				//sleep(rd.nextInt(195)*5);
				//Arreglo.contador++;
				System.out.println(Arreglo.ArregloPersonas[Arreglo.contador].getPrioridad()+"-"+Arreglo.ArregloPersonas[Arreglo.contador].isStatus()+"-"+Arreglo.contador);
			//} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}
			Arreglo.contador++;
		}else {
			
			
			System.out.println("Cajero1 Cliente con "+Arreglo.ArregloPersonas[num].getPrioridad()+"--cont-"+Arreglo.contador);
			Arreglo.contador++;
			}
		}
		}
		
		
		
		/*for(int i=0;i<2000;i++) {
			System.out.print(Arreglo.ArregloPersonas[i]);
		}	*/	
}
