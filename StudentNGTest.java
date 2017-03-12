/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educationalelectronicgaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class StudentNGTest {

    @Test
    public void testViewAchievment() throws Exception {
        Student s = new Student(); 
        ArrayList<Achievement> achi2 = new ArrayList<>();
        achi2.add(new Achievement("khaled1", 50));
        achi2.add(new Achievement("khaled2", 70));
        Assert.assertEquals(achi2, s.ViewAchievment("khaled", "01012"));
    }

    public StudentNGTest() {
    }
}
