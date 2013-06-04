
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
object item extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Matchmaker,Set[Profile],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(matchmaker: Matchmaker, notAddedUsers: Set[Profile]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.55*/("""

"""),_display_(Seq[Any](/*3.2*/matchmaker/*3.12*/.getType())),format.raw/*3.22*/("""
"""),_display_(Seq[Any](/*4.2*/matchmaker/*4.12*/.value)),format.raw/*4.18*/("""

<h3>Added users:</h3>
"""),_display_(Seq[Any](/*7.2*/views/*7.7*/.html.profile.list.render(matchmaker.users))),format.raw/*7.50*/("""

<a href=""""),_display_(Seq[Any](/*9.11*/routes/*9.17*/.Matchmakers.matchmake(matchmaker.getId()))),format.raw/*9.59*/("""" class="btn">Matchmake</a>
	
<h3>Not added users:</h3>
"""),_display_(Seq[Any](/*12.2*/views/*12.7*/.html.profile.matchmakerUserList.render(matchmaker, notAddedUsers))))}
    }
    
    def render(matchmaker:Matchmaker,notAddedUsers:Set[Profile]): play.api.templates.Html = apply(matchmaker,notAddedUsers)
    
    def f:((Matchmaker,Set[Profile]) => play.api.templates.Html) = (matchmaker,notAddedUsers) => apply(matchmaker,notAddedUsers)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:01 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/matchmaker/item.scala.html
                    HASH: 1b0995b1a40c77485a5ab06a0a8b5db8e75b1aba
                    MATRIX: 750->1|880->54|919->59|937->69|968->79|1005->82|1023->92|1050->98|1112->126|1124->131|1188->174|1237->188|1251->194|1314->236|1409->296|1422->301
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12
                    -- GENERATED --
                */
            