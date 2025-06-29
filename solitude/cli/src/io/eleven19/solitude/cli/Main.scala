package io.eleven19.solitude.cli 
import org.graalvm.polyglot.Context
import scala.util.Using

object Main extends App:
  scribe.info("Starting Solitude CLI...")
  println("Welcome to Solitude CLI!")
  Using(Context.create()){context => 
    context.eval("python", "print('Hello from GraalPy!')")
  }
end Main
  