
package views.html.search

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
object searchResultPage extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template7[com.avaje.ebean.Page[Event],String,String,com.avaje.ebean.Page[User],String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(eventPage: com.avaje.ebean.Page[Event], eventSortBy: String, eventOrder: String, userPage: com.avaje.ebean.Page[User], userSortBy: String, userOrder: String, searchString: String):play.api.templates.Html = {
        _display_ {
def /*42.2*/header/*42.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*42.38*/("""
	<th class=""""),_display_(Seq[Any](/*43.14*/key/*43.17*/.replace(".","_"))),format.raw/*43.34*/(""" header """),_display_(Seq[Any](/*43.43*/if(eventSortBy == key){/*43.67*/{if(eventOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*43.129*/("""">
		<a href=""""),_display_(Seq[Any](/*44.13*/link(0, key, null))),format.raw/*44.31*/("""">"""),_display_(Seq[Any](/*44.34*/title)),format.raw/*44.39*/("""</a>
	</th>
""")))};def /*47.2*/header2/*47.9*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*47.39*/("""
	<th class=""""),_display_(Seq[Any](/*48.14*/key/*48.17*/.replace(".","_"))),format.raw/*48.34*/(""" header """),_display_(Seq[Any](/*48.43*/if(userSortBy == key){/*48.66*/{if(userOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*48.127*/("""">
		<a href=""""),_display_(Seq[Any](/*49.13*/link(0, null, key))),format.raw/*49.31*/("""">"""),_display_(Seq[Any](/*49.34*/title)),format.raw/*49.39*/("""</a>
	</th>
""")))};def /*3.2*/link/*3.6*/(newPage:Int, newEventSortBy:String, newUserSortBy:String) = {{
	
	var eventsortBy = eventSortBy
	var eventorder = eventOrder
	
	if(newEventSortBy != null) {
		eventsortBy = newEventSortBy
		if(eventSortBy == newEventSortBy) {
			if(eventOrder == "asc") {
				eventorder = "desc"
			} else {
				eventorder = "asc"
			}
		} else {
			eventorder = "asc"
		}
	}
	
	var usersortBy = userSortBy
	var userorder = userOrder
	
	if(newUserSortBy != null) {
		usersortBy = newUserSortBy
		if(userSortBy == newUserSortBy) {
			if(userOrder == "asc") {
				userorder = "desc"
			} else {
				userorder = "asc"
			}
		} else {
			userorder = "asc"
		}
	}
	
	// Generate the link
	routes.Search.searchList(newPage, eventsortBy, eventorder, usersortBy, userorder, searchString)

}};
Seq[Any](format.raw/*1.182*/("""

"""),format.raw/*40.2*/("""

"""),format.raw/*46.2*/("""
"""),format.raw/*51.2*/("""

"""),_display_(Seq[Any](/*53.2*/main/*53.6*/ {_display_(Seq[Any](format.raw/*53.8*/("""

	<h4 id="homeTitle">"""),_display_(Seq[Any](/*55.22*/Messages("Sökresultat för event:", eventPage.getTotalRowCount))),format.raw/*55.84*/("""</h4>
	
	"""),_display_(Seq[Any](/*57.3*/if(flash.containsKey("success"))/*57.35*/ {_display_(Seq[Any](format.raw/*57.37*/("""
	<div class="alert-message warning">
	    <strong>Done!</strong> """),_display_(Seq[Any](/*59.30*/flash/*59.35*/.get("success"))),format.raw/*59.50*/("""
	</div>
	""")))})),format.raw/*61.3*/("""
	
	
	"""),_display_(Seq[Any](/*64.3*/if(eventPage.getTotalRowCount == 0)/*64.38*/ {_display_(Seq[Any](format.raw/*64.40*/("""
	
	<div class="well">
	    <em>Inga sökresultat funna.</em>
	</div>
	
	""")))}/*70.4*/else/*70.9*/{_display_(Seq[Any](format.raw/*70.10*/("""
		<table class="table table-condensed">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*74.22*/header("name", "Namn"))),format.raw/*74.44*/("""
                    """),_display_(Seq[Any](/*75.22*/header("location", "Plats"))),format.raw/*75.49*/("""
                    """),_display_(Seq[Any](/*76.22*/header("fee", "Avgift"))),format.raw/*76.45*/("""
                    """),_display_(Seq[Any](/*77.22*/header("start", "Börjar"))),format.raw/*77.47*/("""
                    """),_display_(Seq[Any](/*78.22*/header("end", "Slutar"))),format.raw/*78.45*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*83.18*/for(event <- eventPage.getList) yield /*83.49*/ {_display_(Seq[Any](format.raw/*83.51*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*85.39*/routes/*85.45*/.Events.showEvent(event.host))),format.raw/*85.74*/("""">"""),_display_(Seq[Any](/*85.77*/event/*85.82*/.name)),format.raw/*85.87*/("""</a></td>
                        <td>"""),_display_(Seq[Any](/*86.30*/event/*86.35*/.location)),format.raw/*86.44*/("""</td>
                        <td>"""),_display_(Seq[Any](/*87.30*/event/*87.35*/.fee)),format.raw/*87.39*/("""</td>
                        <td>
                            """),_display_(Seq[Any](/*89.30*/if(event.start == null)/*89.53*/ {_display_(Seq[Any](format.raw/*89.55*/("""
                                <em>Ej angivet</em>
                            """)))}/*91.31*/else/*91.36*/{_display_(Seq[Any](format.raw/*91.37*/("""
                                """),_display_(Seq[Any](/*92.34*/event/*92.39*/.start.format("dd MMM yyyy"))),format.raw/*92.67*/("""
                            """)))})),format.raw/*93.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*96.30*/if(event.end == null)/*96.51*/ {_display_(Seq[Any](format.raw/*96.53*/("""
                                <em>Ej angivet</em>
                            """)))}/*98.31*/else/*98.36*/{_display_(Seq[Any](format.raw/*98.37*/("""
                                """),_display_(Seq[Any](/*99.34*/event/*99.39*/.end.format("dd MMM yyyy"))),format.raw/*99.65*/("""
                            """)))})),format.raw/*100.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*103.18*/("""

            </tbody>
        </table>
	""")))})),format.raw/*107.3*/("""
	
	<h4 id="homeTitle">"""),_display_(Seq[Any](/*109.22*/Messages("Sökresultat för användare:", userPage.getTotalRowCount))),format.raw/*109.87*/("""</h4>
	
	"""),_display_(Seq[Any](/*111.3*/if(flash.containsKey("success"))/*111.35*/ {_display_(Seq[Any](format.raw/*111.37*/("""
	<div class="alert-message warning">
	    <strong>Done!</strong> """),_display_(Seq[Any](/*113.30*/flash/*113.35*/.get("success"))),format.raw/*113.50*/("""
	</div>
	""")))})),format.raw/*115.3*/("""
	
	
	"""),_display_(Seq[Any](/*118.3*/if(userPage.getTotalRowCount == 0)/*118.37*/ {_display_(Seq[Any](format.raw/*118.39*/("""
	
	<div class="well">
	    <em>Inga sökresultat funna.</em>
	</div>
	
	""")))}/*124.4*/else/*124.9*/{_display_(Seq[Any](format.raw/*124.10*/("""
	
	<table class="table table-condensed">
	    <thead>
	    	<tr>
	        	"""),_display_(Seq[Any](/*129.12*/header2("username", "Användarnamn"))),format.raw/*129.47*/("""
	    	</tr>
	   	</thead>
	    <tbody>
	
	    """),_display_(Seq[Any](/*134.7*/for(user <- userPage.getList) yield /*134.36*/ {_display_(Seq[Any](format.raw/*134.38*/("""
		    <tr>
		        <td><a href=""""),_display_(Seq[Any](/*136.25*/routes/*136.31*/.Profiles.profile(user.username))),format.raw/*136.63*/("""">"""),_display_(Seq[Any](/*136.66*/user/*136.70*/.username)),format.raw/*136.79*/("""</a></td>
		    </tr>
	    """)))})),format.raw/*138.7*/("""
	
	    </tbody>
	</table>
	
	<div id="pagination" class="pagination">
	    <ul>
	        """),_display_(Seq[Any](/*145.11*/if(userPage.hasPrev)/*145.31*/ {_display_(Seq[Any](format.raw/*145.33*/("""
	        <li class="prev">
	            <a href=""""),_display_(Seq[Any](/*147.24*/link(userPage.getPageIndex - 1, eventSortBy, null))),format.raw/*147.74*/("""">&larr; Föregående</a>
	        </li>
	        """)))}/*149.12*/else/*149.17*/{_display_(Seq[Any](format.raw/*149.18*/("""
	        <li class="prev disabled">
	            <a>&larr; Föregående</a>
	        </li>
	        """)))})),format.raw/*153.11*/("""
	        <li class="current">
	            <a>Visar """),_display_(Seq[Any](/*155.24*/userPage/*155.32*/.getDisplayXtoYofZ(" till "," av "))),format.raw/*155.67*/("""</a>
	        </li>
	        """),_display_(Seq[Any](/*157.11*/if(userPage.hasNext)/*157.31*/ {_display_(Seq[Any](format.raw/*157.33*/("""
	        <li class="next">
	            <a href=""""),_display_(Seq[Any](/*159.24*/link(userPage.getPageIndex + 1, eventSortBy, null))),format.raw/*159.74*/("""">Nästa &rarr;</a>
	        </li>
	        """)))}/*161.12*/else/*161.17*/{_display_(Seq[Any](format.raw/*161.18*/("""
	        <li class="next disabled">
	            <a>Nästa &rarr;</a>
	        </li>
	        """)))})),format.raw/*165.11*/("""
	    </ul>
	</div>
	""")))})),format.raw/*168.3*/("""
""")))})))}
    }
    
    def render(eventPage:com.avaje.ebean.Page[Event],eventSortBy:String,eventOrder:String,userPage:com.avaje.ebean.Page[User],userSortBy:String,userOrder:String,searchString:String): play.api.templates.Html = apply(eventPage,eventSortBy,eventOrder,userPage,userSortBy,userOrder,searchString)
    
    def f:((com.avaje.ebean.Page[Event],String,String,com.avaje.ebean.Page[User],String,String,String) => play.api.templates.Html) = (eventPage,eventSortBy,eventOrder,userPage,userSortBy,userOrder,searchString) => apply(eventPage,eventSortBy,eventOrder,userPage,userSortBy,userOrder,searchString)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:01 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/search/searchResultPage.scala.html
                    HASH: 358c191481afea0a5f3dee1d02d610de3a88f0e3
                    MATRIX: 824->1|1065->957|1079->963|1173->993|1223->1007|1235->1010|1274->1027|1319->1036|1351->1060|1437->1122|1488->1137|1528->1155|1567->1158|1594->1163|1630->1178|1645->1185|1739->1215|1789->1229|1801->1232|1840->1249|1885->1258|1916->1281|2001->1342|2052->1357|2092->1375|2131->1378|2158->1383|2193->184|2204->188|3001->181|3030->954|3059->1176|3087->1396|3125->1399|3137->1403|3176->1405|3235->1428|3319->1490|3364->1500|3405->1532|3445->1534|3548->1601|3562->1606|3599->1621|3641->1632|3683->1639|3727->1674|3767->1676|3858->1750|3870->1755|3909->1756|4048->1859|4092->1881|4150->1903|4199->1930|4257->1952|4302->1975|4360->1997|4407->2022|4465->2044|4510->2067|4628->2149|4675->2180|4715->2182|4815->2246|4830->2252|4881->2281|4920->2284|4934->2289|4961->2294|5036->2333|5050->2338|5081->2347|5152->2382|5166->2387|5192->2391|5292->2455|5324->2478|5364->2480|5465->2563|5478->2568|5517->2569|5587->2603|5601->2608|5651->2636|5713->2666|5838->2755|5868->2776|5908->2778|6009->2861|6022->2866|6061->2867|6131->2901|6145->2906|6193->2932|6256->2962|6363->3036|6437->3078|6498->3102|6586->3167|6632->3177|6674->3209|6715->3211|6819->3278|6834->3283|6872->3298|6915->3309|6958->3316|7002->3350|7043->3352|7135->3426|7148->3431|7188->3432|7302->3509|7360->3544|7444->3592|7490->3621|7531->3623|7604->3659|7620->3665|7675->3697|7715->3700|7729->3704|7761->3713|7821->3741|7949->3832|7979->3852|8020->3854|8108->3905|8181->3955|8250->4005|8264->4010|8304->4011|8437->4111|8528->4165|8546->4173|8604->4208|8671->4238|8701->4258|8742->4260|8830->4311|8903->4361|8967->4406|8981->4411|9021->4412|9149->4507|9203->4529
                    LINES: 26->1|28->42|28->42|30->42|31->43|31->43|31->43|31->43|31->43|31->43|32->44|32->44|32->44|32->44|34->47|34->47|36->47|37->48|37->48|37->48|37->48|37->48|37->48|38->49|38->49|38->49|38->49|40->3|40->3|78->1|80->40|82->46|83->51|85->53|85->53|85->53|87->55|87->55|89->57|89->57|89->57|91->59|91->59|91->59|93->61|96->64|96->64|96->64|102->70|102->70|102->70|106->74|106->74|107->75|107->75|108->76|108->76|109->77|109->77|110->78|110->78|115->83|115->83|115->83|117->85|117->85|117->85|117->85|117->85|117->85|118->86|118->86|118->86|119->87|119->87|119->87|121->89|121->89|121->89|123->91|123->91|123->91|124->92|124->92|124->92|125->93|128->96|128->96|128->96|130->98|130->98|130->98|131->99|131->99|131->99|132->100|135->103|139->107|141->109|141->109|143->111|143->111|143->111|145->113|145->113|145->113|147->115|150->118|150->118|150->118|156->124|156->124|156->124|161->129|161->129|166->134|166->134|166->134|168->136|168->136|168->136|168->136|168->136|168->136|170->138|177->145|177->145|177->145|179->147|179->147|181->149|181->149|181->149|185->153|187->155|187->155|187->155|189->157|189->157|189->157|191->159|191->159|193->161|193->161|193->161|197->165|200->168
                    -- GENERATED --
                */
            