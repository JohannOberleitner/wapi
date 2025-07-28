package com.joesample.wapi.demo_1;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/info")
public class InfoController {

  @GetMapping("/test")
  public String test() {
    return "This is an API test";
  }
}
