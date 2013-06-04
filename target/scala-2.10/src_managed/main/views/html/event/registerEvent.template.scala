
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
object registerEvent extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Event],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(eventForm: Form[Event]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Skapa ditt event</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Events.validateEventRegistration())/*11.53*/ {_display_(Seq[Any](format.raw/*11.55*/("""
        
        <fieldset>        
            
			"""),_display_(Seq[Any](/*15.5*/inputText(eventForm("name"), '_showConstraints -> false, '_label -> "Namn på eventet", 'placeholder -> "t.ex. Lan1"))),format.raw/*15.121*/("""
			"""),_display_(Seq[Any](/*16.5*/inputText(eventForm("location"), '_label -> "Plats", 'placeholder -> "Vart eventet kommer hållas"))),format.raw/*16.103*/("""
			"""),_display_(Seq[Any](/*17.5*/inputText(eventForm("fee"), '_label -> "Kostnad", 'placeholder -> "t.ex. 100 kr"))),format.raw/*17.86*/("""
			"""),_display_(Seq[Any](/*18.5*/inputText(eventForm("streamUsername"), '_label -> "Stream", 'placeholder -> "Användarnamn på twitch.tv"))),format.raw/*18.109*/("""
            """),_display_(Seq[Any](/*19.14*/inputText(eventForm("start"), '_label -> "Startdatum", 'placeholder -> "YYYY-MM-DD"))),format.raw/*19.98*/("""
            """),_display_(Seq[Any](/*20.14*/inputText(eventForm("end"), '_label -> "Slutdatum", 'placeholder -> "YYYY-MM-DD"))),format.raw/*20.95*/("""
			"""),_display_(Seq[Any](/*21.5*/textarea(eventForm("info"), '_label -> "Om eventet", 'placeholder -> "Lägg till information"))),format.raw/*21.98*/("""

        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Skapa eventet!" class="btn primary"> eller 
            <a href=""""),_display_(Seq[Any](/*27.23*/routes/*27.29*/.Events.list())),format.raw/*27.43*/("""" class="btn warning">Avbryt</a> 
        </div>
        
    """)))})),format.raw/*30.6*/("""
    
""")))})))}
    }
    
    def render(eventForm:Form[Event]): play.api.templates.Html = apply(eventForm)
    
    def f:((Form[Event]) => play.api.templates.Html) = (eventForm) => apply(eventForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:00 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/event/registerEvent.scala.html
                    HASH: 3b4af7b3125c572f4b7cd9db683256224de15518
                    MATRIX: 742->1|852->50|884->74|968->25|998->47|1027->128|1067->134|1078->138|1116->140|1201->190|1257->237|1297->239|1390->297|1529->413|1570->419|1691->517|1732->523|1835->604|1876->610|2003->714|2054->729|2160->813|2211->828|2314->909|2355->915|2470->1008|2679->1181|2694->1187|2730->1201|2827->1267
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|46->18|46->18|47->19|47->19|48->20|48->20|49->21|49->21|55->27|55->27|55->27|58->30
                    -- GENERATED --
                */
            