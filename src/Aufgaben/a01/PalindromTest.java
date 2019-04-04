package Aufgaben.a01;

import org.junit.Assert;
import org.junit.Test;

public class PalindromTest {

    @Test
    public void isPalindromRELIEFPFEILER() throws Exception {
        Assert.assertTrue(Palindrom.isPalindrom("RELIEFPFEILER"));
    }

    @Test
    public void isPalindromANNA() throws Exception {
        Assert.assertTrue(Palindrom.isPalindrom("ANNA"));
    }

    @Test
    public void isPalindromSAIPPUAKAUPPIAS() throws Exception {
        Assert.assertTrue(Palindrom.isPalindrom("SAIPPUAKAUPPIAS"));
    }

    @Test
    public void isPalindromNoPalindrom() throws Exception {
        Assert.assertFalse(Palindrom.isPalindrom("asetgarthrtj"));
    }

    @Test(expected = Exception.class)
    public void isPalindromEmptyString() throws Exception {
        Assert.assertFalse(Palindrom.isPalindrom(""));
    }
}