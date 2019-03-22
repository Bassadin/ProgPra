package Aufgaben.a01;

import org.junit.Assert;
import org.junit.Test;

public class PalindromTest {

    @Test
    public void isPalindromRELIEFPFEILER() {
        Assert.assertTrue(Palindrom.isPalindrom("RELIEFPFEILER"));
    }

    @Test
    public void isPalindromANNA() {
        Assert.assertTrue(Palindrom.isPalindrom("ANNA"));
    }

    @Test
    public void isPalindromSAIPPUAKAUPPIAS() {
        Assert.assertTrue(Palindrom.isPalindrom("SAIPPUAKAUPPIAS"));
    }

    @Test
    public void isPalindromNoPalindrom() {
        Assert.assertFalse(Palindrom.isPalindrom("asetgarthrtj"));
    }
}