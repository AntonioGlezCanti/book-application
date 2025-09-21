package com.book_application.wishlist.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class ExampleController {

  @GetMapping
  public String get() {
    String hola = "hola";
    return hola;
  }

}
