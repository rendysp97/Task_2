/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *  NIM = 1301154301
 *  Nama = Rendy Syahputra
 */
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    private String nim,nama,status;
    private char [] Nilai;
    private int i;

    public char[] getNilai() {
        return Nilai;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }

    public int getI() {
        return i;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNilai(char[] Nilai) {
        this.Nilai = Nilai;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    public Mahasiswa(){
        status = "Tidak Lulus";
        i = 0;    
        Nilai = new char[10];
}
    public Mahasiswa(String a,String b){
        nim = a;
        nama = b;
        status = "Tidak Lulus";
        i = 0;
        Nilai = new char[10];
        
    }
    
    public void addNilai(char nilai){
        if (i  <= 10){
            Nilai[i] = nilai;
        }
    }
    
public char getNilai(int i){
    return Nilai[i];
}
    
public String toString(){
    return nim + nama + status + "Nilai = " + Nilai;
    
}
       
public char cekNilai(Mahasiswa m){
     char z = 0;
     for (char x = 'A' ; x < 'E'; x++){
        for(int y = 0 ; y < i; y++){
            if ( Nilai[y] == x){
                for (int n = 0 ; n < m.i; n++){
                    if(m.Nilai [n] == z){
                        return z;
                    }
                }
            }
        } 
     }
        return z;
}
        
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa m1 = new Mahasiswa();
        m1.setNim("001");
        m1.setNama("Budi");
        m1.addNilai('C');
        m1.addNilai('D');
        m1.addNilai('B');
        m1.addNilai('D');
        System.out.println(m1);
        // akan mengoutputkan tulisan: 001, Budi, Tidak Lulus, Nilai = C,D,B,D,
        System.out.println(m1.getNilai(2));
        // akan mengoutputkan B

        Mahasiswa m2 = new Mahasiswa("002", "Eka");
        m2.addNilai('A');
        m2.addNilai('B');
        m2.addNilai('E');
        m2.addNilai('C');
        m2.addNilai('B');
        m2.setStatus("Lulus");
        System.out.println(m2);
        // akan mengoutputkan tulisan: 002, Eka, Lulus, Nilai = A,B,E,C,B,

        // output kode berikut harus menghasilkan nilai yang sama yaitu=B
        char h1 = m1.cekNilai(m2);
        char h2 = m2.cekNilai(m1);
        System.out.println("hasil = " + h1 + ", " + h2);

    }

}
