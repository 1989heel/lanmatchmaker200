
package views.html.event

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object eventProfile extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Event,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(event: Event):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""


"""),_display_(Seq[Any](/*4.2*/main/*4.6*/{_display_(Seq[Any](format.raw/*4.7*/("""
<html>
    <iframe src="""),_display_(Seq[Any](/*6.18*/routes/*6.24*/.Chat.chatRoom(event.host))),format.raw/*6.50*/(""" height="310"
    width="554" scrolling="no"> </iframe>
</html>
""")))})))}
    }
    
    def render(event:Event): play.api.templates.Html = apply(event)
    
    def f:((Event) => play.api.templates.Html) = (event) => apply(event)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:00 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/event/eventProfile.scala.html
                    HASH: 3a9dc9ba63558ad9125aeda4eb3f6ec9e7b72cd6
                    MATRIX: 735->1|826->15|864->19|875->23|912->24|972->49|986->55|1033->81
                    LINES: 26->1|29->1|32->4|32->4|32->4|34->6|34->6|34->6
                    -- GENERATED --
                */
            