
package views.html.profile

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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Set[Profile],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(profiles: Set[Profile]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.26*/("""

<ul>
"""),_display_(Seq[Any](/*4.2*/if(profiles != null)/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
	"""),_display_(Seq[Any](/*5.3*/profiles/*5.11*/.map/*5.15*/ { profile =>_display_(Seq[Any](format.raw/*5.28*/("""
		<li>
			"""),_display_(Seq[Any](/*7.5*/profile/*7.12*/.username)),format.raw/*7.21*/("""
		</li>
	""")))})),format.raw/*9.3*/("""
""")))})),format.raw/*10.2*/("""
</ul>"""))}
    }
    
    def render(profiles:Set[Profile]): play.api.templates.Html = apply(profiles)
    
    def f:((Set[Profile]) => play.api.templates.Html) = (profiles) => apply(profiles)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:01 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/profile/list.scala.html
                    HASH: fb74e7998ce13ef9130f5333661894ebaa7270b2
                    MATRIX: 736->1|837->25|882->36|910->56|949->58|987->62|1003->70|1015->74|1065->87|1113->101|1128->108|1158->117|1201->130|1235->133
                    LINES: 26->1|29->1|32->4|32->4|32->4|33->5|33->5|33->5|33->5|35->7|35->7|35->7|37->9|38->10
                    -- GENERATED --
                */
            