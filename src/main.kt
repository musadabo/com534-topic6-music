fun main() {
    val song1 = Song("Hey Jude", "The Beatles", 431.0)
    val song2 = Song("Revolution", "The Beatles", 203.0)
    val song3 = Song("Track One", "Solo Artist", 150.0)
    val song4 = Song("Track Two", "Solo Artist", 200.0)

    val mySingle = Single(song1, song2)
    val myAlbum = Album("The Beatles Collection", "The Beatles", listOf(song1, song2, song3, song4))

    val player = RecordPlayer()

    val playlist: List<Music> = listOf(mySingle, myAlbum)

    playlist.forEach { musicItem ->
        player.play(musicItem)
    }
}