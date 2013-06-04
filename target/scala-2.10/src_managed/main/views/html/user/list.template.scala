
package views.html.user

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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Set[User],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(users: Set[User]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

<ul>
"""),_display_(Seq[Any](/*4.2*/if(users != null)/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
	"""),_display_(Seq[Any](/*5.3*/users/*5.8*/.map/*5.12*/ { user =>_display_(Seq[Any](format.raw/*5.22*/("""
		<li>
			"""),_display_(Seq[Any](/*7.5*/user/*7.9*/.username)),format.raw/*7.18*/("""
		</li>
	""")))})),format.raw/*9.3*/("""
""")))})),format.raw/*10.2*/("""
</ul>"""))}
    }
    
    def render(users:Set[User]): play.api.templates.Html = apply(users)
    
    def f:((Set[User]) => play.api.templates.Html) = (users) => apply(users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:01 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/user/list.scala.html
                    HASH: b0e687a996e8f1422fd3a266e8c70cb5623bea68
                    MATRIX: 730->1|825->19|870->30|895->47|934->49|972->53|984->58|996->62|1043->72|1091->86|1102->90|1132->99|1175->112|1209->115
                    LINES: 26->1|29->1|32->4|32->4|32->4|33->5|33->5|33->5|33->5|35->7|35->7|35->7|37->9|38->10
                    -- GENERATED --
                */
            