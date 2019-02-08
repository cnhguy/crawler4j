import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.sleepycat.je.DatabaseEntry databaseEntry0 = null;
        try {
            com.sleepycat.bind.tuple.TupleInput tupleInput1 = com.sleepycat.bind.tuple.TupleBase.entryToInput(databaseEntry0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = java.lang.Thread.MIN_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.sleepycat.bind.tuple.TupleInput tupleInput0 = null;
        com.sleepycat.je.DatabaseEntry databaseEntry1 = null;
        try {
            com.sleepycat.bind.tuple.TupleBase.inputToEntry(tupleInput0, databaseEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.sleepycat.bind.tuple.TupleOutput tupleOutput0 = null;
        com.sleepycat.je.DatabaseEntry databaseEntry1 = null;
        try {
            com.sleepycat.bind.tuple.TupleBase.outputToEntry(tupleOutput0, databaseEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        edu.uci.ics.crawler4j.crawler.CrawlConfig crawlConfig0 = null;
        try {
            edu.uci.ics.crawler4j.fetcher.PageFetcher pageFetcher1 = new edu.uci.ics.crawler4j.fetcher.PageFetcher(crawlConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        boolean boolean1 = edu.uci.ics.crawler4j.util.Util.hasPlainTextContent("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.String str0 = org.apache.http.conn.ssl.SSLConnectionSocketFactory.TLS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TLS" + "'", str0.equals("TLS"));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int0 = edu.uci.ics.crawler4j.robotstxt.HostDirectives.DISALLOWED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        try {
            edu.uci.ics.crawler4j.crawler.authentication.FormAuthInfo formAuthInfo5 = new edu.uci.ics.crawler4j.crawler.authentication.FormAuthInfo("", "", "TLS", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: TLS");
        } catch (java.net.MalformedURLException e) {
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.sleepycat.je.Environment environment0 = null;
        edu.uci.ics.crawler4j.crawler.CrawlConfig crawlConfig1 = null;
        try {
            edu.uci.ics.crawler4j.frontier.DocIDServer docIDServer2 = new edu.uci.ics.crawler4j.frontier.DocIDServer(environment0, crawlConfig1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        int int0 = edu.uci.ics.crawler4j.robotstxt.HostDirectives.ALLOWED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        edu.uci.ics.crawler4j.url.TLDList.setUseOnline(false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        byte[] byteArray1 = edu.uci.ics.crawler4j.util.Util.long2ByteArray((long) 2);
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        try {
            edu.uci.ics.crawler4j.crawler.authentication.NtAuthInfo ntAuthInfo4 = new edu.uci.ics.crawler4j.crawler.authentication.NtAuthInfo("TLS", "TLS", "TLS", "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: TLS");
        } catch (java.net.MalformedURLException e) {
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        edu.uci.ics.crawler4j.robotstxt.RobotstxtParser robotstxtParser0 = new edu.uci.ics.crawler4j.robotstxt.RobotstxtParser();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.sleepycat.je.Environment environment0 = null;
        edu.uci.ics.crawler4j.crawler.CrawlConfig crawlConfig1 = null;
        try {
            edu.uci.ics.crawler4j.frontier.Frontier frontier2 = new edu.uci.ics.crawler4j.frontier.Frontier(environment0, crawlConfig1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.String str1 = edu.uci.ics.crawler4j.url.URLCanonicalizer.getCanonicalURL("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        int int7 = edu.uci.ics.crawler4j.util.Util.byteArray2Int(byteArray6);
        try {
            long long8 = edu.uci.ics.crawler4j.util.Util.byteArray2Long(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65546 + "'", int7 == 65546);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.String str0 = edu.uci.ics.crawler4j.frontier.Counters.ReservedCounterNames.PROCESSED_PAGES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Processed-Pages" + "'", str0.equals("Processed-Pages"));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        boolean boolean1 = edu.uci.ics.crawler4j.util.Util.hasBinaryContent("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        edu.uci.ics.crawler4j.url.URLCanonicalizer uRLCanonicalizer0 = new edu.uci.ics.crawler4j.url.URLCanonicalizer();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        edu.uci.ics.crawler4j.crawler.exceptions.ParseException parseException0 = new edu.uci.ics.crawler4j.crawler.exceptions.ParseException();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.io.File file0 = null;
        try {
            boolean boolean1 = edu.uci.ics.crawler4j.util.IO.deleteFolderContents(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.sleepycat.bind.tuple.TupleOutput tupleOutput0 = com.sleepycat.bind.tuple.TupleBase.newOutput();
        org.junit.Assert.assertNotNull(tupleOutput0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.String str0 = edu.uci.ics.crawler4j.fetcher.SniSSLConnectionSocketFactory.ENABLE_SNI;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "__enable_sni__" + "'", str0.equals("__enable_sni__"));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        edu.uci.ics.crawler4j.crawler.WebCrawler webCrawler0 = new edu.uci.ics.crawler4j.crawler.WebCrawler();
        edu.uci.ics.crawler4j.crawler.CrawlController crawlController1 = webCrawler0.getMyController();
        org.junit.Assert.assertNull(crawlController1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) 0 };
        try {
            long long6 = edu.uci.ics.crawler4j.util.Util.byteArray2Long(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        edu.uci.ics.crawler4j.crawler.WebCrawler webCrawler0 = new edu.uci.ics.crawler4j.crawler.WebCrawler();
        webCrawler0.onBeforeExit();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig robotstxtConfig0 = null;
        edu.uci.ics.crawler4j.fetcher.PageFetcher pageFetcher1 = null;
        edu.uci.ics.crawler4j.robotstxt.RobotstxtServer robotstxtServer2 = new edu.uci.ics.crawler4j.robotstxt.RobotstxtServer(robotstxtConfig0, pageFetcher1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.String str1 = edu.uci.ics.crawler4j.url.URLCanonicalizer.getCanonicalURL("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        int int0 = java.lang.Thread.NORM_PRIORITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.sleepycat.je.Environment environment0 = null;
        try {
            edu.uci.ics.crawler4j.frontier.InProcessPagesDB inProcessPagesDB1 = new edu.uci.ics.crawler4j.frontier.InProcessPagesDB(environment0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        edu.uci.ics.crawler4j.frontier.Counters.ReservedCounterNames reservedCounterNames0 = new edu.uci.ics.crawler4j.frontier.Counters.ReservedCounterNames();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.http.conn.ssl.SSLConnectionSocketFactory sSLConnectionSocketFactory0 = org.apache.http.conn.ssl.SSLConnectionSocketFactory.getSystemSocketFactory();
        org.junit.Assert.assertNotNull(sSLConnectionSocketFactory0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.io.File file0 = null;
        try {
            boolean boolean1 = edu.uci.ics.crawler4j.util.IO.deleteFolder(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        edu.uci.ics.crawler4j.parser.TextParseData textParseData0 = new edu.uci.ics.crawler4j.parser.TextParseData();
        java.util.Set<edu.uci.ics.crawler4j.url.WebURL> webURLSet1 = textParseData0.getOutgoingUrls();
        org.junit.Assert.assertNotNull(webURLSet1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        javax.net.ssl.HostnameVerifier hostnameVerifier0 = org.apache.http.conn.ssl.SSLConnectionSocketFactory.getDefaultHostnameVerifier();
        org.junit.Assert.assertNotNull(hostnameVerifier0);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        edu.uci.ics.crawler4j.parser.HtmlParseData htmlParseData0 = new edu.uci.ics.crawler4j.parser.HtmlParseData();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        htmlParseData0.setMetaTags(strMap1);
        java.util.Set<edu.uci.ics.crawler4j.url.WebURL> webURLSet3 = htmlParseData0.getOutgoingUrls();
        org.junit.Assert.assertNull(webURLSet3);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig robotstxtConfig1 = null;
        try {
            edu.uci.ics.crawler4j.robotstxt.HostDirectives hostDirectives2 = edu.uci.ics.crawler4j.robotstxt.RobotstxtParser.parse("", robotstxtConfig1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        edu.uci.ics.crawler4j.url.WebURL webURL0 = new edu.uci.ics.crawler4j.url.WebURL();
        webURL0.setParentUrl("TLS");
        webURL0.setDepth((short) (byte) 10);
        java.lang.String str5 = webURL0.getDomain();
        java.lang.String str6 = webURL0.getTag();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        edu.uci.ics.crawler4j.url.WebURL webURL0 = new edu.uci.ics.crawler4j.url.WebURL();
        webURL0.setParentUrl("TLS");
        webURL0.setDepth((short) 0);
        byte byte5 = webURL0.getPriority();
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        edu.uci.ics.crawler4j.parser.NotAllowedContentException notAllowedContentException0 = new edu.uci.ics.crawler4j.parser.NotAllowedContentException();
        java.lang.Throwable[] throwableArray1 = notAllowedContentException0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        edu.uci.ics.crawler4j.url.WebURL webURL0 = new edu.uci.ics.crawler4j.url.WebURL();
        webURL0.setParentDocid(65546);
        java.lang.String str3 = webURL0.getAnchor();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        edu.uci.ics.crawler4j.crawler.CrawlConfig crawlConfig0 = new edu.uci.ics.crawler4j.crawler.CrawlConfig();
        java.util.Collection<org.apache.http.message.BasicHeader> basicHeaderCollection1 = crawlConfig0.getDefaultHeaders();
        int int2 = crawlConfig0.getMaxOutgoingLinksToFollow();
        crawlConfig0.setProxyPort((int) (short) 0);
        crawlConfig0.setIncludeBinaryContentInCrawling(true);
        org.junit.Assert.assertNotNull(basicHeaderCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5000 + "'", int2 == 5000);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        byte[] byteArray1 = edu.uci.ics.crawler4j.util.Util.int2ByteArray((int) 'a');
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        edu.uci.ics.crawler4j.crawler.exceptions.PageBiggerThanMaxSizeException pageBiggerThanMaxSizeException1 = new edu.uci.ics.crawler4j.crawler.exceptions.PageBiggerThanMaxSizeException((long) 100);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        edu.uci.ics.crawler4j.crawler.WebCrawler webCrawler0 = new edu.uci.ics.crawler4j.crawler.WebCrawler();
        webCrawler0.onStart();
        int int2 = webCrawler0.getMyId();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        edu.uci.ics.crawler4j.crawler.WebCrawler webCrawler0 = new edu.uci.ics.crawler4j.crawler.WebCrawler();
        edu.uci.ics.crawler4j.crawler.Page page1 = null;
        edu.uci.ics.crawler4j.url.WebURL webURL2 = null;
        boolean boolean3 = webCrawler0.shouldVisit(page1, webURL2);
        java.lang.Object obj4 = webCrawler0.getMyLocalData();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        boolean boolean2 = edu.uci.ics.crawler4j.robotstxt.PathRule.matchesRobotsPattern("hi!", "__enable_sni__");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        edu.uci.ics.crawler4j.url.TLDList.setUseOnline(true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        edu.uci.ics.crawler4j.parser.HtmlParseData htmlParseData0 = new edu.uci.ics.crawler4j.parser.HtmlParseData();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        htmlParseData0.setMetaTags(strMap1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = htmlParseData0.getMetaTags();
        java.util.Set<edu.uci.ics.crawler4j.url.WebURL> webURLSet4 = htmlParseData0.getOutgoingUrls();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(webURLSet4);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.lang.String[] strArray1 = new java.lang.String[] { "TLS" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        edu.uci.ics.crawler4j.robotstxt.UserAgentDirectives userAgentDirectives4 = new edu.uci.ics.crawler4j.robotstxt.UserAgentDirectives((java.util.Set<java.lang.String>) strSet2);
        edu.uci.ics.crawler4j.robotstxt.UserAgentDirectives userAgentDirectives5 = new edu.uci.ics.crawler4j.robotstxt.UserAgentDirectives((java.util.Set<java.lang.String>) strSet2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        edu.uci.ics.crawler4j.robotstxt.PathRule pathRule2 = new edu.uci.ics.crawler4j.robotstxt.PathRule((int) (short) 0, "");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        edu.uci.ics.crawler4j.parser.ExtractedUrlAnchorPair extractedUrlAnchorPair0 = new edu.uci.ics.crawler4j.parser.ExtractedUrlAnchorPair();
        java.lang.String str1 = extractedUrlAnchorPair0.getAnchor();
        java.lang.String str2 = extractedUrlAnchorPair0.getAnchor();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        edu.uci.ics.crawler4j.crawler.CrawlConfig crawlConfig0 = new edu.uci.ics.crawler4j.crawler.CrawlConfig();
        java.util.Collection<org.apache.http.message.BasicHeader> basicHeaderCollection1 = crawlConfig0.getDefaultHeaders();
        int int2 = crawlConfig0.getMaxOutgoingLinksToFollow();
        java.lang.String str3 = crawlConfig0.getProxyUsername();
        java.lang.String str4 = crawlConfig0.getUserAgentString();
        org.junit.Assert.assertNotNull(basicHeaderCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5000 + "'", int2 == 5000);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "crawler4j (https://github.com/yasserg/crawler4j/)" + "'", str4.equals("crawler4j (https://github.com/yasserg/crawler4j/)"));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        edu.uci.ics.crawler4j.crawler.CrawlConfig crawlConfig0 = new edu.uci.ics.crawler4j.crawler.CrawlConfig();
        boolean boolean1 = crawlConfig0.isProcessBinaryContentInCrawling();
        edu.uci.ics.crawler4j.fetcher.PageFetcher pageFetcher2 = new edu.uci.ics.crawler4j.fetcher.PageFetcher(crawlConfig0);
        crawlConfig0.setCleanupDelaySeconds((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        int int0 = edu.uci.ics.crawler4j.robotstxt.HostDirectives.UNDEFINED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        javax.net.ssl.SSLContext sSLContext0 = null;
        org.apache.http.conn.ssl.X509HostnameVerifier x509HostnameVerifier1 = org.apache.http.conn.ssl.SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
        try {
            edu.uci.ics.crawler4j.fetcher.SniSSLConnectionSocketFactory sniSSLConnectionSocketFactory2 = new edu.uci.ics.crawler4j.fetcher.SniSSLConnectionSocketFactory(sSLContext0, (javax.net.ssl.HostnameVerifier) x509HostnameVerifier1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SSL context may not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(x509HostnameVerifier1);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        edu.uci.ics.crawler4j.crawler.WebCrawler webCrawler0 = new edu.uci.ics.crawler4j.crawler.WebCrawler();
        edu.uci.ics.crawler4j.crawler.Page page1 = null;
        edu.uci.ics.crawler4j.url.WebURL webURL2 = null;
        boolean boolean3 = webCrawler0.shouldVisit(page1, webURL2);
        webCrawler0.onStart();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        edu.uci.ics.crawler4j.crawler.CrawlConfig crawlConfig0 = new edu.uci.ics.crawler4j.crawler.CrawlConfig();
        java.util.Collection<org.apache.http.message.BasicHeader> basicHeaderCollection1 = crawlConfig0.getDefaultHeaders();
        crawlConfig0.setMaxDownloadSize(5000);
        crawlConfig0.setThreadShutdownDelaySeconds((int) ' ');
        try {
            crawlConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Crawl storage folder is not set in the CrawlConfig.");
        } catch (java.lang.Exception e) {
        }
        org.junit.Assert.assertNotNull(basicHeaderCollection1);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.apache.http.impl.conn.PoolingHttpClientConnectionManager poolingHttpClientConnectionManager0 = null;
        edu.uci.ics.crawler4j.fetcher.IdleConnectionMonitorThread idleConnectionMonitorThread1 = new edu.uci.ics.crawler4j.fetcher.IdleConnectionMonitorThread(poolingHttpClientConnectionManager0);
        idleConnectionMonitorThread1.shutdown();
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        edu.uci.ics.crawler4j.crawler.CrawlConfig crawlConfig0 = new edu.uci.ics.crawler4j.crawler.CrawlConfig();
        java.util.Collection<org.apache.http.message.BasicHeader> basicHeaderCollection1 = crawlConfig0.getDefaultHeaders();
        crawlConfig0.setMaxDownloadSize(5000);
        crawlConfig0.setThreadShutdownDelaySeconds((int) ' ');
        crawlConfig0.setProxyHost("");
        org.junit.Assert.assertNotNull(basicHeaderCollection1);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        edu.uci.ics.crawler4j.url.WebURL webURL0 = new edu.uci.ics.crawler4j.url.WebURL();
        webURL0.setParentDocid(65546);
        edu.uci.ics.crawler4j.crawler.Page page3 = new edu.uci.ics.crawler4j.crawler.Page(webURL0);
    }
}

