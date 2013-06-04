
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
object imageUpload extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""
"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
    <h1>Ladda upp en profilbild</h1>
		
 """),_display_(Seq[Any](/*6.3*/form(action = routes.Upload.upload, 'enctype -> "multipart/form-data")/*6.73*/ {_display_(Seq[Any](format.raw/*6.75*/("""
    
    <input type="file" name="picture">
    
    <p>
        <input type="submit" value="Ladda bild" class="btn primary"> eller 
            <a href=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Profiles.profile(session().get("username")))),format.raw/*12.73*/("""" class="btn primary">Avbryt</a> 
    </p>
    
""")))})),format.raw/*15.2*/("""
    
""")))})))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:01 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/image/imageUpload.scala.html
                    HASH: d6a6f384659d59d021eed490165b4eae28cdcf3b
                    MATRIX: 816->18|853->21|864->25|902->27|982->73|1060->143|1099->145|1297->307|1312->313|1378->357|1461->409
                    LINES: 30->2|31->3|31->3|31->3|34->6|34->6|34->6|40->12|40->12|40->12|43->15
                    -- GENERATED --
                */
            