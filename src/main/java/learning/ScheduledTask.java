package learning;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

  @Scheduled(fixedRate = 100)
  public void executeFixedRate()
  {
    System.out.println("Executing every 100 millis time count start at beginning of method execution ");
  }

  @Scheduled(fixedDelay = 100)
  public void executeFixedDelay()
  {
    System.out.println("Executing every 100 millis time count start at end of method execution ");
  }

  @Scheduled(cron = "*/1 * * * * *")
  public void executeCron()
  {
    System.out.println("Executing every 1 second ");
  }
}
