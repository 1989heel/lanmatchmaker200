
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>Lananu.nu</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.119*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.70*/routes/*8.76*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*8.126*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*9.70*/routes/*9.76*/.Assets.at("stylesheets/changes.css"))),format.raw/*9.113*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*10.70*/routes/*10.76*/.Assets.at("stylesheets/eventMain.css"))),format.raw/*10.115*/("""">
        <link rel="shortcut icon" href=""""),_display_(Seq[Any](/*11.42*/routes/*11.48*/.Assets.at("img/icon.png"))),format.raw/*11.74*/("""">
    </head>
    <body>
        
<!-- NAVBAR ================================================== -->
    <div class="navbar-wrapper">
      <!-- Wrap the .navbar in .container to center it within the absolutely positioned parent. -->
      <div class="container">
	

        <div class="navbar navbar-inverse">
          <div class="navbar-inner ">
            <!-- Responsive Navbar Part 1: Button for triggering responsive navbar (not covered in tutorial). Include responsive CSS to utilize. -->
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
			
			"""),_display_(Seq[Any](/*30.5*/if( !session().isEmpty() )/*30.31*/ {_display_(Seq[Any](format.raw/*30.33*/("""
			<ul class="nav hidden-phone">
			<li><a href=""""),_display_(Seq[Any](/*32.18*/routes/*32.24*/.Application.index)),format.raw/*32.42*/("""" style="padding-top: 3px; padding-bottom: 0px;"><img src=""""),_display_(Seq[Any](/*32.102*/routes/*32.108*/.Assets.at("img/logotype.png"))),format.raw/*32.138*/(""""></a></li>
				
				</ul>
				
			<ul class="nav visible-phone">
			<li><a href=""""),_display_(Seq[Any](/*37.18*/routes/*37.24*/.Application.index)),format.raw/*37.42*/("""">Logotype</a></li>
				
				</ul>	
								
				
				<ul class="nav"><li><div class="input-append">
				<div class="visible-desktop">
			  	<input onkeyup="wichKey()" class="input-xlarge" id="appendedInputButton" type="text" placeholder="Sök person eller LAN">
			  	<button onclick="search()" class="btn" type="button"><i class="icon-search"></i></button></input>
				</div></div></li></ul>

			<ul class="nav hidden-phone">
			<li><a href=""""),_display_(Seq[Any](/*49.18*/routes/*49.24*/.Events.registerEvent)),format.raw/*49.45*/(""""><i class="icon-plus icon-white"></i> Skapa event</a></li>
				
				</ul>
				
				<ul class="nav hidden-phone">
				
				"""),_display_(Seq[Any](/*55.6*/if(Profile.find.where().eq("username", session().get("username")).findUnique().getQueue() == false)/*55.105*/{_display_(Seq[Any](format.raw/*55.106*/("""
					<li><a href=""""),_display_(Seq[Any](/*56.20*/routes/*56.26*/.Queue.queue(session().get("username")))),format.raw/*56.65*/(""""><i class="icon-play icon-white"></i> Matchmaking</a></li>
					""")))})),format.raw/*57.7*/("""
				"""),_display_(Seq[Any](/*58.6*/if(Profile.find.where().eq("username", session().get("username")).findUnique().getQueue() == true)/*58.104*/{_display_(Seq[Any](format.raw/*58.105*/("""
					<li><a href=""""),_display_(Seq[Any](/*59.20*/routes/*59.26*/.Queue.deQueue(session().get("username")))),format.raw/*59.67*/(""""><i class="icon-play icon-white"></i> Avbryt matchmaking</a></li>
					""")))})),format.raw/*60.7*/("""
				</ul>
				

			<ul class="nav pull-right hidden-phone">	
			<p class="navbar-text pull-right">
					<a href=""""),_display_(Seq[Any](/*66.16*/routes/*66.22*/.Profiles.profile( session().get("username") ))),format.raw/*66.68*/("""" class="navbar-link">
					"""),_display_(Seq[Any](/*67.7*/if(Profile.find.where().eq("username", session().get("username")).findUnique().picture != null)/*67.102*/{_display_(Seq[Any](format.raw/*67.103*/("""
						<img src="/assets/images/"""),_display_(Seq[Any](/*68.33*/Profile/*68.40*/.find.where().eq("username", session().get("username")).findUnique().picture)),format.raw/*68.116*/("""" width="25" height="26">
					""")))}/*69.8*/else/*69.13*/{_display_(Seq[Any](format.raw/*69.14*/("""
						<img src=""""),_display_(Seq[Any](/*70.18*/routes/*70.24*/.Assets.at("images/anonymous-person1.jpg"))),format.raw/*70.66*/("""">
						
					""")))})),format.raw/*72.7*/("""
					"""),_display_(Seq[Any](/*73.7*/session()/*73.16*/.get("username"))),format.raw/*73.32*/("""
					</a>
					
							
							
				</p>
				</ul>
				<!-- Read about Bootstrap dropdowns at http://twitter.github.com/bootstrap/javascript.html#dropdowns -->
                
				
				<ul class="nav pull-right hidden-phone">
				<li>
				<li class="dropdown pull-right">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">Mitt konto <b class="caret"></b></a>
                  <ul class="dropdown-menu"  role="menu" aria-labelledby="dLabel">
							<li><a href=""""),_display_(Seq[Any](/*88.22*/routes/*88.28*/.Profiles.profile(session().get("username")))),format.raw/*88.72*/(""""><i class="icon-list"></i> Profil</a></li>
							 <li><a href=""""),_display_(Seq[Any](/*89.23*/routes/*89.29*/.Profiles.editProfile(session().get("username")))),format.raw/*89.77*/(""""><i class="icon-edit"></i> Redigera profil</a></li>
                    		<li class="divider"></li>
                    		<li><a href=""""),_display_(Seq[Any](/*91.37*/routes/*91.43*/.Users.logout)),format.raw/*91.56*/(""""><i class="icon-off"></i> Logga ut</a></li>
                  </ul>
				</li></li>
				</ul>
				
			<div class="span2 pull-right hidden-phone">			
				<ul class="nav pull-right">
				<li class="dropdown">
                  <a href=""""),_display_(Seq[Any](/*99.29*/routes/*99.35*/.Application.index)),format.raw/*99.53*/("""" class="dropdown-toggle" ><i class="icon-home icon-white"></i></a>
				</li>
				</ul>
			</div>
			""")))})),format.raw/*103.5*/(""" <!-- End of if -->
			

           <!--- NAV head for phone -->
			<div class="span2 visible-phone">
			<ul class="nav pull-right">
				<li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-bell icon-white"></i></a>
                  <ul class="dropdown-menu"  role="menu" aria-labelledby="dLabel">
                    <li><a href="./newer_shit.htm">Action</a></li>
                    <li><a href="./newer_shit.htm">Another action</a></li>
                    <li><a href="./newer_shit.htm">Something else here</a></li>
                    <li class="divider"></li>
                    <li class="nav-header">Nav header</li>
                    <li><a href="./newer_shit.htm">Separated link</a></li>
                    <li><a href="./newer_shit.htm">One more separated link</a></li>
                  </ul>
				</li>
				</ul>
				
				<ul class="nav pull-right">
				<li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-envelope icon-white"></i></a>
                  <ul class="dropdown-menu"  role="menu" aria-labelledby="dLabel">
                    <li><a href="./newer_shit.htm">Action</a></li>
                    <li><a href="./newer_shit.htm">Another action</a></li>
                    <li><a href="./newer_shit.htm">Something else here</a></li>
                    <li class="divider"></li>
                    <li class="nav-header">Nav header</li>
                    <li><a href="./newer_shit.htm">Separated link</a></li>
                    <li><a href="./newer_shit.htm">One more separated link</a></li>
                  </ul>
				</li>
				</ul>
				
				<ul class="nav pull-right">
				<li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-user icon-white"></i></a>
                  <ul class="dropdown-menu"  role="menu" aria-labelledby="dLabel">
                    <li><a href="./newer_shit.htm">User wants to add you to their freinds list.</a></li>
                    <li><a href="./newer_shit.htm">User wants to add you to their freinds list.</a></li>
                    <li><a href="./newer_shit.htm">User wants to add you to their freinds list.</a></li>
                    <li class="divider"></li>

                    <li><a href="./newer_shit.htm">Go to your friends list</a></li>
                    
                  </ul>
				</li>
				</ul>
			<ul class="nav pull-right">
				<li class="dropdown">
                  <a href="./newer_shit.htm" class="dropdown-toggle" ><i class="icon-home icon-white"></i></a>
				</li>
				</ul>
				</div><!---- End NAV Phone--->
				
				
				<!-- Responsive Navbar Part 2: Place all navbar contents you want collapsed withing .navbar-collapse.collapse. -->
            <div class="nav-collapse collapse">
              <ul class="nav">
                
				
			<ul class="nav visible-phone">	
			
			<ul class="nav"><li><div class="input-append">
				
			  <input onkeyup="wichKey()" class="input-medium" id="appendedInputButton" type="text" placeholder="Search people, LAN's and things">
			  <button class="btn" type="button"><i class="icon-search"></i></input></button>
			</div></li></ul>
                
				<ul class="nav">
			<li><a href="http://twitter.github.io/bootstrap/examples/carousel.html#"><i class="icon-map-marker icon-white"></i> LAN finder</a></li>
				
				</ul>
				
				<ul class="nav">
			<li><a href="http://twitter.github.io/bootstrap/examples/carousel.html#"><i class="icon-play icon-white"></i> Matchmaker</a></li>
				
				</ul>
				
				<ul class="nav">
			<li><a href="http://twitter.github.io/bootstrap/examples/carousel.html#"><i class="icon-list-alt icon-white"></i> Profile</a></li>
				
				</ul>
				
				<ul class="nav">
			<li><a href="http://twitter.github.io/bootstrap/examples/carousel.html#"><i class="icon-cog icon-white"></i> Settings</a></li>
				
				</ul>
				
				<ul class="nav">
			<li><a href="http://twitter.github.io/bootstrap/examples/carousel.html#"><i class="icon-eye-open icon-white"></i> Privacy</a></li>
				
				</ul>
				
				<ul class="nav">
			<li><a href="http://twitter.github.io/bootstrap/examples/carousel.html#"><i class="icon-off icon-white"></i> Log out</a></li>
				
				</ul>
				
				
				
				
				</ul>	
				
				
			  
            </div><!--/.nav-collapse -->
				
				
				
			
			
          </div><!-- /.navbar-inner -->
        </div><!-- /.navbar -->
	
      </div> <!-- /.container -->
    </div><!-- /.navbar-wrapper -->
        
        
	<!-- CONTAINER ================================================== -->
	
	
	<div class="container style="margin-top: 40px">
	<div class="row";">
	
	
	<div class="span2">
              <ul class="nav nav-list">
                """),_display_(Seq[Any](/*232.18*/if( !session().isEmpty() )/*232.44*/{_display_(Seq[Any](format.raw/*232.45*/("""
                
                <li><a href=""""),_display_(Seq[Any](/*234.31*/routes/*234.37*/.Application.index())),format.raw/*234.57*/("""">Twitter-feed</a></li>
				<li class="divider"></li>
				<li class="nav-header">Event</li>
				"""),_display_(Seq[Any](/*237.6*/for( e <- User.find.byId(session().get("username")).events) yield /*237.65*/{_display_(Seq[Any](format.raw/*237.66*/("""
					<li><a href="""),_display_(Seq[Any](/*238.19*/routes/*238.25*/.Events.showEvent(e.host))),format.raw/*238.50*/(""">"""),_display_(Seq[Any](/*238.52*/e/*238.53*/.name)),format.raw/*238.58*/("""</a>
				
				""")))})),format.raw/*240.6*/("""
				
				
				""")))})),format.raw/*243.6*/("""
              </ul>
            </div>
	
	
	
      <div class="span7" style="margin-left: 0px;">
	  

            """),_display_(Seq[Any](/*252.14*/content)),format.raw/*252.21*/(""" 
        
 
      </div>
      
      """),_display_(Seq[Any](/*257.8*/if( !session().isEmpty() )/*257.34*/ {_display_(Seq[Any](format.raw/*257.36*/("""
	  <div class="span3">	  
	  <img src=""""),_display_(Seq[Any](/*259.15*/routes/*259.21*/.Assets.at("images/horse.gif"))),format.raw/*259.51*/(""""> <br> <br>
		
	 <br>
	 <hr>
	 <br>
	  </div>
	  """)))})),format.raw/*265.5*/("""
	  

      

      
	</div> <!-- /row -->
	
	<hr>
	<div class="footer" style="margin-right: 20px;"><center>
        <p>Lanmatchmaker 2000 © 2013</p>
        </center>
      </div>
	
    </div> <!-- /container -->
        <script>
        	function wichKey()"""),format.raw/*281.28*/("""{"""),format.raw/*281.29*/("""
        	if(event.keyCode == 13)"""),format.raw/*282.33*/("""{"""),format.raw/*282.34*/("""
        	search();
        	"""),format.raw/*284.10*/("""}"""),format.raw/*284.11*/("""
        	
        	
        	"""),format.raw/*287.10*/("""}"""),format.raw/*287.11*/("""
            function search()"""),format.raw/*288.30*/("""{"""),format.raw/*288.31*/("""
                var searchString = document.getElementById("appendedInputButton").value;
               window.location.href = "../../../../../../search?searchQuery="+searchString;

            """),format.raw/*292.13*/("""}"""),format.raw/*292.14*/("""
            
           
        </script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*296.46*/routes/*296.52*/.Assets.at("javascripts/jquery.js"))),format.raw/*296.87*/("""" </script>        
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*297.46*/routes/*297.52*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*297.94*/(""""  </script>        
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*298.46*/routes/*298.52*/.Assets.at("javascripts/bootstrap-dropdown.js"))),format.raw/*298.99*/(""""  </script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*299.46*/routes/*299.52*/.Assets.at("javascripts/bootstrap-button.js"))),format.raw/*299.97*/(""""  </script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*300.46*/routes/*300.52*/.Assets.at("javascripts/bootstrap-tab.js"))),format.raw/*300.94*/(""""  </script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*301.46*/routes/*301.52*/.Application.javascriptRoutes)),format.raw/*301.81*/(""""> </script>
        
    </body>
</html>"""))}
    }
    
    def render(content:Html): play.api.templates.Html = apply(content)
    
    def f:((Html) => play.api.templates.Html) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:43:59 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/main.scala.html
                    HASH: bf47be2a9148c40b0ee689c7c0b6da46c9dbe66f
                    MATRIX: 720->1|812->16|985->154|999->160|1064->203|1172->276|1186->282|1258->332|1366->405|1380->411|1439->448|1548->521|1563->527|1625->566|1705->610|1720->616|1768->642|2576->1415|2611->1441|2651->1443|2738->1494|2753->1500|2793->1518|2890->1578|2906->1584|2959->1614|3078->1697|3093->1703|3133->1721|3613->2165|3628->2171|3671->2192|3830->2316|3939->2415|3979->2416|4035->2436|4050->2442|4111->2481|4208->2547|4249->2553|4357->2651|4397->2652|4453->2672|4468->2678|4531->2719|4635->2792|4786->2907|4801->2913|4869->2959|4933->2988|5038->3083|5078->3084|5147->3117|5163->3124|5262->3200|5312->3233|5325->3238|5364->3239|5418->3257|5433->3263|5497->3305|5544->3321|5586->3328|5604->3337|5642->3353|6170->3845|6185->3851|6251->3895|6353->3961|6368->3967|6438->4015|6611->4152|6626->4158|6661->4171|6932->4406|6947->4412|6987->4430|7121->4532|11966->9340|12002->9366|12042->9367|12127->9415|12143->9421|12186->9441|12319->9538|12395->9597|12435->9598|12491->9617|12507->9623|12555->9648|12594->9650|12605->9651|12633->9656|12680->9671|12728->9687|12881->9803|12911->9810|12987->9850|13023->9876|13064->9878|13142->9919|13158->9925|13211->9955|13294->10006|13581->10264|13611->10265|13673->10298|13703->10299|13761->10328|13791->10329|13850->10359|13880->10360|13939->10390|13969->10391|14193->10586|14223->10587|14349->10676|14365->10682|14423->10717|14525->10782|14541->10788|14606->10830|14709->10896|14725->10902|14795->10949|14890->11007|14906->11013|14974->11058|15069->11116|15085->11122|15150->11164|15245->11222|15261->11228|15313->11257
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|58->30|58->30|58->30|60->32|60->32|60->32|60->32|60->32|60->32|65->37|65->37|65->37|77->49|77->49|77->49|83->55|83->55|83->55|84->56|84->56|84->56|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|100->72|101->73|101->73|101->73|116->88|116->88|116->88|117->89|117->89|117->89|119->91|119->91|119->91|127->99|127->99|127->99|131->103|260->232|260->232|260->232|262->234|262->234|262->234|265->237|265->237|265->237|266->238|266->238|266->238|266->238|266->238|266->238|268->240|271->243|280->252|280->252|285->257|285->257|285->257|287->259|287->259|287->259|293->265|309->281|309->281|310->282|310->282|312->284|312->284|315->287|315->287|316->288|316->288|320->292|320->292|324->296|324->296|324->296|325->297|325->297|325->297|326->298|326->298|326->298|327->299|327->299|327->299|328->300|328->300|328->300|329->301|329->301|329->301
                    -- GENERATED --
                */
            