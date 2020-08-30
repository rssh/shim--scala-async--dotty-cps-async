package async

import org.junit.{Assert, Test}

import scala.async.Async._
import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.language.postfixOps


class MinimalShimTest {

  @Test def test_add(): Unit = {
     val p1 = Promise[Int]()
     val p2 = Promise[Int]()
     val c = async {
         await(p1.future) + await(p2.future)
     }
     p1 success 1
     p2 success 2
     val r = Await.result(c, 1 second)
     assert(r == 3) 
  }

}
