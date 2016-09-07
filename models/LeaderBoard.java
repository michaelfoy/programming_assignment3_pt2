package models;

import java.util.ArrayList;
import java.util.Collections;
import utils.UserSocialComparator;
import utils.UserTalkativeComparator;
import utils.UserLeastTalkativeComparator;
import views.LeaderBoardView;

/**
 * @file LeaderBoard.java
 * @brief Class publishes users graded most socially and most and least talkatively active
 * @author michaelfoy
 * @version 18.04.2016
 */


public class LeaderBoard {
  /**
   * Method to sort users according to their number of friends
   * 
   * @param users List of all Spacebook users
   */
  public static void index(ArrayList<User> users) {
    Collections.sort(users, new UserSocialComparator());
    LeaderBoardView.index(users);
  }

  /**
   * Method to sort users by the size of their outbox beginning with the largest
   * 
   * @param users List of all Spacebook users
   */
  public static void talkative(ArrayList<User> users) {
    // TODO: Complete implementation of method LeaderBoard.talkative
    Collections.sort(users, new UserTalkativeComparator());
    LeaderBoardView.talkative(users);
  }

  /**
   * Method to sort users by the size of their outbox beginning with the smallest
   * 
   * @param users List of all Spacebook users
   */
  public static void leastTalkative(ArrayList<User> users) {
    // TODO: Complete implementation of method LeaderBoard.leastTalkative
    Collections.sort(users, new UserLeastTalkativeComparator());
    LeaderBoardView.leastTalkative(users);
  }
}
