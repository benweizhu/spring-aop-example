package me.zeph.spring.aop.example.springaopexample;

import org.springframework.stereotype.Component;

@Component
public class CreateUserCommandHandler extends CommandHandler {

  @Override
  public Event handle(Command command) {
    return new Event();
  }

}
