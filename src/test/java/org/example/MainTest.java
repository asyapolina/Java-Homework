package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {
  @Test
  @DisplayName("Test HW1")
  public void testMain() {
    System.setIn(new ByteArrayInputStream("Adam 10000 3 3.5".getBytes()));
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    System.setOut(ps);
    Main.main(null);
    assertEquals("Enter your name, start money, years, account rate:\r\nHello Adam. Your final balance: 11050.0 rubles.\r\n", baos.toString());
  }

}