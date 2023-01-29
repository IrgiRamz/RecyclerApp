package com.example.recyclerapplication

object FoodsData {
    private val foodNames = arrayOf("Bakso",
        "Bika Ambon",
        "Gado-gado",
        "Gorengan",
        "Gudeg",
        "Kerak Telur",
        "Nasi Goreng",
        "Opor",
        "Pempek",
        "Pepes",
        "Rawon",
        "Rendang",
        "Sate",
        "Sop buntut",
        "Soto")

    private val foodDetails = arrayOf("Bakso, si makanan berbentuk bulat ini rasanya sungguh-sungguh lezat. Makan bakso setiap hari pun tidak masalah. Bakso yang umumnya dikonsumsi adalah bakso sapi dan bakso ikan.",
        "Ada kue khas Indonesia yang rasanya disukai banyak orang. Nama kue tersebut adalah bika ambon. Bika ambon terbuat dari bahan-bahan utama pembuat kue, seperti telur, gula dan santan.",
        "Gado-gado adalah makanan khas Indonesia yang sehat. Kamu bisa lihat dari gambar makanan, isinya adalah sayur-sayuran. Dicampur dengan bumbu kacang super lezat membuat gado-gado menjadi salah satu makanan berisi sayuran yang paling banyak disukai.",
        "Masyarakat Indonesia sudah tahu bahwa gorengan itu merupakan makanan yang kurang sehat untuk tubuh, namun tetap saja gorengan adalah makanan yang sudah menjadi bagian dari kehidupan banyak penduduk Indonesia. Apa saja bisa dijadikan gorengan, namun yang umum adalah pisang, tempe, bakwan, ubi dan singkong.",
        "Makanan khas Indonesia yang bernama gudeg ini juga wajib kamu cicipi. Gudeg merupakan sayur nangka muda yang dimasak dengan gula merah dan santan. Agar lebih lezat, gudeg biasanya dimakan bersama telur rebus, ayam goreng dan beberapa lauk lainnya.",
        "Kerak telur adalah jajanan khas Indonesia, lebih tepatnya Betawi. Kerak telur adalah campuran antara beras ketan dan telur ayam atau telur bebek yang kemudian dicampur dengan bumbu-bumbu.",
        "Nasi goreng juga ada di negara-negara lain, namun bagaimanapun juga nasi goreng Indonesia terasa lebih enak di lidah karena memang dimasak menggunakan bumbu-bumbu khas Indonesia yang sangat kaya.",
        "Makanan santan dengan isi kentang, telur dan ayam yang sangat enak ini dinamakan opor. Saat sedang berada di luar negeri, apalagi di negara yang makanannya kurang sesuai dengan lidah, pasti kamu akan terbayang-bayang opor.",
        "Apa jadinya jika ikan dan tepung diadon menjadi satu lalu digoreng? Pempek adalah sebutan untuk makanan ini. Pempek biasanya dimakan menggunakan bumbunya yang terbuat dari cuka yang dicampur dengan gula. ",
        "Setelah melihat gambar makanan pepes di atas, bagaimana pendapatmu? Apakah terlihat menarik untuk dicoba? Jangan tertipu, karena pepes rasanya enak walaupun tidak terlihat enak. Karena dibungkus dengan daun pisang, pepes mengeluarkan aroma yang sangat sedap. Isi pepes itu sendiri bisa bermacam-macam, misalnya saja tahu, telur, ayam, ataupun jamur.",
        "Rawon adalah makanan berkuah hitam pekat yang berasal dari provinsi Jawa Timur. Terbuat dari dua bahan utama, yaitu daging sapi dan kluwek, Rawon paling nikmat disantap hangat-hangat.",
        "Dilihat dari gambarnya saja rendang sudah lezat, apalagi saat kamu mencicipinya. Kelezatan rendang sudah dikenal dunia. Bahan utama rendang adalah daging. Dimasak dengan aneka bumbu khas Indonesia, rasa rendang menjadi tiada duanya. Banyak orang yang langsung ketagihan pada saat pertama kali mereka mencicipi rendang.",
        "Sate, siapa yang tidak suka makan sate? Makanan yang menggunakan tusuk bambu dan menghasilkan bau harum saat dibakar ini adalah makanan kesukaan banyak orang Indonesia. Jenis sate ada bermacam-macam, seperti sate ayam, babi dan kambing. Gambar makanan sate di atas sudah membuatmu meneteskan air liur, kan?",
        "Siapa sangka kalau buntut sapi ternyata enak jika dimasak dengan cinta dan bumbu yang tepat. Ya, memang seperti itulah kenyataannya. Kelezatan sop buntut terkenal bukan hanya di Indonesia, namun juga di luar negeri.",
        "Daging dan sayuran yang bersatu padu di dalam kuah dengan bumbu lezat adalah makanan khas Indonesia yang dinamai soto. Ada banyak jenis soto di Indonesia, tergantung asal kotanya. Walaupun jenisnya ada banyak, semuanya mampu menggoyang lidah.")

    private val foodsImages = intArrayOf(R.drawable.bakso,
        R.drawable.bikaambon,
        R.drawable.gadogado,
        R.drawable.gorengan,
        R.drawable.gudeg,
        R.drawable.keraktelur,
        R.drawable.nasigoreng,
        R.drawable.opor,
        R.drawable.pempek,
        R.drawable.pepes,
        R.drawable.rawon,
        R.drawable.rendang,
        R.drawable.sate,
        R.drawable.sopbuntut,
        R.drawable.soto)

    val listData: ArrayList<Foods>
        get() {
            val list = arrayListOf<Foods>()
            for (position in foodNames.indices) {
                val foods = Foods()
                foods.name = foodNames[position]
                foods.detail = foodDetails[position]
                foods.photo = foodsImages[position]
                list.add(foods)
            }
            return list
        }
}