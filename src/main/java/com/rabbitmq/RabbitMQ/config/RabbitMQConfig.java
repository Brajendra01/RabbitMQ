package com.oppopay.kyc.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig { 
	
	@Bean
	Queue queue1() {
		return new Queue("queue",true, false, false, null);
	}
	
	/*
	 * @Bean Queue queue2() { return new Queue("queue2",true, false, false, null); }
	 */
	  
	@Bean   
	TopicExchange topicExchange() {
		return new TopicExchange("oppo_exchange");
	}
	  
	@Bean
	Binding bindingQueue1(Queue queue1, TopicExchange topicExchange) {
		return BindingBuilder.bind(queue1).to(topicExchange).with("routing_key");   
	} 
}
