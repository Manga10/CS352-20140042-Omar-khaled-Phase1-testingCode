/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educationalelectronicgaming;

import java.io.IOException;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
/**
 *
 * @author Manga
 */
public class DataBaseManagerNGTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of AddTeacher method, of class DataBaseManager.
     */
    @DataProvider(name = "gamenames")
    public Object[][] dataa() {
        return new Object[][]{{true, "Khaledgame"}, {true, "Studentgame"}};
    }

    public DataBaseManagerNGTest() {
    }

    @Test(enabled = false)
    public void testAddTeacher() throws Exception {
        System.out.println("AddTeacher");
        Teacher t = null;
        DataBaseManager instance = new DataBaseManager();
        instance.AddTeacher(t);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of AddStudent method, of class DataBaseManager.
     */
    @Test(enabled = false)
    public void testAddStudent() throws Exception {
        System.out.println("AddStudent");
        Student s = null;
        DataBaseManager instance = new DataBaseManager();
        instance.AddStudent(s);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of AddGame method, of class DataBaseManager.
     */
    @Test(enabled = false)
    public void testAddGame() throws Exception {
        System.out.println("AddGame");
        Game g = null;
        DataBaseManager instance = new DataBaseManager();
        instance.AddGame(g);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of CheckGame method, of class DataBaseManager.
     */
    @Test(enabled = false)
    public void testCheckGame() throws Exception {
        DataBaseManager instance = new DataBaseManager();
        Game g = new Game();
        g.Name = "masryGame";

        instance.AddGame(g);
        Assert.assertEquals(true, instance.CheckGame(g.Name));
        /*System.out.println("CheckGame");
        String s = "";
        boolean expResult = false;
        boolean result = instance.CheckGame(s);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.*/

    }

    @Test(dataProvider = "gamenames")
    public void checkgame(boolean check, String Gamename) throws IOException {
        DataBaseManager instance = new DataBaseManager();

        Assert.assertEquals(check, instance.CheckGame(Gamename));
    }

    /**
     * Test of CheckStudent method, of class DataBaseManager.
     */
    @Test(enabled = false)
    public void testCheckStudent() throws Exception {
        System.out.println("CheckStudent");
        String s = "";
        String p = "";
        DataBaseManager instance = new DataBaseManager();
        String expResult = "";
        String result = instance.CheckStudent(s, p);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of CheckTeacher method, of class DataBaseManager.
     */
    @Test(enabled = false)
    public void testCheckTeacher() throws Exception {
        System.out.println("CheckTeacher");
        String t = "";
        String p = "";
        DataBaseManager instance = new DataBaseManager();
        String expResult = "";
        String result = instance.CheckTeacher(t, p);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of RetriveGame method, of class DataBaseManager.
     */
    @Test(enabled = false)
    public void testRetriveGame() throws Exception {
        System.out.println("RetriveGame");
        Game g = null;
        DataBaseManager instance = new DataBaseManager();
        Game expResult = null;
        Game result = instance.RetriveGame(g);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of RetriveTeacher method, of class DataBaseManager.
     */
    @Test(enabled = false)
    public void testRetriveTeacher() throws Exception {
        System.out.println("RetriveTeacher");
        Teacher t = null;
        DataBaseManager instance = new DataBaseManager();
        boolean expResult = false;
        boolean result = instance.RetriveTeacher(t);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of RetriveStudent method, of class DataBaseManager.
     */
    @Test(enabled = false)
    public void testRetriveStudent() throws Exception {
        System.out.println("RetriveStudent");
        Student s = null;
        DataBaseManager instance = new DataBaseManager();
        boolean expResult = false;
        boolean result = instance.RetriveStudent(s);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of EditGame method, of class DataBaseManager.
     */
    @Test(enabled = false)
    public void testEditGame() throws Exception {
        System.out.println("EditGame");
        Game g = null;
        DataBaseManager instance = new DataBaseManager();
        instance.EditGame(g);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of RetriveGameList method, of class DataBaseManager.
     */
    @Test(enabled = false)
    public void testRetriveGameList() {
        System.out.println("RetriveGameList");
        DataBaseManager instance = new DataBaseManager();
        String[] expResult = null;
        String[] result = instance.RetriveGameList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

}
