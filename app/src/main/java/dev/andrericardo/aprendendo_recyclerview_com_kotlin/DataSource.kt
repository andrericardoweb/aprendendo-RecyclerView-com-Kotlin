package dev.andrericardo.aprendendo_recyclerview_com_kotlin
import dev.andrericardo.aprendendo_recyclerview_com_kotlin.models.Filme

class DataSource {

    companion object {
        fun createDataSet(): ArrayList<Filme>{
            val list = ArrayList<Filme>()
            list.add(
                Filme(
                    "Um Sonho de Liberdade",
                    1994,
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/umX3lBhHoTV7Lsci140Yr8VpXyN.jpg",
                    "https://www.themoviedb.org/movie/278"
                )
            )
            list.add(
                Filme(
                    "O Poderoso Chefão",
                    1972,
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oJagOzBu9Rdd9BrciseCm3U3MCU.jpg",
                    "https://www.themoviedb.org/movie/238"
                )
            )
            list.add(
                Filme(
                    "A Lista de Schindler",
                    1993,
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/bGhhNzJYDsuLruNN5bJ2PvLcMiq.jpg",
                    "https://www.themoviedb.org/movie/424"
                )
            )
            list.add(
                Filme(
                    "Clube da Luta ",
                    1999,
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/r3pPehX4ik8NLYPpbDRAh0YRtMb.jpg",
                    "https://www.themoviedb.org/movie/550"
                )
            )
            list.add(
                Filme(
                    "Interestelar",
                    2014,
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/nCbkOyOMTEwlEV0LtCOvCnwEONA.jpg",
                    "https://www.themoviedb.org/movie/157336"
                )
            )
            return list
        }
    }
}