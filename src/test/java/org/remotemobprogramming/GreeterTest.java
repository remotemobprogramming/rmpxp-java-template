package org.remotemobprogramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreeterTest {

  @Test
  void greet() {
    var greeter = new Greeter();

    var greeting = greeter.greet("Heribert Innoq");

    assertEquals("Hallo Heribert Innoq", greeting);
  }
}