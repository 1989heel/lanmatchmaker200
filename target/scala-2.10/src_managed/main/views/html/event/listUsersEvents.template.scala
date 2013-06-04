
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
object listUsersEvents extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Event],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(events: List[Event]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""

<html>
<ul>
    """),_display_(Seq[Any](/*5.6*/for(e <- events) yield /*5.22*/{_display_(Seq[Any](format.raw/*5.23*/("""
    <li> <a href=" """),_display_(Seq[Any](/*6.21*/routes/*6.27*/.Events.showEvent(e.host))),format.raw/*6.52*/("""">"""),_display_(Seq[Any](/*6.55*/e/*6.56*/.host)),format.raw/*6.61*/("""</a></li>
    """)))})),format.raw/*7.6*/("""
</ul>

</html>"""))}
    }
    
    def render(events:List[Event]): play.api.templates.Html = apply(events)
    
    def f:((List[Event]) => play.api.templates.Html) = (events) => apply(events)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:00 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/event/listUsersEvents.scala.html
                    HASH: c07f501f38701e5e906b35e06d453e50c6186859
                    MATRIX: 744->1|842->22|895->41|926->57|964->58|1020->79|1034->85|1080->110|1118->113|1127->114|1153->119|1198->134
                    LINES: 26->1|29->1|33->5|33->5|33->5|34->6|34->6|34->6|34->6|34->6|34->6|35->7
                    -- GENERATED --
                */
            