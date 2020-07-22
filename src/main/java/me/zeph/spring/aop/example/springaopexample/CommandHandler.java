package me.zeph.spring.aop.example.springaopexample;

public interface CommandHandler {

  Event handle(Command command);

  default Event handleCommand(Command command) {
    return handle(command);
  }

}
