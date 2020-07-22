package me.zeph.spring.aop.example.springaopexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandService {

  @Autowired
  private CreateUserCommandHandler createUserCommandHandler;

  public Event handleCreateUserCommand(Command command){
    return createUserCommandHandler.handleCommand(command);
  }
}
