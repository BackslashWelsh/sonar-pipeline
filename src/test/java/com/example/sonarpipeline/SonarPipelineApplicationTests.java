package com.example.sonarpipeline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarPipelineApplicationTests {

  @Test
  void contextLoads() {
  }

  @Test
  void testGetUser() {
    UserController userController = new UserController();
    assertEquals("Hello User!", userController.getUser());
  }

  @Test
  void testExcessive() throws InterruptedException {
    System.out.println("Sleeping; Datetime: " + LocalDateTime.now());
    Thread.sleep(TimeUnit.SECONDS.toMillis(10));
    System.out.println("Woke up; Datetime: " + LocalDateTime.now());
  }
}
