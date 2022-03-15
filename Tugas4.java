import java.util.*;

public class Tugas4 {
    public static void main(String[] args) {
        Queue <String> nama = new LinkedList<>();
        Scanner masukkan = new Scanner (System.in);
        while(true){
            System.out.println("1. Masukkan nama \n2. Menghapus nilai antrian \n3. Ukuran queue \n4. Mengambil nilai antrian \n5. Mengecek data \n6. Mengosongkan queue \n7. Exit \n\nMenu : ");
            Integer pilih = masukkan.nextInt();
            switch (pilih){
                case 1:
                    System.out.println("\nMasukkan nama : ");
                    String angka = masukkan.next();
                    nama.add(angka);
                    System.out.println("antrian: "+nama+"\n");
                    break;

                case 2:
                    System.out.println("\nMenghapus antrian: "+nama.poll());
                    System.out.println("antrian: "+nama+"\n");
                    break;

                case 3:
                    System.out.println("\nUkuran queue: "+nama.size()+"\n");
                    break;
                
                case 4:
                    System.out.println("\nMengambil nilai antrian: "+nama.peek());
                    System.out.println("antrian: "+nama+"\n");
                    break;

                case 5:
                    System.out.println("\nMengecek data: "+nama.isEmpty()+"\n");
                    break;

                case 6:
                    nama.clear();
                    System.out.println("\nMengosonkan queue: "+nama+"\n");
                    break;

                case 7:
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("\nAngka tidak ditemukan");
                    break;

            }
        }
        //nama.add("Reihan");
        //nama.add("Sarah");
        //nama.add("Anton");
        //nama.add("Budi");
        //nama.add("Rani");
        //nama.add("Loli");
        //nama.add("Farhan");
        //nama.add("Rizky");
        //System.out.println("Nama dalam antrian: "+nama);

        //System.out.println("\nUkuran dari anterian: "+nama.size());
        //System.out.println("\nMengambil Nilai dari anterian: "+nama.peek());
        //System.out.println("\nMenghapus Nilai dari anterian: "+nama.poll());
        //System.out.println("\nUkuran dari anterian setelah dipoll: "+nama.size());
        //System.out.println("\nNilai pada antrian setelah dipoll: "+nama);
        //System.out.println("\nMengecek antrian kosong atau tidak: "+nama.isEmpty());
        //nama.clear();
        //System.out.println("\nMengecek antrian kosong atau tidak setelah di clear : "+nama.isEmpty());
    }
}
