import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

@Component
@EnableAutoConfiguration
public class Example {

  public String home() {
    return "Hello User";
  }

  public static void main(String args[]) {
    SpringApplication.run(Example.class, args);
    System.out.println("Running this as a simple jar file not as a webapp");
  }

}
