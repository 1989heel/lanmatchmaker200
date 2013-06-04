
package views.html.chat

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
object chatError extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*2.1*/("""<head> 
<title> Chat Error </title>
 <link rel="stylesheet" href=""""),_display_(Seq[Any](/*4.32*/routes/*4.38*/.Assets.at("stylesheets/chatBootstrap.css"))),format.raw/*4.81*/("""">
</head>
    """),_display_(Seq[Any](/*6.6*/if(flash.containsKey("error"))/*6.36*/ {_display_(Seq[Any](format.raw/*6.38*/("""        
        <div class="alert-message error">
            <p>
                """),_display_(Seq[Any](/*9.18*/flash/*9.23*/.get("error"))),format.raw/*9.36*/("""
            </p>
        </div>
    """)))})),format.raw/*12.6*/("""
  
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:00 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/chat/chatError.scala.html
                    HASH: 5753dc1c99a3bcf7dd1716747963cd62f7f14588
                    MATRIX: 796->1|898->68|912->74|976->117|1026->133|1064->163|1103->165|1222->249|1235->254|1269->267|1338->305
                    LINES: 29->2|31->4|31->4|31->4|33->6|33->6|33->6|36->9|36->9|36->9|39->12
                    -- GENERATED --
                */
            