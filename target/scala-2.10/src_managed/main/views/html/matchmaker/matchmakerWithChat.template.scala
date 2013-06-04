
package views.html.matchmaker

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
object matchmakerWithChat extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Matchmaker,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(matchmaker: Matchmaker):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.26*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
	"""),_display_(Seq[Any](/*4.3*/matchmaker/*4.13*/.getType())),format.raw/*4.23*/("""
	"""),_display_(Seq[Any](/*5.3*/matchmaker/*5.13*/.value)),format.raw/*5.19*/("""

    <iframe src="""),_display_(Seq[Any](/*7.18*/routes/*7.24*/.Chat.chatRoom(-matchmaker.id))),format.raw/*7.54*/(""" height="310"
            width="100%" style="border: 1px solid #3f3f3f;" scrolling="no"> </iframe>
""")))})))}
    }
    
    def render(matchmaker:Matchmaker): play.api.templates.Html = apply(matchmaker)
    
    def f:((Matchmaker) => play.api.templates.Html) = (matchmaker) => apply(matchmaker)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:01 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/matchmaker/matchmakerWithChat.scala.html
                    HASH: 6f2bcaf6b3558089bfac8b6d2ce15dd8544d8f8e
                    MATRIX: 751->1|852->25|891->30|902->34|940->36|978->40|996->50|1027->60|1065->64|1083->74|1110->80|1166->101|1180->107|1231->137
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|35->7
                    -- GENERATED --
                */
            