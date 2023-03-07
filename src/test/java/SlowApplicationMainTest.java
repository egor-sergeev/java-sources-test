import org.junit.Test;
import slow_app.SlowApplication;

import static org.junit.Assert.assertEquals;

public class SlowApplicationMainTest {

    @Test
    public void mainMethodTest() {
        preprocessingTest();
        relatedJobsTest();
    }

    @Test
    public void preprocessingTest() {
        int data = 40000;
        int expectedResult = 0;
        int result = SlowApplication.brandNewPostprocessing(data);
        assertEquals(expectedResult, result);
    }

    @Test
    public void relatedJobsTest() {
        int expectedResult = 0;
        int result = SlowApplication.doRelatedJobs();
        assertEquals(expectedResult, result);
    }
}