
import java.util.*;
  

class User { 

    private String username; 

    private String email; 

    private String password; 

    private String address; 

  

    public User(String username, String email, String password, String address) { 

        this.username = username; 

        this.email = email; 

        this.password = password; 

        this.address = address; 

    } 

  

    public User() { 

        this.username = "defaultUser"; 

        this.email = "defaultUser@123example.com"; 

        this.password = "defaultPasscode"; 

        this.address = "123, DefaultStreet"; 

    } 

  

    public void registerUser() { 

        System.out.println("User \"" + username + "\" registered successfully.\nThe email:\"" + email + "\""); 

    } 

  

    public boolean login() { 

        System.out.println("User " + username + " logged in."); 

        return true; 

    } 

  

    public void updateAddress(String newAddress) { 

        this.address = newAddress; 

        System.out.println("User " + username + "'s address updated to " + newAddress + "."); 

    } 

  

    public void viewOrders() { 

        System.out.println("Fetching orders for user " + username + "."); 

    } 

  

    public void logout() { 

        System.out.println("User " + username + " logged out."); 

    } 

} 

  

class Product { 

    private int productId; 

    private String name; 

    private String description; 

    private double price; 

    private int stockQuantity; 

  

    public Product(int productId, String name, String description, double price, int stockQuantity) { 

        this.productId = productId; 

        this.name = name; 

        this.description = description; 

        this.price = price; 

        this.stockQuantity = stockQuantity; 

    } 

  

    public void addProduct() { 

        System.out.println("Product " + name + " added successfully."); 

    } 

  

    public void updatePrice(double newPrice) { 

        System.out.println("Price of product " + productId + " updated to " + newPrice + "."); 

    } 

  

    public void updateStock(int quantityChange) { 

        System.out.println("Stock quantity of product " + productId + " updated."); 

    } 

  

    public void viewDetails() { 

        System.out.println("Fetching details for product " + productId + "."); 

        System.out.println("Name: " + name); 

        System.out.println("Description: " + description); 

        System.out.println("Price: " + price); 

        System.out.println("Quantity Left: " + stockQuantity); 

    } 

  

    public void searchProduct(String keyword) { 

        System.out.println("...Searching for products with keyword " + keyword + "..."); 

    } 

} 

  

class Review { 

    public void addReview(int userId, int productId, int rating, String comment) { 

        System.out.println("Review added successfully."); 

    } 

  

    public void updateReview(int reviewId, int newRating, String newComment) { 

        System.out.println("Review updated successfully."); 

    } 

  

    public void deleteReview(int reviewId) { 

        System.out.println("Review deleted successfully."); 

    } 

  

    public void viewReviews(int productId) { 

        System.out.println("Fetching reviews for product " + productId + "."); 

    } 

  

    public void averageRating(int productId) { 

        System.out.println("Calculating average rating for product " + productId + "."); 

    } 

} 

  

class ShoppingCart extends User { 

    private int[] cartItems; 

  

    public void addToCart(int productId, int quantity) { 

        System.out.println("Product added to cart."); 

    } 

  

    public void removeFromCart(int productId) { 

        System.out.println("Product removed from cart."); 

    } 

  

    public void updateQuantity(int productId, int newQuantity) { 

        System.out.println("Quantity updated for product in cart."); 

    } 

  

    public void viewCart() { 

        System.out.println("Viewing shopping cart."); 

    } 

  

    public void checkout() { 

        System.out.println("Checking out shopping cart."); 

    } 

} 

  

class Order extends User { 

    private int orderId; 

    private double totalAmount; 

    private String status; 

  

    public void placeOrder() { 

        System.out.println("Order placed successfully."); 

    } 

  

    public void cancelOrder(int orderId) { 

        System.out.println("Order cancelled successfully."); 

    } 

  

    public void trackOrder(int orderId) { 

        System.out.println("Tracking order."); 

    } 

  

    public void viewOrderDetails(int orderId) { 

        System.out.println("Viewing order details."); 

    } 

  

    public void updateStatus(int orderId, String newStatus) { 

        System.out.println("Updating order status."); 

    } 

} 

  

 class OnlineShoppingSystem { 

    public static void main(String[] args) { 

        System.out.println("-------------------Online Shopping System Software---------------------"); 

        System.out.println("Press 1 for User related query\nPress 2 for Product related query\nPress 3 for ShoppingCart related query\nPress 4 for Order related query"); 

  

        Scanner scanner = new Scanner(System.in); 

        int choice = scanner.nextInt(); 

        if (choice == 1) { 

            System.out.println("Enter username"); 

            String uName = scanner.next(); 

            System.out.println("Do you want to:\n1.Register?\n2.Login?\n3.Update Address\n4.View Orders\n5.Logout"); 

            int ch = scanner.nextInt(); 

            System.out.println("Enter password: "); 

            String pass = scanner.next(); 

            String email, addr; 

            if (ch != 2) { 

                System.out.println("Enter your email-id: "); 

                email = scanner.next(); 

                System.out.println("Enter address: "); 

                addr = scanner.next(); 

            } else { 

                email = "defaultUser@123example.com"; 

                addr = "123, DefaultStreet"; 

            } 

            User user1 = new User(uName, email, pass, addr); 

            if (ch == 1) { 

                user1.registerUser(); 

            } else if (ch == 2) { 

                user1.login(); 

            } else if (ch == 3) { 

                System.out.println("Enter new address"); 

                addr = scanner.next(); 

                user1.updateAddress(addr); 

            } else if (ch == 4) { 

                user1.viewOrders(); 

            } else if (ch == 5) { 

                user1.logout(); 

            } else { 

                System.out.println("Wrong Input"); 

            } 

        } else if (choice == 2) { 

            double price; 

            System.out.println("Enter product id: "); 

            int id = scanner.nextInt(); 

            System.out.println("\nDo you want to:\n1.Add a Product\n2.Update existing product\n3.Update Stock\n4.View Details of the product\n5.Search a Product"); 

            int ch = scanner.nextInt(); 

            String key; 

            if (ch == 1) { 

                System.out.println("Name of the product: "); 

                String uName = scanner.next(); 

                System.out.println("Description: "); 

                String desc = scanner.next(); 

                System.out.println("Price"); 

                price = scanner.nextDouble(); 

                System.out.println("Quantity: "); 

                int qty = scanner.nextInt(); 

                Product product1 = new Product(id, uName, desc, price, qty); 

                product1.addProduct(); 

            } else { 

                Product product1 = new Product(7, "HI", "Hello", 25.6,8); 

                switch (ch) { 

                    case 2: 

                        System.out.println("\nNew Price: "); 

                        price = scanner.nextDouble(); 

                        product1.updatePrice(price); 

                        break; 

                    case 3: 

                        System.out.println("\nNew stock: "); 

                        int qty = scanner.nextInt(); 

                        product1.updateStock(qty); 

                        break; 

                    case 4: 

                        product1.viewDetails(); 

                        break; 

                    case 5: 

                        System.out.println("\nKeyword to be searched by: "); 

                        key = scanner.next(); 

                        product1.searchProduct(key); 

                        break; 

                    default: 

                        System.out.println("Wrong input"); 

                } 

            } 

        } else if (choice == 3) { 

            System.out.println("Do you want to:\n1.Add to Cart\n2.Remove an item from cart\n3.Update the quantity of an item cart\n4.View Cart\n5.Checkout"); 

            int ch = scanner.nextInt(); 

            ShoppingCart cart = new ShoppingCart(); 

            int id, qty; 

            if (ch == 1 || ch == 2 || ch == 3) { 

                System.out.println("Product Id: "); 

                id = scanner.nextInt(); 

                if (ch == 1 || ch == 3) { 

                    System.out.println("\nQuantity: "); 

                    qty = scanner.nextInt(); 

                } else { 

                    qty = 0; 

                } 

            } else { 

                id = 0; 

                qty = 0; 

            } 

  

            switch (ch) { 

                case 1: 

                    cart.addToCart(id, qty); 

                    break; 

                case 2: 

                    cart.removeFromCart(id); 

                    break; 

                case 3: 

                    cart.updateQuantity(id, qty); 

                    break; 

                case 4: 

                    cart.viewCart(); 

                    break; 

                case 5: 

                    cart.checkout(); 

                    break; 

                default: 

                    System.out.println("Wrong Input"); 

            } 

        } else if (choice == 4) { 

            Order order = new Order(); 

            System.out.println("What do you want to do:\n1.Place Order\n2.Cancel order\n3.Track Order\n4.View Order\n5.Update Order details\n"); 

            int ch = scanner.nextInt(); 

            int orderId; 

            if (ch != 1) { 

                System.out.println("Order Id Please: "); 

                orderId = scanner.nextInt(); 

            } else { 

                orderId = 0; 

            } 

  

            switch (ch) { 

                case 1: 

                    order.placeOrder(); 

                    break; 

                case 2: 

                    order.cancelOrder(orderId); 

                    break; 

                case 3: 

                    order.trackOrder(orderId); 

                    break; 

                case 4: 

                    order.viewOrderDetails(orderId); 

                    break; 

                case 5: 

                    order.updateStatus(orderId, "Shipped"); 

                    break; 

                default: 

                    System.out.println("Wrong Input"); 

            } 

        } else { 

            System.out.println("Wrong choice, select again"); 

        } 

    } 

} 

 

 