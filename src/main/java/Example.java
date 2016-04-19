import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

@Component
@EnableAutoConfiguration
public class Example {
  public static void main(String args[]) {
    System.out.println("Running this as a simple jar file not as a webapp");
  }

}
