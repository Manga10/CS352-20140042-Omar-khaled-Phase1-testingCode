/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educationalelectronicgaming;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Manga
 */
public class RegisterationControllerNGTest {
    
    public RegisterationControllerNGTest() {
    }

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
     * Test of SaveStudentAccount method, of class RegisterationController.
     * @throws java.lang.Exception
     */
    @Test
    public void testSaveStudentAccount() throws Exception {
        
        RegisterationController R = new RegisterationController();
        DataBaseManager D = new DataBaseManager();
        Student s=new Student();
        s.Name="Ahmed";
        s.Password = "5555";
        D.AddStudent(s);
        R.SaveStudentAccount(s);
        Assert.assertEquals(true, D.RetriveStudent(s));
        
        
        /*
        System.out.println("SaveStudentAccount");
        Student s = null;
        RegisterationController instance = new RegisterationController();
        instance.SaveStudentAccount(s);
        // TODO review the generated test code and remove the default call to fail.*/
    }

    /**
     * Test of SaveTeacherAccount method, of class RegisterationController.
     */
    @Test (enabled = false)
    public void testSaveTeacherAccount() throws Exception {
        System.out.println("SaveTeacherAccount");
        Teacher t = null;
        RegisterationController instance = new RegisterationController();
        instance.SaveTeacherAccount(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
