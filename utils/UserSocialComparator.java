package utils;

import java.util.Comparator;

import models.User;

/**
 * @file UserSocialComparator
 * @brief Implements the comparator interface to compare user objects based on the number of
 *        friendships they have
 * @author michaelfoy
 * @version 18.04.2016
 */
public class UserSocialComparator implements Comparator<User> {
  @Override
  public int compare(User a, User b) {
    return Integer.compare(b.friendships.size(), a.friendships.size());
  }
}
