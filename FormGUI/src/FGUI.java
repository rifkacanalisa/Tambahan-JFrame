import javax.swing.*;

public class FGUI extends JFrame {
    public FGUI(){
        setTitle("Biodata");
        setSize(800,600);
        setResizable(true);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        //Judul
        JLabel Judul = new JLabel("Biodata Mahasiswa");
        add(Judul);
        Judul.setBounds(325,10,150,20);

        //Nama
        JLabel Nama = new JLabel("Nama");
        add(Nama);
        Nama.setBounds(50,45,50,20);
        JTextField IsiNama = new JTextField();
        add(IsiNama);
        IsiNama.setBounds(150,45,150,20);

        //NIM
        JLabel NIM = new JLabel("NIM");
        add(NIM);
        NIM.setBounds(50,70,100,20);
        JTextField IsiNim = new JTextField();
        add(IsiNim);
        IsiNim.setBounds(150,70,150,20);

        // TTL
        JLabel tl = new JLabel("Tanggal Lahir");
        add(tl);
        tl.setBounds(50,95,100,20);
        JLabel tgl = new JLabel("Tanggal");
        add(tgl);
        tgl.setBounds(150,95,50,20);
        JTextField IsiTgl = new JTextField();
        add(IsiTgl);
        IsiTgl.setBounds(210,95,50,20);
        JLabel bln = new JLabel("Bulan");
        add(bln);
        bln.setBounds(270,95,50,20);
        JTextField IsiBln = new JTextField();
        add(IsiBln);
        IsiBln.setBounds(320,95,50,20);
        JLabel thn = new JLabel("Tahun");
        add(thn);
        thn.setBounds(380,95,50,20);
        JTextField IsiThn = new JTextField();
        add(IsiThn);
        IsiThn.setBounds(430,95,50,20);

        //JK
        JLabel jenis = new JLabel("Jenis Kelamin");
        add(jenis);
        jenis.setBounds(50,120,100,20);
        JRadioButton lk = new JRadioButton("Laki-laki");
        add(lk);
        lk.setBounds(150,120,100,20);
        JRadioButton pr = new JRadioButton("Perempuan");
        add(pr);
        pr.setBounds(260,120,100,20);
        ButtonGroup jekel = new ButtonGroup();
        jekel.add(lk);
        jekel.add(pr);

        JLabel alamat = new JLabel("Alamat");
        add(alamat);
        alamat.setBounds(50,145,100,20);
        JTextField IsiAlamat = new JTextField();
        add(IsiAlamat);
        IsiAlamat.setBounds(150,145,150,100);

        JLabel agama = new JLabel("Agama");
        add(agama);
        agama.setBounds(50,250,100,20);
        String[] agamanya = {"Islam","Kristen","Katolik","Hindu","Budha","Konghucu"};
        JComboBox pAgama = new JComboBox(agamanya);
        add(pAgama);
        pAgama.setBounds(150,250,150,20);

        JLabel jGoldar = new JLabel("Golongan Darah");
        add(jGoldar);
        jGoldar.setBounds(50,275,100,20);
        String[] goldar = {"O","AB","A","B"};
        JComboBox pGoldar = new JComboBox(goldar);
        add(pGoldar);
        pGoldar.setBounds(150,275,150,20);

        JLabel jHobi = new JLabel("Hobi");
        add(jHobi);
        jHobi.setBounds(50,300,100,20);
        JTextField Hobi = new JTextField();
        add(Hobi);
        Hobi.setBounds(150,300,150,20);
    }
}
