package ec.edu.espe.calculator.controller;

import ec.edu.espe.calculator.model.Operation;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class BasicOperationTest {

    public BasicOperationTest() {
    }

    ArrayList<Operation> operations = new ArrayList<>();

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAdd() {
        operations = FileManager.readJson(operations, "addTestCases.json");

        for (int i = 0; i < operations.size(); i++) {
            double addend1 = operations.get(i).getValue1();
            double addent2 = operations.get(i).getValue2();;
            double expResult = operations.get(i).getExpectedValue();;
            double result = BasicOperation.add(addend1, addent2);
            assertEquals(expResult, result, 0);
        }
    }

    /**
     * Test of add method, of class BasicOperation.
     */
    @Test
    public void testAddNegatives() {
        System.out.println("add");
        double addend1 = -56.88;
        double addent2 = -235.00;
        double expResult = -291.88;
        double result = BasicOperation.add(addend1, addent2);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of substract method, of class BasicOperation.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        double minuend = 2.0;
        double subtrahend = 3.0;
        double expResult = -1.0;
        double result = BasicOperation.substract(minuend, subtrahend);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of multiply method, of class BasicOperation.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double multiplicand = 0.0;
        double muliplier = 0.0;
        double expResult = 0.0;
        double result = BasicOperation.multiply(multiplicand, muliplier);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of divide method, of class BasicOperation.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double dividend = 0.0;
        double divisor = 1.0;
        double expResult = 0.0;
        double result = BasicOperation.divide(dividend, divisor);
        assertEquals(expResult, result, 0);

    }

}
