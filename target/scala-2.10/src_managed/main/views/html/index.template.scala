
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Html,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(login: Html, register: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.31*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
	<div class="span12" style="margin-left: -90px;">
		<div class="row" style="margin-left: -155px;">
			<div class="span3" style="padding-left: 50px;">
				"""),_display_(Seq[Any](/*7.6*/login)),format.raw/*7.11*/("""
			</div>
			<div class="span6" style="margin-left: 115px; margin-top: 80px;">
	     		<img src=""""),_display_(Seq[Any](/*10.20*/routes/*10.26*/.Assets.at("img/logotype_startpage.png"))),format.raw/*10.66*/("""">
	     	</div>
	
			</div>
		</div>		
		
		<div class="span9" style="text-align: center; margin-left: -30px;">
			<br><br><br>
			<hr>
			"""),_display_(Seq[Any](/*19.5*/register)),format.raw/*19.13*/("""
		</div>
	</div>
""")))})),format.raw/*22.2*/("""
"""))}
    }
    
    def render(login:Html,register:Html): play.api.templates.Html = apply(login,register)
    
    def f:((Html,Html) => play.api.templates.Html) = (login,register) => apply(login,register)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:43:59 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/index.scala.html
                    HASH: 9554e8d7021167efd230392d050213de56600307
                    MATRIX: 726->1|832->30|869->33|880->37|918->39|1108->195|1134->200|1269->299|1284->305|1346->345|1522->486|1552->494|1602->513
                    LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|38->10|38->10|38->10|47->19|47->19|50->22
                    -- GENERATED --
                */
            