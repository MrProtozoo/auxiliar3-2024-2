package uchile.dcc.cl
package social

import user.IUser

/**
 * Interface for the social app
 */
trait ISocialY {

  /**
   * Attempts to login to the social app with the given username and password 
   * @param username  username to login with
   * @param password  password to login with
   * @return  the user registered with the username and password given,
   *          or None if the username is not registered or the password
   *          is incorrect.
   */
  def login(username: String, password: String): Option[IUser]

  /**
   * Registers a user in the social app using the username and password given
   * @param username  username to register with
   * @param password  password to register with
   * @return  the user registered with the username and password given,
   *          or None of the user with the username already exists.
   */
  def register(username: String, password: String): Option[IUser]

}
