## Cara Pengerjaan 2A

![2a_sisop](https://user-images.githubusercontent.com/57633103/113398288-8cce3a80-93c8-11eb-8cea-474a19d683c7.png)

Untuk mengetahui Row ID dan profit percentage terbesar maka menggunakan definisi dari Profit Percentage yaitu : `profit=(($NF/($(NF-3)-$NF))*100)`. 
`NF` yaitu kolom paling belakang, berdasarkan definisi tersebut kolomnya dihitung paling terakhir setelah itu mundur tiga setelah itu dikali seratus maka akan diketahui  profit percentage nya, Setelah itu masuk ke percabangan, jika  `profit>=max` maka yang paling besar akan ditampilkan ID nya beserta  profit percentage nya dan otputnya pada `hasil.txt`.

![2a_sisop_output](https://user-images.githubusercontent.com/57633103/113399663-c2742300-93ca-11eb-864f-c77fe015e420.png)


## Cara Pengerjaan 2B

![2b_sisop](https://user-images.githubusercontent.com/57633103/113398735-40cfc580-93c9-11eb-8d08-8d0c4a903841.png)

Membutuhkan daftar nama customer pada transaksi tahun 2017 di Albuquerque. `if($2~"-2017-" && $10~"Albuquerque")` Setelah melalui percabangan maka akan diteruskan ke `a[$7]` yaitu terdapat nama-nama yang ada pada rentang tersebut, Setelah itu diiterasikan array tersebut `for (costumer in a)`, dan akan ditampilkan satu persatu isi dari array nya dan otputnya pada `hasil.txt`.

![2b_sisop_output](https://user-images.githubusercontent.com/57633103/113399719-df105b00-93ca-11eb-97f5-6ee6c895e821.png)


## Cara Pengerjaan 2C

Membutuhkan segment customer dan jumlah transaksinya yang paling sedikit. Karena mencari yang paling sedikit, `min` diinisialisasikan menjadi `9999` yaitu angka paling maksimal, Setelah itu dilakukan iterasi dan terdapat percabangan didalamnya, maka akan terus dicari yang paling sedikit terus akan ditampilkan.

## Cara Pengerjaan 2D

mencari wilayah bagian (region) yang memiliki total keuntungan (profit) paling sedikit dan total keuntungan wilayah tersebut. Hampir sama dengan `2c` perbedaannya terdapat pada kolom, untuk `2c` menggunakan kolom nomor `8`. Mengunakan `NF` yaitu kolom paling belakang diinisialisasikan sebagai profit
Setelah itu jika `NR > 1` maka index nya bertambah sesuai profitnya. Beranjak ke `END` nya setelah diinisialisasi `min` ke angka paling besar, masuk ke iterasi, jika `min > c[reg]` maka `min` nya akan berubah menjadi kecil agar ketemu angka paling kecilnya.
