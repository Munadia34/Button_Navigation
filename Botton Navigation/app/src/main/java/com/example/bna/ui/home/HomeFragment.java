package com.example.bna.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bna.R;

import java.util.ArrayList;
import java.util.List;

import com.example.bna.R;
public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, null);
        List<CardData> data = fill_with_data();
        RecyclerView rv = (RecyclerView) root.findViewById(R.id.rv);
        CardAdapter rva = new CardAdapter(data,getContext());
        rv.setAdapter(rva);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));

        return root;
    }
    public List<CardData> fill_with_data(){
        List<CardData> data = new ArrayList<>();
        data.add(new CardData("Vincenzo","1 Season", "20 Episode", "Pada usia delapan tahun, Park Joo-hyung (Song Joong-ki) pergi ke Italia setelah diadopsi oleh Don Fabio, kepala keluarga mafia Cassano. Berganti nama menjadi Vincenzo Cassano, dia menjadi pengacara Italia, seorang consigliere untuk mafia, dan salah satu orang terbaik Fabio sampai kematiannya. Setelah Fabio meninggal, Paolo (putra kandung dan pemimpin baru Fabio) mencoba membunuhnya; dia melarikan diri ke Seoul untuk mendapatkan emas tersembunyi di dalam Kompleks Apartemen Geumga-dong. Vincenzo membantu seorang hartawan asal Tiongkok menyembunyikan emasnya di lemari besi yang diamankan mafia di dalam kompleks tersebut, tetapi orang tersebut meninggal. Tanpa ada yang tahu tentang lemari besi itu, dia berencana untuk mengambil emas itu dan menggunakannya sebagai dana pensiunnya setelah meninggalkan Italia dan mafia.", R.mipmap.vin));
        data.add(new CardData("The Penthouse 2","3 Season", "13 Episode", "Cheon Seo-Jin (Kim So-Yeon) & Joo Dan-Tae (Uhm Ki-Joon) bersiap untuk pernikahan mereka dan penggabungan perusahaan mereka, tetapi mereka berdua merasa gelisah dengan kemungkinan pengkhianatan oleh orang lain. Anak-anak remaja mereka tidak senang menjadi bagian dari keluarga baru mereka. Joo Seok-Kyung (Han Ji-Hyun) masih bingung atas nasib ibunya Shim Su-Ryeon (Lee Ji-Ah). Ha Eun-Byeol (Choi Ye-Bin) tidak ingin ada hubungannya dengan ayah tiri barunya, tetapi dia masih memegang cinta tak terbalas untuk Joo Seok-Hoon (Kim Young-Dae). Sementara itu, Oh Yoon-Hee (Eugene) mengambil langkah pertama dalam rencananya untuk membalas dendam, dengan menyerahkan diri ke polisi. Polisi menetapkan bahwa Oh Yoon-Hee tidak bersalah dalam kasus pembunuhannya.", R.mipmap.ic_launcher));
        data.add(new CardData("Mouse","1 Season", "20 Episode", "Jung Ba-Reum (Lee Seung-Gi) adalah seorang perwira polisi pemula, bekerja di gardu polisi. Dia adalah orang yang jujur dan mencoba untuk mencapai keadilan. Dia menghadapi pembunuh psikopat, yang menempatkan seluruh bangsa dalam ketakutan. Kehidupan Jung Ba-Reum benar-benar berubah setelahnya.", R.mipmap.mouse));
        data.add(new CardData("Sisyphus: The Myth","1 Season", "16 Episode", "Han Tae-Sul adalah seorang insinyur jenius dan salah satu pendiri Quantum and Time Company. Dia tampan dan dia menghasilkan hasil yang inovatif. Berkat usahanya, Quantum and Time telah menjadi perusahaan kelas dunia. Dia dikenal sebagai pekerja ajaib dan pahlawan di Korea, tetapi kenyataannya sedikit berbeda. Setelah kematian kakaknya 10 tahun yang lalu, ia telah menunjukkan perilaku eksentrik. Harga saham perusahaan telah berfluktuasi sesuai. Suatu hari, Han Tae-Sul mengetahui kebenaran yang tidak dapat diandalkan di balik kematian saudaranya. Perjalanan berbahayanya dimulai.", R.mipmap.sis));
        data.add(new CardData("Mr. Queen","1 Season", "20 Episode", "Pada masa sekarang, Jang Bong-Hwan bekerja sebagai koki di Rumah Biru Presiden. Dia memiliki semangat bebas, tetapi semangatnya entah bagaimana menemukan jalan ke dalam tubuh Ratu Kim So-Yong (Shin Hye-Sun) pada periode Joseon Raja Cheoljong (Kim Jung-Hyun) memiliki rahasia. Dia tampak seperti seorang tokoh, yang lembut dan santai. Bahkan, dia menyembunyikan aspek kuatnya. Ratu Sunwon (Bae Jong-Ok) adalah istri mendiang Raja Sunjo. Dia memegang kekuatan sejati di negara ini dan, dengan demikian, membebaskan Raja Cheoljong hanya sebagai tokoh. Kim Jwa-Geun (Kim Tae-Woo) adalah adik Ratu Sunwon. Dia sangat ambisius.", R.mipmap.mr));
        data.add(new CardData("Taxi Driver","1 Season", "16 Episode", "Kim Do-Ki (Lee Je-Hoon) lulus dari Akademi Angkatan Laut dan menjadi Pejabat UDT (tim pembongkaran bawah air). Ibunya dibunuh oleh pembunuh berantai dan hidupnya berubah setelah itu. Kim Do-Ki sekarang menjadi sopir taksi mewah dan bekerja untuk Rainbow Taxi Company. Perusahaan ini bukan hanya perusahaan taksi biasa. Perusahaan ini menawarkan layanan \"panggilan balas dendam\" khusus. Jika klien meminta mereka untuk membalas dendam, Kim Do-Ki dan rekan kerjanya akan melakukan layanan ini.", R.mipmap.taxi));
        data.add(new CardData("River Where The Moon Rises","1 Season", "20 Episode", "Sebuah kisah cinta antara Pyong Gang dan On Dal. Pyong Gang (Kim So-Hyun) adalah putri dari Goguryeo. Dia dibesarkan sebagai tentara untuk Goguryeo segera setelah dia lahir. Dia cukup ambisius untuk bermimpi menjadi Raja Goguryeo. Dia bertemu dengan seorang pria bernama On Dal (Ji Soo).", R.mipmap.river));
        data.add(new CardData("Sell Your Haunted House","1 Season", "16 Episode", "Hong Ji-A (Jang Na-Ra) adalah seorang pengusir setan, yang mengelola Daebak Real Estate. Dia menyingkirkan roh jahat dari properti real estat dan kemudian menjualnya. Oh In-Bum (Jung Yong-Hwa) adalah seorang penipu. Dia sering menggunakan hantu dalam skemanya untuk menghasilkan uang. Hong Ji-A dan Oh In-Bum bekerja sama untuk mengungkapkan rahasia tentang kematian ibu Hong Ji-A, yang meninggal 20 tahun yang lalu.", R.mipmap.sell));
        data.add(new CardData("Law School","1 Season", "16 Episode", "Kang Sol (Ryoo Hye-Young) dan Han Joon-Hwi (Kim Beom) adalah siswa sekolah hukum tahun pertama. Kang Sol nyaris tidak masuk ke sekolah hukum. Dia berasal dari latar belakang keluarga miskin. Di sekolah, dia dikelilingi oleh siswa yang cerdas dan berasal dari latar belakang kaya. Dia merasa tidak aman dan bahkan memalukan karena latar belakangnya. Kang Sol perlahan-lahan belajar tentang profesi hukum yang sebenarnya. Han Joon-Hwi berada di puncak di antara siswa sekolah hukum tahun pertama. Dia adalah pemuda yang menarik dengan kualitas kepemimpinan, tetapi dia memiliki rahasia.", R.mipmap.law));
        data.add(new CardData("Beyond Evil","1 Season", "16 Episode", "Lee Dong-Sik (Shin Ha-Kyun) pernah menjadi detektif yang cakap. Dia sekarang bekerja di Gardu Polisi Manyang di kota kecil dan melakukan semua pekerjaan membosankan di stasiun. Hidupnya tenang di sana. Suatu hari, Detektif Han Joo-Won (Yeo Jin-Goo) dipindahkan ke gardu polisi yang sama. Dia ditugaskan untuk bekerja sebagai bos Lee Dong-Sik dan juga pasangannya. Kasus pembunuhan berantai terjadi di kota kecil yang damai. Kasus ini adalah kasus pembunuhan berantai yang sama yang terjadi 20 tahun yang lalu dan mengubah hidup Lee Dong-Sik. Dua detektif bekerja untuk menangkap pembunuhnya.", R.mipmap.beyond));
        data.add(new CardData("She Would Never Know","1 Season", "16 Episode", "Yoon Song-A (Won Jin-A) bekerja sebagai pemasar untuk merek kosmetik. Dia menikmati pekerjaannya dan melakukannya dengan penuh semangat. Impiannya adalah memulai merek kosmetiknya sendiri. Sementara itu, Chae Hyun-Seung (Ro Woon) bekerja sama dengan Yoon Song-A sebagai pemasar. Dia menjadi tertarik pada Yoon Song-A dan mencoba mengembangkan hubungan romantis dengannya. Namun, Yoon Song-A menolaknya, karena dia tidak melihat pria yang lebih muda sebagai mitra kencan.", R.mipmap.she));
        data.add(new CardData("L.U.C.A.: The Beginning","1 Season", "12 Episode", "Ji-O (Kim Rae-Won) memiliki kekuatan khusus dan rahasia, tetapi dia tidak tahu siapa dia sebenarnya. Dia dikejar oleh tokoh-tokoh misterius, sementara dia mencoba menemukan jawaban atas banyak pertanyaan yang mengelilinginya. Gu-Reum (Lee Da-Hee) adalah seorang detektif. Ketika dia memutuskan tindakan, dia tidak akan berubah apapun yang terjadi. Orang tuanya menghilang ketika dia masih kecil. Gu-Reum mengejar kebenaran di balik hilangnya orang tuanya. Dia bertemu Ji-O dan hidupnya berubah.", R.mipmap.luca));
        return data;
    }
}