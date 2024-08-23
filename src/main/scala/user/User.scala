package uchile.dcc.cl
package user

import scala.collection.mutable.Set

class User(val username: String, val password: String, var name: String = "") extends IUser {

  var state: String = "Active"

  private val _followers: Set[IUser] = Set()
  private val _following: Set[IUser] = Set()

  override def changeName(newName: String): Unit = name = newName

  override def follow(user: IUser): Unit = {
    if (user == this) return
    _following add user
    user.followedBy(this)
  }

  override def unfollow(user: IUser): Unit = {
    _following remove user
    user.unfollowedBy(this)
  }

  override def followedBy(user: IUser): Unit = {
    if (user != this) _followers add user
  }

  override def unfollowedBy(user: IUser): Unit = {
    if (user != this) _followers remove user
  }

  override def auth(password: String): Boolean = {
    this.password equals password
  }

  override def followers: Int = _followers.size

  override def following: Int = _following.size

  override def getBanned(): Unit = {
    state = "Banned"
  }

  override def getMuted(): Unit = {
    state = "Muted"
  }

  override def removeRestrictions(): Unit = {
    state = ""
  }

  override def isBanned(): Boolean = {
    this.state == "Banned"
  }

  override def isMuted(): Boolean = {
    this.state == "Muted"
  }
  
}
