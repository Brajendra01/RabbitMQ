package com.rabbitmq.RabbitMQ;

import java.io.IOException;
import java.util.concurrent.TimeoutException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.DeliverCallback;
import com.rabbitmq.client.Envelope;

@SpringBootApplication
public class RabbitMqApplication {

	public static void main(String[] args) throws IOException, TimeoutException {
		SpringApplication.run(RabbitMqApplication.class, args); 
	}
		/*
		  Connection connection = connect(); Channel channel =
		  connection.createChannel();
		  
		  channel.queueDeclare("queue1", true, false, false, null);  
		  System.out.println(" [*] Waiting for messages. To exit press CTRL+C    Queue name: "+channel.queueDeclare().getQueue());
		  
		  DeliverCallback deliverCallback=(consumerTag, del) -> { String msg=new
				  String(del.getBody(),"UTF-8");
		  		System.out.println("44444444 Recieved msg:::  "+msg+"'");
		  	};
		 
		  	channel.basicConsume("queue1", deliverCallback, consumerTag -> {});
        //channel.basicConsume("user123.queue", true, deliverCallback, consumerTag - > {});
        
	} 
	
	protected static Connection connect() { 
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
	//	factory.setPort(15672);  
		factory.setUsername("guest");
		factory.setPassword("guest"); 
		Connection connection = null;
		
		try {
			connection = factory.newConnection();
		} catch (Exception e){ 
			
		} 
		return connection;
	}*/
}
