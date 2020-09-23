import java.util.Random;

public class Main {
	public static void main (String args[]) {
		Random rd = new Random();
		Persona[] persona=new Persona[50];
		int num;
		boolean afir;
		for(int i=0;i<persona.length;i++) {
			num=rd.nextInt(3);
			System.out.println(num);
			afir=rd.nextBoolean();
			persona[i] = new Persona(num,false);
		}
		Arreglo.ArregloPersonas=persona;
		Operaciones OP = new Operaciones();
		OP.Cajeros();
		
		
		/*for(int i=0;i<2000;i++) {
			System.out.print(persona[i].getPrioridad());
			System.out.print("--");
			System.out.println(persona[i].isStatus());
					
		}*/
		
	}
}
