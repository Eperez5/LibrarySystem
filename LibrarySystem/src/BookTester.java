/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hmjaneway
 */
public class BookTester {
    public static void main(String[] args) {
        Book book1 = new Book ();
        book1.setTitle("Lola");
        book1.setAuthor("Marc Jo");
        book1.setGenre("Children's Book");
        book1.setAvailable(false);
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Genre: " + book1.getGenre());
        System.out.println("Availability: " + book1.getAvailable());
        
        System.out.println("");
        
        Book book2 = new Book ("Portrait", "John Low", "Biography", false);
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Genre: " + book2.getGenre());
        System.out.println("Availability: " + book2.getAvailable());
        
    }
    
}
