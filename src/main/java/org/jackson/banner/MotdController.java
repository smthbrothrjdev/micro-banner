package org.jackson.banner;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin()
@RestController
public class MotdController {

  @GetMapping("/api/motd")
  public String messageOfTheDay(){
    return "there are no alerts";
  }

}
