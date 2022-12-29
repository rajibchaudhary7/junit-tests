import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student Rajib;

    @Before
    public void setup(){
        Rajib = new Student(1L, "Rajib");
    }

    @Test
    public void testObjCanBeCreated(){
        Student jeffrey = null;
        assertNull(jeffrey);
        assertNotNull(Rajib);
    }

    @Test
    public void testFieldWorks(){
        assertEquals(1, Rajib.getId());
        assertEquals("Rajib", Rajib.getName());
        assertNotNull(Rajib.getGrades());

        Student jeffrey = new Student(2L, "jeffrey");
        assertNotEquals("Rajib", jeffrey.getName());

    }

    @Test
    public void testAddGrade(){
        assertEquals(0, Rajib.getGrades().size());
        Rajib.addGrade(90);
        assertEquals(1, Rajib.getGrades().size());
        Rajib.addGrade(100);
        assertEquals(2, Rajib.getGrades().size());

        assertEquals(90, (int) Rajib.getGrades().get(0));
        assertEquals(100, (int) Rajib.getGrades().get(1));
    }

    @Test
    public void testGetGradeAverage(){
        Rajib.addGrade(80);
        Rajib.addGrade(100);
        assertEquals(90, Rajib.getGradeAverage(), 0);
        Rajib.addGrade(60);
        assertEquals(80, Rajib.getGradeAverage(), 0);
    }
}
