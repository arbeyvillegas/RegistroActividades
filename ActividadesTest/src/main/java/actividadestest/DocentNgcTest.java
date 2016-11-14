package actividadestest;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import com.ctrlz.util.excepcion.ExcepcionDao;
import com.ctrlz.util.excepcion.ExcepcionNgc;
import com.udea.dominio.dto.TbDocente;
import com.udea.servicios.dao.DocenteDaoInt;
import com.udea.servicios.ngc.DocenteNgc;

import junit.framework.TestCase;

public class DocentNgcTest extends TestCase {

	public void testConsultarDocentesResultadoVacio() throws ExcepcionDao, ExcepcionNgc {
		DocenteNgc docente = new DocenteNgc();

		DocenteDaoInt docenteDao = mock(DocenteDaoInt.class);

		when(docenteDao.consultarDocentes()).thenReturn(new ArrayList<TbDocente>());
		docente.setDocenteDao(docenteDao);
		List<TbDocente> docentesResult = docente.consultarDocentes();
		List<TbDocente> docentesExpected = new ArrayList<TbDocente>();

		assertEquals(docentesExpected, docentesResult);
	}

	public void testConsultarDocentesConUnElemento() throws ExcepcionDao, ExcepcionNgc {
		TbDocente docente=new TbDocente();
		docente.setNbId(1);
		
		List<TbDocente> docentes=new ArrayList<TbDocente>();
		docentes.add(docente);
		
		
		DocenteNgc docenteNgc = new DocenteNgc();

		DocenteDaoInt docenteDao = mock(DocenteDaoInt.class);

		when(docenteDao.consultarDocentes()).thenReturn(docentes);
		docenteNgc.setDocenteDao(docenteDao);
		List<TbDocente> docentesResult = docenteNgc.consultarDocentes();

		assertEquals(1, docentesResult.size());
	}
}
