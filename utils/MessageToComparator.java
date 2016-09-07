package utils;


import java.util.Comparator;

import models.Message;

/**
 * @file MessageToComparator.java
 * @brief Implements the comparator interface to compare message objects based on their recipients
 * @author michaelfoy
 * @version 18.04.2016
 */
public class MessageToComparator implements Comparator<Message> {

  @Override
  public int compare(Message o1, Message o2) {

    String o1Name = o1.to.firstName + o1.to.lastName;
    String o2Name = o2.to.firstName + o2.to.lastName;
    return o1Name.compareTo(o2Name);
  }

}
