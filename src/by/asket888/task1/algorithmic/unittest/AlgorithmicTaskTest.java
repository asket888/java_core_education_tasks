package by.asket888.java.task1.algorithmic.unittest;

import by.asket888.java.task1.algorithmic.AlgorithmicTask;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class AlgorithmicTaskTest {

    // Test array with all different by length elements
    @Test
    public void testArrayWithDifferentByLengthElements() {
        String[] array = {"USA", "Belarus", "Poland", "Monaco", "Netherlands", "Spain"};

        System.out.println("");
        System.out.println(Arrays.toString(array));
        assertEquals("The second element by length: \"Belarus\"",
                AlgorithmicTask.findSecondByLengthElement(array));
        System.out.println("");
    }

    // Test array with all elements same by length
    @Test (dependsOnMethods = "testArrayWithDifferentByLengthElements")
    public void testArrayWithAllSameByLengthElements() {
        String[] array = {"Petr", "Ivan", "Mark", "Stan", "Bill", "Alex"};

        System.out.println(Arrays.toString(array));
        assertEquals("Task can not be solved because all elements of the array have identical length",
                AlgorithmicTask.findSecondByLengthElement(array));
        System.out.println("");
    }

    // Test array with one element
    @Test (dependsOnMethods = "testArrayWithAllSameByLengthElements")
    public void testArrayWithOneElement() {
        String[] array = {"Alone_element"};

        System.out.println(Arrays.toString(array));
        assertEquals("Task can not be solved because array consists of one element",
                AlgorithmicTask.findSecondByLengthElement(array));
        System.out.println("");
    }

    // Test null array
    @Test (dependsOnMethods = "testArrayWithOneElement")
    public void testNullArray() {
        String[] array = {};

        System.out.println(Arrays.toString(array));
        assertEquals("Task can not be solved because there are no any elements in the array",
                AlgorithmicTask.findSecondByLengthElement(array));
        System.out.println("");
    }
}
