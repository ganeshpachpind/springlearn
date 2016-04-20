import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@EnableAutoConfiguration
public class Example {

  @RequestMapping("/")
  public String home() {
    return "Hello User";
  }

  @RequestMapping(value = "/welcome/{name}",method = RequestMethod.GET)
  public String welcome (@PathVariable("name") String name) {
   return "Welcome "+ name;
  }

  @RequestMapping(value = "/SecuredData/{name}",method = RequestMethod.GET)
  public String securedData (@PathVariable("name") String name) {
    return name + "Congrats Yor can access Secure Data ";
  }

  public static void main(String args[]) {
    SpringApplication.run(Example.class, args);
    System.out.println("Running this as a simple jar file not as a webapp");
  }

}
