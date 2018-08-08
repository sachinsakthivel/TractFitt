package seng202.groupNine;


import org.junit.runner.RunWith;
import org.junit.*;
import static org.junit.Assert.*;


public class GKTest {
//    @Deployment
//    public static JavaArchive createDeployment() {
//        return ShrinkWrap.create(JavaArchive.class)
//                .addClass(App.class)
//                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
//    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void runMe() {
        int c = 3;
        c = true == false ? 0 : -1;
        assert(c == -1);
    }
}
