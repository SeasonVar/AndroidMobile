package seasonvar.server.website.wrapper

data class HomePage(

    val header: Header

) {

    data class Header(
        val tvSeriesCount: Int
    )

}
