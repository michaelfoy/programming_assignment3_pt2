package utils;

import java.util.Comparator;

import models.Message;

/**
 * @file MessageDateComparator.java
 * @brief Implements the comparator interface to compare message objects by the date they were sent
 * @author michaelfoy
 * @version 18.04.2016
 */
public class MessageDateComparator implements Comparator<Message> {
  @Override
  public int compare(Message a, Message b) {
    // TODO: Complete implementation of method MessageDateComparator.compare
    return a.postedAt.compareTo(b.postedAt);
  }
}
