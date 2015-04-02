package com.hilcg;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Leo.Liu on 2015/4/1.
 */
public class MathTest{

/*
    @Before
    public void setUp() {

        System.out.println("setUp");
    }
*/
    @Test
    public void testAdd(){

        Math math = new Math();
        assertEquals( "testAdd",4, math.add(2 ,2));
    }

    @Ignore
    public void testAdd2(){

        Math math = new Math();
        assertEquals( "testAdd",4, math.add(2 ,2));
    }

    @Test
    public void testDivison(){

        Math math = new Math();
        assertEquals( "testDivison",1, math.divison(2 ,2));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivision2() {

        Math math = new Math();
        assertEquals( 0, math.divison(2, 1));
    }

    @Test( timeout = 100)
    public void testDivison3(){

        Math math = new Math();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("testDivison", 1, math.divison(2, 2));
    }
/*
    @After
    public void tearDown() {

        System.out.println("tearDown");
    }
*/

    @BeforeClass
    public static void setBeforeClass() {

        System.out.println("setBeforeClass");
    }

    @AfterClass
    public static void setAfterClass() {

        System.out.println("setAfterClass");
    }
}
