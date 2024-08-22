package uchile.dcc.cl
package user

class Admin(val username: String, val password: String, var name: String = "") extends IUser {

  override def follow(user: IUser): Unit = {
  }

  override def unfollow(user: IUser): Unit = {
  }

  override def followedBy(user: IUser): Unit = {
  }

  override def unfollowedBy(user: IUser): Unit = {
  }

  override def auth(password: String): Boolean = {
    this.password == password
  }

  override def followers: Int = 0

  override def following: Int = 0

  def banUser(user: User): Unit = {
    user.getBanned()
  }

  def muteUser(user: User): Unit = {
    user.getMuted()
  }

  def removeRestrictions(user: User): Unit = {
    user.removeRestrictions()
  }

  override def getBanned(): Unit = {
  }

  override def getMuted(): Unit = {
  }

  override def removeRestrictions(): Unit = {
  }

}
