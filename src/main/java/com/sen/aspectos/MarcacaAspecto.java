package com.sen.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MarcacaAspecto {

	@Around("@annotation(com.sen.aspectos.Marcacao)")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Executando código antes do método circundado pelo aspecto");
		pjp.proceed();
		System.out.println("Executando código após o método circundado pelo aspecto");
	}
}
