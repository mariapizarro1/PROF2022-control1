package jar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Vector;

import org.junit.Test;
import org.mockito.Mockito;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void excepcionVectorNulo() {
    	Vector<Asignatura> vectorAsignaturas = new Vector<Asignatura>();
    	Matricula matricula = new Matricula(vectorAsignaturas);
    	assertThrows(Exception.class, () -> matricula.getImporte());
    }
    
   
    @Test
    public void calculoImporteMatricula() {
    
    	Vector<Asignatura> vectorAsignaturas = new Vector<Asignatura>(); 
    	Matricula matricula = new Matricula(vectorAsignaturas);
    	
    	Asignatura asignatura1 = Mockito.mock(Asignatura.class);
    	when(asignatura1.getImporte()).thenReturn(1.0);
        
    	Asignatura asignatura2 = Mockito.mock(Asignatura.class);
    	when(asignatura2.getImporte()).thenReturn(4.6);
    	
     	
    	vectorAsignaturas.add(asignatura1);
    	vectorAsignaturas.add(asignatura2);
        assertEquals(matricula,5.6);
        
    }
    
    @Test
    public void getImporteMatriculaVerify() throws Exception {
    	Vector<Asignatura> vectorAsignaturas = new Vector<Asignatura>(); 
    	Matricula matricula = new Matricula(vectorAsignaturas);
    	
    	Asignatura asignatura1 = Mockito.mock(Asignatura.class);
    	when(asignatura1.getImporte()).thenReturn(1.0);
        
    	Asignatura asignatura2 = Mockito.mock(Asignatura.class);
    	when(asignatura2.getImporte()).thenReturn(4.6);
    	
    	vectorAsignaturas.add(asignatura1);
    	vectorAsignaturas.add(asignatura2);
    	
    	matricula.getImporte();
    	verify(asignatura1).getImporte();
        verify(asignatura2).getImporte();
    }
    
    
   
}
