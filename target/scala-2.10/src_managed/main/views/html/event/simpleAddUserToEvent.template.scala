
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
object simpleAddUserToEvent extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Events.UserEventPair],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(userForm: Form[Events.UserEventPair]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""


"""),_display_(Seq[Any](/*8.2*/form(action = routes.Events.addUserToEvent, args = 'id -> "AddUserToEventForm")/*8.81*/ {_display_(Seq[Any](format.raw/*8.83*/("""

"""),_display_(Seq[Any](/*10.2*/inputText(
field = userForm("username"),
args = '_label -> "Username", 'placeholder -> "Anonymous"
))),format.raw/*13.2*/("""

"""),_display_(Seq[Any](/*15.2*/inputText(
field = userForm("eventhost"),
args = '_label -> "EventHost", 'placeholder -> "Anonymous"
))),format.raw/*18.2*/("""

<p class="buttons">
    <input type="submit">
<p>


    """)))})),format.raw/*25.6*/("""


""")))})))}
    }
    
    def render(userForm:Form[Events.UserEventPair]): play.api.templates.Html = apply(userForm)
    
    def f:((Form[Events.UserEventPair]) => play.api.templates.Html) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:00 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/event/simpleAddUserToEvent.scala.html
                    HASH: 2b68b084d44d23d271a5e11dc47896331a0855a5
                    MATRIX: 764->1|895->39|923->58|959->60|970->64|1008->66|1046->70|1133->149|1172->151|1210->154|1331->254|1369->257|1492->359|1582->418
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|36->8|36->8|36->8|38->10|41->13|43->15|46->18|53->25
                    -- GENERATED --
                */
            