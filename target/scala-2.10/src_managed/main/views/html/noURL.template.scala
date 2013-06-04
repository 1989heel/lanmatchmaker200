
package views.html

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
object noURL extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*2.1*/("""<img src=""""),_display_(Seq[Any](/*2.12*/routes/*2.18*/.Assets.at("/images/404_2.png"))),format.raw/*2.49*/("""">"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:43:59 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/noURL.scala.html
                    HASH: 712371f7848c25d46885bf754ccfcd48374b3bf3
                    MATRIX: 787->2|833->13|847->19|899->50
                    LINES: 29->2|29->2|29->2|29->2
                    -- GENERATED --
                */
            