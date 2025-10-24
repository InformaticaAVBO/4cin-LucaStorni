public class App {
    public static void main(String[] args) throws Exception {
        
     FileWriter myWriter = new FileWriter (filename:"filename.txt");

     for(int i=0; i < 100; i++){
        
        myWriter.Writer ("Questa è una prima frase scritta in un file");
     }
     myWriter.close();

     System.out.println("Ok ho scritto sul file!");
    }
}
