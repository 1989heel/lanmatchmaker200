
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
object register extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(userForm: Form[User]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 


<br>
<h1>Gå med idag. Det är gratis!</h1>

"""),_display_(Seq[Any](/*11.2*/if(flash.contains("error"))/*11.29*/ {_display_(Seq[Any](format.raw/*11.31*/("""
	<p class="error">"""),_display_(Seq[Any](/*12.20*/flash/*12.25*/.get("error"))),format.raw/*12.38*/("""</p>
""")))})),format.raw/*13.2*/("""
"""),_display_(Seq[Any](/*14.2*/if(flash.contains("successRegister"))/*14.39*/{_display_(Seq[Any](format.raw/*14.40*/("""
	<p class="success">"""),_display_(Seq[Any](/*15.22*/flash/*15.27*/.get("successRegister"))),format.raw/*15.50*/("""</p>
""")))})),format.raw/*16.2*/("""

"""),_display_(Seq[Any](/*18.2*/form(routes.Users.validateRegistration())/*18.43*/ {_display_(Seq[Any](format.raw/*18.45*/("""

    <fieldset>
    
        """),_display_(Seq[Any](/*22.10*/inputText(userForm("username"), '_label -> " ", '_showConstraints -> false, 'placeholder -> "Användarnamn"))),format.raw/*22.117*/("""
        """),_display_(Seq[Any](/*23.10*/inputText(userForm("email"), '_label -> " ", '_showConstraints -> false, 'placeholder -> "Email"))),format.raw/*23.107*/("""
        """),_display_(Seq[Any](/*24.10*/inputPassword(userForm("password"), '_label -> " ", '_showConstraints -> false, 'placeholder -> "Lösenord"))),format.raw/*24.117*/("""
        
    </fieldset>
	
	
    
    <div class="actions">
        <input type="submit" value="Skapa konto" class="btn btn-large btn-inverse">
    </div>
    <br>

""")))})))}
    }
    
    def render(userForm:Form[User]): play.api.templates.Html = apply(userForm)
    
    def f:((Form[User]) => play.api.templates.Html) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:02 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/user/register.scala.html
                    HASH: 90defcf7a1a631eefbbce7a5065547d04e2fdfb3
                    MATRIX: 735->1|843->48|875->72|959->23|989->45|1018->126|1107->180|1143->207|1183->209|1240->230|1254->235|1289->248|1327->255|1365->258|1411->295|1450->296|1509->319|1523->324|1568->347|1606->354|1646->359|1696->400|1736->402|1807->437|1937->544|1984->555|2104->652|2151->663|2281->770
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|39->11|39->11|39->11|40->12|40->12|40->12|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|46->18|46->18|46->18|50->22|50->22|51->23|51->23|52->24|52->24
                    -- GENERATED --
                */
            