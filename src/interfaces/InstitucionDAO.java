package interfaces;

import java.util.List;

import beans.InstitucionDTO;

public interface InstitucionDAO
{
	public List<InstitucionDTO> listarInstituciones();
	public InstitucionDTO buscarInstitucion(int cod);
	public int registrarInstitucion(InstitucionDTO obj);
	public int actualizarInstitucion(InstitucionDTO obj);
	public int eliminarInstitucion(int cod);
}
