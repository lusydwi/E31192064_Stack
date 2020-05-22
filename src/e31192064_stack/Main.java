/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192064_stack;
import java.util.Scanner;

/**
 *
 * @author Lusy
 */
public class Main {
    public static void main(String[] args) {
        //inisialisasi
        int pilihan, data;    //tipe data integer dengan variable pilihan dan data    
        E31192064_Stack result = new E31192064_Stack();
        //memampilkan menu pilihan yang tersedia
        System.out.println("1. PUSH");//menu push yaitu untuk menambahkan data
        System.out.println("2. POP");//menu pop yaitu untuk mengeluarkan data terakhir
        System.out.println("3. SHOW DATA");//menu untuk menampilkan isi data stack
        System.out.println("4. EXIT");//menu untuk keluar  
        System.out.print("______________________________________\n");
        do {
            System.out.println("\nPilih Menu:\t");
            //syntax dibawah berguna agar user bisa menginputkan data
            Scanner input=new Scanner (System.in);
            pilihan = input.nextInt();
            //deklarasi dari menu
            if (pilihan == 1) { //perulangan apabila memilih menu 1
                System.out.print("Tambahkan data: ");
                data = input.nextInt();
                result.push(data);
            }else if (pilihan == 2) {///perulangan apabila memilih menu 2
                result.pop();
            }else if (pilihan == 3){    //perulangan apabila memilih menu 3
                result.display();
            }else if (pilihan == 4){    //perulangan apabila memilih menu 4
                System.exit(0);
            }else{
                //program akan menampilkan kalimat berikut apabila memilih menu yang tidak tersedia
                System.out.println("Pilihan tidak ada");
                
            }
        } while (pilihan != 0);
    }
}

    

