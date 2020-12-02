import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        String[][] mhs = {{"40","1","20201215","ABDURRAFI IBNU SHALEH ISKANDAR","0815454545454"},
                {"40","2","20201215","AFIF DAFFA ATSIILA","0815454545454"},
                {"40","3","20201215","AHMAD TSABIT GOSAIBI","0815454545454"},
                {"40","4","202014454","ALFIN NUGRAHA","087878785545"},
                {"40","5","202014454","ANDRIAN RIVALDI","087878785545"},
                {"40","6","202014454","ANNISA NUR RAHMADHANI","087878785545"},
                {"40","7","202014454","ANTONIUS FHILIFI","087878785545"},
                {"40","8","202014454","BERTRANDUS GABRIEL UTOMO","087878785545"},
                {"40","9","202014454","BIMO SULTHAN ALAUDIN","087878785545"},
                {"40","10","202014454","DAMAR ARRAFI SALDERMAWANA RIANO","087878785545"},
                {"40","11","202014454","DIMAS APRI LIYANTO","087878785545"},
                {"40","12","202014454","FADHLI RASYID","087878785545"},
                {"40","13","202014454","FADHLY AJI PUTRA","087878785545"},
                {"40","14","202014454","FEBRIAN GIOVANNI","087878785545"},
                {"40","15","202014454","GALIH DWI PRAKOSO","087878785545"},
                {"40","16","202014454","HUSAIN SYARIF","087878785545"},
                {"40","17","20201215","IHSAN FATHYA","0815454545454"},
                {"40","18","20201215","ISHAM ROFID MISBAHUDDIN","0815454545454"},
                {"40","19","20201215","JOVI YEHEZKIEL PRATAMA","0815454545454"},
                {"40","20","202014454","LAURENSIUS RIO VEBRIAN","087878785545"},
                {"40","21","202014454","MARIA TESSA KARTINI SIRAIT","087878785545"},
                {"40","22","202014454","MOCHAMMAD HUSNI THAMRIN","087878785545"},
                {"40","23","202014454","MOCHAMMAD YUSUF SIREGAR","087878785545"},
                {"40","24","202014454","MUHAMMAD ABDUH TRI DIRNA","087878785545"},
                {"40","25","202014454","MUHAMMAD FADHLAN AQILA","087878785545"},
                {"40","26","202014454","MUHAMMAD HAFIDZ NURROHMAN","087878785545"},
                {"40","27","20201215","MUHAMMAD IKBAR ADANI","0815454545454"},
                {"40","28","20201215","MUHAMMAD NUR IRFAN","0815454545454"},
                {"40","29","20201215","MUHAMMAD NURFIAN FANNYADE SETIAWAN","0815454545454"},
                {"40","30","202014454","MUHAMMAD SOFIYAN","087878785545"},
                {"40","31","202014454","MUTIARA DIVA SAKINAH","087878785545"},
                {"40","32","202014454","PETRA CHANAYA ANAKUYANESIA","087878785545"},
                {"40","33","202014454","RACHMAT RIZKI","087878785545"},
                {"40","34","202014454","RAYHAN ALAMSYAH","087878785545"},
                {"40","35","202014454","Rizki Patria Linaldi","087878785545"},
                {"40","36","202014454","SETIA NOVANTO DIO PUTRA","087878785545"},
                {"40","37","202014454","SRI MEINIS","087878785545"},
                {"40","38","202014454","WINDY INDRIARNIE","087878785545"},
                {"40","39","202014454","YANWAR KURNIAWAN","087878785545"},
                {"40","40","202014454","YOGA INDRA PRATAMA","087878785545"}};

        System.out.println();

        Scanner userinput = new Scanner(System.in);
        System.out.print("Input Nomor Absen (NO ABSEN - 1 ) yang mau ditampilkan = ");
        int a = userinput.nextInt();

        System.out.println();
        System.out.println("Jumlah Mahasiswa Kelas 1IA07 : " + mhs[a][0]);
        System.out.println("Data Mahasiswa ke " + mhs[a][1]);
        System.out.println("NPM : " + mhs[a][2]);
        System.out.println("Nama : " + mhs[a][3]);
        System.out.println("No HP : " + mhs[a][4] );


    }
}
