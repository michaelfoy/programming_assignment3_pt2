package utils;

import java.util.Comparator;

import models.User;

/**
 * @file UserLeastTalkativeComparator.java
 * @brief Implements the comparator interface to compare the size of the outbox of 2 users
 * @author michaelfoy
 * @version 17.04.2016
 */
public class UserLeastTalkativeComparator implements Comparator<User> {
  @Override
  public int compare(User a, User b) {
    return Integer.compare(a.outbox.size(), b.outbox.size());
  }
}
