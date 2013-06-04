
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
object notLoggedInMain extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>Events</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.119*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.70*/routes/*8.76*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*8.126*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*9.70*/routes/*9.76*/.Assets.at("stylesheets/changes.css"))),format.raw/*9.113*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*10.70*/routes/*10.76*/.Assets.at("stylesheets/eventMain.css"))),format.raw/*10.115*/(""""> 
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
			
			<ul class="nav hidden-phone">
			<li><a href=""""),_display_(Seq[Any](/*30.18*/routes/*30.24*/.Application.index)),format.raw/*30.42*/("""">Lanmatchmaker 2000</a></li>
				
				</ul>
				
			<ul class="nav visible-phone">
			<li><a href="http://twitter.github.io/bootstrap/examples/carousel.html#">Logotype</a></li>
				
				</ul>	
				
				
				<ul class="nav"><li><div class="input-append">
				<div class="visible-desktop">
  <input class="input-xlarge" id="appendedInputButton" type="text" placeholder="Search people, LAN's and things">
  <button class="btn" type="button"><i class="icon-search"></i></button></input>
</div></div></li></ul>

<ul class="nav hidden-phone">
			<li><a href="http://twitter.github.io/bootstrap/examples/carousel.html#"><i class="icon-map-marker icon-white"></i> LAN finder</a></li>
				
				</ul>
				
				<ul class="nav hidden-phone">
			<li><a href="http://twitter.github.io/bootstrap/examples/carousel.html#"><i class="icon-play icon-white"></i> Matchmaker</a></li>
				
				</ul>
				
				<ul class="nav hidden-phone">
			<li><a href=""""),_display_(Seq[Any](/*57.18*/routes/*57.24*/.Users.register)),format.raw/*57.39*/("""">Register</a></li>
				
				</ul>
				
				<ul class="nav hidden-phone">
			<li><a href=""""),_display_(Seq[Any](/*62.18*/routes/*62.24*/.Users.login)),format.raw/*62.36*/("""">Login</a></li>
				
				</ul>

			
			

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
				
  <input class="input-medium" id="appendedInputButton" type="text" placeholder="Search people, LAN's and things">
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
                <li class="nav-header">A category</li>
                <li class="active"><a href="#"><i class="icon-chevron-right"></i>Following feed</a></li>
                <li><a href="#">The LAN you like</a></li>
                <li><a href="#">Another LAN</a></li>
                <li class="nav-header">Another category</li>
                <li><a href="#">LAN matckmaking</a></li>
                <li><a href="#">Settings</a></li>
                <li class="divider"></li>
                <li><a href="#">Help</a></li>
				<li class="divider"></li>
              </ul>
            </div>
	
	
	
      <div class="span7">
	  
	  <div class="tab-pane" id="lB">
		
            """),_display_(Seq[Any](/*212.14*/content)),format.raw/*212.21*/("""       
        
      </div>
      </div>
	  <div class="span3">
	  Ads, polls and other random shit, unaffected by tabbing. <br> <br> oeioie noie ieoi ieoi ieuaoa uasdofja jhdfo aojadfa ajsdf. Adjas jasdjas jas da *Faceroll*.
	  
	 <br>
	 <hr>
	 <br>
	  
	  <img src="./public/img/horse.gif">
	  <p>Deal with it</p>
	  
	  
	  </div>

      

      
	</div> <!-- /row -->
        
        
        
        <!-- OLD
        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(Seq[Any](/*239.27*/routes/*239.33*/.Application.index())),format.raw/*239.53*/("""">
                    Test
                </a>
            </h1>
        </header>
        <section id="main">
            """),_display_(Seq[Any](/*245.14*/content)),format.raw/*245.21*/("""
        </section>
        -->
        
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*249.40*/routes/*249.46*/.Assets.at("javascripts/jquery.js"))),format.raw/*249.81*/("""" </script>        
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*250.46*/routes/*250.52*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*250.94*/(""""  </script>        
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*251.46*/routes/*251.52*/.Assets.at("javascripts/bootstrap-dropdown.js"))),format.raw/*251.99*/(""""  </script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*252.46*/routes/*252.52*/.Assets.at("javascripts/bootstrap-button.js"))),format.raw/*252.97*/(""""  </script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*253.46*/routes/*253.52*/.Application.javascriptRoutes)),format.raw/*253.81*/(""""> </script>
		
		
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
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/notLoggedInMain.scala.html
                    HASH: 2349320032e89cbcf195a433381698f562569813
                    MATRIX: 731->1|823->16|993->151|1007->157|1072->200|1180->273|1194->279|1266->329|1374->402|1388->408|1447->445|1556->518|1571->524|1633->563|2490->1384|2505->1390|2545->1408|3516->2343|3531->2349|3568->2364|3695->2455|3710->2461|3744->2473|9238->7930|9268->7937|9811->8443|9827->8449|9870->8469|10033->8595|10063->8602|10180->8682|10196->8688|10254->8723|10356->8788|10372->8794|10437->8836|10540->8902|10556->8908|10626->8955|10721->9013|10737->9019|10805->9064|10900->9122|10916->9128|10968->9157
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|58->30|58->30|58->30|85->57|85->57|85->57|90->62|90->62|90->62|240->212|240->212|267->239|267->239|267->239|273->245|273->245|277->249|277->249|277->249|278->250|278->250|278->250|279->251|279->251|279->251|280->252|280->252|280->252|281->253|281->253|281->253
                    -- GENERATED --
                */
            