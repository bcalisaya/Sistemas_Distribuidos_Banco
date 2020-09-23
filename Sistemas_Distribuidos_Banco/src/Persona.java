
public class Persona {
	int Prioridad;
	boolean Status;
	public Persona(int prioridad, boolean status) {
		super();
		Prioridad = prioridad;
		Status = status;
	}
	public Persona() {
	}
	public int getPrioridad() {
		return Prioridad;
	}
	public void setPrioridad(int prioridad) {
		Prioridad = prioridad;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	
}
