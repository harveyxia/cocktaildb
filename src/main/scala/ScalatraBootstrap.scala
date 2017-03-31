import com.cocktaildb.app._
import org.scalatra._
import javax.servlet.ServletContext

import com.cocktaildb.app.MyScalatraServlet

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new MyScalatraServlet, "/*")
  }
}
