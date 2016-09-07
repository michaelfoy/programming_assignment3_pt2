package utils;


import java.util.Comparator;
import models.Message;

/**
 * A comparator class that facilitates comparison between the concatenated first and second names of
 * the originator of 2 message objects Example: Message o1 has a User from that has String firstName
 * and String lastName The comparison is between firstName+lastName in both messages' originators.
 * 
 * @author jfitzgerald
 * @author michaelfoy
 * @version 18.04.2016
 */
public class MessageFromComparator implements Comparator<Message> {

  /**
   * Performs a lexicographic comparison of the String name fields of the sender (that is User
   * from) in 2 Message objects
   * 
   * @param o1 the first message object
   * @param o2 the second message object
   * @return 0 if the user name in o1 is equal to the name in o2 less than zero if name in o1 less
   *         than name in o2 greater than zero if name in o2 greater than name in o2
   */
  @Override
  public int compare(Message o1, Message o2) {
    // TODO: Complete implementation of method MessageFromComparator.compare.
    String name1 = o1.from.firstName + o1.from.lastName;
    String name2 = o2.from.firstName + o2.from.lastName;
    return name1.compareToIgnoreCase(name2);
  }
}
