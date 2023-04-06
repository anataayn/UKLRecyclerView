package com.example.mytwice

object MembersData {
    private val data = arrayOf(
        arrayOf(
            "Junhyung",
            "adalah penyanyi-penulis lagu, rapper, produser rekaman, dan aktor Korea Selatan. Junhyung menjadi terkenal sebagai anggota boy band Korea Selatan Highlight (sebelumnya dikenal sebagai Beast), yang dibentuk pada tahun 2009.",
            "https://upload.wikimedia.org/wikipedia/commons/b/bf/Yong_Jun-hyung_2018-05-30.jpg",
        ),
        arrayOf(
            "Dongjun",
            "adalah penyanyi dan aktor Korea Selatan. Dia memulai debutnya sebagai anggota boy grup ZE:A (dan kemudian subgrupnya ZE:A Five dan ZE:AJ).",
            "https://upload.wikimedia.org/wikipedia/commons/2/24/2017_%EC%95%84%EC%8B%9C%EC%95%84_%EB%AA%A8%EB%8D%B8_%ED%8E%98%EC%8A%A4%ED%8B%B0%EB%B2%8C_%EB%A0%88%EB%93%9C%EC%B9%B4%ED%8E%AB_%2872%29.jpg",
        ),
        arrayOf(
            "Shin",
            "adalah aktor Korea Selatan. Salah satu aktor dengan bayaran tertinggi di Korea Selatan, [1] penghargaannya meliputi empat Baeksang Arts Awards , dua Grand Bell Awards , dan satu Blue Dragon Film Award . Dari 2012 hingga 2016 dan pada 2021, ia muncul dalam daftar 40 Selebriti Forbes Korea Power . [2] Ia terpilih sebagai Aktor Televisi Terbaik Gallup Korea Tahun 2014 dan ditampilkan oleh Forbes dalam daftar 30 Under 30 Asia tahun 2016",
            "https://upload.wikimedia.org/wikipedia/commons/2/2a/Kim_Soo-hyun_in_June_2020.jpg",
        ),
        arrayOf(
            "kangsung",
            "Lee Kang Seong atau dikenal dengan nama Kangsung ini adalah main rapper andalan GHOST9. Kangsung dikenal sebagai member dengan suara yang powerful saat melantunkan rap",
            "https://static.wikia.nocookie.net/kpop/images/1/13/GHOST9_Lee_Kang_Sung_Arcade_-_V_concept_photo_1.png/revision/latest?cb=20220323200824",
        ),
        arrayOf(
            "Junseong",
            "(juga dikreditkan sebagai Jun Sung Kim, Jun Kim atau Brian Kim; lahir 4 Oktober 1975) adalah aktor Amerika Serikat kelahiran Hong Kong keturunan Korea. Dia mungkin paling dikenal karena perannya sebagai Mike Juhn dalam film kejahatan tahun 2007 West 32nd (2007), yang disutradarai oleh Michael Kang.",
            "https://static.wikia.nocookie.net/kpop/images/6/60/GHOST9_Choi_Jun_Seong_Arcade_-_V_concept_photo_1.png/revision/latest?cb=20220323200933",
        ),
        arrayOf(
            "Jinwoo",
            "lahir 26 September 1991), juga dikenal secara mononim sebagai Jinu , adalah penyanyi, aktor, dan anggota Pemenang Korea Selatan di bawah YG Entertainment . Band ini memulai debutnya pada 17 Agustus 2014 dengan album penuh berjudul 2014 S/S . Kim juga debut sebagai solois pada 14 Agustus 2019 dengan single album berjudul Jinu's Heyday .",
            "https://kepoper.com/wp-content/uploads/2021/08/JINWOO.png",
        ),
        arrayOf(
            "Taeseung",
            "adalah penyanyi Korea Selatan di bawah Maroo Entertainment . Ia merupakan mantan anggota boy grup GHOST9 dan grup unit TEEN TEEN .",
            "https://static.wikia.nocookie.net/kpop/images/9/9d/GHOST9_Lee_Tae_Seung_Now_-_When_We_Are_In_Love_concept_photo_1.png/revision/latest?cb=20210520174259",
        ),
        arrayOf(
            "Prince",
            "adalah penyanyi Thailand di bawah Maroo Entertainment . Dia adalah anggota dari boy grup GHOST9 .",
            "https://static.wikia.nocookie.net/kpop/images/e/e9/GHOST9_Prince_Arcade_-_V_concept_photo_1.png/revision/latest?cb=20220322195958",
        ),
        arrayOf(
            "Woojin",
            "lahir 8 April 1997), juga dikenal sebagai Woojin ( 우진 ), adalah penyanyi dan aktor Korea Selatan. Dia masuk ke JYP Entertainment dan menjadi anggota boy grup Stray Kids dari formasi mereka melalui acara bertahan hidup eponymous pada tahun 2017 hingga kepergiannya dua tahun kemudian. Dia menandatangani kontrak dengan 10x Entertainment dalam usahanya untuk memulai karir solo. ",
            "https://upload.wikimedia.org/wikipedia/commons/c/c2/190419_Stray_Kids_%E5%AE%87%E7%8F%8D.png",
        ),


    )
    val listData: ArrayList<Member>
        get() {
            val list = arrayListOf<Member>()
            for (aData in data) {
                val member = Member()
                member.name = aData[0]
                member.from = aData[1]
                member.photo = aData[2]
                list.add(member)
            }

            return list
        }
}