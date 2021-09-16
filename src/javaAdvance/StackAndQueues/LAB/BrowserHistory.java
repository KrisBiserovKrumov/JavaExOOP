package javaAdvance.StackAndQueues.LAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BrowserHistory {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        ArrayDeque<String>urls = new ArrayDeque<>();

        while (!url.equals("Home")){
            if (url.equals("back")){
                if (urls.size() <= 1){
                    System.out.println("no previous URLs");
                }else {
                    urls.pop();
                    String current = urls.peek();
                    System.out.println(current);
                }

            }else {
                urls.push(url);
                System.out.println(url);
            }

            url = reader.readLine();
        }
    }
}
