package uchile.dcc.cl
package social

import munit.FunSuite
import uchile.dcc.cl.user.{Admin, User}

class SocialYTest extends FunSuite {
    val user = "root"
    val pass = "admin"
    val name = "Administrador"
    var social: SocialY = _

    override def beforeEach(context: BeforeEach): Unit = {
        social = new SocialY()
        val admin = social.register(user, pass)
        admin.get.changeName(name)
    }

    test("An user must be able to login"){
        val u = social.login(user, pass)
        assert(u.isDefined)
        assertEquals(u.get.username, user)
        assertEquals(u.get.name, naem)
    }

    test("An user that doesn't exist must not be able to login"){
        val u = social.login(user, "pass")
        assert(u.isEmpty)
        u = social.login(user, pass)
        assert(u.isDefined)
        assertEquals(u.get.username, user)
        assertEquals(u.get.name, name)
        assert(u.get.auth(pass))
    }

    test("An user must be able to login only with the correct password"){
        var u = social.login(user, "pass")
        assert(u.isEmpty)
        u = social.login(user, pass)
        assert(u.isDefined)
        assertEquals(u.get.username, user)
        assertEquals(u.get.name, name)
        assert(u.get.auth(pass))
    }

    test("An user must be able to register"){
        val u = social.register("user", "pass")
        assert(u.isDefined)
        assertEquals(u.get.username, "user")
        assertEquals(u.get.name, "")
        assert(u.get.auth("pass"))
    }

    test("An user must not be able to register with an already taken username"){
        val u = social.register(user, pass)
        assert(u.isEmpty)
    }

    test("An user can't login if it's banned"){
        val admin = new Admin("alan", "lapeorbuilddelahistoria")
        val name = "meportomal"
        val pass = "baneenme"
        val user = social.register(name, pass)
        admin.banUser(user.get)

        val u = social.login(name, pass)
        assert(u.isEmpty)
    }

}
