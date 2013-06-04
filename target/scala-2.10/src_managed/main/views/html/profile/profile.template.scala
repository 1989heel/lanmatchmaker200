
package views.html.profile

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
object profile extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Profile,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(profil: Profile):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
	<div class="row" style="margin-left: -30px;"> <!--Header-->
		<div class="span7" style="padding-top: 20px; padding-bottom: 20px; padding-right: 10px; -webkit-border-radius: 5px; -moz-border-radius: 5px; border-radius: 5px;
		background-image:-moz-linear-gradient(top,rgb(93, 56, 134),rgb(48, 0, 121));
		background-image:-webkit-gradient(linear,0 0,0 100%,from(rgb(93, 56, 134)),to (rgb(48, 0, 121)));
		background-image:-webkit-linear-gradient(top,rgb(93, 56, 134),rgb(48, 0, 121));
		background-image:-o-linear-gradient(top,rgb(93, 56, 134),rgb(48, 0, 121));
		background-image:linear-gradient(to bottom,rgb(93, 56, 134),rgb(48, 0, 121));">
			<div class="span2" style="margin-right: -22px; margin-left: 20px;">
				<img class="img-polaroid" src="/assets/images/"""),_display_(Seq[Any](/*12.52*/profil/*12.58*/.picture)),format.raw/*12.66*/("""" width="150" height="100">
				
				<br>
				"""),_display_(Seq[Any](/*15.6*/if(session().get("username") == profil.username)/*15.54*/ {_display_(Seq[Any](format.raw/*15.56*/("""
					<center><a href=""""),_display_(Seq[Any](/*16.24*/routes/*16.30*/.Upload.imageUpload())),format.raw/*16.51*/("""" style="color: rgb(148, 130, 185); margin-left: -10px;">Ladda upp profilbild</a></center>
				""")))})),format.raw/*17.6*/("""
			</div>

			<div class="span3">
				<br><br>
				<h3 style="line-height: 10px; color: #fff;">"""),_display_(Seq[Any](/*22.50*/profil/*22.56*/.username)),format.raw/*22.65*/("""</h3>
				<h5 style="line-height: 10px; color: #fff;"></br>
				"""),_display_(Seq[Any](/*24.6*/profil/*24.12*/.sex)),format.raw/*24.16*/("""
				"""),_display_(Seq[Any](/*25.6*/if(profil.age != 0)/*25.25*/{_display_(Seq[Any](format.raw/*25.26*/("""
					"""),_display_(Seq[Any](/*26.7*/profil/*26.13*/.age)),format.raw/*26.17*/("""			
				""")))})),format.raw/*27.6*/("""		
				"""),_display_(Seq[Any](/*28.6*/if(!profil.residence.equals("") && profil.age != 0 || !profil.residence.equals("") && !profil.sex.equals(""))/*28.115*/{_display_(Seq[Any](format.raw/*28.116*/("""
					- 
				""")))})),format.raw/*30.6*/("""
				"""),_display_(Seq[Any](/*31.6*/profil/*31.12*/.residence)),format.raw/*31.22*/("""
				</h5>
				<br>
				<p style="color: #fff;">"""),_display_(Seq[Any](/*34.30*/profil/*34.36*/.signature)),format.raw/*34.46*/("""</p>
			</div>
			
			"""),_display_(Seq[Any](/*37.5*/if(profil.username == session().get("username"))/*37.53*/ {_display_(Seq[Any](format.raw/*37.55*/("""
				<div class="span2" style="float: right; margin-right: -40px;">
        			<a href=""""),_display_(Seq[Any](/*39.22*/routes/*39.28*/.Profiles.editProfile(session().get("username")))),format.raw/*39.76*/("""" class="btn"> Redigera profil</a>
        		</div>
		    """)))}/*41.9*/else/*41.14*/{_display_(Seq[Any](format.raw/*41.15*/("""
		    	"""),_display_(Seq[Any](/*42.9*/if(Follows.contains(session().get("username"), profil))/*42.64*/ {_display_(Seq[Any](format.raw/*42.66*/("""
		    		<div class="span2" style="float: right; margin-right: -10px;">
		   				<a href=""""),_display_(Seq[Any](/*44.20*/routes/*44.26*/.Follows.unFollow(session().get("username"), profil.username))),format.raw/*44.87*/("""" class="btn">Sluta följa """),_display_(Seq[Any](/*44.114*/profil/*44.120*/.username)),format.raw/*44.129*/("""</a>
		   			</div>
		   		""")))}/*46.10*/else/*46.15*/{_display_(Seq[Any](format.raw/*46.16*/("""
		    		<div class="span2" style="float: right; margin-right: -10px;">
		   				<a href=""""),_display_(Seq[Any](/*48.20*/routes/*48.26*/.Follows.follow(session().get("username"), profil.username))),format.raw/*48.85*/("""" class="btn">Följ """),_display_(Seq[Any](/*48.105*/profil/*48.111*/.username)),format.raw/*48.120*/("""</a>
		   			</div>
			   	""")))})),format.raw/*50.9*/("""
		   	""")))})),format.raw/*51.8*/("""
		</div>
	</div>
	
	<div class="span7" style="margin-left: 10px; margin-top: 10px;"> <!--Body-->
		<div class="span2" style="margin-left: -40px;"> <!--Left part of the body-->
			<div class="span2" style="border: 1px solid #ddd; padding-left: 15px; -webkit-border-radius: 5px; -moz-border-radius: 5px; border-radius: 5px;"> <!--Games field-->
				<h5>Spelar: </h5> 
					"""),_display_(Seq[Any](/*59.7*/for(games <- profil.game) yield /*59.32*/{_display_(Seq[Any](format.raw/*59.33*/("""
						"""),_display_(Seq[Any](/*60.8*/games/*60.13*/.title)),format.raw/*60.19*/(""",
					""")))})),format.raw/*61.7*/("""
				<br><br>
			</div>
			<br>
			<div class="span2" style="border: 1px solid #ddd; margin-top: 10px; padding-left: 15px; -webkit-border-radius: 5px; -moz-border-radius: 5px; border-radius: 5px;"> <!--Friends field-->
				<h5>Följer </h5>
				<ul class ="thumbnails" style="padding-left: 20px;">
					"""),_display_(Seq[Any](/*68.7*/for(follow <- profil.follows) yield /*68.36*/ {_display_(Seq[Any](format.raw/*68.38*/("""
						<li class ="thumbnails" style="margin-bottom: 5px; margin-left: 5px;">
							<a href=""""),_display_(Seq[Any](/*70.18*/routes/*70.24*/.Profiles.profile(follow.followed.username))),format.raw/*70.67*/("""" class="thumbnail">
								<img data-src="holder.js/50X50" alt="" style="width: 50px; height: 50px;" src=""""),_display_(Seq[Any](/*71.89*/routes/*71.95*/.Assets.at("img/140x140.png"))),format.raw/*71.124*/("""">
							</a>
						</li>
					""")))})),format.raw/*74.7*/("""
				</ul>
			</div>
		</div>
		
		<div class="span5" style="margin-left: 25px;"> <!--Right part of the body-->
			<div class="span5" style="margin-right: -30px; padding-left: 15px; border: 1px solid #ddd; -webkit-border-radius: 5px; -moz-border-radius: 5px; border-radius: 5px; padding-right: -50px;">
				<h5>Om mig</h5>
				<p>"""),_display_(Seq[Any](/*82.9*/profil/*82.15*/.about)),format.raw/*82.21*/("""</p>
			</div>
		
			<div class="span5" style="margin-right: -30px; margin-top: 10px; padding-left: 15px; border: 1px solid #ddd; -webkit-border-radius: 5px; -moz-border-radius: 5px; border-radius: 5px; padding-right: -50px;">
				<h5>Lan</h5>
				"""),_display_(Seq[Any](/*87.6*/for( e <- User.find.byId(profil.username).events) yield /*87.55*/{_display_(Seq[Any](format.raw/*87.56*/("""
					<a href="""),_display_(Seq[Any](/*88.15*/routes/*88.21*/.Events.showEvent(e.host))),format.raw/*88.46*/(""">"""),_display_(Seq[Any](/*88.48*/e/*88.49*/.name)),format.raw/*88.54*/("""</a><br>				
				""")))})),format.raw/*89.6*/("""
				<br>
			</div>
		</div>
	</div>

""")))})))}
    }
    
    def render(profil:Profile): play.api.templates.Html = apply(profil)
    
    def f:((Profile) => play.api.templates.Html) = (profil) => apply(profil)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:01 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/profile/profile.scala.html
                    HASH: cdd85bd81c739f3cadfd47084adc27f97d422f9f
                    MATRIX: 734->1|828->18|865->21|876->25|913->26|1716->793|1731->799|1761->807|1843->854|1900->902|1940->904|2000->928|2015->934|2058->955|2185->1051|2318->1148|2333->1154|2364->1163|2464->1228|2479->1234|2505->1238|2546->1244|2574->1263|2613->1264|2655->1271|2670->1277|2696->1281|2736->1290|2779->1298|2898->1407|2938->1408|2983->1422|3024->1428|3039->1434|3071->1444|3156->1493|3171->1499|3203->1509|3261->1532|3318->1580|3358->1582|3483->1671|3498->1677|3568->1725|3645->1785|3658->1790|3697->1791|3741->1800|3805->1855|3845->1857|3972->1948|3987->1954|4070->2015|4134->2042|4150->2048|4182->2057|4229->2086|4242->2091|4281->2092|4408->2183|4423->2189|4504->2248|4561->2268|4577->2274|4609->2283|4668->2311|4707->2319|5115->2692|5156->2717|5195->2718|5238->2726|5252->2731|5280->2737|5319->2745|5657->3048|5702->3077|5742->3079|5873->3174|5888->3180|5953->3223|6098->3332|6113->3338|6165->3367|6229->3400|6595->3731|6610->3737|6638->3743|6922->3992|6987->4041|7026->4042|7077->4057|7092->4063|7139->4088|7177->4090|7187->4091|7214->4096|7263->4114
                    LINES: 26->1|29->1|31->3|31->3|31->3|40->12|40->12|40->12|43->15|43->15|43->15|44->16|44->16|44->16|45->17|50->22|50->22|50->22|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|56->28|56->28|56->28|58->30|59->31|59->31|59->31|62->34|62->34|62->34|65->37|65->37|65->37|67->39|67->39|67->39|69->41|69->41|69->41|70->42|70->42|70->42|72->44|72->44|72->44|72->44|72->44|72->44|74->46|74->46|74->46|76->48|76->48|76->48|76->48|76->48|76->48|78->50|79->51|87->59|87->59|87->59|88->60|88->60|88->60|89->61|96->68|96->68|96->68|98->70|98->70|98->70|99->71|99->71|99->71|102->74|110->82|110->82|110->82|115->87|115->87|115->87|116->88|116->88|116->88|116->88|116->88|116->88|117->89
                    -- GENERATED --
                */
            