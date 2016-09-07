package models;

/**
 * @file Friendship.java
 * @brief Class to describe a friendship between users
 * @author michaelfoy
 * @version 18.04.2016
 *
 */
public class Friendship {
  User sourceUser;
  public User targetUser;

  /**
   * Constructor of a friendship object
   * 
   * @param sourceUser The user who instigates the friendship
   * @param targetUser The user to be befriended
   */
  public Friendship(User sourceUser, User targetUser) {
    this.sourceUser = sourceUser;
    this.targetUser = targetUser;
  }

  /**
   * toString method to describe the friendship
   */
  @Override
  public String toString() {
    return sourceUser.firstName + "'s friend is " + targetUser.firstName + " "
        + targetUser.lastName;
  }
}
