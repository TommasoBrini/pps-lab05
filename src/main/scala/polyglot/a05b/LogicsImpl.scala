package polyglot.a05b

import polyglot.a05b.Logics
import util.Sequences.*
import Sequence.*
import scala.util.Random

/** solution and descriptions at https://bitbucket.org/mviroli/oop2019-esami/src/master/a05b/sol2/ */
class LogicsImpl(private val size: Int) extends Logics:
  val random = scala.util.Random(42)
  private var map: Sequence[(Int, Int)] = Cons((random.nextInt(size), random.nextInt(size)), empty)

  override def tick(): Unit = {}

  override def isOver: Boolean = false

  override def hasElement(x: Int, y: Int): Boolean = map.contains((x,y))
