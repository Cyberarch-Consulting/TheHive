package org.thp.thehive.connector.cortex.controllers.v0

import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter
import play.api.routing.sird._

import javax.inject.{Inject, Singleton}

@Singleton
class Router @Inject()(jobCtrl: JobCtrl, analyzerCtrl: AnalyzerCtrl, actionCtrl: ActionCtrl) extends SimpleRouter {
  override def routes: Routes = {
    case GET(p"/job")          ⇒ jobCtrl.search
    case POST(p"/job/_search") ⇒ jobCtrl.search

    case GET(p"/analyzer")        ⇒ analyzerCtrl.list
    case POST(p"/action/_search") ⇒ actionCtrl.list
  }
}
