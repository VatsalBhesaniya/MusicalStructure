package com.example.android.musicalstructure;

import java.util.ArrayList;

public final class PlaylistArrays {

    public ArrayList<Song> getPlaylistSongs(String playlist) {
        switch (playlist) {
            case "Arijit Singh":
                return songsArijitSingh();
            case "Taylor Swift":
                return songsTaylorSwift();
            case "Jennifer Lopez":
                return songsJenniferLopez();
            case "Justin Bieber":
                return songsJustinBieber();
            case "Ed Sheeran":
                return songsEdSheeran();
            case "Rahat Fateh Ali Khan":
                return songsRahatFatehAliKhan();
            case "Love Songs":
                return songsLoveSongs();
            case "Super Hits":
                return songsSuperHits();
            case "Dj Songs":
                return songsDjSongs();
            default:
                return null;
        }
    }

    private ArrayList<Song> songsArijitSingh() {
        ArrayList<Song> arijitSingh = new ArrayList<Song>() {
        };
        Song arijitSingh1 = new Song(R.drawable.arijit_singh, "Roke Na Ruke Naina",
                "Arijit Singh", R.raw.badrikidulhania_roke_na_nuke_naina);
        Song arijitSingh2 = new Song(R.drawable.arijit_singh, "Nashe Si Chad Gayi",
                "Arijit Singh", R.raw.befikre_nashe_si_chadh_gayi);
        Song arijitSingh3 = new Song(R.drawable.arijit_singh, "Naina",
                "Arijit Singh", R.raw.dangal_naina);
        Song arijitSingh4 = new Song(R.drawable.arijit_singh, "Aaj Se Teri",
                "Arijit Singh", R.raw.padman_aaj_se_teri);
        Song arijitSingh5 = new Song(R.drawable.arijit_singh, "Ae Watan",
                "Arijit Singh", R.raw.raazi_ae_watan);
        arijitSingh.add(arijitSingh1);
        arijitSingh.add(arijitSingh2);
        arijitSingh.add(arijitSingh3);
        arijitSingh.add(arijitSingh4);
        arijitSingh.add(arijitSingh5);
        return arijitSingh;
    }

    private ArrayList<Song> songsTaylorSwift() {
        ArrayList<Song> taylorSwift = new ArrayList<Song>() {
        };
        Song taylorSwift1 = new Song(R.drawable.taylor_swift, "And So It Goes",
                "Taylor Swift", R.raw.taylor_swift_delicate);
        Song taylorSwift2 = new Song(R.drawable.taylor_swift, "Delicate",
                "Taylor Swift", R.raw.taylor_swift_delicate);
        Song taylorSwift3 = new Song(R.drawable.taylor_swift, "Dont Blame Me",
                "Taylor Swift", R.raw.taylor_swift_delicate);
        Song taylorSwift4 = new Song(R.drawable.taylor_swift, "End Game",
                "Taylor Swift", R.raw.taylor_swift_delicate);
        Song taylorSwift5 = new Song(R.drawable.taylor_swift, "Gorgeous",
                "Taylor Swift", R.raw.taylor_swift_delicate);
        Song taylorSwift6 = new Song(R.drawable.taylor_swift, "Something Bad",
                "Taylor Swift", R.raw.taylor_swift_delicate);
        Song taylorSwift7 = new Song(R.drawable.taylor_swift, "Look What You Made Me Do",
                "Taylor Swift", R.raw.taylor_swift_delicate);
        Song taylorSwift8 = new Song(R.drawable.taylor_swift, "Ready For It",
                "Taylor Swift", R.raw.taylor_swift_delicate);
        taylorSwift.add(taylorSwift1);
        taylorSwift.add(taylorSwift2);
        taylorSwift.add(taylorSwift3);
        taylorSwift.add(taylorSwift4);
        taylorSwift.add(taylorSwift5);
        taylorSwift.add(taylorSwift6);
        taylorSwift.add(taylorSwift7);
        taylorSwift.add(taylorSwift8);

        return taylorSwift;
    }

    private ArrayList<Song> songsJenniferLopez() {
        ArrayList<Song> jenniferLopez = new ArrayList<Song>() {
        };
        Song jenniferLopez1 = new Song(R.drawable.jennifer_lopez, "Aint Your Mama",
                "Jennifer Lopez", R.raw.jennifer_lopez_dance_again_ft_pitbull);
        Song jenniferLopez2 = new Song(R.drawable.jennifer_lopez, "Dance Again",
                "Jennifer Lopez", R.raw.jennifer_lopez_dance_again_ft_pitbull);
        Song jenniferLopez3 = new Song(R.drawable.jennifer_lopez, "Dinero",
                "Jennifer Lopez", R.raw.jennifer_lopez_dance_again_ft_pitbull);
        Song jenniferLopez4 = new Song(R.drawable.jennifer_lopez, "El Anillo",
                "Jennifer Lopez", R.raw.jennifer_lopez_dance_again_ft_pitbull);
        Song jenniferLopez5 = new Song(R.drawable.jennifer_lopez, "Try Me",
                "Jennifer Lopez", R.raw.jennifer_lopez_dance_again_ft_pitbull);
        Song jenniferLopez6 = new Song(R.drawable.jennifer_lopez, "On The Floor",
                "Jennifer Lopez", R.raw.jennifer_lopez_dance_again_ft_pitbull);
        Song jenniferLopez7 = new Song(R.drawable.jennifer_lopez, "Papi",
                "Jennifer Lopez", R.raw.jennifer_lopez_dance_again_ft_pitbull);
        jenniferLopez.add(jenniferLopez1);
        jenniferLopez.add(jenniferLopez2);
        jenniferLopez.add(jenniferLopez3);
        jenniferLopez.add(jenniferLopez4);
        jenniferLopez.add(jenniferLopez5);
        jenniferLopez.add(jenniferLopez6);
        jenniferLopez.add(jenniferLopez7);
        return jenniferLopez;
    }

    private ArrayList<Song> songsJustinBieber() {
        ArrayList<Song> justinBieber = new ArrayList<Song>() {
        };
        Song justinBieber1 = new Song(R.drawable.justin_bieber, "Baby",
                "Justin Bieber", R.raw.justin_bieber_ever_let_you_go);
        Song justinBieber2 = new Song(R.drawable.justin_bieber, "Enie Meenie",
                "Justin Bieber", R.raw.justin_bieber_ever_let_you_go);
        Song justinBieber3 = new Song(R.drawable.justin_bieber, "Ever Let You Go",
                "Justin Bieber", R.raw.justin_bieber_ever_let_you_go);
        Song justinBieber4 = new Song(R.drawable.justin_bieber, "Hat Should Be Me",
                "Justin Bieber", R.raw.justin_bieber_ever_let_you_go);
        Song justinBieber5 = new Song(R.drawable.justin_bieber, "Overboard",
                "Justin Bieber", R.raw.justin_bieber_ever_let_you_go);
        Song justinBieber6 = new Song(R.drawable.justin_bieber, "Somebody To Love",
                "Justin Bieber", R.raw.justin_bieber_ever_let_you_go);
        justinBieber.add(justinBieber1);
        justinBieber.add(justinBieber2);
        justinBieber.add(justinBieber3);
        justinBieber.add(justinBieber4);
        justinBieber.add(justinBieber5);
        justinBieber.add(justinBieber6);
        return justinBieber;
    }

    private ArrayList<Song> songsEdSheeran() {
        ArrayList<Song> edSheeran = new ArrayList<Song>() {
        };
        Song edSheeran1 = new Song(R.drawable.ed_sheeran, "Shape Of You",
                "Ed Sheeran", R.raw.ed_sheeran_shape_of_you);
        Song edSheeran2 = new Song(R.drawable.ed_sheeran, "Thinking Out Loud",
                "Ed Sheeran", R.raw.ed_sheeran_shape_of_you);
        Song edSheeran3 = new Song(R.drawable.ed_sheeran, "Photograph",
                "Ed Sheeran", R.raw.ed_sheeran_shape_of_you);
        Song edSheeran4 = new Song(R.drawable.ed_sheeran, "Perfect",
                "Ed Sheeran", R.raw.ed_sheeran_shape_of_you);
        Song edSheeran5 = new Song(R.drawable.ed_sheeran, "Give Me Love",
                "Ed Sheeran", R.raw.ed_sheeran_shape_of_you);
        Song edSheeran6 = new Song(R.drawable.ed_sheeran, "Galway Girl",
                "Ed Sheeran", R.raw.ed_sheeran_shape_of_you);
        Song edSheeran7 = new Song(R.drawable.ed_sheeran, "Eminem River",
                "Ed Sheeran", R.raw.ed_sheeran_shape_of_you);
        edSheeran.add(edSheeran1);
        edSheeran.add(edSheeran2);
        edSheeran.add(edSheeran3);
        edSheeran.add(edSheeran4);
        edSheeran.add(edSheeran5);
        edSheeran.add(edSheeran6);
        edSheeran.add(edSheeran7);
        return edSheeran;
    }

    private ArrayList<Song> songsRahatFatehAliKhan() {
        ArrayList<Song> rahatFatehAliKhan = new ArrayList<Song>() {
        };
        Song rahatFatehAliKhan1 = new Song(R.drawable.rahat_fateh_ali_khan, "Afreen Afreen",
                "Rahat Fateh Ali Khan", R.raw.baadshaho_mere_rashke_qamar);
        Song rahatFatehAliKhan2 = new Song(R.drawable.rahat_fateh_ali_khan, "Halka Halka",
                "Rahat Fateh Ali Khan", R.raw.baadshaho_mere_rashke_qamar);
        Song rahatFatehAliKhan3 = new Song(R.drawable.rahat_fateh_ali_khan, "Mere Rashke Qamar",
                "Rahat Fateh Ali Khan", R.raw.baadshaho_mere_rashke_qamar);
        Song rahatFatehAliKhan4 = new Song(R.drawable.rahat_fateh_ali_khan, "Nit Khair Manga",
                "Rahat Fateh Ali Khan", R.raw.baadshaho_mere_rashke_qamar);
        Song rahatFatehAliKhan5 = new Song(R.drawable.rahat_fateh_ali_khan, "Sanu Ek Pal Chain",
                "Rahat Fateh Ali Khan", R.raw.baadshaho_mere_rashke_qamar);
        Song rahatFatehAliKhan6 = new Song(R.drawable.rahat_fateh_ali_khan, "Zaroori Tha",
                "Rahat Fateh Ali Khan", R.raw.baadshaho_mere_rashke_qamar);
        rahatFatehAliKhan.add(rahatFatehAliKhan1);
        rahatFatehAliKhan.add(rahatFatehAliKhan2);
        rahatFatehAliKhan.add(rahatFatehAliKhan3);
        rahatFatehAliKhan.add(rahatFatehAliKhan4);
        rahatFatehAliKhan.add(rahatFatehAliKhan5);
        rahatFatehAliKhan.add(rahatFatehAliKhan6);
        return rahatFatehAliKhan;
    }

    private ArrayList<Song> songsLoveSongs() {
        ArrayList<Song> loveSongs = new ArrayList<Song>() {
        };
        Song loveSongs1 = new Song(R.drawable.love_songs, "Agar Tum Saath Ho",
                "Arijit Singh, Alka Yagnik", R.raw.samjhawan);
        Song loveSongs2 = new Song(R.drawable.love_songs, "Dil Diyan Gallan",
                "Atif Aslam", R.raw.samjhawan);
        Song loveSongs3 = new Song(R.drawable.love_songs, "Hasi",
                "Shreya Ghoshal", R.raw.samjhawan);
        Song loveSongs4 = new Song(R.drawable.love_songs, "Ishq De Fanniyar",
                "Jyotika Tangri", R.raw.samjhawan);
        Song loveSongs5 = new Song(R.drawable.love_songs, "Kuch To Hai",
                "Amaal Malik", R.raw.samjhawan);
        Song loveSongs6 = new Song(R.drawable.love_songs, "Lae Dooba",
                "Sunidhi Chaihan", R.raw.samjhawan);
        Song loveSongs7 = new Song(R.drawable.love_songs, "Samjhawan",
                "Arijit Singh", R.raw.samjhawan);
        Song loveSongs8 = new Song(R.drawable.love_songs, "Sawaar Loon",
                "Monali Thakur", R.raw.samjhawan);
        loveSongs.add(loveSongs1);
        loveSongs.add(loveSongs2);
        loveSongs.add(loveSongs3);
        loveSongs.add(loveSongs4);
        loveSongs.add(loveSongs5);
        loveSongs.add(loveSongs6);
        loveSongs.add(loveSongs7);
        loveSongs.add(loveSongs8);
        return loveSongs;
    }

    private ArrayList<Song> songsSuperHits() {
        ArrayList<Song> superHits = new ArrayList<Song>() {
        };
        Song superHits1 = new Song(R.drawable.super_hits, "Shape Of You",
                "Ed Sheeran", R.raw.ed_sheeran_shape_of_you);
        Song superHits2 = new Song(R.drawable.super_hits, "Love Me Like You Do",
                "Ellie Goulding", R.raw.ellie_goulding_love_me_like_you_do);
        Song superHits3 = new Song(R.drawable.super_hits, "On The Floor",
                "Jennifer Loopez, ft. Pitbull", R.raw.jennifer_lopez_dance_again_ft_pitbull);
        Song superHits4 = new Song(R.drawable.super_hits, "Diamonds",
                "Rihanna", R.raw.rihanna_diamonds);
        Song superHits5 = new Song(R.drawable.super_hits, "See You Again",
                "Charlie Puth", R.raw.see_you_again_feat_charlie_puth);
        Song superHits6 = new Song(R.drawable.super_hits, "Delicate",
                "Taylor Swift", R.raw.taylor_swift_delicate);
        superHits.add(superHits1);
        superHits.add(superHits2);
        superHits.add(superHits3);
        superHits.add(superHits4);
        superHits.add(superHits5);
        superHits.add(superHits6);
        return superHits;
    }

    private ArrayList<Song> songsDjSongs() {
        ArrayList<Song> djSongs = new ArrayList<Song>() {
        };
        Song djSongs1 = new Song(R.drawable.dj_songs, "Magneta Riddim",
                "Dj Snake", R.raw.dj_snake_magenta_riddim);
        Song djSongs2 = new Song(R.drawable.dj_songs, "Blue Mama",
                "Jons, ft.William Singe", R.raw.dj_jonas_blue_mama_ft_william_singe);
        Song djSongs3 = new Song(R.drawable.dj_songs, "Let Me Love You",
                "Justin Bieber", R.raw.dj_let_me_love_you_ft_justin_bieber);
        Song djSongs4 = new Song(R.drawable.dj_songs, "Despacito",
                "Luis Onsi, ft.Daady Yankee", R.raw.dj_luis_onsi_despacito_ft_daddy_yankee);
        Song djSongs5 = new Song(R.drawable.dj_songs, "Lean On",
                "Major Lazer, Dj Snake", R.raw.dj_major_lazer_dj_snake_lean_on);
        djSongs.add(djSongs1);
        djSongs.add(djSongs2);
        djSongs.add(djSongs3);
        djSongs.add(djSongs4);
        djSongs.add(djSongs5);
        return djSongs;
    }
}
