import java.io.*;

import java.util.Scanner;

public class FileHandling
{
    public static void main(String[] args) {
        try{
            File f1 = new File("NewFIle.tt");
            if(f1.createNewFile()){
                System.out.println("FIle created successfully : "+ f1.getName() );
            }else{
                System.out.println("FIle already exisit.");
            }
        }catch(IOException e){
            System.out.println("Error occured while creating a file");
            e.printStackTrace();
        }
    }
        public static void main(String[] args) {
             try{
                 FileWriter writer = new FileWriter("NewFile.txt");
                 writer.write("I am learning , how to write inside a file");
                 writer.close();
                 System.out.println("Successfully written in file");
             }catch(IOException e){
                 System.out.println("Error");
                 e.printStackTrace();
             }
        }
        public static void main(String[] args) {
            // Reading data from user.
//            try{
//                File obj = new File("NewFile.txt");
//                Scanner sc = new Scanner(obj);
//                while(sc.hasNextLine()){
//                    String data = sc.nextLine();
//                    System.out.println(data);
//                }
//                sc.close();
//
//            }catch(FileNotFoundException e){
//                System.out.println("FIle not found exception");
//                e.printStackTrace();
//            }
            /* Reading from File */
//            try(InputStream input = new FileInputStream("NewFile.txt")){
//               int data;
//               while((data= input.read())!=-1){
//                   System.out.print((char)data);
//               }
//            }catch(IOException e){
//                e.printStackTrace();
//            }



            /* Reading som data from file */
            try(InputStream input = new FileInputStream("NewFile.txt")){
                byte[] buffer= new byte[12];
                int byteRead = input.read(buffer);
                System.out.println(new String(buffer,0,byteRead));
            }catch(IOException e){
                e.printStackTrace();
            }
           // ????
            try (InputStream input = new FileInputStream("NewFile.txt")) {
                byte[] buffer = new byte[20];
                int bytesRead = input.read(buffer, 5, 10); // Offset 5, read 10 bytes
                System.out.println(new String(buffer, 5, bytesRead));
            } catch (IOException e) {
                e.printStackTrace();
            }
            /*SKip*/
            try(InputStream input = new FileInputStream("NewFile.txt")){
                input.skip(5);
                byte[] buffer= new byte[12];
                int byteRead = input.read(buffer);
                System.out.println(new String(buffer,0,byteRead));
            }catch(IOException e){
                e.printStackTrace();
            }
              /* Read how many Bytes are ready to read*/
            try(InputStream input = new FileInputStream("NewFile.txt")){
                System.out.println("Available bytes are : "+ input.available());
            }catch(IOException e){
                e.printStackTrace();
            }
            ??
            InputStream input = new ByteArrayInputStream("".getBytes());
            System.out.println("Mark Supported: " + input.markSupported());
            try (OutputStream output = new FileOutputStream("NewFile.txt")) {
                byte[] buffer = "Hello-World".getBytes();
                output.write(buffer,2,5); // Writes the ASCII value for 'A'
                output.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}