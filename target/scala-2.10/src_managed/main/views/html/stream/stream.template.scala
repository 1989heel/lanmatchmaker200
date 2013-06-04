
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
object stream extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(streamUsername: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.26*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
	<li>You are now watching """),_display_(Seq[Any](/*4.28*/streamUsername)),format.raw/*4.42*/("""</li>
	<object type="application/x-shockwave-flash" height="378" width="620" id="live_embed_player_flash" data="http://www.twitch.tv/widgets/live_embed_player.swf?channel="""),_display_(Seq[Any](/*5.167*/streamUsername)),format.raw/*5.181*/("""" bgcolor="#000000"><param name="allowFullScreen" value="true" /><param name="allowScriptAccess" value="always" /><param name="allowNetworking" value="all" /><param name="movie" value="http://www.twitch.tv/widgets/live_embed_player.swf" /><param name="flashvars" value="hostname=www.twitch.tv&channel="""),_display_(Seq[Any](/*5.483*/streamUsername)),format.raw/*5.497*/("""&auto_play=true&start_volume=25" /></object><a href="http://www.twitch.tv/"""),_display_(Seq[Any](/*5.572*/streamUsername)),format.raw/*5.586*/("""" class="trk" style="padding:2px 0px 4px; display:block; width:345px; font-weight:normal; font-size:10px; text-decoration:underline; text-align:center;">Watch live video from """),_display_(Seq[Any](/*5.762*/streamUsername)),format.raw/*5.776*/(""" on www.twitch.tv</a>
""")))})))}
    }
    
    def render(streamUsername:String): play.api.templates.Html = apply(streamUsername)
    
    def f:((String) => play.api.templates.Html) = (streamUsername) => apply(streamUsername)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:01 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/stream/stream.scala.html
                    HASH: 2cfd08b684188c92b8b170662b9759740b060a00
                    MATRIX: 731->1|832->25|871->30|882->34|920->36|984->65|1019->79|1228->252|1264->266|1602->568|1638->582|1749->657|1785->671|1997->847|2033->861
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|33->5|33->5|33->5|33->5|33->5|33->5|33->5|33->5
                    -- GENERATED --
                */
            