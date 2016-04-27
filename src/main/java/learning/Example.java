package learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Component
@EnableScheduling
public class Example {

  @RequestMapping("/")
  public String home() {
    return "Hello User";
  }

  public static void main(String args[]) {
    SpringApplication.run(Example.class, args);
    System.out.println("Running this as a simple jar file not as a webapp");
  }

}
