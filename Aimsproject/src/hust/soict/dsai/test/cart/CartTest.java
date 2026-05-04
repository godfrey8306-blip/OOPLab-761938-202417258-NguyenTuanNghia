package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Book b = new Book("Java Book");
        DigitalVideoDisc dvd = new DigitalVideoDisc("Movie");

        cart.addMedia(b);
        cart.addMedia(dvd);
    }
}