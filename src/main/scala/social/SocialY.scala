package uchile.dcc.cl
package social
import user.{IUser, User}

import scala.collection.mutable.Map

class SocialY extends ISocialY {
  private val users: Map[String, IUser] = Map()

  override def login(username: String, password: String): Option[IUser] = {
    val u = users.get(username)
    if (u.isDefined && u.get.auth(password)) return u
    None
  }

  override def register(username: String, password: String): Option[IUser] = {
    if (users.contains(username)) None
    else {
      val u = new User(username = username, password = password)
      users(username) = u
      Some(u)
    }
  }
}
