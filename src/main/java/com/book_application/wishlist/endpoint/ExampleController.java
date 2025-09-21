package com.book_application.wishlist.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/libros")
public class ExampleController {

  @GetMapping
  public String getLibros() {
    return "hola";
  }

  @GetMapping(value = "/libro/{id}")
  public String getAdios(@PathVariable Integer id) {
    return id.toString();
  }

}
