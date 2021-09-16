package javaAdvance.StackAndQueues.LAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String imput = reader.readLine();
        ArrayDeque<String> urls = new ArrayDeque<>();
        ArrayDeque<String> forlward = new ArrayDeque<>();

        while (!imput.equals("Home")){
            if (imput.equals("forward")){
                if (forlward.size() < 1){
                    System.out.println("no next URLs");
                }else {
                    System.out.println(forlward.peek());
                    urls.push(forlward.pop());




                }
            }else if (imput.equals("back")){
                if (urls.size() <= 1){
                    System.out.println("no previous URLs");
                }else {
                    forlward.push(urls.pop());
                    System.out.printf("%s%n",urls.peek());
                }
            }else {
                urls.push(imput);
                System.out.println(imput);
                forlward.clear();

            }

            imput = reader.readLine();
        }
    }
}
