package com.swarawan.sample

/**
 * Created by Rio Swarawn on 7/10/18.
 */
data class Stock(val id: Int,
                 val name: String,
                 val stock: Int,
                 val price: Int) {

    companion object {
        fun getData(): MutableList<Stock> =
                mutableListOf<Stock>().apply {
                    add(Stock(1, "Remote TV", 10, 10000))
                    add(Stock(2, "Handphone", 9, 2000000))
                    add(Stock(3, "Aqua Botol", 29, 2500))
                    add(Stock(4, "Aqua Botol Kardus", 29, 2500))
                    add(Stock(5, "Aqua Gelas", 0, 0))
                    add(Stock(6, "Aqua Gelas Kardus", 0, 0))
                    add(Stock(7, "Aqua Galon", 0, 0))
                    add(Stock(8, "Amplop 110×230", 0, 0))
                    add(Stock(9, "Amplop 95×152", 0, 0))
                    add(Stock(10, "Amplop Lamaran", 0, 0))
                    add(Stock(11, "Buku Gambar A4 Ria", 0, 0))
                    add(Stock(12, "Buku Gambar Kecil Ria", 0, 0))
                    add(Stock(13, "Buku Tulis Big Boss 42 Lembar", 0, 0))
                    add(Stock(14, "Buku Tulis Dodo 38 Lembar", 0, 0))
                    add(Stock(15, "Buku Tulis Dodo 58 Lembar", 0, 0))
                    add(Stock(16, "Buku Tulis Lani 30 Lembar", 0, 0))
                    add(Stock(17, "Buku Tulis Lani 38 Lembar", 0, 0))
                    add(Stock(18, "Buku Tulis Segitiga 58 Lembar", 0, 0))
                    add(Stock(19, "Buku Tulis Sidu 38 Lembar", 0, 0))
                    add(Stock(20, "Buku Tulis Sidu 58 Lembar", 0, 0))
                }
    }
}