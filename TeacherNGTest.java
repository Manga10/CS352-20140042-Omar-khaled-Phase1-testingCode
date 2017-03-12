/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educationalelectronicgaming;

import java.util.Arrays;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author Manga
 */
public class TeacherNGTest {

    @Test
    public void removeGame() {
        DataBaseManager db = new DataBaseManager();
        Teacher tea = new Teacher();
        tea.RemoveGame("todelete.txt");
        String[] g = db.RetriveGameList();
        //System.err.println("dd"+g.length);
        //for (int t = 0; t < g.length; t++) {
        //System.out.println(g[t]);
        //}
        Assert.assertFalse(Arrays.asList(g).contains("KhaledGame.txt"));

    }

}
