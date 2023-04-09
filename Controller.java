import java.awt.event.*;
import java.io.FileWriter;

public class Controller {

    private View vista;
    private Model modello;

    public Controller(View v, Model m) throws Exception {

        vista = v;
        modello = m;
        assegnaGestori();
        vista.getNomeFileVisualizer().setText(modello.getF().getName());
        vista.getNomeFileVisualizer().setEditable(false);
        setView();

    }

    private void setView() throws Exception {

        String s = modello.getBr().readLine();
        while(s != null) {
            vista.getCampoTesto().append(String.format("%s\n", s));
            s = modello.getBr().readLine();
        }

    }

    private void assegnaGestori() throws Exception {

        ActionListener gestoreSalva = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              // qualcosa per salvare il file, probabilmente un ciclo while che legge tutta la textArea e la salva nel file, probabilmente poco efficiente
                String testo = vista.getCampoTesto().getText();
                System.out.println(testo);
              try {
                setView();
                // tutto quello dopo questo commento fa schifo anche se funziona
                modello.setFw(new FileWriter(modello.getF(), false));
                modello.getFw().write(testo);
                System.out.println("File sovrascritto");
                modello.getFw().close();        // per sovrascrivere
                modello.setFw(new FileWriter(modello.getF(), true));
              } catch (Exception ex) {} // inguardabile

            }
        };

        vista.getSalva().addActionListener(gestoreSalva);
        
    }
}