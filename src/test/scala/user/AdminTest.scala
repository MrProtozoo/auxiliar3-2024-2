package uchile.dcc.cl
package user

import munit.FunSuite

class AdminTest extends FunSuite {
  var u1: User = _
  var u2: User = _
  var a1: Admin = _

  override def beforeEach(context: BeforeEach): Unit = {
    u1 = new User("operagyofficial", "browserforgamers", "Opera GY")
    u2 = new User("user123", "12356")
    a1 = new Admin("Duo", "doYourSpanishLessons", "DuolingoBros")
  }

  test("The admin has a username") {
    val expectedUsername: String = "DuolingoBros"
    assertEquals(a1.name, expectedUsername)
  }
  test("The admin has a password") {
    val expectedPassword: String = "DuolingoBros"
    assertEquals(a1.name, expectedPassword)
  }

  test("The admin has a name") {
    val expectedName: String = "DuolingoBros"
    assertEquals(a1.name, expectedName)
  }
  test("An admin can ban any user") {
    a1.banUser(u1)
    val expected: String = "Banned"
    assertEquals(u1.state, expected)
  }
  test("An admin can mute any user") {
    a1.muteUser(u2)
    val expected: String = "Muted"
    assertEquals(u2.state, expected)
  }
  test("An admin can unmute or unban an user") {
    a1.muteUser(u1)
    a1.banUser(u2)
    assertEquals(u1.state, "Muted")
    assertEquals(u2.state, "Banned")
    a1.removeRestrictions(u1)
    a1.removeRestrictions(u2)
    assertEquals(u1.state, "")
    assertEquals(u2.state, "")
  }
}
