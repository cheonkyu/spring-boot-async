package simple.app.event.email

import org.springframework.stereotype.Component
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import simple.app.event.email.SendEmail
import simple.app.logger

@Component
class EmailEventHandler {
  val log = logger()

  @EventListener
  @Async
  fun sendEmail(sendEmail: SendEmail) {
    Thread.sleep(2000); // 2초
    log.info("$sendEmail")
  }

}