package com.msk.flatrock

import javafx.application._
import javafx.stage._
import javafx.scene._
import javafx.scene.layout._
import javafx.scene.paint._
import javafx.scene.control._

class Main extends Application {

  /**
   * start()より前に呼ばれる
   */
  override def init {
    println("called init()")
  }

  /**
   * init()の後に呼ばれる
   */
  override def start(stage: Stage): Unit = {
    println("called start()")
    val root:FlowPane = FlowPaneBuilder.create()
        .children(new Button("aaa"), new Button("cccc")).asInstanceOf[FlowPaneBuilder[_]]
        .build()

    val scene: Scene = SceneBuilder.create()
        .root(root).asInstanceOf[SceneBuilder[_]]
        .fill(Color.AQUA).asInstanceOf[SceneBuilder[_]]
        .build()

    stage.setScene(scene)
    stage.setTitle("Main")
    stage.setX(100)
    stage.setY(100)
    stage.setWidth(900)
    stage.setHeight(800)
    stage.setOpacity(0.8)
    stage.show()
  }

  override def stop {
    println("called stop()")
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
    println(System.getProperties().get("javafx.runtime.version"))
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

