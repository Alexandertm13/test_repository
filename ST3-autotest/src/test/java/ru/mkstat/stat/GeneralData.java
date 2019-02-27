package ru.mkstat.stat;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by alexander.kotov on 06.02.2019.
 */
public class GeneralData {
  public String generateRandomString(int length) {
    return RandomStringUtils.randomAlphabetic(length);
  }

  public String generateRandomNumber(int length) {
    return RandomStringUtils.randomNumeric(length);
  }

  public static String generateRandomAlphaNumeric(int length) {
    return RandomStringUtils.randomAlphanumeric(length);
  }

  public String generateStringWithAllobedSplChars(int length, String allowdSplChrs) {
    String allowedChars = "abcdefghijklmnopqrstuvwxyz" +   //alphabets
            "1234567890" +   //numbers
            allowdSplChrs;
    return RandomStringUtils.random(length, allowedChars);
  }

  public String generateEmail(int length) {
    String allowedChars = "abcdefghijklmnopqrstuvwxyz" +   //alphabets
            "1234567890" +   //numbers
            "_-.";   //special characters
    String email = "";
    String temp = RandomStringUtils.random(length, allowedChars);
    email = temp.substring(0, temp.length() - 9) + "@test.org";
    return email;
  }

  public String generateUrl(int length) {
    String allowedChars = "abcdefghijklmnopqrstuvwxyz" +   //alphabets
            "1234567890" +   //numbers
            "_-.";   //special characters
    String url = "";
    String temp = RandomStringUtils.random(length, allowedChars);
    url = temp.substring(0, 3) + "." + temp.substring(4, temp.length() - 4) + "." + temp.substring(temp.length() - 3);
    return url;
  }
}
