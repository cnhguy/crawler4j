import org.junit.Test;

import edu.uci.ics.crawler4j.url.WebURL;

public class RandoopMinimizedErrorTest {
    @Test
    public void test1() throws Throwable {
        WebURL webURL0 = new WebURL();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on webURL0 and webURL0",
            webURL0.equals(webURL0) ? webURL0.hashCode() == webURL0.hashCode() : true);
    }
}