
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
object tempLogin extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {import helper._

def /*5.2*/tempLogin/*5.11*/(loginForm: Form[Users.Login]):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*5.45*/("""
	<h1>Welcome. Please, log in.</h1>
    
    """),_display_(Seq[Any](/*8.6*/form(routes.Users.authenticate())/*8.39*/ {_display_(Seq[Any](format.raw/*8.41*/("""
        
        <fieldset>
        
            """),_display_(Seq[Any](/*12.14*/inputText(loginForm("userName"), '_label -> "Username"))),format.raw/*12.69*/("""
			"""),_display_(Seq[Any](/*13.5*/inputPassword(loginForm("password"), '_label -> "Password"))),format.raw/*13.64*/("""

        </fieldset>
        
        """),_display_(Seq[Any](/*17.10*/if(loginForm.hasGlobalErrors)/*17.39*/ {_display_(Seq[Any](format.raw/*17.41*/("""
        	<p class="error">"""),_display_(Seq[Any](/*18.28*/loginForm/*18.37*/.globalError.message)),format.raw/*18.57*/("""</p>
        """)))})),format.raw/*19.10*/("""
            
        """),_display_(Seq[Any](/*21.10*/if(flash.contains("success"))/*21.39*/ {_display_(Seq[Any](format.raw/*21.41*/("""
        	<p class="success">"""),_display_(Seq[Any](/*22.30*/flash/*22.35*/.get("success"))),format.raw/*22.50*/("""</p>
        """)))})),format.raw/*23.10*/("""
        
        <div class="actions">
            <input type="submit" value="Login" class="btn primary"> 
        </div>
        
    """)))})),format.raw/*29.6*/("""
""")))};implicit def /*1.2*/implicitFieldConstructor/*1.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.80*/("""

"""),format.raw/*4.1*/("""
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:02 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/user/tempLogin.scala.html
                    HASH: 7bd7533202f66de82df7d85e15631e6a88516626
                    MATRIX: 797->104|814->113|911->147|994->196|1035->229|1074->231|1165->286|1242->341|1283->347|1364->406|1444->450|1482->479|1522->481|1587->510|1605->519|1647->539|1694->554|1755->579|1793->608|1833->610|1900->641|1914->646|1951->661|1998->676|2173->820|2207->1|2239->25|2323->79|2353->101
                    LINES: 29->5|29->5|31->5|34->8|34->8|34->8|38->12|38->12|39->13|39->13|43->17|43->17|43->17|44->18|44->18|44->18|45->19|47->21|47->21|47->21|48->22|48->22|48->22|49->23|55->29|56->1|56->1|57->1|59->4
                    -- GENERATED --
                */
            