class RecordPlayer {
    fun play(music: Music) {
        println("--- Playing Music ---")
        println("Total Playing Time: ${music.getPlayingTime()} seconds")
        println("Songs included:")
        music.getAllSongs().forEach { song ->
            println(" > '${song.title}' by ${song.artist} (${song.playingTime}s)")
        }
        println()
    }
}