class Album(
    val title: String,
    val artist: String,
    val songs: List<Song>
) : Music {

    fun getSongsByArtist(artistName: String): List<Song> {
        return songs.filter { it.artist == artistName }
    }

    override fun getPlayingTime(): Double {
        return songs.sumOf { it.playingTime }
    }

    override fun getAllSongs(): List<Song> {
        return songs
    }
}