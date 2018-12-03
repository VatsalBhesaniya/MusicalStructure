package com.example.android.musicalstructure;

import java.util.ArrayList;

public final class AlbumArrays {
    public ArrayList<Song> getAlbumSongs(String album) {
        switch (album) {
            case "Dangal":
                return songsDangal();
            case "Padmaavat":
                return songsPadmaavat();
            case "Badrinath Ki Dulhaniya":
                return songsBadrinathKiDulhaniya();
            case "Padman":
                return songsPadman();
            case "Raid":
                return songsRaid();
            case "Raazi":
                return songsRaazi();
            case "Befikre":
                return songsBefikre();
            case "Sonu Ke Titu Ki Sweety":
                return songsSonuKeTituKiSweety();
            case "Veere Di Wedding":
                return songsVeereDiWedding();
            case "Baadshaho":
                return songsBaadshaho();
            default:
                return null;
        }
    }

    private ArrayList<Song> songsDangal() {
        ArrayList<Song> dangal = new ArrayList<Song>() {
        };
        Song dangal1 = new Song(R.drawable.dangal, "Naina",
                "Arijit Singh", R.raw.dangal_naina);
        Song dangal2 = new Song(R.drawable.dangal, "Dangal",
                "Daler Mehndi", R.raw.dangal_naina);
        Song dangal3 = new Song(R.drawable.dangal, "Dhaakad",
                "Raftaar", R.raw.dangal_naina);
        Song dangal4 = new Song(R.drawable.dangal, "Gilheriyaan",
                "Jonita Gandhi", R.raw.dangal_naina);
        Song dangal5 = new Song(R.drawable.dangal, "Haanikaarak Bapu",
                "Sarwar Khan, Sartaz Khan Barna", R.raw.dangal_naina);
        Song dangal6 = new Song(R.drawable.dangal, "Idiot Banna",
                "Jyoti Nooran, Sultana Nooran", R.raw.dangal_naina);
        dangal.add(dangal1);
        dangal.add(dangal2);
        dangal.add(dangal3);
        dangal.add(dangal4);
        dangal.add(dangal5);
        dangal.add(dangal6);
        return dangal;
    }

    private ArrayList<Song> songsPadmaavat() {
        ArrayList<Song> padmaavat = new ArrayList<Song>() {
        };
        Song padmaavat1 = new Song(R.drawable.padmaavat, "Ghoomar",
                "Shreya Ghoshal, Swaroop Khan", R.raw.padmaavat_ghoomar);
        Song padmaavat2 = new Song(R.drawable.padmaavat, "Binte Dil",
                "Arijit Singh", R.raw.padmaavat_ghoomar);
        Song padmaavat3 = new Song(R.drawable.padmaavat, "Ek Dil Ek Jaan",
                "Shivam Pathak, Kunal Pandit", R.raw.padmaavat_ghoomar);
        Song padmaavat4 = new Song(R.drawable.padmaavat, "Holi",
                "Richa Sharma, Sahil Hada", R.raw.padmaavat_ghoomar);
        Song padmaavat5 = new Song(R.drawable.padmaavat, "Khalibali",
                "Shivam Pathak, Sahil Hada", R.raw.padmaavat_ghoomar);
        Song padmaavat6 = new Song(R.drawable.padmaavat, "Nainowale Ne",
                "Neeti Mohan", R.raw.padmaavat_ghoomar);
        padmaavat.add(padmaavat1);
        padmaavat.add(padmaavat2);
        padmaavat.add(padmaavat3);
        padmaavat.add(padmaavat4);
        padmaavat.add(padmaavat5);
        padmaavat.add(padmaavat6);

        return padmaavat;
    }

    private ArrayList<Song> songsBadrinathKiDulhaniya() {
        ArrayList<Song> badrinathKiDulhaniya = new ArrayList<Song>() {
        };
        Song badrinathkidulhania1 = new Song(R.drawable.badrinathkidulhania, "Roke Na Ruke Naina",
                "Arijit Singh", R.raw.badrikidulhania_roke_na_nuke_naina);
        Song badrinathkidulhania2 = new Song(R.drawable.badrinathkidulhania, "Badri Ki Dulhaniya",
                "Dev Negi, Neha Kakkar, Monali Thakur", R.raw.badrikidulhania_roke_na_nuke_naina);
        Song badrinathkidulhania3 = new Song(R.drawable.badrinathkidulhania, "Aashique Surrander Hua",
                "Amaal Malik, Shreya Ghoshal", R.raw.badrikidulhania_roke_na_nuke_naina);
        Song badrinathkidulhania4 = new Song(R.drawable.badrinathkidulhania, "Humsufar",
                "Akhil Sachdeva", R.raw.badrikidulhania_roke_na_nuke_naina);
        Song badrinathkidulhania5 = new Song(R.drawable.badrinathkidulhania, "Tamma Tamma",
                "Bappi Lahiri, Anuradha Paudwal", R.raw.badrikidulhania_roke_na_nuke_naina);
        badrinathKiDulhaniya.add(badrinathkidulhania1);
        badrinathKiDulhaniya.add(badrinathkidulhania2);
        badrinathKiDulhaniya.add(badrinathkidulhania3);
        badrinathKiDulhaniya.add(badrinathkidulhania4);
        badrinathKiDulhaniya.add(badrinathkidulhania5);
        return badrinathKiDulhaniya;
    }

    private ArrayList<Song> songsPadman() {
        ArrayList<Song> padman = new ArrayList<Song>() {
        };
        Song padman1 = new Song(R.drawable.padman, "Aaj Se Teri",
                "Arijit Singh", R.raw.padman_aaj_se_teri);
        Song padman2 = new Song(R.drawable.padman, "Hu Ba Hu",
                "Amit Trivedi", R.raw.padman_aaj_se_teri);
        Song padman3 = new Song(R.drawable.padman, "Saale Sapne",
                "Mohit Chauhan", R.raw.padman_aaj_se_teri);
        Song padman4 = new Song(R.drawable.padman, "Sayaani",
                "Yashika Sharma, Jonita Gandhi", R.raw.padman_aaj_se_teri);
        Song padman5 = new Song(R.drawable.padman, "Padman",
                "Mika Singh", R.raw.padman_aaj_se_teri);
        padman.add(padman1);
        padman.add(padman2);
        padman.add(padman3);
        padman.add(padman4);
        padman.add(padman5);
        return padman;
    }

    private ArrayList<Song> songsRaid() {
        ArrayList<Song> raid = new ArrayList<Song>() {
        };
        Song raid1 = new Song(R.drawable.raid, "Nit Khair Manga",
                "Rahat Fateh Ali Khan", R.raw.raid_nit_khair_manga);
        Song raid2 = new Song(R.drawable.raid, "Black",
                "Sukhwinder Singh", R.raw.raid_nit_khair_manga);
        Song raid3 = new Song(R.drawable.raid, "Jhuk Na Paunga",
                "Papon", R.raw.raid_nit_khair_manga);
        Song raid4 = new Song(R.drawable.raid, "Sanu Ek Pal Chain",
                "Rahat Fateh Ali Khan", R.raw.raid_nit_khair_manga);
        raid.add(raid1);
        raid.add(raid2);
        raid.add(raid3);
        raid.add(raid4);
        return raid;
    }

    private ArrayList<Song> songsRaazi() {
        ArrayList<Song> raazi = new ArrayList<Song>() {
        };
        Song raazi1 = new Song(R.drawable.raazi, "Dilbaro",
                "Harshdeep Kaur", R.raw.raazi_dilbaro);
        Song raazi2 = new Song(R.drawable.raazi, "Ae Watan - Male",
                "Arijit Singh", R.raw.raazi_dilbaro);
        Song raazi3 = new Song(R.drawable.raazi, "Ae Watan - Female",
                "Sunidhi Chauhan", R.raw.raazi_dilbaro);
        Song raazi4 = new Song(R.drawable.raazi, "Raazi",
                "Arijit Singh", R.raw.raazi_dilbaro);
        raazi.add(raazi1);
        raazi.add(raazi2);
        raazi.add(raazi3);
        raazi.add(raazi4);
        return raazi;
    }

    private ArrayList<Song> songsBefikre() {
        ArrayList<Song> befikre = new ArrayList<Song>() {
        };
        Song befikre1 = new Song(R.drawable.befikre, "Nashe Si Chad Gayi",
                "Arijit Singh", R.raw.befikre_nashe_si_chadh_gayi);
        Song befikre2 = new Song(R.drawable.befikre, "Je Taime",
                "Vishal Dadlani, Sunidhi Chauhan", R.raw.befikre_nashe_si_chadh_gayi);
        Song befikre3 = new Song(R.drawable.befikre, "Khulke Dhulke",
                "Gippy Gerwal, Harshdeep Kaur", R.raw.befikre_nashe_si_chadh_gayi);
        Song befikre4 = new Song(R.drawable.befikre, "Labon Ka Karobaar",
                "Papon", R.raw.befikre_nashe_si_chadh_gayi);
        Song befikre5 = new Song(R.drawable.befikre, "Love Is Dare",
                "Instrumental", R.raw.befikre_nashe_si_chadh_gayi);
        befikre.add(befikre1);
        befikre.add(befikre2);
        befikre.add(befikre3);
        befikre.add(befikre4);
        befikre.add(befikre5);
        return befikre;
    }

    private ArrayList<Song> songsSonuKeTituKiSweety() {
        ArrayList<Song> sonuKeTituKiSweety = new ArrayList<Song>() {
        };
        Song sonuketitukisweety1 = new Song(R.drawable.sonuketitukisweety, "Bom Diggy Diggy",
                "Zack Knight, Jasmin Walia", R.raw.sonuketitukisweety_bom_diggy_diggy);
        Song sonuketitukisweety2 = new Song(R.drawable.sonuketitukisweety, "Chhote Chotte Peg",
                "Honey Singh, Neha Kakkar", R.raw.sonuketitukisweety_bom_diggy_diggy);
        Song sonuketitukisweety3 = new Song(R.drawable.sonuketitukisweety, "Dil Chori",
                "Simar Kaur, Honey Singh", R.raw.sonuketitukisweety_bom_diggy_diggy);
        Song sonuketitukisweety4 = new Song(R.drawable.sonuketitukisweety, "Kaun Nachdi",
                "Guru Randhawa, Neeti Mohan", R.raw.sonuketitukisweety_bom_diggy_diggy);
        sonuKeTituKiSweety.add(sonuketitukisweety1);
        sonuKeTituKiSweety.add(sonuketitukisweety2);
        sonuKeTituKiSweety.add(sonuketitukisweety3);
        sonuKeTituKiSweety.add(sonuketitukisweety4);
        return sonuKeTituKiSweety;
    }

    private ArrayList<Song> songsVeereDiWedding() {
        ArrayList<Song> veereDiWedding = new ArrayList<Song>() {
        };
        Song veerediwedding1 = new Song(R.drawable.veerediwedding, "Tareefan",
                "Baadshah", R.raw.veerediwedding_tareefan);
        Song veerediwedding2 = new Song(R.drawable.veerediwedding, "Aa Jao Na",
                "Arijit Singh, Shashwat Sachdev", R.raw.veerediwedding_tareefan);
        Song veerediwedding3 = new Song(R.drawable.veerediwedding, "Bass Gira De Raja",
                "Shashwat Sachdev", R.raw.veerediwedding_tareefan);
        Song veerediwedding4 = new Song(R.drawable.veerediwedding, "Bhangra Ta Sajda",
                "Neha Kakkar, Shashwat Sachdev", R.raw.veerediwedding_tareefan);
        Song veerediwedding5 = new Song(R.drawable.veerediwedding, "Dagmag",
                "Vishal Mishra, Payal Dev", R.raw.veerediwedding_tareefan);
        veereDiWedding.add(veerediwedding1);
        veereDiWedding.add(veerediwedding2);
        veereDiWedding.add(veerediwedding3);
        veereDiWedding.add(veerediwedding4);
        veereDiWedding.add(veerediwedding5);
        return veereDiWedding;
    }

    private ArrayList<Song> songsBaadshaho() {
        ArrayList<Song> baadshaho = new ArrayList<Song>() {
        };
        Song baadshaho1 = new Song(R.drawable.baadshaho, "Mere Rashke Qamar",
                "Rahat Fateh Ali Khan", R.raw.baadshaho_mere_rashke_qamar);
        Song baadshaho2 = new Song(R.drawable.baadshaho, "Hoshiyar Rehna",
                "Neeraj Arya", R.raw.baadshaho_mere_rashke_qamar);
        Song baadshaho3 = new Song(R.drawable.baadshaho, "Piya More",
                "Mika Singh, Neeti Mohan", R.raw.baadshaho_mere_rashke_qamar);
        Song baadshaho4 = new Song(R.drawable.baadshaho, "Socha Hai",
                "Jubin Nautiyal, Neeti Mohan", R.raw.baadshaho_mere_rashke_qamar);
        Song baadshaho5 = new Song(R.drawable.baadshaho, "Socha Hai - Dj",
                "Jubin Nautiyal, Neeti Mohan", R.raw.baadshaho_mere_rashke_qamar);
        Song baadshaho6 = new Song(R.drawable.baadshaho, "Socha Hai - Love Version",
                "Jubin Nautiyal, Neeti Mohan", R.raw.baadshaho_mere_rashke_qamar);
        baadshaho.add(baadshaho1);
        baadshaho.add(baadshaho2);
        baadshaho.add(baadshaho3);
        baadshaho.add(baadshaho4);
        baadshaho.add(baadshaho5);
        baadshaho.add(baadshaho6);
        return baadshaho;
    }
}
