package me.zeph.spring.aop.example.springaopexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandController {

  @Autowired
  private CommandService commandService;

  @GetMapping(value = "/handle")
  public HttpEntity<Event> handleRequest() {
    return new HttpEntity<>(commandService.handleCreateUserCommand(new Command()));
  }
}
