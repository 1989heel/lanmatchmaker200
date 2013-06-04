
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
object editProfile extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Profile],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(profilForm: Form[Profile]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*3.1*/("""

"""),_display_(Seq[Any](/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""


<div style="float:left;">
"""),_display_(Seq[Any](/*9.2*/form(action = routes.Profiles.saveProfile, args = 'id -> "editProfile")/*9.73*/ {_display_(Seq[Any](format.raw/*9.75*/("""

"""),_display_(Seq[Any](/*11.2*/select(
            field = profilForm("residence"), 
            options = options(
            	"" -> "Välj stad",
                "Alingsås" -> "Alingsås",
"Arboga" -> "Arboga",
"Arvika" -> "Arvika",
"Askersund" -> "Askersund",
"Avaskär" -> "Avaskär",
"Avesta" -> "Avesta",
"Boden" -> "Boden",
"Bollnäs" -> "Bollnäs",
"Borgholm" -> "Borgholm",
"Borlänge" -> "Borlänge",
"Borås" -> "Borås",
"Broo" -> "Broo",
"Brätte" -> "Brätte",
"Båstad" -> "Båstad",
"Djursholm" -> "Djursholm",
"Eksjö" -> "Eksjö",
"Elleholm" -> "Elleholm",
"Enköping" -> "Enköping",
"Eskilstuna" -> "Eskilstuna",
"Eslöv" -> "Eslöv",
"Fagersta" -> "Fagersta",
"Falkenberg" -> "Falkenberg",
"Falköping" -> "Falköping",
"Falsterbo" -> "Falsterbo",
"Falun" -> "Falun",
"Filipstad" -> "Filipstad",
"Flen" -> "Flen",
"Gränna" -> "Gränna",
"Gävle" -> "Gävle",
"Göteborg" -> "Göteborg",
"Hagfors" -> "Hagfors",
"Halmstad" -> "Halmstad",
"Haparanda" -> "Haparanda",
"Hedemora" -> "Hedemora",
"Helsingborg" -> "Helsingborg",
"Hjo" -> "Hjo",
"Hudiksvall" -> "Hudiksvall",
"Huskvarna" -> "Huskvarna",
"Härnösand" -> "Härnösand",
"Hässleholm" -> "Hässleholm",
"Höganäs" -> "Höganäs",
"Järle" -> "Järle",
"Jönköping" -> "Jönköping",
"Kalmar" -> "Kalmar",
"Karlshamn" -> "Karlshamn",
"Karlskoga" -> "Karlskoga",
"Karlskrona" -> "Karlskrona",
"Karlstad" -> "Karlstad",
"Katrineholm" -> "Katrineholm",
"Kiruna" -> "Kiruna",
"Kongahälla" -> "Kongahälla",
"Kramfors" -> "Kramfors",
"Kristianopel" -> "Kristianopel",
"Kristianstad" -> "Kristianstad",
"Kristinehamn" -> "Kristinehamn",
"Kumla" -> "Kumla",
"Kungsbacka" -> "Kungsbacka",
"Kungälv" -> "Kungälv",
"Köping" -> "Köping",
"Laholm" -> "Laholm",
"Landskrona" -> "Landskrona",
"Lidingö" -> "Lidingö",
"Lidköping" -> "Lidköping",
"Lindesberg" -> "Lindesberg",
"Linköping" -> "Linköping",
"Ljungby" -> "Ljungby",
"Lomma" -> "Lomma",
"Ludvika" -> "Ludvika",
"Luleå" -> "Luleå",
"Lund" -> "Lund",
"Luntertun" -> "Luntertun",
"Lycksele" -> "Lycksele",
"Lyckå" -> "Lyckå",
"Lysekil" -> "Lysekil",
"Lödöse" -> "Lödöse",
"Malmö" -> "Malmö",
"Mariefred" -> "Mariefred",
"Mariestad" -> "Mariestad",
"Marstrand" -> "Marstrand",
"Mjölby" -> "Mjölby",
"Motala" -> "Motala",
"Mölndal" -> "Mölndal",
"Mönsterås" -> "Mönsterås",
"Nacka" -> "Nacka",
"Nora" -> "Nora",
"Norrköping" -> "Norrköping",
"Norrtälje" -> "Norrtälje",
"Nybro" -> "Nybro",
"Nyköping" -> "Nyköping",
"Nynäshamn" -> "Nynäshamn",
"Nässjö" -> "Nässjö",
"Lidköping" -> "Lidköping",
"Oskarshamn" -> "Oskarshamn",
"Oxelösund" -> "Oxelösund",
"Piteå" -> "Piteå",
"Ronneby" -> "Ronneby",
"Sala" -> "Sala",
"Sandviken" -> "Sandviken",
"Sigtuna" -> "Sigtuna",
"Simrishamn" -> "Simrishamn",
"Skanör" -> "Skanör",
"Skara" -> "Skara",
"Skellefteå" -> "Skellefteå",
"Skänninge" -> "Skänninge",
"Skövde" -> "Skövde",
"Sollefteå" -> "Sollefteå",
"Solna" -> "Solna",
"Stockholm" -> "Stockholm",
"Strängnäs" -> "Strängnäs",
"Strömstad" -> "Strömstad",
"Sundbyberg" -> "Sundbyberg",
"Sundsvall" -> "Sundsvall",
"Säffle" -> "Säffle",
"Säter" -> "Säter",
"Sävsjö" -> "Sävsjö",
"Söderhamn" -> "Söderhamn",
"Söderköping" -> "Söderköping",
"Södertälje" -> "Södertälje",
"Sölvesborg" -> "Sölvesborg",
"Tidaholm" -> "Tidaholm",
"Tommarp" -> "Tommarp",
"Torget" -> "Torget",
"Torshälla" -> "Torshälla",
"Tranås" -> "Tranås",
"Trelleborg" -> "Trelleborg",
"Trollhättan" -> "Trollhättan",
"Trosa" -> "Trosa",
"Uddevalla" -> "Uddevalla",
"Ulricehamn" -> "Ulricehamn",
"Umeå" -> "Umeå",
"Uppsala" -> "Uppsala",
"Vadstena" -> "Vadstena",
"Varberg" -> "Varberg",
"Vaxholm" -> "Vaxholm",
"Vetlanda" -> "Vetlanda",
"Vimmerby" -> "Vimmerby",
"Visby" -> "Visby",
"Vä" -> "Vä",
"Vänersborg" -> "Vänersborg",
"Värnamo" -> "Värnamo",
"Västervik" -> "Västervik",
"Västerås" -> "Västerås",
"Växjö" -> "Växjö",
"Ystad" -> "Ystad",
"Åhus" -> "Åhus",
"Åmål" -> "Åmål",
"Älvsborg" -> "Älvsborg",
"Ängelholm" -> "Ängelholm",
"Örebro" -> "Örebro",
"Öregrund" -> "Öregrund",
"Örnsköldsvik" -> "Örnsköldsvik",
"Östersund" -> "Östersund",
"Östhammar" -> "Östhammar"
            ),
            args = '_label -> "Stad"
        ))),format.raw/*170.10*/("""		


"""),_display_(Seq[Any](/*173.2*/inputText(
field = profilForm("age"),
args = '_label -> "Ålder", 'placeholder -> "t.ex. 20"
))),format.raw/*176.2*/("""

"""),_display_(Seq[Any](/*178.2*/select(
            field = profilForm("sex"), 
            options = options(
                "" -> "Välj kön",
                "Man" -> "Man",
                "Kvinna" -> "Kvinna"
            ),
            args = '_label -> "Kön"
        ))),format.raw/*186.10*/("""

"""),_display_(Seq[Any](/*188.2*/inputText(
field = profilForm("signature"),
args = '_label -> "Signatur", 'placeholder -> "Har du ett motto?"
))),format.raw/*191.2*/("""	

<p class="buttons">
    <input type="submit" value="Uppdatera profil" class="btn primary"> eller 
            <a href=""""),_display_(Seq[Any](/*195.23*/routes/*195.29*/.Profiles.profile(session().get("username")))),format.raw/*195.73*/("""" class="btn warning">Avbryt</a> 
<p>
</div>	
<div style="float: right; margin-right: 80px;">
"""),_display_(Seq[Any](/*199.2*/select(
            field = profilForm("games"), 
            options = options(
            	"" -> "Välj ett spel",
                "Starcraft 1" -> "Starcraft 1",
                "Starcraft 2, Wings of Liberty" -> "Starcraft 2, Wings of Liberty",
				"Starcraft 2, Heart of the Swarm" -> "Starcraft 2, Heart of the Swarm",
				"Warcraft 1" -> "Warcraft 1",
				"Warcraft 2" -> "Warcraft 2",
				"Warcraft 3" -> "Warcraft 3",
				"World of Warcraft" -> "World of Warcraft",
				"Diablo 2" -> "Diablo 2",
				"Diablo 2, Lord of Destruction" -> "Diablo 2, Lord of Destruction",
				"Diablo 3" -> "Diablo 3",
				"DotA" -> "DotA",
				"DotA 2" -> "DotA 2",
				"LoL" -> "LoL",
				"CoD" -> "CoD",
				"My Little Pony" -> "My Little Pony"
            ),
            args = '_label -> "Spel jag aktivt spelar"
        ))),format.raw/*220.10*/("""		
"""),_display_(Seq[Any](/*221.2*/select(
            field = profilForm("matchmakeGame"), 
            options = options(
            	"" -> "Välj ett spel",
                "Starcraft 1" -> "Starcraft 1",
                "Starcraft 2, Wings of Liberty" -> "Starcraft 2, Wings of Liberty",
				"Starcraft 2, Heart of the Swarm" -> "Starcraft 2, Heart of the Swarm",
				"Warcraft 1" -> "Warcraft 1",
				"Warcraft 2" -> "Warcraft 2",
				"Warcraft 3" -> "Warcraft 3",
				"World of Warcraft" -> "World of Warcraft",
				"Diablo 2" -> "Diablo 2",
				"Diablo 2, Lord of Destruction" -> "Diablo 2, Lord of Destruction",
				"Diablo 3" -> "Diablo 3",
				"DotA" -> "DotA",
				"DotA 2" -> "DotA 2",
				"LoL" -> "LoL",
				"CoD" -> "CoD",
				"My Little Pony" -> "My Little Pony"
            ),
            args = '_label -> "Jag vill lana"
        ))),format.raw/*242.10*/("""		
		
		
"""),_display_(Seq[Any](/*245.2*/textarea(profilForm("about"), '_label -> "Om mig", 'placeholder -> "Lägg till information"))),format.raw/*245.93*/("""
</div>




    """)))})),format.raw/*251.6*/("""


    """)))})))}
    }
    
    def render(profilForm:Form[Profile]): play.api.templates.Html = apply(profilForm)
    
    def f:((Form[Profile]) => play.api.templates.Html) = (profilForm) => apply(profilForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:01 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/profile/editProfile.scala.html
                    HASH: 2bef904279cff6e267deabf6d6e320c48015fe89
                    MATRIX: 744->1|864->28|891->46|928->49|939->53|977->55|1041->85|1120->156|1159->158|1197->161|5259->4200|5301->4206|5416->4299|5455->4302|5720->4544|5759->4547|5892->4658|6052->4781|6068->4787|6135->4831|6266->4926|7104->5741|7144->5745|7981->6559|8027->6569|8141->6660|8190->6677
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|37->9|37->9|37->9|39->11|198->170|201->173|204->176|206->178|214->186|216->188|219->191|223->195|223->195|223->195|227->199|248->220|249->221|270->242|273->245|273->245|279->251
                    -- GENERATED --
                */
            