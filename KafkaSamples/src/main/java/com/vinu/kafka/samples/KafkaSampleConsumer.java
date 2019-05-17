/**
 * 
 */
package com.vinu.kafka.samples;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.LongDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;

/**
 * @author Vinu Prabhakaran
 *         on May 16, 2019
 *
 */
public class KafkaSampleConsumer {

	public static Consumer<Long, String> createConsumer(){
		
		Properties configItems=new Properties();
		configItems.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, KafkaConstants.KAFKA_BROKERS);
		configItems.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, LongDeserializer.class.getName());
		configItems.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		configItems.setProperty(ConsumerConfig.GROUP_ID_CONFIG, KafkaConstants.GROUP_ID_CONFIG);
		return new KafkaConsumer<Long, String>(configItems);		
	}
	
	public static void main(String[] args) {

		Consumer<Long, String> consumer= createConsumer();
		int messagesCount=0,noMessagesCount=0;
		consumer.subscribe(Arrays.asList(KafkaConstants.TOPIC_NAME));
		
		while(true) {
			ConsumerRecords<Long, String> consRecords=consumer.poll(Duration.ofSeconds(2));
			messagesCount=consRecords.count();
			
			if (consRecords.count() == 0) {
				noMessagesCount++;
			}
			
			if(noMessagesCount >= KafkaConstants.MAX_NO_MESSAGE_FOUND_COUNT) {
				System.out.println("Exiting after "+KafkaConstants.MAX_NO_MESSAGE_FOUND_COUNT +" unsuccessful attempts");
				break;
			}
			
			System.out.println("Records Read :"+messagesCount);
			consRecords.forEach(record -> {
				System.out.println("RecordKey 		:"+ record.key());
				System.out.println("RecordValue 	:"+ record.value());
				System.out.println("RecordOffset	:"+ record.offset());
				System.out.println("RecordParition	:"+ record.partition());
			});
			
		}
		consumer.close();
					

	}

}
