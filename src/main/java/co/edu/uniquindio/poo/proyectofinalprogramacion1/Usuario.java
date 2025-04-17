package co.edu.uniquindio.poo.proyectofinalprogramacion1;

public abstract class Usuario {
	protected String nombre;
	protected String id;
	protected String correo;
	protected String telefono;
	protected int edad;
	
	public Usuario(String nombre,String id, String correo, String telefono, int edad) {
		
		this.nombre=nombre;
		this.id=id;
		this.correo=correo;
		this.telefono=telefono;
		this.edad=edad;
		
		
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setId(String id) {
		this.id=id;
	}
	public void setCorreo(String correo) {
		this.correo=correo;
	}
	public void setTelefono(String telefono) {
		this.telefono=telefono;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public String getNombre() {
		return nombre;
	}
	public String getId() {
		return id;
	}
	public String getCorreo() {
		return correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public int getEdad() {
		return edad;
	}
	public abstract void registrarDatosPersonales();
	public abstract void actualizarDatosPersonales();
	
}
