public class Main {
    
    public static void main(String[] args) throws Exception{

        View vista = new View("test");
        Model modello = new Model(args[0]);
        Controller controller = new Controller(vista, modello);
        
    }
}