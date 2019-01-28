package zone.share

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity

@SpringBootApplication
@EnableEurekaServer
@EnableWebSecurity
class CenterServiceApplication

fun main(args: Array<String>) {
    runApplication<CenterServiceApplication>(*args)
}