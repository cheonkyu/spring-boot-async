package simple.app.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationEventPublisher
import org.springframework.scheduling.annotation.Async

import java.util.concurrent.Future
import java.util.concurrent.CompletableFuture

import simple.app.event.email.SendEmail
import simple.app.logger

@RestController
class SimpleController(
    val publisher: ApplicationEventPublisher
){
    val log = logger()

    @GetMapping("email")
    fun sendEmail(): String {
        log.info("call sendEmail")
        publisher.publishEvent(
            SendEmail(
                title = "이메일제목",
                content = "이메일내용"
            )
        );
        return "success"
    }
}