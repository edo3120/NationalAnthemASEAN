package com.example.nationalanthemasean;

import java.util.ArrayList;

import javax.sql.StatementEvent;

public class StateData {
    private static String[] stateNames = {
            "Brunei Darussalam",
            "Cambodia",
            "Indonesia",
            "Laos",
            "Malaysia",
            "Myanmar",
            "Philippines",
            "Singapore",
            "Thailand",
            "Vietnam"

    };

    private static String[] nationalAnthems = {
            "Allah Peliharakan Sultan (God Bless the Sultan)",
            "Nokor Reach (Royal Kingdom)",
            "Indonesia Raya (Great Indonesia)",
            "Pheng Xat Lao (Lao National Anthem)",
            "Negaraku (My Country)",
            "Kaba Ma Kyei (Till the End of the World)",
            "Lupang Hinirang (Chosen Land)",
            "Majulah Singapura (Onward Singapore)",
            "Phleng Chat Thai (Thai National Anthem)",
            "Tien Quan Ca (Marching Song)"
    };

    private static String[] lyrics = {
            "Ya Allah lanjutkanlah usia\nKebawah Duli Yang Maha Mulia\nAdil berdaulat menaungi nusa\nmemimpin rakyat kekal bahagia\nhidup sentosa negara dan sultan\nIlahi selamatkan Brunei Darussalam",
            "Som pouk tepda rak sa moha khsath yeung\nOy ben roung roeung doy chey monkol srey soursdey\nYeung Khnom preah ang som chrok Krom molup preah Baromey\nNey preah Noropdey vong Khsattra del sang preah sat thm\u00ADr\nKroup Kraung dèn Khmer borann thkoeung thkann.\n\nPrasath séla kombang kan dal prey\nKuor oy sr\u00ADmay noeuk d\u00ADl yuos sak Moha Nokor\nCheat Khmer dauch Thmar kong vong n\u00ADy l\u00ADar rung peung chom hor.\nYeung sang Khim por pheap preng samnang robuos Kampuchea.\nMoha r\u00ADth koeut mien you ang veanh hey.\n\nKroup vath aram lu tè so sap thoeur\nSot doy am no rom lik koun poth sasna\nChol yeung chea neak thioeur thiak smos smak tam bep donnta\nKong tè thévoda nùng chuoy chrom chrèng phkot phkang pra yoch oy\nDol prateah Khmer chea Moha Nokor",
            "Indonesia tanah airku,\nTanah tumpah darahku,\nDisanalah aku berdiri,\nJadi pandu ibuku,\nIndonesia kebangsaanku,\nBangsa dan tanah airku,\nMarilah kita berseru:\n\"Indonesia bersatu!\"\nHiduplah tanahku,\nHiduplah negeriku,\nBangsaku, Rakyatku semuanya.\nBangunlah jiwanya,\nBangunlah badannya\nUntuk Indonesia Raya!\n\nIndonesia Raya, merdeka, merdeka\nTanahku, negeriku yang kucinta\nIndonesia Raya, merdeka, merdeka\nHiduplah Indonesia Raya",
            "Xatlao tangtae dayma lao thookthuana xeutxoo sootchay,\nHuamhaeng huamchit huamchay samakkhikan pen kamlang diao.\nDetdiao phomkan kaona booxa xukiat khong lao,\nSongseum xaysit pen chao laothook xonphao sameu pabkan.\nBo hay foong chackkaphat lae phuak khayxat khaomalob kuan,\nLao thangmuan xoo ekkalat itsalaphab khong xatlao vay,\nTatsin chay soo xing ao xay phaxat kaopay soo khuam vatthana.",
            "Negara ku, tanah tumpahnya darah ku\nRakyat hidup bersatu dan maju\nRahmat bahagia, Tuhan kurniakan\nRaja kita selamat bertakhta\n(repeat previous two lines)",
            "Gba majay Bma pyay\nDobo bwa myay si mo chi myano bey.\nByay daungtsu go athé bay loo do ka kwe mlay.\nDa do byay da do myay way myay.\nDo byay do myay adjogo nyinya zwa do dudway.\nTaung saung ba tso lay do dawon bay apo dan myay.",
            "Bayang magiliw\nPerlas ng Silanganan,\nAlab ng puso\nSa dibdib mo'y buhay.\n\nLupang hinirang\nDuyan ka ng magiting\nSa manlulupig\nDi ka pasisiil.\n\nSa dagat at bundok\nSa simoy at sa langit mong bughaw,\nMay dilag ang tula\nAt awit sa paglayang minamahal.\n\nAng kislap ng watawat mo'y\nTagumpay na nangniningning;\nAng bituin at araw niya\nKailan pa ma'y di magdidilim.\n\nLupa ng araw, ng luwalhati't pagsinta,\nBuhay ay langit sa piling mo,\nAming ligaya na pag may mang-aapi\nAng mamatay nang dahil sa iyo.",
            "Mari kita rakyat\nSingapura sama-sama menuju,bahagia.\nCita-cita kita yang mulia.\nBerjaya,Singapura.\nMarilah kita bersatu.\nDengan semangat yang baru.\nSemua kita berseru.\nMajulah Singapura.\nMajulah Singapura. Marira!",
            "Pra thet thai ruam luead nu’a chat chu’a thai\nPen pra cha rat pha thai kho’ng thai thuk suan\nYu dam rong khong wai dai thang muan\nDuay thai luan mai rak sa mak khi\nThai ni rak sa ngop tae thu’ng rop mai khlat\nEk ka raj ja mai hai khrai khom khi\nSa la luead thuk yat pen chat p’hli\nTha loeng pra thet chat thai tha wi mi chai ch’yo",
            "Đoàn quân Việt Nam đi\nChung lòng cứu quốc\nBước chân dồn vang trên đường gập ghềnh xa\nCờ in máu chiến thắng mang hồn nước,\nSúng ngoài xa chen khúc quân hành ca.\nĐường vinh quang xây xác quân thù,\nThắng gian lao cùng nhau lập chiến khu.\nVì nhân dân chiến đấu không ngừng,\nTiến mau ra sa trường,\nTiến lên, cùng tiến lên.\nNước non Việt Nam ta vững bền.\n\nĐoàn quân Việt Nam đi\nSao vàng phấp phới\nDắt giống nòi quê hương qua nơi lầm than\nCùng chung sức kiến thiết xây đời mới,\nĐứng đều lên gông xích ta đập tan.\nTừ bao lâu ta nuốt căm hờn,\nQuyết hy sinh đời ta tươi thắm hơn.\nVì nhân dân chiến đấu không ngừng,\nTiến mau ra sa trường,\nTiến lên, cùng tiến lên.\nNước non Việt Nam ta vững bền."
    };

    private static int[] statesFlags = {
            R.drawable.bruneian_flag_medium,
            R.drawable.cambodian_flag_medium,
            R.drawable.indonesian_flag_medium,
            R.drawable.laotian_flag_medium,
            R.drawable.malaysian_flag_medium,
            R.drawable.myanmar_flag_medium,
            R.drawable.filipino_flag_medium,
            R.drawable.singaporean_flag_medium,
            R.drawable.thai_flag_medium,
            R.drawable.vietnamese_flag_medium

    };

    static ArrayList<State> getListData(){
        ArrayList<State> list = new ArrayList<>();
        for (int position = 0; position < stateNames.length; position++){
            State state = new State();
            state.setName(stateNames[position]);
            state.setAnthem(nationalAnthems[position]);
            state.setLyric(lyrics[position]);
            state.setFlag(statesFlags[position]);
            list.add(state);
        }
        return list;
    }
}
