package Spring.Oracle.POC.controller

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class WelcomeNote {
  @RequestMapping(Array("/"))
  def welcome :String = "Welcome to Spring_Oracle_POC."

}
