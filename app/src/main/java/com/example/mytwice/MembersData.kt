package com.example.mytwice

object MembersData {
    private val data = arrayOf(
        arrayOf(
            "Kai",
            "Kim Jong-in, atau yang lebih dikenal dengan nama Kai, adalah penyanyi, aktor, dan penari Korea Selatan. Ia adalah anggota grup penyanyi Korea Selatan-Tiongkok EXO dan subkelompok-nya EXO-K.",
            "https://upload.wikimedia.org/wikipedia/commons/0/0c/Kai_-_2016_Gaon_Chart_K-pop_Awards_red_carpet.jpg",
        ),
        arrayOf(
            "Baekhyun",
            "Byun Baek-hyun, atau lebih dikenal dengan mononim Baekhyun adalah penyanyi, penulis lagu, dan aktor Korea Selatan. Pada tahun 2012, Baekhyun memulai debut sebagai anggota grup Korea Selatan-Tiongkok, EXO. Ia juga tergabung dalam dua subunit EXO, yakni EXO-K dan EXO-CBX.Ia juga merupakan leader dari grup SuperM.",
            "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcQ1WO39bPfKKglF3Q6PwwvZUr9ny3TbyL3YiyI6u-eyYUj1tqt72WsKEg8&usqp=CAE&s=19",
        ),
        arrayOf(
            "D.O.",
            "Doh Kyung-soo, juga secara profesional dikenal sebagai D.O., adalah penyanyi dan aktor Korea Selatan, paling dikenal sebagai anggota grup vokal pria Korea Selatan-Tiongkok Exo.",
            "https://cdn1-production-images-kly.akamaized.net/-W1rGWhYJHMl3uT1JgPe61K5KpI=/1200x900/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2819465/original/004625800_1559189314-do.jpg",
        ),
        arrayOf(
            "Sehun",
            "Oh Se-hun, lebih dikenal dengan mononim Sehun, adalah penyanyi, rapper, model, dan aktor asal Korea Selatan. Ia dikenal sebagai anggota dari boyband Korea Selatan-Tiongkok EXO dan sub kelompoknya EXO-K.",
            "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcT_9kbHv-BqMhp9LuEMfN45uKKQaXgcZ15ztAaf0AT_AbDG0JQwrlLxpoej&usqp=CAE&s=19",
        ),
        arrayOf(
            "Chanyeol",
            "Park Chan-yeol, lebih dikenal dengan mononim Chanyeol adalah rapper, penyanyi, penulis lagu, dan aktor Korea Selatan. Ia adalah anggota dari grup penyanyi laki-laki Tiongkok-Korea Selatan EXO dan sub kelompoknya EXO-K.",
            "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcSXidtYqKNewlGH7M5XEfLaqYpBqhZyccNv5lU3akeic5nyIut-2hEq_udU&usqp=CAE&s=19",
        ),
        arrayOf(
            "Chen",
            "Kim Jong-dae, atau lebih dikenal dengan nama panggungnya, Chen, adalah penyanyi dan penulis lagu Korea Selatan. Ia debut pada tahun 2012 sebagai anggota dan vokalis utama grup vokal pria Korea Selatan-Tiongkok, EXO, berserta subunitnya EXO-M.",
            "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcTUtZvnjSvkGqX-ljKYtepXKCYKnxCtMpPYcRyQohajf2V_NVniLP9D-3A&usqp=CAE&s=19",
        ),
        arrayOf(
            "Suho",
            "Kim Jun-myeon, atau lebih dikenal dengan nama panggungnya Suho adalah penyanyi, penulis lagu, dan aktor Korea Selatan. Saat ini ia adalah pemimpin dan vokalis utama grup pria Korea Selatan-Tiongkok, EXO dan subunitnya EXO-K.",
            "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcQDQFY4thGBbYxJJMlIQQTGmejfAoqX0CtafKZ4KFIVq514tFHWHwPgrQKm&usqp=CAE&s=19",
        ),
        arrayOf(
            "Xiumin",
            "Kim Min-seok, atau yang lebih dikenal dengan nama panggungnya Xiumin, adalah penyanyi dan aktor Korea Selatan. Ia dikenal sebagai anggota grup musik Korea Selatan-Tiongkok EXO, berserta subunitnya EXO-M dan EXO-CBX.",
            "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcSYWBfwIL6QmxJ9n4HnW3hro6JDlX5AqmSt23gfjAk-JXjjAliu7ANS2T9_&usqp=CAE&s=19",
        ),
        arrayOf(
            "Lay",
            "Zhang Yixing, atau lebih dikenal dengan nama panggung Lay Zhang atau hanya Lay, adalah seorang penyanyi, rapper, penulis lagu, penari, dan aktor Tiongkok. Ia debut pada tahun 2012 sebagai anggota grup musik pria Korea Selatan-Tiongkok, EXO berserta subunitnya EXO-M di bawah naungan SM Entertainment.",
            "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcTKVRMLndbq1srE1jzXUh-xBjl8pLF4HG1euoaUXH06opAZ2LmaSwWQiW5-&usqp=CAE&s=19",
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