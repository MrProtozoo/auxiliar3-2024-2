package uchile.dcc.cl

import munit.FunSuite

/**
 * Clase para que conozcan la testing suite de munit.
 */
class DummyTest extends FunSuite {
  
  private var n1: Int = _ // usar _ para dejar una variable sin inicializar 
  private var n2: Int = _ // se debe específicar el tipo que será, en este caso Int
  
  /*
  beforeEach se ejecuta antes de cada test. Se usa para establecer las variables que
  quedaron sin inicializar y dejar las cosas listas para correr los tests.
   */
  override def beforeEach(context: BeforeEach): Unit = {
    n1 = 1
    n2 = 2
  }

  test("Dummy test") {
    assertEquals(n1, 1) // usar assertEquals para comparar igualdad entre obj del mismo tipo
    assertEquals(n2, 2)
    assertEquals(n1 + n2, 3) 
  }

}
