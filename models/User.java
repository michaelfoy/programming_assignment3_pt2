package models;


import java.util.ArrayList;
import java.util.Iterator;


/**
 * @file User.java
 * @brief Describes a user object
 * @author michaelfoy
 * @version 18.04.2016 
 */
public class User {
  public String firstName;
  public String lastName;
  int age;
  String nationality;
  String email;
  String password;

  public ArrayList<Friendship> friendships = new ArrayList<>();
  public ArrayList<Message> inbox = new ArrayList<>();
  public ArrayList<Message> outbox = new ArrayList<>();

  /**
   * Constructor for user object
   * @param firstName User's first name
   * @param lastName User's last name
   * @param age User's age
   * @param nationality User's nationality
   * @param email User's email address
   * @param password User's account password
   */
  public User(String firstName, String lastName, int age, String nationality, String email,
      String password) {
    setState(firstName, lastName, age, nationality, email, password);
  }

  /**
   * Default constructor for user object of age 100, nationality American
   * @param firstName User's first name
   * @param lastName User's last name
   * @param email User's email address
   * @param password User's account password
   */
  public User(String firstName, String lastName, String email, String password) {
    setState(firstName, lastName, 100, "USA", email, password);
  }

  /* Sets state of the user object
   * 
   * @param firstName User's first name
   * @param lastName User's last name
   * @param age User's age
   * @param nationality User's nationality
   * @param email User's email address
   * @param password User's account password
   */
  private void setState(String firstName, String lastName, int age, String nationality,
      String email, String password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.nationality = nationality;
    this.email = email;
    this.password = password;
  }

  /**
   * Sends a single message to each friend
   * @param messageText Content of the message
   */
  public void broadcastMessage(String messageText) {
    for (Friendship f : friendships) {
      Message message = new Message(this, f.targetUser, messageText);
      outbox.add(message);
      f.targetUser.inbox.add(message);
    }
  }

  /**
   * Sends a message to a user
   * @param to Recipient of the message
   * @param messageText Content of the message
   */
  public void sendMessage(User to, String messageText) {
    Message message = new Message(this, to, messageText);
    outbox.add(message);
    to.inbox.add(message);
  }

  /**
   * Prints to console each message contained in outbox
   */
  public void displayOutbox() {
    for (Message msg : outbox) {
      msg.displayMessage();
    }
  }

  /**
   * Prints to console each message contained in inbox
   */
  public void displayInbox() {
    for (Message msg : inbox) {
      msg.displayMessage();
    }
  }

  /**
   * Creates a freindship with another user
   * @param friend User to be befriended
   */
  public void befriend(User friend) {
    if (!(friend == this)) {
      Friendship friendship = new Friendship(this, friend);
      friendships.add(friendship);
    } else {
      System.out
          .println("Opps! You seem to have made a mistake in attempting to befriend yourself");
    }
  }

  /**
   * Removes all friendships
   */
  public void unfriendAll() {
    Iterator<Friendship> it = friendships.iterator();
    while (it.hasNext()) {
      it.next();
      it.remove();
    }
  }

  /**
   * Unfriends a user 
   * @param friend User to be unfriended
   */
  public void unfriend(User friend) {
    for (Friendship friendship : friendships) {
      if (friendship.targetUser == friend) {
        friendships.remove(friendship);
        return;
      }
    }
  }

  /**
   * Prints list of all friends for this user
   */
  public void displayFriends() {
    if (friendships.isEmpty()) {
      System.out.println("Unfortunately you have no friends");
    }
    for (Friendship friendship : friendships) {
      System.out.println("My friend is " + friendship.targetUser.firstName);
    }
  }

}
