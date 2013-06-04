
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
object editEvent extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Event],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, eventForm: Form[Event]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Redigera ditt event</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Events.updateEvent(id))/*11.41*/ {_display_(Seq[Any](format.raw/*11.43*/("""
        
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
            <input type="submit" value="Uppdatera" class="btn primary"> 
            <a href=""""),_display_(Seq[Any](/*27.23*/routes/*27.29*/.Events.list())),format.raw/*27.43*/("""" class="btn">Avbryt</a> 
        </div>
        
    """)))})),format.raw/*30.6*/("""
    
""")))})))}
    }
    
    def render(id:Long,eventForm:Form[Event]): play.api.templates.Html = apply(id,eventForm)
    
    def f:((Long,Form[Event]) => play.api.templates.Html) = (id,eventForm) => apply(id,eventForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:00 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/event/editEvent.scala.html
                    HASH: 8716e10957638eebd2b0a9a34fc8038002bd4468
                    MATRIX: 743->1|863->60|895->84|979->35|1009->57|1038->138|1078->144|1089->148|1127->150|1215->203|1259->238|1299->240|1380->286|1519->402|1560->408|1681->506|1722->512|1825->593|1866->599|1993->703|2044->718|2150->802|2201->817|2304->898|2345->904|2460->997|2661->1162|2676->1168|2712->1182|2801->1240
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|46->18|46->18|47->19|47->19|48->20|48->20|49->21|49->21|55->27|55->27|55->27|58->30
                    -- GENERATED --
                */
            