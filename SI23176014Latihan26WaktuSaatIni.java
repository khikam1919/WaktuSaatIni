/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.pkg23176014.latihan26.waktusaatini;

/**
 *
 * @author User
 * NAMA     : Muhammad Nur Khikam
 * KELAS    : Sistem Informasi
 * NIM      : 23176014
 * Deskripsi Program :program ini berisi untuk menampilkan waktu saat ini sesuai dengan lokasi kita berada saat ini
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SI23176014Latihan26WaktuSaatIni {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        System.out.println("Hari ini adalah hari: " + formattedDateTime);
    }
}
