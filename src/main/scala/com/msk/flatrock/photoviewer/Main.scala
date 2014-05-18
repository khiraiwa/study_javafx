package com.msk.flatrock.photoviewer

import javafx.application._
import javafx.stage._
import javafx.scene.layout._
import javafx.scene.control._
import javafx.scene.layout._
import javafx.scene._
import javafx.scene.paint._

class Main extends Application {
  override def init:Unit = {
    println("called init()")
  }

  override def start(mainStage: Stage): Unit = {
    println("called start()")
    val center: Button = new Button("center")

    val controllPane: FlowPane = FlowPaneBuilder.create()
        .children(new Button("aaa"), new Button("cccc")).asInstanceOf[FlowPaneBuilder[_]]
        .build()

    val rootPane:BorderPane = BorderPaneBuilder.create()
        .center(center).asInstanceOf[BorderPaneBuilder[_]]
        .bottom(controllPane).asInstanceOf[BorderPaneBuilder[_]]
        .build()
    
    val scene: Scene = SceneBuilder.create()
        .root(rootPane).asInstanceOf[SceneBuilder[_]]
        .fill(Color.AQUA).asInstanceOf[SceneBuilder[_]]
        .build()

    mainStage.setScene(scene)
    mainStage.setTitle("Main")
    mainStage.setX(100)
    mainStage.setY(100)
    mainStage.setWidth(900)
    mainStage.setHeight(800)
    mainStage.setOpacity(0.8)
    mainStage.show()
  }

  override def stop: Unit = {
    println("called stop")
  }

  def launch(args: Array[String]): Unit = {
    Application.launch("", "","")
  }
}

object Main {
  def main(args:Array[String]): Unit = {
    val main:Main = new Main()
    main.launch(args)
  }
}