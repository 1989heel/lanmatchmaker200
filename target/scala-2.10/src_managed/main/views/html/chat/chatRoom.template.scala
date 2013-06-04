
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
object chatRoom extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Long,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(username: String, eventid: Long):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.35*/("""

<html>
<head> 
<title> Event Chat </title>
 <link rel="stylesheet" href=""""),_display_(Seq[Any](/*6.32*/routes/*6.38*/.Assets.at("stylesheets/chatBootstrap.css"))),format.raw/*6.81*/("""">
 <link rel="stylesheet" href=""""),_display_(Seq[Any](/*7.32*/routes/*7.38*/.Assets.at("stylesheets/chatMain.css"))),format.raw/*7.76*/("""">
 <script src=""""),_display_(Seq[Any](/*8.16*/routes/*8.22*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*8.67*/("""" type="text/javascript"></script>
</head>

	<body>
		<div class="container">
			<div class="content">
				<div id="onError" class="alert-message error">
        <p>
            <strong>Oops!</strong> <span></span>
        </p>
    </div>

    <div id="onChat" class="row">
        <div class="span10" id="main">
            <p id="messages">
            </p>

        </div>
        <textarea maxlength="150" id="talk"></textarea>
        <div class="span4">
            <strong>Deltagare</strong>
            <ul id="members" style="list-style-type: none;">
            </ul>
        </div>
    </div>

    <script type="text/javascript" charset="utf-8">

        $(function() """),format.raw/*36.22*/("""{"""),format.raw/*36.23*/("""
            var WS = window['MozWebSocket'] ? MozWebSocket : WebSocket
	        var chatSocket = new WS(""""),_display_(Seq[Any](/*38.36*/routes/*38.42*/.Chat.chat(username, eventid).webSocketURL(request))),format.raw/*38.93*/("""")

            var sendMessage = function() """),format.raw/*40.42*/("""{"""),format.raw/*40.43*/("""
                var str = $("#talk").val()
                    var currentDate = new Date();
                    chatSocket.send(JSON.stringify("""),format.raw/*43.52*/("""{"""),format.raw/*43.53*/("""
                        text: str,
                        year: currentDate.getFullYear(),
                        month: currentDate.getMonth()+1,
                        day: currentDate.getDate(),
                        hours: currentDate.getHours(),
                        minutes: currentDate.getMinutes()
                    """),format.raw/*50.21*/("""}"""),format.raw/*50.22*/("""))
                    $("#onError").hide()

                $("#talk").val('')
            """),format.raw/*54.13*/("""}"""),format.raw/*54.14*/("""

            var receiveEvent = function(event) """),format.raw/*56.48*/("""{"""),format.raw/*56.49*/("""
                var data = JSON.parse(event.data)
                
                if(data.error) """),format.raw/*59.32*/("""{"""),format.raw/*59.33*/("""
                    chatSocket.close()
                    $("#onError span").text(data.error)
                    $("#onError").show()
                    return
                """),format.raw/*64.17*/("""}"""),format.raw/*64.18*/(""" else """),format.raw/*64.24*/("""{"""),format.raw/*64.25*/("""
                    $("#onChat").show()
                """),format.raw/*66.17*/("""}"""),format.raw/*66.18*/("""
                
				
                var el = $('<div class="message"><span></span><p></p><em></em></div>')

                if(data.kind == 'talk')"""),format.raw/*71.40*/("""{"""),format.raw/*71.41*/("""
                    $("span", el).text(data.user+':')
					$("p", el).text(data.message)
					//$(el).addClass(data.kind)
					$("em", el).text(data.time)
					$('#messages').append(el)
                """),format.raw/*77.17*/("""}"""),format.raw/*77.18*/("""
               
                var div = document.getElementById("messages");
                div.scrollTop = div.scrollHeight;


                $("#members").html('')
                $(data.members).each(function() """),format.raw/*84.49*/("""{"""),format.raw/*84.50*/("""
                     $("#members").append('<li><a target="_blank" href="/profile?username=' + this + '">' + this + '</a>' + '</li>')
                """),format.raw/*86.17*/("""}"""),format.raw/*86.18*/(""")
            """),format.raw/*87.13*/("""}"""),format.raw/*87.14*/("""
            
            var handleReturnKey = function(e) """),format.raw/*89.47*/("""{"""),format.raw/*89.48*/("""
                if(e.charCode == 13 || e.keyCode == 13) """),format.raw/*90.57*/("""{"""),format.raw/*90.58*/("""
                    e.preventDefault()
                    sendMessage()
                """),format.raw/*93.17*/("""}"""),format.raw/*93.18*/(""" 
            """),format.raw/*94.13*/("""}"""),format.raw/*94.14*/("""
            
            $("#talk").keypress(handleReturnKey)  
            
            chatSocket.onmessage = receiveEvent
            
        """),format.raw/*100.9*/("""}"""),format.raw/*100.10*/(""")
    
    </script>
    
			</div>
		</div>
	</body>
</html>






"""))}
    }
    
    def render(username:String,eventid:Long): play.api.templates.Html = apply(username,eventid)
    
    def f:((String,Long) => play.api.templates.Html) = (username,eventid) => apply(username,eventid)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:00 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/chat/chatRoom.scala.html
                    HASH: 09ebd7ea7139a4cd16185424657cdefee014e563
                    MATRIX: 736->1|846->34|957->110|971->116|1035->159|1104->193|1118->199|1177->237|1230->255|1244->261|1310->306|2017->985|2046->986|2189->1093|2204->1099|2277->1150|2350->1195|2379->1196|2552->1341|2581->1342|2944->1677|2973->1678|3093->1770|3122->1771|3199->1820|3228->1821|3355->1920|3384->1921|3592->2101|3621->2102|3655->2108|3684->2109|3769->2166|3798->2167|3976->2317|4005->2318|4236->2521|4265->2522|4512->2741|4541->2742|4719->2892|4748->2893|4790->2907|4819->2908|4907->2968|4936->2969|5021->3026|5050->3027|5168->3117|5197->3118|5239->3132|5268->3133|5443->3280|5473->3281
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|64->36|64->36|66->38|66->38|66->38|68->40|68->40|71->43|71->43|78->50|78->50|82->54|82->54|84->56|84->56|87->59|87->59|92->64|92->64|92->64|92->64|94->66|94->66|99->71|99->71|105->77|105->77|112->84|112->84|114->86|114->86|115->87|115->87|117->89|117->89|118->90|118->90|121->93|121->93|122->94|122->94|128->100|128->100
                    -- GENERATED --
                */
            