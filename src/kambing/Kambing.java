/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambing;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class Kambing {

        public void tambahKambing() {
            int jumlahKambing = 0;
            
            jumlahKambing = jumlahKambing + 10;
            System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
