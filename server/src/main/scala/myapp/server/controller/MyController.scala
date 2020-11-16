package myapp.server.controller

import java.time.Instant

import scala.concurrent.{ ExecutionContext, Future }

import akka.http.scaladsl.marshalling.ToResponseMarshallable
import akka.http.scaladsl.model.{ HttpResponse, StatusCode, StatusCodes }
import akka.http.scaladsl.server._
import akka.http.scaladsl.server.{ Directive => AkkaDirective }
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import cats.data.{ NonEmptyChain, NonEmptyMap }
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport
import org.slf4j.LoggerFactory

class MyController extends PlayJsonSupport {
  val x1: Instant = ???
  val x2: ExecutionContext = ???
  val x3: Future[String] = ???
  val x4: ToResponseMarshallable = ???
  val x5: HttpResponse = ???
  val x6: StatusCode = ???
  val x7 = StatusCodes.ClientError
  val x8: AkkaDirective[_] = ???
  val x9: FromRequestUnmarshaller[_] = ???
  val x10: NonEmptyMap[String, String] = ???
  val x11: NonEmptyChain[String] = ???
  val x12: LoggerFactory = ???
  val x13: ExceptionHandler = ???
}
