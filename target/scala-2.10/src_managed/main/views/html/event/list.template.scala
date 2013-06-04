
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Event],String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Event], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.Html = {
        _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*32.38*/("""
    <th class=""""),_display_(Seq[Any](/*33.17*/key/*33.20*/.replace(".","_"))),format.raw/*33.37*/(""" header """),_display_(Seq[Any](/*33.46*/if(currentSortBy == key){/*33.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*33.136*/("""">
        <a href=""""),_display_(Seq[Any](/*34.19*/link(0, key))),format.raw/*34.31*/("""">"""),_display_(Seq[Any](/*34.34*/title)),format.raw/*34.39*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    
    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }
    
    // Generate the link
    routes.Events.list(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*1.112*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""
    
    <h1 id="homeTitle">"""),_display_(Seq[Any](/*40.25*/Messages("List of LAN parties.", currentPage.getTotalRowCount))),format.raw/*40.87*/("""</h1>

    """),_display_(Seq[Any](/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*50.24*/link(0, "name"))),format.raw/*50.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.66*/currentFilter)),format.raw/*51.79*/("""" placeholder="Filter by the event's name">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">
        </form>
        
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.48*/routes/*55.54*/.Events.registerEvent())),format.raw/*55.77*/("""">Register your own event.</a>
        
    </div>
    
    """),_display_(Seq[Any](/*59.6*/if(currentPage.getTotalRowCount == 0)/*59.43*/ {_display_(Seq[Any](format.raw/*59.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq[Any](format.raw/*65.13*/("""
        
        <table class="table table-condensed">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*70.22*/header("name", "Name"))),format.raw/*70.44*/("""
                    """),_display_(Seq[Any](/*71.22*/header("location", "Location"))),format.raw/*71.52*/("""
                    """),_display_(Seq[Any](/*72.22*/header("fee", "Fee"))),format.raw/*72.42*/("""
                    """),_display_(Seq[Any](/*73.22*/header("start", "Starts"))),format.raw/*73.47*/("""
                    """),_display_(Seq[Any](/*74.22*/header("end", "Ends"))),format.raw/*74.43*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*79.18*/for(event <- currentPage.getList) yield /*79.51*/ {_display_(Seq[Any](format.raw/*79.53*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*81.39*/routes/*81.45*/.Events.showEvent(event.host))),format.raw/*81.74*/("""">"""),_display_(Seq[Any](/*81.77*/event/*81.82*/.name)),format.raw/*81.87*/("""</a></td>
                        <td>"""),_display_(Seq[Any](/*82.30*/event/*82.35*/.location)),format.raw/*82.44*/("""</td>
                        <td>"""),_display_(Seq[Any](/*83.30*/event/*83.35*/.fee)),format.raw/*83.39*/("""</td>
                        <td>
                            """),_display_(Seq[Any](/*85.30*/if(event.start == null)/*85.53*/ {_display_(Seq[Any](format.raw/*85.55*/("""
                                <em>unspecified</em>
                            """)))}/*87.31*/else/*87.36*/{_display_(Seq[Any](format.raw/*87.37*/("""
                                """),_display_(Seq[Any](/*88.34*/event/*88.39*/.start.format("dd MMM yyyy"))),format.raw/*88.67*/("""
                            """)))})),format.raw/*89.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*92.30*/if(event.end == null)/*92.51*/ {_display_(Seq[Any](format.raw/*92.53*/("""
                                <em>unspecified</em>
                            """)))}/*94.31*/else/*94.36*/{_display_(Seq[Any](format.raw/*94.37*/("""
                                """),_display_(Seq[Any](/*95.34*/event/*95.39*/.end.format("dd MMM yyyy"))),format.raw/*95.65*/("""
                            """)))})),format.raw/*96.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*99.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq[Any](/*106.18*/if(currentPage.hasPrev)/*106.41*/ {_display_(Seq[Any](format.raw/*106.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq[Any](/*108.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*108.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*110.19*/else/*110.24*/{_display_(Seq[Any](format.raw/*110.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*114.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*116.36*/currentPage/*116.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*116.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*118.18*/if(currentPage.hasNext)/*118.41*/ {_display_(Seq[Any](format.raw/*118.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*120.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*120.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*122.19*/else/*122.24*/{_display_(Seq[Any](format.raw/*122.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*126.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*130.6*/("""
        
""")))})))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Event],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.Html = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Event],String,String,String) => play.api.templates.Html) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 13:44:00 CEST 2013
                    SOURCE: M:/workpace/Project Code/Williams experimentella version/lanmatchmaker2000/app/views/event/list.scala.html
                    HASH: 77fc0fa2f43c67f6f8dd96c6d264de9a35be50f6
                    MATRIX: 770->1|941->883|955->889|1049->919|1103->937|1115->940|1154->957|1199->966|1233->992|1321->1056|1379->1078|1413->1090|1452->1093|1479->1098|1519->245|1530->249|2078->111|2109->242|2138->766|2170->880|2199->1116|2239->1121|2251->1125|2290->1127|2358->1159|2442->1221|2491->1235|2532->1267|2572->1269|2691->1352|2705->1357|2742->1372|2796->1395|2894->1457|2931->1472|3049->1554|3084->1567|3335->1782|3350->1788|3395->1811|3495->1876|3541->1913|3581->1915|3711->2028|3724->2033|3763->2034|3922->2157|3966->2179|4025->2202|4077->2232|4136->2255|4178->2275|4237->2298|4284->2323|4343->2346|4386->2367|4509->2454|4558->2487|4598->2489|4700->2555|4715->2561|4766->2590|4805->2593|4819->2598|4846->2603|4922->2643|4936->2648|4967->2657|5039->2693|5053->2698|5079->2702|5181->2768|5213->2791|5253->2793|5357->2879|5370->2884|5409->2885|5480->2920|5494->2925|5544->2953|5607->2984|5735->3076|5765->3097|5805->3099|5909->3185|5922->3190|5961->3191|6032->3226|6046->3231|6094->3257|6157->3288|6266->3365|6434->3496|6467->3519|6508->3521|6620->3596|6683->3636|6770->3704|6784->3709|6824->3710|6999->3852|7111->3927|7132->3938|7188->3971|7271->4017|7304->4040|7345->4042|7457->4117|7520->4157|7603->4221|7617->4226|7657->4227|7828->4365|7912->4417
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|99->73|99->73|100->74|100->74|105->79|105->79|105->79|107->81|107->81|107->81|107->81|107->81|107->81|108->82|108->82|108->82|109->83|109->83|109->83|111->85|111->85|111->85|113->87|113->87|113->87|114->88|114->88|114->88|115->89|118->92|118->92|118->92|120->94|120->94|120->94|121->95|121->95|121->95|122->96|125->99|132->106|132->106|132->106|134->108|134->108|136->110|136->110|136->110|140->114|142->116|142->116|142->116|144->118|144->118|144->118|146->120|146->120|148->122|148->122|148->122|152->126|156->130
                    -- GENERATED --
                */
            