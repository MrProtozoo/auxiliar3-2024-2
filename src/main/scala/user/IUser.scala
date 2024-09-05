package uchile.dcc.cl
package user

/**
 * Interface for users in the social app.
 */
trait IUser {
  /**
   * 
   * @return  the name of the user
   */
  def name: String

  /**
   * Changes the name of the user
   * @param newName the new name
   */
  def changeName(newName: String): Unit

  /**
   * 
   * @return the username of the user
   */
  def username: String

  /**
   * Follows the given user
   * @param user the user to follow
   */
  def follow(user: IUser): Unit

  /**
   * Unfollows the given user
   * @param user the user to unfollow
   */
  def unfollow(user: IUser): Unit

  /**
   * Get followed by the given user
   * @param user the other user
   */
  def followedBy(user: IUser): Unit

  /**
   * Get unfollowed by the given user
   * @param user the other user
   */
  def unfollowedBy(user: IUser): Unit

  /**
   * Compares the given password with the user's password
   * @param password password to compare
   * @return true if the passwords match
   */
  def auth(password: String): Boolean

  /**
   * 
   * @return the amount of followers of the user 
   */
  def followers: Int

  /**
   * 
   * @return the amount of users the user follows
   */
  def following: Int

  /**
   * Changes user status to "Banned"
   */
  def getBanned(): Unit

  /**
    * Check if the user is banned.
    * @return true if the user status is "Banned"
    */
  def isBanned(): Boolean

  /**
    * Changes the user status to "Muted"
    */
  def getMuted(): Unit

  /**
    * Check if the user is muted
    * @return true if the user status is "Muted"
    */
  def isMuted(): Boolean

  /**
    * Removes any status of the user
    */
  def removeRestrictions(): Unit
}
