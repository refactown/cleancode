package refactown.cleancode.c03functions


fun delete(page: Page) {
    try {
        deletePageAndAllReferences(page)
    } catch (e: Exception) {
        logError(e)
    }
}

private fun deletePageAndAllReferences(page: Page) {
    deletePage(page)
    deleteReferences(page)
    page.configKeys.delete()
}

private fun deleteReferences(page: Page) {}

private fun deletePage(page: Page) {}

fun logError(e: Exception) {}

class Page(val configKeys: ConfigKeys) {

}

class ConfigKeys {
    fun delete() {
        refactown.cleancode.c03functions.delete(Page(ConfigKeys()))
    }
}
