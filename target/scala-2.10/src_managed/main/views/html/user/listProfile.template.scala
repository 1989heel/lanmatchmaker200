
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
object listProfile extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Profile,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(userProfile: Profile):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.24*/("""

<ul>
"""),_display_(Seq[Any](/*4.2*/if(userProfile != null)/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""
	<li>
		"""),_display_(Seq[Any](/*6.4*/userProfile/*6.15*/.username)),format.raw/*6.24*/("""
	</li>
""")))})),format.raw/*8.2*/("""
</ul>"""))}
    }
    
    def render(userProfile:Profile): play.api.templates.Html = apply(userProfile)
    
    def f:((Profile) => play.api.templates.Html) = (userProfile) => apply(userProfile)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:01 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/user/listProfile.scala.html
                    HASH: a391f9de9e28cb8996fb418ce07cd4b3b0bc3587
                    MATRIX: 735->1|834->23|879->34|910->57|949->59|995->71|1014->82|1044->91|1085->102
                    LINES: 26->1|29->1|32->4|32->4|32->4|34->6|34->6|34->6|36->8
                    -- GENERATED --
                */
            