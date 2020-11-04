package servlets;

import classes.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class CookieSession extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession sessions = request.getSession();

        PriorityQueue<String> categories = new PriorityQueue<>();
        categories.add("Sport");
        categories.add("Furniture");
        categories.add("Gadgets");
        categories.add("Clothes");
        categories.add("Cart");

        sessions.setAttribute("categories", categories);

        Product sport1 = new Product(1, "Football shoes",
        "https://ae01.alicdn.com/kf/Hef22a92dca314717bd49a1f86b84866aH/MWY-Men-High-Ankle-Football-Boots-Soccer-Cleats-Turf-Shoes-Kids-Soccer-Shoes-Indoor-Futsal-Sneakers.jpg_220x220xz.jpg_.webp",
                20.99);

        Product sport2 = new Product(2, "Football ball",
        "https://ae01.alicdn.com/kf/H09c2dcca2fb54f609ce8fe2d96e2ca2c4/2020-Newest-Match-Soccer-Ball-Standard-Size-5-Football-Ball-PU-Material-High-Quality-Sports-League.jpg_220x220xz.jpg_.webp",
                13.25);

        Product sport3 = new Product(3, "Football gloves",
        "https://ae01.alicdn.com/kf/HTB1z5GXeGSs3KVjSZPiq6AsiVXaf/Professional-Adult-Children-Goalkeeper-Gloves-Finger-Protection-Thicken-Latex-Soccer-Football-Goalie-Gloves-Goal-keeper-Gloves.jpg_220x220xz.jpg_.webp",
                16.71);

        Product cloth1 = new Product(4, "Winter Jacket",
        "https://ae01.alicdn.com/kf/H533f12e0a25346988702c5a0541d2b47G/Thicken-Men-s-Down-Jacket-With-Big-Real-Fur-Collar-Warm-Parka-30-degrees-Men-Casual.jpg_220x220xz.jpg_.webp",
                38.25);
        Product cloth2 = new Product(5, "T-shirt",
                "https://ae01.alicdn.com/kf/H140aab3edae742e4b0310f570b8f3fd9v/Men-Polo-Men-Shirt-Short-Sleeve-Polo-Shirt-Contrast-Color-Polo-New-Clothing-Summer-Streetwear-Casual.jpg_220x220xz.jpg_.webp",
                4.99);
        Product cloth3 = new Product(6, "Undershirt",
                "https://ae01.alicdn.com/kf/HTB1w5WhaGWs3KVjSZFxq6yWUXXa0/Men-Hoodies-Tank-Top-Sleeveless-Muscle-Gym-Sport-Slim-Vest-Bodybuilding-Hooded-Hip-Hop-Streetwear-Workout.jpg_220x220xz.jpg_.webp",
                2.31);

        Product gadj1 = new Product(7, "Smart Watch",
                "https://ae01.alicdn.com/kf/H1a34831aae3d4373923c8d8317d7a99et/Caridite-Newest-Product-Body-Temperature-Smart-Watch-Bracelet-Waterproof-Man-Relojes-Inteligente-Bluetooth-Smartwatch-Sport-Band.jpg_220x220xz.jpg_.webp",
                79.80);

        Product gadj2 = new Product(8, "Bluetooth Adapter",
                "https://ae01.alicdn.com/kf/H09cdd85392754ad0b1e347214e1b7629Z/5-0-Bluetooth-Adapter-Wireless-LCD-Display-USB-Bluetooth-Receiver-Music-Audio-Transmitter-for-PC-TV.jpg_220x220xz.jpg_.webp",
                3.93);

        Product gadj3 = new Product(9, "Selfie-Stick",
                "https://ae01.alicdn.com/kf/H8eed634615f1450ea5c6f379bd0ecf41U/Roreta-3-in-1-Wireless-Bluetooth-Selfie-Stick-Foldable-Mini-Tripod-Expandable-Monopod-with-Remote-Control.jpg_220x220xz.jpg_.webp",
                6.73);

        LinkedList<Product> sport = new LinkedList<Product>();
        sport.add(sport1); sport.add(sport2); sport.add(sport3);
        sessions.setAttribute("sport", sport);

        LinkedList<Product> cloth = new LinkedList<Product>();
        cloth.add(cloth1); cloth.add(cloth2); cloth.add(cloth3);
        sessions.setAttribute("cloth", cloth);

        LinkedList<Product> gadj = new LinkedList<Product>();
        gadj.add(gadj1); gadj.add(gadj2); gadj.add(gadj3);
        sessions.setAttribute("gadj", gadj);

        LinkedList<Product> cart = new LinkedList<Product>();
        sessions.setAttribute("cart", cart);

        request.getRequestDispatcher("jsp/Sport.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
