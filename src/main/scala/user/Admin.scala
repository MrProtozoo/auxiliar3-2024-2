package uchile.dcc.cl
package user

class Admin(val username: String, val password: String, var name: String = ""){

  /**
   * Ban the given user
   * @param user  the user to be banned
   */
  def banUser(user: IUser): Unit = {
    user.getBanned()
  }

  /**
   * mutes the given user
   * @param user  the user to be muted
   */
  def muteUser(user: IUser): Unit = {
    user.getMuted()
  }

  /**
   * removes the status of the given user
   * @param user  the given user
   */
  def removeRestrictions(user: IUser): Unit = {
    user.removeRestrictions()
  }
  
}
