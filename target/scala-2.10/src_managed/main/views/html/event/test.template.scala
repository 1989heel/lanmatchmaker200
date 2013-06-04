
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
object test extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Event,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(event: Event):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
	<li>Hostname: """),_display_(Seq[Any](/*4.17*/event/*4.22*/.host)),format.raw/*4.27*/(""" </li>
""")))})))}
    }
    
    def render(event:Event): play.api.templates.Html = apply(event)
    
    def f:((Event) => play.api.templates.Html) = (event) => apply(event)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:00 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/event/test.scala.html
                    HASH: 52c373b1b1d0faeb6acd7aec386fecd92f80d6f5
                    MATRIX: 727->1|818->15|857->20|868->24|906->26|959->44|972->49|998->54
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4
                    -- GENERATED --
                */
            