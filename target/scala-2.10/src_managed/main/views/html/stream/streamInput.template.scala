
package views.html.stream

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
object streamInput extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Stream.streamUser],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(streamUserform: Form[Stream.streamUser]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""
    
	<h2>Enter the twitch username:</h2>
    
		"""),_display_(Seq[Any](/*9.4*/form(action = routes.Stream.stream, args = 'id -> "streamform")/*9.67*/ {_display_(Seq[Any](format.raw/*9.69*/("""
        
        """),_display_(Seq[Any](/*11.10*/inputText(
            field = streamUserform("streamUsername"),
            args = '_label -> "Username", 'placeholder -> "Anonymous"
        ))),format.raw/*14.10*/("""
        
        
        <p class="buttons">
            <input type="submit">
        <p>
		
		
	""")))})),format.raw/*22.3*/("""
 
    
""")))})))}
    }
    
    def render(streamUserform:Form[Stream.streamUser]): play.api.templates.Html = apply(streamUserform)
    
    def f:((Form[Stream.streamUser]) => play.api.templates.Html) = (streamUserform) => apply(streamUserform)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:01 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/stream/streamInput.scala.html
                    HASH: 0dc6c46a448769798f4954aae85061470dd328b1
                    MATRIX: 753->1|888->42|918->64|955->67|966->71|1004->73|1093->128|1164->191|1203->193|1260->214|1429->361|1569->470
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|39->11|42->14|50->22
                    -- GENERATED --
                */
            