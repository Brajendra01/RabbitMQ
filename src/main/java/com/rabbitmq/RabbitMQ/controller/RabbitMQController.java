package com.rabbitmq.RabbitMQ.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oppopay.kyc.model.PanKYCStatus;

@RestController 
@RequestMapping(value = "/rabbitmq/topic/")   
public class RabbitMQController{  
	public static final Logger logger = LoggerFactory.getLogger(RabbitMQController.class);
	
	  @RabbitListener(queues = "queue")  
	  public void recievedMessage(PanKYCStatus panStatus) {
		  logger.debug("11111111111 "+panStatus.getPanNumber()+" status: "+panStatus.getStatusDesc());
	  }
	 
	 

}
