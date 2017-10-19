package interfaces;

import java.util.List;

import beans.AlumnoDTO;
import beans.ReporteAlumnoDTO;
import beans.VoluntariadoDTO;

public interface AlumnoDAO {
	
	public List<AlumnoDTO> listarAlumnos();
	public int insertarAlumno(AlumnoDTO alumno);
	public int actualizarAlumno(AlumnoDTO alumno);
	public int eliminarAlumno(String codigo);
	public AlumnoDTO buscarCodigoAlumno(String cod);
	
}
