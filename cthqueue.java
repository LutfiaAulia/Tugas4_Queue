import java.util.*;

public class cthqueue{
    public static void main(String[] args) {
        Queue<Integer> antrian = new LinkedList<>();
        Scanner masukkan = new Scanner(System.in);
        while(true){
            System.out.print("1. Memasukan antrian angka \n2. Menghapus antrian angka \n3. Mengambil antrian angka \n4. Ukuran queue \n5. Mengecek data kosong atau tidak \n6. Mengosongkan data queue \n7.Exit \n\nMenu : ");
            int pilih = masukkan.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("\nMasukan angka :");
                    int angka = masukkan.nextInt();
                    antrian.add(angka);
                    System.out.println("antrian : "+antrian+"\n");
                    break;
                
                case 2:
                    System.out.println("\nMenghapus angka : "+antrian.poll());
                    System.out.println("antrian : "+antrian+"\n");
                    break;
                    
                case 3:
                    System.out.println("\nMengambil angka : "+antrian.peek());
                    System.out.println("antrian : "+antrian+"\n");
                    break;

                case 4:
                    System.out.println("\nUkuran Queue : "+antrian.size()+"\n");
                    break;

                case 5:
                    System.out.println("\nMengecek data kosong atau tidak : "+antrian.isEmpty()+"\n");
                    break;

                case 6:
                    antrian.clear();
                    System.out.println("\nMengosongkan data queue : "+antrian+"\n");
                    break;

                case 7:
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("\nAngka tidak terdapat pada pilihan\n");
                    break;
            }
        }
    }
}