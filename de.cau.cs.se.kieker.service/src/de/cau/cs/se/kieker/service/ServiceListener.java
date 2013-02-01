/**
 * 
 */
package de.cau.cs.se.kieker.service;

/**
 * @author rju
 *
 */
public interface ServiceListener {
	void handleEvent(long count, String message);
}
