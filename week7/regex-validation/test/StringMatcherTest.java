package com.iquestgroup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringMatcherTest {
  private static StringMatcher stringMatcher;

  @BeforeAll static
    public void setup(){
      stringMatcher = new StringMatcher();
  }

  @Test
    public void testMailIsValid() {
      Assertions.assertTrue(stringMatcher.isEmailValid("uursu.adrian@gmail.com"));
      Assertions.assertTrue(stringMatcher.isEmailValid("mircea.cel.batran@gmail.co.uk"));
      Assertions.assertTrue(stringMatcher.isEmailValid("user23@domain.co"));
      Assertions.assertTrue(stringMatcher.isEmailValid("asd.adrian@gmail.co"));
  }

  @Test
    public void testMailIsNotValid() {
      Assertions.assertFalse(stringMatcher.isEmailValid("adrian#gmail.com"));
      Assertions.assertFalse(stringMatcher.isEmailValid("@gmail.com"));
      Assertions.assertFalse(stringMatcher.isEmailValid("adrian1337@@gmail.com"));
  }

  @Test
    public void testPasswordIsValid() {
      Assertions.assertTrue(stringMatcher.isPasswordValid("adrianursU@:+>"));
      Assertions.assertTrue(stringMatcher.isPasswordValid("alexandrU@+"));
  }

  @Test
    public void testPasswordIsNotValid() {
      Assertions.assertFalse(stringMatcher.isPasswordValid("ADRIANURSU@"));
      Assertions.assertFalse(stringMatcher.isPasswordValid("ADRIANURSu"));
      Assertions.assertFalse(stringMatcher.isPasswordValid("adrianursu@"));
  }

  @Test
    public void testPhoneNumberIsValid() {
      Assertions.assertTrue(stringMatcher.isPhoneNumberValid("+40 123 456 7890"));
      Assertions.assertTrue(stringMatcher.isPhoneNumberValid("123 456 7890"));
      Assertions.assertTrue(stringMatcher.isPhoneNumberValid("0040 123.456.7890"));
      Assertions.assertTrue(stringMatcher.isPhoneNumberValid("123-456-7890"));
  }

  @Test
    public void testPhoneNumberIsNotValid() {
      Assertions.assertFalse(stringMatcher.isPhoneNumberValid("+0040 123.456.7890"));
  }
}
