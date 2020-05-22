/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192064_stack;

/**
 *
 * @author Lusy
 */
public class E31192064_Stack {

    //pendeklarasian array dan variable
    private int pos;    //variable pos dengan tipe data integer
    private int max_data = 9;   //wadah untuk menyimpan data, maksimal 9 data
    private int item[] = new int[max_data];
    private boolean empty, full;

    //stack method
    public void Stack() {
        full = false;   //full bernilai false
        empty = true;   //empty benilai true
        pos = 0;        //pos bernilai 0
    }

    //method dibawah berfungsi untuk menguji apakah stack sudah penuh
    public boolean isFull() {
        return (full);
    }

    //method dibawah berfungsi untuk menguji apakah stack masih kosong
    public boolean isEmpty() {
        return (empty);
    }

    //method dibawah berfungsi untuk memasukkan data
    public void push(int data) {
        //perulangan untuk stack apabila sudah penuh
        if (!isFull()) {
            item[pos++] = data; //item [pos increment] bernilai data
            empty = false;      //variable empty bernilai false
            if (pos == max_data) {//apabila nilai pos sama dengan nilai maksimal data
                full = true; //maka variable full akan bernilai benar
            }
            //program akan menampilkan kalimat berikut apabila ada penambahan data
            System.out.print("Data sudah ditambahkan");
            System.out.print("\n______________________________________\n");
        } else {
            //program akan menampilkan data berikut apabila stack sudah penuh
            System.out.println("Stack penuh");
        }
        return;
    }

    //method yang berfungsi untuk mengeluarkan data terakhir
    public int pop() {
        int x = 0;  //tie data integer dengan variable x bernilai 0
        //perulangan untuk mengeluarkan data terakhir 
        if (!isEmpty()) {
            x = item[--pos];
            full = false;
            //jika perulangan dilakukan maka akan tercetak kalimat berikut
            System.out.print("Data yang dipop :\n" + item[pos]);
            System.out.print("______________________________________\n");
            item[pos] = 0;
            //perulangan apabila nilai pos sama dengan 0
            if (pos == 0) {
                empty = true;
                //jika perulangan dilakukan maka akan tercetak kalimat berikut
                System.out.println("Stack kosong");
            } else {
                //program akan menampilkan kalimat berikut apabila ada pengambilan data
                System.out.println("Data sudah diambil");
            }
        } else {
            System.out.println("Stack data masih kosong:\n");
        }
        return (x);
    }
    //method display
    public void display() {
        System.out.print("Data Stack:\t");
        //perulangan untuk integer i bernilai 0 hingga i kurang dari pos
        for (int i = 0; i < pos; i++) {
            //menampilkan data yang ada di dalam stack
            System.out.print(item[i]+"\t");
        }
        System.out.print("\n______________________________________\n");
    }
}
