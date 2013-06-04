
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
object temporaryHomePage extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""
		<br>
		"""),_display_(Seq[Any](/*3.4*/if(flash.contains("success"))/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
    	<div class="alert alert-success">"""),_display_(Seq[Any](/*4.40*/flash/*4.45*/.get("success"))),format.raw/*4.60*/("""</div>
    """)))})),format.raw/*5.6*/("""
		<div style="margin-left: 80px;">
		<a class="twitter-timeline" width="520" height="800" href="https://twitter.com/LanMatchmaker2K/progamers" data-widget-id="336771636160237568">Tweets from @LanMatchmaker2K/progamers</a>
<script>!function(d,s,id)"""),format.raw/*8.26*/("""{"""),format.raw/*8.27*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id))"""),format.raw/*8.135*/("""{"""),format.raw/*8.136*/("""js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*8.249*/("""}"""),format.raw/*8.250*/("""}"""),format.raw/*8.251*/("""(document,"script","twitter-wjs");</script>
		</div>

""")))})))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:00 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/temporaryHomePage.scala.html
                    HASH: ece399e6165a25be5b332e0035f82bf66420c6c6
                    MATRIX: 808->1|819->5|857->7|904->20|941->49|980->51|1056->92|1069->97|1105->112|1148->125|1426->377|1454->378|1590->486|1619->487|1760->600|1789->601|1818->602
                    LINES: 29->1|29->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|33->5|36->8|36->8|36->8|36->8|36->8|36->8|36->8
                    -- GENERATED --
                */
            