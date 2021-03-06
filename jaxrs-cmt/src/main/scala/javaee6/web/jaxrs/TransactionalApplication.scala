package javaee6.web.jaxrs

import scala.collection.JavaConverters._

import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application

@ApplicationPath("rest")
class TransactionalApplication extends Application {
  override def getClasses: java.util.Set[Class[_]] =
    Set[Class[_]](classOf[TransactionSubmitResource]).asJava
}

