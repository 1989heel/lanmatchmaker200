
package views.html.image

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
object imageUploadEvent extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Long,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id:Long):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.11*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main/*4.6*/ {_display_(Seq[Any](format.raw/*4.8*/("""
    <h1>Ladda upp en bild för eventet</h1>
		
 """),_display_(Seq[Any](/*7.3*/form(action = routes.Upload.uploadEvent(id:Long), 'enctype -> "multipart/form-data")/*7.87*/ {_display_(Seq[Any](format.raw/*7.89*/("""
    
    <input type="file" name="picture">
    
	
	
    <p>
        <input type="submit" value="Ladda upp" class="btn primary"> eller 
            <a href=""""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Events.viewEvent(id))),format.raw/*15.50*/("""" class="btn primary">Avbryt</a> 
    </p>
    
""")))})),format.raw/*18.2*/("""
    
""")))})))}
    }
    
    def render(id:Long): play.api.templates.Html = apply(id)
    
    def f:((Long) => play.api.templates.Html) = (id) => apply(id)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:01 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/image/imageUploadEvent.scala.html
                    HASH: 3bf9361c58ad3fbbc9947c6617fe5657ff91b871
                    MATRIX: 738->1|841->10|869->30|906->33|917->37|955->39|1041->91|1133->175|1172->177|1375->344|1390->350|1433->371|1516->423
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|43->15|43->15|43->15|46->18
                    -- GENERATED --
                */
            