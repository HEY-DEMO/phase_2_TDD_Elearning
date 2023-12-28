package tdd_elearning.tdd_elearning;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class course_test {

    @Test
    public void testCreateCourse() {
        course course = new course("Java Programming");
        assertNotNull(course);
        assertEquals(course.getTitle(), "Java Programming");
        assertTrue(course.getModules().isEmpty());
    }

    @Test
    public void testAddModuleToCourse() {
        course course = new course("Software Engineering");
        module module = new module("Introduction to Software Engineering");
        course.addModule(module);
        assertFalse(course.getModules().isEmpty());
        assertTrue(course.getModules().contains(module));
    }
}