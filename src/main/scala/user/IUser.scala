package uchile.dcc.cl
package user

trait IUser {
  def name: String
  def changeName(newName: String): Unit
  def username: String
  def follow(user: IUser): Unit
  def unfollow(user: IUser): Unit
  def followedBy(user: IUser): Unit
  def unfollowedBy(user: IUser): Unit
  def auth(password: String): Boolean
  def followers: Int
  def following: Int
  
  def getBanned(): Unit
  def isBanned(): Boolean
  def getMuted(): Unit
  def isMuted(): Boolean
  def removeRestrictions(): Unit

}
