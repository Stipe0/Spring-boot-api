package com.example.demo.Condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class UserCondition implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return "true".equalsIgnoreCase(context.getEnvironment().getProperty("spring.h2.console.enabled"));
	}

}
