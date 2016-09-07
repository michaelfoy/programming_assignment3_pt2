package models;

import java.util.ArrayList;
import java.util.Date;

/**
 * @file Message.java
 * @brief Class to describe a message object
 * @author michaelfoy
 * @version 18.04.2016
 */
public class Message {
  public String messageText;
  public User from;
  public User to;
  public Date postedAt;

  /**
   * Constructor for message object
   * 
   * @param from Message sender
   * @param to Message recipient
   * @param messageText Content of the message
   */
  public Message(User from, User to, String messageText) {
    this.from = from;
    this.to = to;
    this.messageText = messageText;
    postedAt = new Date();
    pause();
  }

  /*
   * Pause briefly to ensure the Date postedAt values are sufficiently different to allow sorting.
   * Here 10 milliseconds are used with effect but this figure may vary on other systems.
   */
  private void pause() {
    try {
      Thread.sleep(10);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }

  /**
   * toString method to return a description of the message
   */
  @Override
  public String toString() {
    return this.from.firstName + " says... " + this.messageText;
  }

  /**
   * Prints a message to the console
   */
  public void displayMessage() {
    System.out.println(toString());
  }

  /**
   * Prints to the console all messages from an ArrayList of messages
   * 
   * @param messages ArrayList of messages
   */
  public static void displayMessage(ArrayList<Message> messages) {
    for (Message message : messages) {
      message.displayMessage();
    }
  }
}
