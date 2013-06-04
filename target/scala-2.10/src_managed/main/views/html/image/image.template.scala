
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
object image extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(fileName: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""


"""),_display_(Seq[Any](/*4.2*/main/*4.6*/ {_display_(Seq[Any](format.raw/*4.8*/("""
    
    <h1>Here is the result:</h1>
            <img src="/assets/images/"""),_display_(Seq[Any](/*7.39*/fileName)),format.raw/*7.47*/("""">
        
   
    
""")))})))}
    }
    
    def render(fileName:String): play.api.templates.Html = apply(fileName)
    
    def f:((String) => play.api.templates.Html) = (fileName) => apply(fileName)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:01 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/image/image.scala.html
                    HASH: 902da31c7b99cc29e0f65c7127d7baa02528163d
                    MATRIX: 729->1|824->19|862->23|873->27|911->29|1023->106|1052->114
                    LINES: 26->1|29->1|32->4|32->4|32->4|35->7|35->7
                    -- GENERATED --
                */
            