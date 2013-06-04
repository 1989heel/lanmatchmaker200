
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
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Users.Login],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(loginForm: Form[Users.Login]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

<h1>Logga in</h1>

"""),_display_(Seq[Any](/*9.2*/form(routes.Users.authenticate())/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""
    
    <fieldset>
    
        """),_display_(Seq[Any](/*13.10*/inputText(loginForm("username"), '_label -> " ", 'placeholder -> "Användarnamn"))),format.raw/*13.90*/("""
		"""),_display_(Seq[Any](/*14.4*/inputPassword(loginForm("password"), '_label -> " ", 'placeholder -> "Lösenord"))),format.raw/*14.84*/("""

    </fieldset>
    
    """),_display_(Seq[Any](/*18.6*/if(loginForm.hasGlobalErrors)/*18.35*/ {_display_(Seq[Any](format.raw/*18.37*/("""
    	<p class="error">"""),_display_(Seq[Any](/*19.24*/loginForm/*19.33*/.globalError.message)),format.raw/*19.53*/("""</p>
    """)))})),format.raw/*20.6*/("""
        
    """),_display_(Seq[Any](/*22.6*/if(flash.contains("success"))/*22.35*/ {_display_(Seq[Any](format.raw/*22.37*/("""
    	<p class="success">"""),_display_(Seq[Any](/*23.26*/flash/*23.31*/.get("success"))),format.raw/*23.46*/("""</p>
    """)))})),format.raw/*24.6*/("""
    
    <div class="actions">
        <input type="submit" value="Logga in" class="btn primary"> 
    </div>
    
""")))})))}
    }
    
    def render(loginForm:Form[Users.Login]): play.api.templates.Html = apply(loginForm)
    
    def f:((Form[Users.Login]) => play.api.templates.Html) = (loginForm) => apply(loginForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:02 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/user/login.scala.html
                    HASH: e3616a4cba20890d763ceb929aed9d6181ee931d
                    MATRIX: 739->1|855->56|887->80|971->31|1001->53|1030->134|1091->161|1132->194|1171->196|1246->235|1348->315|1388->320|1490->400|1557->432|1595->461|1635->463|1696->488|1714->497|1756->517|1798->528|1850->545|1888->574|1928->576|1991->603|2005->608|2042->623|2084->634
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|37->9|37->9|37->9|41->13|41->13|42->14|42->14|46->18|46->18|46->18|47->19|47->19|47->19|48->20|50->22|50->22|50->22|51->23|51->23|51->23|52->24
                    -- GENERATED --
                */
            