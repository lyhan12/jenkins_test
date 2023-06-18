package com.lyhan12.jenkins_test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class JenkinsTestTest {
  private JenkinsTest jenkins_test = new JenkinsTest();

  @Test
  public void testSum() {
    assertEquals(5, jenkins_test.sum(2, 3));
  }
}
