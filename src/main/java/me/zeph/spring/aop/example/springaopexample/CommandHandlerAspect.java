package me.zeph.spring.aop.example.springaopexample;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CommandHandlerAspect {

  @Before("execution(* CreateUserCommandHandler.handleCommand(..))")
  public void adviceDefaultImplementation() {
    System.out.println("aspect");
  }

  @Before("execution(* *.handle(..))")
  public void adviceHandle() {
    System.out.println("aspect");
  }

  @Before("execution(* CommandService.handleCreateUserCommand(..))")
  public void adviceService() {
    System.out.println("aspect");
  }

}
