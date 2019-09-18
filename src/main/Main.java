package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Book arr[] = new Book[n];
        if (n == 0) {
            System.out.println("N/A");
        } else {
            for (int i = 0; i < n; i++) {
                String book_name = br.readLine();
                String author_name = br.readLine();
                String isbn_no = br.readLine();
                arr[i] = new Book(book_name, author_name, isbn_no);
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

    }
}
