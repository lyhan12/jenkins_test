package com.lyhan12.jenkins_test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class JenkinsTestController {
  @Autowired
  private JenkinsTest jenkins_test;

  @RequestMapping("/sum")
  String sum(@RequestParam("a") Integer a,
             @RequestParam("b") Integer b) {
    return String.valueOf(jenkins_test.sum(a, b));
  }
}
