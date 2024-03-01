package org.jackson.banner;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MotdController {

  @GetMapping("/api/motd")
  public ResponseEntity messageOfTheDay(){

    return new ResponseEntity<>("Streaming this in", HttpStatus.OK);
  }

}
