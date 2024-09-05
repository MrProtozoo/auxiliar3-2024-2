package uchile.dcc.cl
package social
import user.IUser
import scala.collection.mutable.Map

class SocialYP1 {
  
  private val users: Map[String, String] = Map()

  def login(username: String, password: String): Boolean = {
    val u = users.get(username)
    if (u.isDefined && u.get == password) true
    else false
  }

  def register(username: String, password: String): Boolean = {
    if (users.contains(username)) false
    else {
      users(username) = password
      true
    }
  }

}