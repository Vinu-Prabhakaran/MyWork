/**
 * 
 */
/**
 * @author Vinu Prabhakaran
 *
 */
package com.vinu.nio;

//Java introduced a replacement for java.io streams in Java 1.4 called Non-blocking
//I/O, or NIO for short. The NIO API introduced the concepts of buffers and channels in
//place of java.io streams. The basic idea is that you load the data from a file channel into
//a temporary buffer that, unlike byte streams, can be read forward and backward without
//blocking on the underlying resource.