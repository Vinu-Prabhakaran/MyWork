/**
 * 
 */
package com.vinu.kafka.samples;

/**
 * @author Vinu Prabhakaran
 *         on May 16, 2019
 *
 */
public interface KafkaConstants {
	
	public static String KAFKA_BROKERS = "ubuntu-1:9092";
    public static Integer MESSAGE_COUNT=100;
    public static String CLIENT_ID="Vinu's-Lenovo";
    public static String TOPIC_NAME="TutorialTopic";
    public static String GROUP_ID_CONFIG="TutorialTopic-consumer-group";
    public static Integer MAX_NO_MESSAGE_FOUND_COUNT=10;
    public static String OFFSET_RESET_LATEST="latest";
    public static String OFFSET_RESET_EARLIER="earliest";
    public static Integer MAX_POLL_RECORDS=1;

}
