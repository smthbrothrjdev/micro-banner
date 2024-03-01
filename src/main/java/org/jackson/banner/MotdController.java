package org.jackson.banner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MotdController {

  @GetMapping("/api/motd")
  public String messageOfTheDay(){
    return "there are no alerts";
  }

}
