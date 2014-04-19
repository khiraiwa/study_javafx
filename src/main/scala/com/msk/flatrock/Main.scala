package com.msk.flatrock

import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.Scene
import javafx.scene.Group

class Main extends Application {
  override def start(stage: Stage): Unit = {
    stage.setScene(new Scene(new Group()))
    stage.show()
  }
  
  def launch(args: Array[String]): Unit = {
    Application.launch("", "", "")
  }

  def testOption: Option[Int] = {
    var i: Int = 0
    if ( i == 0) Some( 1 )
    else None
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val app:Main = new Main
    app.launch(args)
    
    val file = app.testOption
    var str:String = null
    file match {
        case Some( f ) => str = "exist! [%d]" format f
        case None  => str = "nothing!"
    }
    println(str)
  }
  
}

