package beans;

/* `cod_usu` varchar(11) NOT NULL,
  `nom_usu` varchar(50) NOT NULL,
  `ape_usu` varchar(50) NOT NULL,
  `fono_usu` varchar(20) DEFAULT NULL, -- si se piensa dar formato(otras ciudades¿?) deberia ser varchar¿?
  `correo` varchar(50) DEFAULT NULL,
  `login_usu` varchar(15) NOT NULL,
  `pass_usu` varchar(20) NOT NULL,
 `cod_estado` int(5) NOT NULL references tb_estado,*/

public class UsuarioDTO 
{
	private String codigo;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private String login;
	private String password;
	private int estado;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "UsuarioDTO [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", correo=" + correo + ", login=" + login + ", password=" + password + ", estado=" + estado
				+ "]";
	}
	
	
}
