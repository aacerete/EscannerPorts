import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

/**
 * Created by 46990527d on 01/02/17.
 */
public class portScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ip;
        int maxPorts = 6500;
        int port = 1;

        System.out.println("Introdueix una ip");
        ip = sc.next();

//172.31.73.14


            Socket cliente = new Socket();

            while(port<maxPorts){

                try {

                    SocketAddress adress = new InetSocketAddress(ip, port);
                    cliente.connect(adress);
                    InputStream is = cliente.getInputStream();
                    OutputStream os = cliente.getOutputStream();

                    System.out.println("Enviando mensaje");
                    String mensaje = "Garbage";
                    os.write(mensaje.getBytes());


                    System.out.println(port + " abierto");

                    port++;
                }catch (Exception e){

            }





        }
    }

}
