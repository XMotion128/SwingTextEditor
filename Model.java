import java.io.*;

public class Model {

    private File f;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;

    public File getF() {
        return this.f;
    }

    public void setF(File f) {
        this.f = f;
    }

    public FileReader getFr() {
        return this.fr;
    }

    public void setFr(FileReader fr) {
        this.fr = fr;
    }

    public BufferedReader getBr() {
        return this.br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public FileWriter getFw() {
        return this.fw;
    }

    public void setFw(FileWriter fw) {
        this.fw = fw;
    }

    public Model(String nomeFile) throws Exception {

        f = new File(nomeFile);
        fr = new FileReader(f);
        br = new BufferedReader(fr);
        fw = new FileWriter(f, true);

    }

}