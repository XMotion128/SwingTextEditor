import javax.swing.*;
import java.awt.*;

class View extends JFrame {

    JTextArea campoTesto;
    JPanel pannelloSup;
    JButton salva;
    JButton secondo;    // stub
    JButton terzo;      // stub
    JTextField nomeFileVisualizer;      // non funzionante

    public JTextArea getCampoTesto() {
        return this.campoTesto;
    }

    public void setCampoTesto(JTextArea campoTesto) {
        this.campoTesto = campoTesto;
    }

    public JPanel getPannelloSup() {
        return this.pannelloSup;
    }

    public void setPannelloSup(JPanel pannelloSup) {
        this.pannelloSup = pannelloSup;
    }

    public JButton getSalva() {
        return this.salva;
    }

    public void setSalva(JButton salva) {
        this.salva = salva;
    }

    public JButton getSecondo() {
        return this.secondo;
    }

    public void setSecondo(JButton secondo) {
        this.secondo = secondo;
    }

    public JButton getTerzo() {
        return this.terzo;
    }

    public void setTerzo(JButton terzo) {
        this.terzo = terzo;
    }

    public JTextField getNomeFileVisualizer() {
        return this.nomeFileVisualizer;
    }

    public void setNomeFileVisualizer(JTextField nomeFileVisualizer) {
        this.nomeFileVisualizer = nomeFileVisualizer;
    }
    

    public View(String titolo) {

        campoTesto = new JTextArea();
        pannelloSup = new JPanel(new GridLayout(0, 4));
        salva = new JButton("Salva");
        secondo = new JButton("test2");
        terzo = new JButton("test3");
        nomeFileVisualizer = new JTextField();

        pannelloSup.add(salva);
        pannelloSup.add(secondo);
        pannelloSup.add(terzo);
        pannelloSup.add(nomeFileVisualizer);
        this.add(pannelloSup, BorderLayout.NORTH);
        this.add(campoTesto, BorderLayout.CENTER);



        this.setTitle(titolo);
        this.setSize(600, 400);
        this.setResizable(true);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}