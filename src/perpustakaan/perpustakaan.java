package perpustakaan;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class perpustakaan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pilihan;
        String kodepegawai = "", pegawai = "Tidak ditemukan/Salah input kode", siswa = "", nis = "", x = "", kelas = "";
        String kodebuku = "", judul = "", pengarang = "", penerbit = "", halaman = "";
        String[] namapegawai = { "Mubaedah, S.Pd", "Asep M.Pd", "Fatech S.Kom" };

        LocalDate tglpinjam = LocalDate.now();
        LocalDate btskembali = LocalDate.now().plusDays(7);

        System.out.println("");
        System.out.println("------------------------------------------------------");
        System.out.println("            SELAMAT DATANG DI PERPUSTAKAAN            ");
        System.out.println("------------------------------------------------------");

        String pinjam = "Y";
        while (pinjam.toUpperCase().trim().equals("Y")) {
            System.out.println("");
            System.out.println("Ingin Pinjam Atau Mengembalikan Buku?");
            System.out.println("1. Pinjam Buku");
            System.out.println("2. Kembalikan Buku");
            // Pilihan
            System.out.print("Masukan Pilihan (1-2) : ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("");
                    System.out.println("===MENU PEMINJAMAN BUKU====");
                    System.out.println("");

                    // KODE PEGAWAI
                    while (pegawai.equals("Tidak ditemukan/Salah input kode")) {
                        System.out.print("Kode Pegawai : ");
                        kodepegawai = in.next();

                        if (kodepegawai.equals("101")) {
                            pegawai = namapegawai[0];
                        } else if (kodepegawai.equals("102")) {
                            pegawai = namapegawai[1];
                        } else if (kodepegawai.equals("103")) {
                            pegawai = namapegawai[2];
                        } else {
                            pegawai = "Tidak ditemukan/Salah input kode";
                        }
                        System.out.println("Nama Pegawai : " + pegawai);
                        System.out.println("---------------------------");
                    }

                    // INPUT DATA SISWA
                    in.nextLine();
                    System.out.print("Nama Siswa : ");
                    siswa = in.nextLine();
                    System.out.print("Kelas      : ");
                    kelas = in.nextLine();
                    System.out.print("NIS        : ");
                    nis = in.nextLine();

                    // KODE BUKU
                    System.out.print("Kode Buku  : ");
                    kodebuku = in.nextLine();
                    System.out.println("");
                    switch (kodebuku) {
                        case "1001":
                            judul = "Si Kancil Mencuri Timun";
                            pengarang = "Tedi Siswoko";
                            penerbit = "JP Books";
                            halaman = "56";
                            break;
                        case "1002":
                            judul = "Kisah Kelinci dan kura - kura";
                            pengarang = "Magda";
                            penerbit = "PT. Balai Pustaka";
                            halaman = "30";
                            break;
                        case "1003":
                            judul = "Nama Kamu";
                            pengarang = "Makoto Shinkai";
                            penerbit = "Kadokawa";
                            halaman = "336";
                            break;
                        case "1004":
                            judul = "Merasa Pintar Bodoh Saja Tak Punya";
                            pengarang = "Rusdi Mathari";
                            penerbit = "Buku Mojok";
                            halaman = "226";
                            break;
                        case "1005":
                            judul = "Bahasa Indonesia Kelas X";
                            pengarang = "Istiqomah";
                            penerbit = "Kemendikbud";
                            halaman = "290";
                            break;
                        default:
                            judul = null;
                            pengarang = null;
                            penerbit = null;
                            halaman = null;
                    }

                    // BUKTI PEMINJAMAN
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("       PERPUSTAKAAN SMA NEGERI 5 PEKALONGAN       ");
                    System.out.println("            PEMINJAMAN & PENGEMBALIAN             ");
                    System.out.println("                       BUKU                       ");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    System.out.println("=== BUKTI PEMINJAMAM ===");
                    System.out.println("Nama Pegawai  : " + pegawai);
                    System.out.println("Nama Peminjam : " + siswa);
                    System.out.println("NIS           : " + nis);
                    System.out.println("");
                    System.out.println("---Informasi Buku---");
                    System.out.println("Kode Buku          : " + kodebuku);
                    System.out.println("Judul Buku         : " + judul);
                    System.out.println("Pengarang          : " + pengarang);
                    System.out.println("Penerbit           : " + penerbit);
                    System.out.println("Jumlah Halaman     : " + halaman + " Halaman");
                    System.out.println(
                            "Tanggal Pinjam     : " + tglpinjam.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
                    System.out.println(
                            "Batas Pengembalian : " + btskembali.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
                    System.out.println(
                            "Catatan 'Jika Anda Melebihi Batas Tanggal Kembali' , Akan dikenakan DENDA sebesar Rp.500 per Harinya!");
                    System.out.println("");

                    // Nilai default untuk loop salah input kode pegawai
                    pegawai = "Tidak ditemukan/Salah input kode";
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("===MENU PENGEMBALIAN BUKU====");
                    // KODE PEGAWAI
                    while (pegawai.equals("Tidak ditemukan/Salah input kode")) {
                        System.out.print("Kode Pegawai : ");
                        kodepegawai = in.next();

                        if (kodepegawai.equals("101")) {
                            pegawai = namapegawai[0];
                        } else if (kodepegawai.equals("102")) {
                            pegawai = namapegawai[1];
                        } else if (kodepegawai.equals("103")) {
                            pegawai = namapegawai[2];
                        } else {
                            pegawai = "Tidak ditemukan/Salah input kode";
                        }
                        System.out.println("Nama Pegawai : " + pegawai);
                        System.out.println("---------------------------");
                    }

                    // INPUT DATA SISWA
                    in.nextLine();
                    System.out.print("Nama Siswa : ");
                    siswa = in.nextLine();
                    System.out.print("Kelas      : ");
                    kelas = in.nextLine();
                    System.out.print("NIS        : ");
                    nis = in.nextLine();

                    // KODE BUKU
                    System.out.print("Kode Buku  : ");
                    kodebuku = in.nextLine();
                    switch (kodebuku) {
                        case "1001":
                            judul = "Si Kancil Mencuri Timun";
                            pengarang = "Tedi Siswoko";
                            penerbit = "JP Books";
                            halaman = "56";
                            break;
                        case "1002":
                            judul = "Kisah Kelinci dan kura - kura";
                            pengarang = "Magda";
                            penerbit = "PT. Balai Pustaka";
                            halaman = "30";
                            break;
                        case "1003":
                            judul = "Nama Kamu";
                            pengarang = "Makoto Shinkai";
                            penerbit = "Kadokawa";
                            halaman = "336";
                            break;
                        case "1004":
                            judul = "Merasa Pintar Bodoh Saja Tak Punya";
                            pengarang = "Rusdi Mathari";
                            penerbit = "Buku Mojok";
                            halaman = "226";
                            break;
                        case "1005":
                            judul = "Bahasa Indonesia Kelas X";
                            pengarang = "Istiqomah";
                            penerbit = "Kemendikbud";
                            halaman = "290";
                            break;
                        default:
                            judul = null;
                            pengarang = null;
                            penerbit = null;
                            halaman = null;
                    }
                    System.out.print("Masukan Tanggal Peminjaman : ");
                    x = in.nextLine();
                    LocalDate tglpeminjaman = LocalDate.parse(x, DateTimeFormatter.ofPattern("dd MMMM yyyy"));
                    LocalDate btspengembalian = tglpeminjaman.plusDays(7);

                    // BUKTI PENGEMBALIAN
                    System.out.println("");
                    System.out.println("--------------------------------------------------");
                    System.out.println("       PERPUSTAKAAN SMA NEGERI 5 PEKALONGAN       ");
                    System.out.println("            PEMINJAMAN & PENGEMBALIAN             ");
                    System.out.println("                       BUKU                       ");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    System.out.println("=== BUKTI PENGEMBALIAN ===");
                    System.out.println("Nama Pegawai  : " + pegawai);
                    System.out.println("Nama Peminjam : " + siswa);
                    System.out.println("NIS           : " + nis);
                    System.out.println("");
                    System.out.println("---Informasi Buku---");
                    System.out.println("Kode Buku          : " + kodebuku);
                    System.out.println("Judul Buku         : " + judul);
                    System.out.println("Pengarang          : " + pengarang);
                    System.out.println("Penerbit           : " + penerbit);
                    System.out.println("Jumlah Halaman     : " + halaman + " Halaman");
                    System.out.println("Tanggal Pinjam     : "
                            + tglpeminjaman.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
                    System.out.println("Batas Pengembalian : "
                            + btspengembalian.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
                    System.out.println("----------------------");
                    System.out.print("Masukan Tanggal Pengembalian : ");
                    x = in.nextLine();
                    LocalDate tglpengembalian = LocalDate.parse(x, DateTimeFormatter.ofPattern("dd MMMM yyyy"));
                    //LocalDate telat = LocalDate.from(tglpengembalian).minusDays(btspengembalian.getDayOfYear());
                    Long haritelat = ChronoUnit.DAYS.between(btspengembalian, tglpengembalian);
                    // sebelum if aku pakai while XD
                    // if (tglpengembalian.getDayOfMonth() > btspengembalian.getDayOfMonth()) {
                    //     int haritelat = telat.getDayOfMonth();

                    //     System.out.println("telat = " + haritelat + " Hari");
                    //     System.out.println("Denda diberikan jika melewati batas pengembalian. Per harinya Rp.500");
                    //     int denda = haritelat * 500;

                    //     System.out.println("Denda yang harus dibayarkan : Rp." + denda);
                    //     System.out.println("");
                    //     // STOP
                    //     // Ga tau kenapa kok keprint loop, tolong bagaimana cara menghentikannyaaa
                    //     // karena pake while kali
                    //     // ini ganti if else tiba2 WORK HOKI kali wkwkw

                    //     // Nilai default untuk loop salah input kode pegawai
                    //     pegawai = "Tidak ditemukan/Salah input kode";
                    if (haritelat > 0) {
                        System.out.println("telat = " + haritelat + " Hari");
                        System.out.println("Denda diberikan jika melewati batas pengembalian. Per harinya Rp.500");
                        int denda = haritelat.intValue() * 500;
                        System.out.println("Denda yang harus dibayarkan : Rp." + denda);
                        System.out.println("");

                    } else {
                        System.out.println("Anda Mengembalikan Tepat Waktu dan Belum Melewati Batas");
                        System.out.println("telat = 0 Hari");
                        System.out.println("Denda = Rp.0");
                    }
                    break;

                default:
                    break;
            }
            System.out.print("Apakah Anda ingin Meminjam Lagi? Atau ingin Mengembalikan (Y/T) ");
            pinjam = in.next();
        }

    }

}
