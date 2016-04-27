package learning;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

  @Scheduled(fixedRate = 100)
  public void executeFixedRate()
  {
//    System.out.println("Executing every 100 millis time count start at beginning of method execution " );
    System.out.println(Thread.currentThread().getName() + " 100 sec diff " +System.currentTimeMillis());
  }

//  @Scheduled(fixedDelay = 100)
//  public void executeFixedDelay()
//  {
////    System.out.println("Executing every 100 millis time count start at end of method execution ");
//    System.out.println(Thread.currentThread().getName() + " 100 sec diff2 " +System.currentTimeMillis());
//  }

  @Scheduled(cron = "*/1 * * * * *")
  public void executeCron() throws InterruptedException {
//    System.out.println("Executing every 1 second " + Thread.currentThread().getName() + Thread.currentThread().isDaemon());
    System.out.println(Thread.currentThread().getName() + " 1 sec diff " +System.currentTimeMillis());
    Thread.sleep(200l);
  }
}
