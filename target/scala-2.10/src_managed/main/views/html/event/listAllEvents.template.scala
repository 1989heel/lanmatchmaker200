
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
object listAllEvents extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Event,List[Event],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(events: Event, lists: List[Event]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""

<li>
TODO
</li>"""))}
    }
    
    def render(events:Event,lists:List[Event]): play.api.templates.Html = apply(events,lists)
    
    def f:((Event,List[Event]) => play.api.templates.Html) = (events,lists) => apply(events,lists)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:00 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/event/listAllEvents.scala.html
                    HASH: 75795d5f0d9beb8d180c00fe2e89a358406af963
                    MATRIX: 748->1|860->36
                    LINES: 26->1|29->1
                    -- GENERATED --
                */
            