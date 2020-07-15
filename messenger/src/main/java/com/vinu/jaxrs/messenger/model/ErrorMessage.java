/**
 * 
 */
package com.vinu.jaxrs.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Vinu Prabhakaran
 *         on Jul 13, 2020
 *
 */
@XmlRootElement
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
	
	String errorCode;
	String errorMessage;
}
