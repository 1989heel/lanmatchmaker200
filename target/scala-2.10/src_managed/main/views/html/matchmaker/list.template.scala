
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Matchmaker],Set[Profile],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(matchmakers: List[Matchmaker], notAddedUsers: Set[Profile]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.62*/("""

<ul>

"""),_display_(Seq[Any](/*5.2*/matchmakers/*5.13*/.map/*5.17*/ { matchmaker =>_display_(Seq[Any](format.raw/*5.33*/("""
		<li>
		"""),_display_(Seq[Any](/*7.4*/views/*7.9*/.html.matchmaker.item.render(matchmaker, notAddedUsers))),format.raw/*7.64*/("""
		</li>
	
""")))})),format.raw/*10.2*/("""
</ul>
"""))}
    }
    
    def render(matchmakers:List[Matchmaker],notAddedUsers:Set[Profile]): play.api.templates.Html = apply(matchmakers,notAddedUsers)
    
    def f:((List[Matchmaker],Set[Profile]) => play.api.templates.Html) = (matchmakers,notAddedUsers) => apply(matchmakers,notAddedUsers)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:01 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/matchmaker/list.scala.html
                    HASH: a2f622a7d976a67e4ad25c9f7458193421e3449a
                    MATRIX: 756->1|893->61|940->74|959->85|971->89|1024->105|1071->118|1083->123|1159->178|1205->193
                    LINES: 26->1|29->1|33->5|33->5|33->5|33->5|35->7|35->7|35->7|38->10
                    -- GENERATED --
                */
            