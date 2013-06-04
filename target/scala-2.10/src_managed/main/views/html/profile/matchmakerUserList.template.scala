
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
object matchmakerUserList extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Matchmaker,Set[Profile],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(matchmaker: Matchmaker, users: Set[Profile]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.47*/("""

<ul>
"""),_display_(Seq[Any](/*4.2*/if(users != null)/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
	"""),_display_(Seq[Any](/*5.3*/users/*5.8*/.map/*5.12*/ { user =>_display_(Seq[Any](format.raw/*5.22*/("""
		<li>
			"""),_display_(Seq[Any](/*7.5*/user/*7.9*/.username)),format.raw/*7.18*/("""
			<a href=""""),_display_(Seq[Any](/*8.14*/routes/*8.20*/.Matchmakers.addUser(matchmaker.getId(), user.username))),format.raw/*8.75*/("""">add</a>
		</li>
	""")))})),format.raw/*10.3*/("""
""")))})),format.raw/*11.2*/("""
</ul>"""))}
    }
    
    def render(matchmaker:Matchmaker,users:Set[Profile]): play.api.templates.Html = apply(matchmaker,users)
    
    def f:((Matchmaker,Set[Profile]) => play.api.templates.Html) = (matchmaker,users) => apply(matchmaker,users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:01 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/profile/matchmakerUserList.scala.html
                    HASH: 40748241a6d07dd32206d6e234d58eb2f35b344c
                    MATRIX: 761->1|883->46|928->57|953->74|992->76|1030->80|1042->85|1054->89|1101->99|1149->113|1160->117|1190->126|1240->141|1254->147|1330->202|1383->224|1417->227
                    LINES: 26->1|29->1|32->4|32->4|32->4|33->5|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|38->10|39->11
                    -- GENERATED --
                */
            