
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
object viewEvent extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Event,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(event: Event):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
		<div class="row" style="margin-left: -30px;"> <!--Header-->
			<div class="span7" style="padding-top: 20px; padding-bottom: 20px; padding-right: 10px; -webkit-border-radius: 5px; -moz-border-radius: 5px; border-radius: 5px;
			background-image:-moz-linear-gradient(top,rgb(93, 56, 134),rgb(48, 0, 121));
			background-image:-webkit-gradient(linear,0 0,0 100%,from(rgb(93, 56, 134)),to (rgb(48, 0, 121)));
			background-image:-webkit-linear-gradient(top,rgb(93, 56, 134),rgb(48, 0, 121));
			background-image:-o-linear-gradient(top,rgb(93, 56, 134),rgb(48, 0, 121));
			background-image:linear-gradient(to bottom,rgb(93, 56, 134),rgb(48, 0, 121));">
			
				<div class="span2" style="margin-right: -22px; margin-left: 20px;">
					<img class="img-polaroid" src="/assets/images/"""),_display_(Seq[Any](/*17.53*/event/*17.58*/.picture)),format.raw/*17.66*/("""" width="150" height="100">
					<br>
					"""),_display_(Seq[Any](/*19.7*/if(event.owner.equalsIgnoreCase(session.get("username")))/*19.64*/{_display_(Seq[Any](format.raw/*19.65*/("""
					<center><a href=""""),_display_(Seq[Any](/*20.24*/routes/*20.30*/.Events.imageUpload(event.host))),format.raw/*20.61*/("""" style="color: rgb(148, 130, 185); margin-left: -10px;">Ladda upp bild</a></center>""")))})),format.raw/*20.146*/("""
				</div>
							
				<div class="span3">
					<br>
					<h3 style="line-height: 10px; color: #fff;">"""),_display_(Seq[Any](/*25.51*/event/*25.56*/.name)),format.raw/*25.61*/("""</h3> 
					<h5 style="line-height: 10px; color: #fff;"><i class="icon-map-marker icon-white"></i>"""),_display_(Seq[Any](/*26.93*/event/*26.98*/.location)),format.raw/*26.107*/("""</h5> 
					<p style="color: #fff;">
					Värd: """),_display_(Seq[Any](/*28.13*/event/*28.18*/.owner)),format.raw/*28.24*/("""
					<br>
					Biljettkostnad: """),_display_(Seq[Any](/*30.23*/event/*30.28*/.fee)),format.raw/*30.32*/("""
					</p>
					<p style="color: #fff;">
					Start: """),_display_(Seq[Any](/*33.14*/if(event.start != null)/*33.37*/{_display_(Seq[Any](_display_(Seq[Any](/*33.39*/event/*33.44*/.start.toLocaleString))))}/*33.67*/else/*33.72*/{_display_(Seq[Any](format.raw/*33.73*/(""" obestämt """)))})),format.raw/*33.84*/("""
					<br>
                    Slut: """),_display_(Seq[Any](/*35.28*/if(event.end != null)/*35.49*/{_display_(Seq[Any](_display_(Seq[Any](/*35.51*/event/*35.56*/.end.toLocaleString))))}/*35.77*/else/*35.82*/{_display_(Seq[Any](format.raw/*35.83*/(""" obestämt """)))})),format.raw/*35.94*/("""
					</p>
				</div>
						
				<div class="span2" style="float: right; margin-right: -20px;">
					"""),_display_(Seq[Any](/*40.7*/if(!event.participants.contains(User.find.byId(session().get("username"))))/*40.82*/{_display_(Seq[Any](format.raw/*40.83*/("""
						<a href=""""),_display_(Seq[Any](/*41.17*/routes/*41.23*/.Events.joinEvent(event.host))),format.raw/*41.52*/("""" class="btn">Klicka för att delta</a>
					""")))})),format.raw/*42.7*/("""	
					"""),_display_(Seq[Any](/*43.7*/if(event.participants.contains(User.find.byId(session().get("username"))))/*43.81*/{_display_(Seq[Any](format.raw/*43.82*/("""
						<a href=""""),_display_(Seq[Any](/*44.17*/routes/*44.23*/.Events.exitEvent(event.host))),format.raw/*44.52*/("""" class="btn">Klicka för att gå ur</a>
					""")))})),format.raw/*45.7*/("""					
				</div>				
				
			</div>
		</div>
		"""),_display_(Seq[Any](/*50.4*/if(event.owner.equalsIgnoreCase(session.get("username")))/*50.61*/{_display_(Seq[Any](format.raw/*50.62*/("""
			<a href=""""),_display_(Seq[Any](/*51.14*/routes/*51.20*/.Events.editEvent(event.host))),format.raw/*51.49*/("""" style="float: right;">Redigera event</a>
		""")))})),format.raw/*52.4*/("""
		
		<div class="span7" style="margin-left: 5px; margin-top: 10px;"> <!--Body-->
		
			<div class="tabbable">
  <ul class="nav nav-tabs">
    <li class="active"><a href="#lA" data-toggle="tab">Om eventet</a></li>
	<li><a href="#lB" data-toggle="tab">Chatt</a></li>
	<li><a href="#lC" data-toggle="tab">Streams</a></li>
	
  </ul>
		
			</div>
			
		<div class="tab-content">
	<div class="tab-pane active" id="lA"> <!--tab Om eventet-->
	
	
		
			<div class="span2" style="margin-left: -30px;"> <!--Left part of the body-->
				<div class="span2" style="border: 1px solid #ddd; padding-left: 15px; -webkit-border-radius: 5px; -moz-border-radius: 5px; border-radius: 5px;"> <!--Games field-->
					<h5>Turneringar </h5> <a href="">Spel</a>, <a href="">Spel</a>, <a href="">Spel</a>, <a href="">Spel</a>, <a href="">Spel</a>, <a href="">Spel</a>, <a href="">Spel</a>, <a href="">Spel</a>, <a href="">Spel</a>, <a href="">Spel</a>, <a href="">Spel</a>, <a href="">Spel</a>, 
					<br><br>
				</div>
				<br>
				<div class="span2" style="border: 1px solid #ddd; margin-top: 10px; padding-left: 15px; -webkit-border-radius: 5px; -moz-border-radius: 5px; border-radius: 5px;"> <!--Friends field-->
					<h5>Deltagare </h5>
					<ul class ="thumbnails" style="padding-left: 20px;">
						"""),_display_(Seq[Any](/*80.8*/for(member <- event.participants) yield /*80.41*/ {_display_(Seq[Any](format.raw/*80.43*/("""
							<li class ="thumbnails" style="margin-bottom: 5px; margin-left: 5px;">						
								<a href=""""),_display_(Seq[Any](/*82.19*/routes/*82.25*/.Profiles.profile(member.username))),format.raw/*82.59*/("""" class="thumbnail">
							
						<img src="/assets/images/"""),_display_(Seq[Any](/*84.33*/Profile/*84.40*/.find.where().eq("username", member.getUserName()).findUnique().picture)),format.raw/*84.111*/("""" width="50" height="50">
										
									
								</a>
							</li>
						""")))})),format.raw/*89.8*/("""
					</ul>
				</div>
			</div>
			
			<div class="span4" style="margin-left: 30px;"> <!--Right part of the body-->
				<div class="span4" style="margin-right: -30px; margin-left: 25px; padding-left: 15px; border: 1px solid #ddd; -webkit-border-radius: 5px; -moz-border-radius: 5px; border-radius: 5px; padding-right: -50px;">
					<h5>Om eventet</h5>
						<p>"""),_display_(Seq[Any](/*97.11*/event/*97.16*/.info)),format.raw/*97.21*/("""</p>
				</div>
			</div>
	
	</div> <!-- slut på tab om event-->
	
	<div class="tab-pane" id="lB"> <!--tab Chatt-->
	
	<div class="span7" style="margin-left: -20px; padding-left: 20px;"> 
	"""),_display_(Seq[Any](/*106.3*/if(session().get("username") != null)/*106.40*/ {_display_(Seq[Any](format.raw/*106.42*/("""
            """),_display_(Seq[Any](/*107.14*/if(event.participantsContains(session().get("username")))/*107.71*/{_display_(Seq[Any](format.raw/*107.72*/("""
            <iframe src="""),_display_(Seq[Any](/*108.26*/routes/*108.32*/.Chat.chatRoom(event.host))),format.raw/*108.58*/(""" height="310"
                    width="554" scrolling="no"> </iframe>
					
            """)))}/*111.15*/else/*111.19*/{_display_(Seq[Any](format.raw/*111.20*/(""" <p> Du måste vara med i eventet för att se chatten</p>""")))})),format.raw/*111.76*/("""
        """)))})),format.raw/*112.10*/("""
	</div>
	
	</div> <!-- slut på tab Chatt-->
	
	
	<div class="tab-pane" id="lC"> <!--tab Stream-->
	
	<div class="span7" style="margin-left: -20px; padding-left: 20px;">
	
	<object type="application/x-shockwave-flash" height="378" width="620" id="live_embed_player_flash" data="http://www.twitch.tv/widgets/live_embed_player.swf?channel="""),_display_(Seq[Any](/*122.167*/event/*122.172*/.streamUsername)),format.raw/*122.187*/("""" bgcolor="#000000"><param name="allowFullScreen" value="true" /><param name="allowScriptAccess" value="always" /><param name="allowNetworking" value="all" /><param name="movie" value="http://www.twitch.tv/widgets/live_embed_player.swf" /><param name="flashvars" value="hostname=www.twitch.tv&channel="""),_display_(Seq[Any](/*122.489*/event/*122.494*/.streamUsername)),format.raw/*122.509*/("""&auto_play=true&start_volume=25" /></object><a href="http://www.twitch.tv/"""),_display_(Seq[Any](/*122.584*/event/*122.589*/.streamUsername)),format.raw/*122.604*/("""" class="trk" style="padding:2px 0px 4px; display:block; width:345px; font-weight:normal; font-size:10px; text-decoration:underline; text-align:center;">Watch live video from """),_display_(Seq[Any](/*122.780*/event/*122.785*/.streamUsername)),format.raw/*122.800*/(""" on www.twitch.tv</a>
	
	
	</div>
	
	</div> <!-- slut på tab Stream-->
		</div>
		
		</div>
""")))})))}
    }
    
    def render(event:Event): play.api.templates.Html = apply(event)
    
    def f:((Event) => play.api.templates.Html) = (event) => apply(event)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:00 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/event/viewEvent.scala.html
                    HASH: 40c0cdd65d67f14bbd5936de087a1300909740c9
                    MATRIX: 732->1|832->40|864->64|948->15|978->37|1007->118|1046->123|1057->127|1095->129|1921->919|1935->924|1965->932|2046->978|2112->1035|2151->1036|2212->1061|2227->1067|2280->1098|2398->1183|2543->1292|2557->1297|2584->1302|2720->1402|2734->1407|2766->1416|2853->1467|2867->1472|2895->1478|2966->1513|2980->1518|3006->1522|3099->1579|3131->1602|3179->1604|3193->1609|3228->1632|3241->1637|3280->1638|3323->1649|3399->1689|3429->1710|3477->1712|3491->1717|3524->1738|3537->1743|3576->1744|3619->1755|3761->1862|3845->1937|3884->1938|3938->1956|3953->1962|4004->1991|4081->2037|4125->2046|4208->2120|4247->2121|4301->2139|4316->2145|4367->2174|4444->2220|4532->2273|4598->2330|4637->2331|4688->2346|4703->2352|4754->2381|4832->2428|6178->3739|6227->3772|6267->3774|6408->3879|6423->3885|6479->3919|6578->3982|6594->3989|6688->4060|6804->4145|7211->4516|7225->4521|7252->4526|7487->4725|7534->4762|7575->4764|7627->4779|7694->4836|7734->4837|7798->4864|7814->4870|7863->4896|7977->4991|7991->4995|8031->4996|8120->5052|8164->5063|8550->5411|8566->5416|8605->5431|8945->5733|8961->5738|9000->5753|9113->5828|9129->5833|9168->5848|9382->6024|9398->6029|9437->6044
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|45->17|45->17|45->17|47->19|47->19|47->19|48->20|48->20|48->20|48->20|53->25|53->25|53->25|54->26|54->26|54->26|56->28|56->28|56->28|58->30|58->30|58->30|61->33|61->33|61->33|61->33|61->33|61->33|61->33|61->33|63->35|63->35|63->35|63->35|63->35|63->35|63->35|63->35|68->40|68->40|68->40|69->41|69->41|69->41|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|78->50|78->50|78->50|79->51|79->51|79->51|80->52|108->80|108->80|108->80|110->82|110->82|110->82|112->84|112->84|112->84|117->89|125->97|125->97|125->97|134->106|134->106|134->106|135->107|135->107|135->107|136->108|136->108|136->108|139->111|139->111|139->111|139->111|140->112|150->122|150->122|150->122|150->122|150->122|150->122|150->122|150->122|150->122|150->122|150->122|150->122
                    -- GENERATED --
                */
            