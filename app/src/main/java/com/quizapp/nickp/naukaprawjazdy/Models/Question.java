package com.quizapp.nickp.naukaprawjazdy.Models;

public class Question {
    private String Jaki_ma_zwiazek_z_bezpieczenstwem, Kategorie, Liczba_punktow, Media, Nazwa_bloku,
                    Nazwa_media_tlumaczenie_migowe_PJM_tresc_pyt, Nazwa_pytania, Numer_pytania,
                    O_co_chcemy_zapytac, Odpowiedz_A, Odpowiedz_B, Odpowiedz_C, Podmiot, Poprawna_odp,
                    Pytanie, Status, Zakres_struktury, Zrodlo_pytania;

    public Question() {
    }

    public Question(String jaki_ma_zwiazek_z_bezpieczenstwem, String kategorie, String liczba_punktow,
                    String media, String nazwa_bloku, String nazwa_media_tlumaczenie_migowe_PJM_tresc_pyt,
                    String nazwa_pytania, String numer_pytania, String o_co_chcemy_zapytac, String odpowiedz_A,
                    String odpowiedz_B, String odpowiedz_C, String podmiot, String poprawna_odp, String pytanie,
                    String status, String zakres_struktury, String zrodlo_pytania) {
        Jaki_ma_zwiazek_z_bezpieczenstwem = jaki_ma_zwiazek_z_bezpieczenstwem;
        Kategorie = kategorie;
        Liczba_punktow = liczba_punktow;
        Media = media;
        Nazwa_bloku = nazwa_bloku;
        Nazwa_media_tlumaczenie_migowe_PJM_tresc_pyt = nazwa_media_tlumaczenie_migowe_PJM_tresc_pyt;
        Nazwa_pytania = nazwa_pytania;
        Numer_pytania = numer_pytania;
        O_co_chcemy_zapytac = o_co_chcemy_zapytac;
        Odpowiedz_A = odpowiedz_A;
        Odpowiedz_B = odpowiedz_B;
        Odpowiedz_C = odpowiedz_C;
        Podmiot = podmiot;
        Poprawna_odp = poprawna_odp;
        Pytanie = pytanie;
        Status = status;
        Zakres_struktury = zakres_struktury;
        Zrodlo_pytania = zrodlo_pytania;
    }

    public String getJaki_ma_zwiazek_z_bezpieczenstwem() {
        return Jaki_ma_zwiazek_z_bezpieczenstwem;
    }

    public void setJaki_ma_zwiazek_z_bezpieczenstwem(String jaki_ma_zwiazek_z_bezpieczenstwem) {
        Jaki_ma_zwiazek_z_bezpieczenstwem = jaki_ma_zwiazek_z_bezpieczenstwem;
    }

    public String getKategorie() {
        return Kategorie;
    }

    public void setKategorie(String kategorie) {
        Kategorie = kategorie;
    }

    public String getLiczba_punktow() {
        return Liczba_punktow;
    }

    public void setLiczba_punktow(String liczba_punktow) {
        Liczba_punktow = liczba_punktow;
    }

    public String getMedia() {
        return Media;
    }

    public void setMedia(String media) {
        Media = media;
    }

    public String getNazwa_bloku() {
        return Nazwa_bloku;
    }

    public void setNazwa_bloku(String nazwa_bloku) {
        Nazwa_bloku = nazwa_bloku;
    }

    public String getNazwa_media_tlumaczenie_migowe_PJM_tresc_pyt() {
        return Nazwa_media_tlumaczenie_migowe_PJM_tresc_pyt;
    }

    public void setNazwa_media_tlumaczenie_migowe_PJM_tresc_pyt(String nazwa_media_tlumaczenie_migowe_PJM_tresc_pyt) {
        Nazwa_media_tlumaczenie_migowe_PJM_tresc_pyt = nazwa_media_tlumaczenie_migowe_PJM_tresc_pyt;
    }

    public String getNazwa_pytania() {
        return Nazwa_pytania;
    }

    public void setNazwa_pytania(String nazwa_pytania) {
        Nazwa_pytania = nazwa_pytania;
    }

    public String getNumer_pytania() {
        return Numer_pytania;
    }

    public void setNumer_pytania(String numer_pytania) {
        Numer_pytania = numer_pytania;
    }

    public String getO_co_chcemy_zapytac() {
        return O_co_chcemy_zapytac;
    }

    public void setO_co_chcemy_zapytac(String o_co_chcemy_zapytac) {
        O_co_chcemy_zapytac = o_co_chcemy_zapytac;
    }

    public String getOdpowiedz_A() {
        return Odpowiedz_A;
    }

    public void setOdpowiedz_A(String odpowiedz_A) {
        Odpowiedz_A = odpowiedz_A;
    }

    public String getOdpowiedz_B() {
        return Odpowiedz_B;
    }

    public void setOdpowiedz_B(String odpowiedz_B) {
        Odpowiedz_B = odpowiedz_B;
    }

    public String getOdpowiedz_C() {
        return Odpowiedz_C;
    }

    public void setOdpowiedz_C(String odpowiedz_C) {
        Odpowiedz_C = odpowiedz_C;
    }

    public String getPodmiot() {
        return Podmiot;
    }

    public void setPodmiot(String podmiot) {
        Podmiot = podmiot;
    }

    public String getPoprawna_odp() {
        return Poprawna_odp;
    }

    public void setPoprawna_odp(String poprawna_odp) {
        Poprawna_odp = poprawna_odp;
    }

    public String getPytanie() {
        return Pytanie;
    }

    public void setPytanie(String pytanie) {
        Pytanie = pytanie;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getZakres_struktury() {
        return Zakres_struktury;
    }

    public void setZakres_struktury(String zakres_struktury) {
        Zakres_struktury = zakres_struktury;
    }

    public String getZrodlo_pytania() {
        return Zrodlo_pytania;
    }

    public void setZrodlo_pytania(String zrodlo_pytania) {
        Zrodlo_pytania = zrodlo_pytania;
    }
}
