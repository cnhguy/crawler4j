package edu.uci.ics.crawler4j.tests;

import java.net.MalformedURLException;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.crawler4j.crawler.authentication.AuthInfo.AuthenticationType;
import edu.uci.ics.crawler4j.crawler.authentication.BasicAuthInfo;

public class BasicAuthInfoTest {

    private BasicAuthInfo b;

    private String username = "username";
    private String password = "password";
    private String url = "https://github.com/login.php";

    @Before
    public void setup() {
        try {
            b = new BasicAuthInfo(username, password, url);
        } catch (MalformedURLException e) {
            fail("MalformedURLException");
        }
    }

    @Test
    public void testConstructor() {
        try {
            b = new BasicAuthInfo(username, password, url);
        } catch (MalformedURLException e) {
            fail("MalformedURLException");
        }
    }

    @Test
    public void testgetAuthenticationType() {
        assertEquals(AuthenticationType.BASIC_AUTHENTICATION, b.getAuthenticationType());
    }

    @Test
    public void testsetAuthenticationType() {
        b.setAuthenticationType(AuthenticationType.NT_AUTHENTICATION);
        assertEquals(AuthenticationType.NT_AUTHENTICATION, b.getAuthenticationType());
    }

    @Test
    public void testgetHttpMethod() {
        assertEquals(MethodType.GET, b.getHttpMethod());
    }

    @Test
    public void testsetHttpMethod() {
        b.setHttpMethod(MethodType.POST);
        assertEquals(MethodType.POST, b.getHttpMethod());
    }

    @Test
    public void testgetProtocol() {
        assertEquals("https", b.getProtocol());
    }

    @Test
    public void testsetProtocol() {
        b.setProtocol("http");
        assertEquals("http", b.getProtocol());
    }

    @Test
    public void testgetHost() {
        assertEquals("github.com", b.getHost());
    }

    @Test
    public void testsetHost() {
        b.setHost("www.google.com");
        assertEquals("www.google.com", b.getHost());
    }

    @Test
    public void testgetLoginTarget() {
        assertEquals("/login.php", b.getLoginTarget());
    }

    @Test
    public void testsetLoginTarget() {
        b.setLoginTarget("/tree/login.php");
        assertEquals("/tree/login.php", b.getLoginTarget());
    }

    @Test
    public void testgetUsername() {
        assertEquals(username, b.getUsername());
    }

    @Test
    public void testsetUsername() {
        b.setUsername("user");
        assertEquals("user", b.getUsername());
    }

    @Test
    public void testgetPassword() {
        assertEquals(password, b.getPassword());
    }

    @Test
    public void testsetPassword() {
        b.setPassword("123");
        assertEquals("123", b.getPassword());
    }
}