package clase7;

import java.time.LocalDateTime;

public class Persona {
	private String nombre;
	private String apellido;
	private LocalDateTime fechaNacimiento;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellido, LocalDateTime fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int edad() {
		int edad = Integer.parseInt(LocalDateTime.now().toString()) - Integer.parseInt((this.fechaNacimiento).toString());
		return edad;
	}
		
}