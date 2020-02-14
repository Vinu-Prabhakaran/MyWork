/**
 * 
 */
package com.vinu.kafka.samples;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

/**
 * @author Vinu Prabhakaran
 *         on May 16, 2019
 *
 */
public class KafkaSampleProducer {

	public static Producer<Long, String> createProducer(){
		
		Properties configItems=new Properties();
		configItems.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, KafkaConstants.KAFKA_BROKERS);
		configItems.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, LongSerializer.class.getName());
		configItems.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		return new KafkaProducer<Long, String>(configItems);		
	}
	public static void main(String[] args) {
		
		Producer<Long, String> producer=createProducer();
		int i;
		for (i=1;i<=KafkaConstants.MESSAGE_COUNT;i++) {
		ProducerRecord<Long, String> record= new ProducerRecord<Long, String>(KafkaConstants.TOPIC_NAME, "This is message #"+i);
			try {
				RecordMetadata metaData= producer.send(record).get();
				System.out.println("Message published to "+metaData.topic()+" partition "+metaData.partition()+" with index "+metaData.offset());
			} catch (InterruptedException e) {
				System.out.println("Error sending record");
				e.printStackTrace();
			} catch (ExecutionException e) {
				System.out.println("Execution error sending record");
				e.printStackTrace();
			}
		}
		System.out.println("Closing producer");
		producer.close();
	}
		

}
