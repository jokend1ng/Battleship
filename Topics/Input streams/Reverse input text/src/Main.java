import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static StringBuilder readAllLines (BufferedReader reader) throws IOException {
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            content.append(line);
            content.append(System.lineSeparator());
        }

        return content;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder content = new StringBuilder();
        try (reader){

           String line;

           while ((line = reader.readLine()) != null) {
               content.append(line);
               reader.close();
           }

       }catch(IOException e){
           e.printStackTrace();
       }
        for (int i =content.length()-1;i>0;i--){
            System.out.print(content.charAt(i));
        }
        System.out.print(content.charAt(0));
        }

    }
