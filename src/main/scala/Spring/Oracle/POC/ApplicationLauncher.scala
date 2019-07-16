package Spring.Oracle.POC

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.boot.builder.SpringApplicationBuilder


@SpringBootApplication
class ApplicationLauncher extends SpringBootServletInitializer{
  override def configure(builder: SpringApplicationBuilder): SpringApplicationBuilder = builder.sources(classOf[ApplicationLauncher])
}


object ApplicationLauncher extends App {
  SpringApplication.run(classOf[ApplicationLauncher])
}
