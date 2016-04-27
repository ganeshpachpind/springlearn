import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@EnableAutoConfiguration
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
