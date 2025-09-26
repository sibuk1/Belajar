package eu.kanade.tachiyomi.extension.en.soulscans

import eu.kanade.tachiyomi.source.online.ParsedHttpSource
import eu.kanade.tachiyomi.source.model.FilterList
import okhttp3.Request
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

class Soulscans : ParsedHttpSource() {
    override val name = "SoulScans"
    override val baseUrl = "https://soulscans.my.id"
    override val lang = "en"
    override val supportsLatest = true

    override fun latestUpdatesRequest(page: Int): Request = throw Exception("Not implemented")
    override fun latestUpdatesSelector(): String = ""
    override fun latestUpdatesFromElement(element: Element) = throw Exception("Not implemented")

    override fun popularMangaRequest(page: Int): Request = throw Exception("Not implemented")
    override fun popularMangaSelector(): String = ""
    override fun popularMangaFromElement(element: Element) = throw Exception("Not implemented")

    override fun searchMangaRequest(page: Int, query: String, filters: FilterList): Request = throw Exception("Not implemented")
    override fun searchMangaSelector(): String = ""
    override fun searchMangaFromElement(element: Element) = throw Exception("Not implemented")

    override fun mangaDetailsParse(document: Document) = throw Exception("Not implemented")
    override fun chapterListSelector() = ""
    override fun chapterFromElement(element: Element) = throw Exception("Not implemented")

    override fun pageListParse(document: Document) = throw Exception("Not implemented")
    override fun imageUrlParse(document: Document) = ""
}
