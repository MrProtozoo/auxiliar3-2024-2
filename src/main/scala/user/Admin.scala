package uchile.dcc.cl
package user

class Admin(val username: String, val password: String, var name: String = ""){

  def banUser(user: IUser): Unit = {
    user.getBanned()
  }

  def muteUser(user: IUser): Unit = {
    user.getMuted()
  }

  def removeRestrictions(user: IUser): Unit = {
    user.removeRestrictions()
  }
  
}
