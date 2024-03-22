 

class User: 

    def __init__(self, username="defaultUser", email="defaultUser@123example.com", password="defaultPasscode", address="123, DefaultStreet"): 

        self.username = username 

        self.email = email 

        self.password = password 

        self.address = address 

  

    def register_user(self): 

        print(f"User \"{self.username}\" registered successfully.\nThe email: \"{self.email}\"") 

  

    def login(self): 

        print(f"User {self.username} logged in.") 

        return True 

  

    def update_address(self, new_address): 

        self.address = new_address 

        print(f"User {self.username}'s address updated to {new_address}.") 

  

    def view_orders(self): 

        print(f"Fetching orders for user {self.username}.") 

  

    def logout(self): 

        print(f"User {self.username} logged out.") 

  

  

class Product: 

    def __init__(self, product_id, name="Anonyous", description="Anonymous Description", price=100.00, stock_quantity=0): 

        self.product_id = product_id 

        self.name = name 

        self.description = description 

        self.price = price 

        self.stock_quantity = stock_quantity 

  

    def add_product(self): 

        print(f"Product {self.name} added successfully.") 

  

    def update_price(self, new_price): 

        print(f"Price of product {self.product_id} updated to {new_price}.") 

  

    def update_stock(self, quantity_change): 

        print(f"Stock quantity of product {self.product_id} updated.") 

  

    def view_details(self): 

        print(f"Fetching details for product {self.product_id}.") 

        print(f"Name: {self.name}\nDescription: {self.description}\nPrice: {self.price}\nQuantity Left: {self.stock_quantity}") 

  

    def search_product(self, keyword): 

        print(f"...Searching for products with keyword {keyword}...") 

  

  

class Review: 

    def add_review(self, user_id, product_id, rating, comment): 

        print("Review added successfully.") 

  

    def update_review(self, review_id, new_rating, new_comment): 

        print("Review updated successfully.") 

  

    def delete_review(self, review_id): 

        print("Review deleted successfully.") 

  

    def view_reviews(self, product_id): 

        print(f"Fetching reviews for product {product_id}.") 

  

    def average_rating(self, product_id): 

        print(f"Calculating average rating for product {product_id}.") 

  

  

class ShoppingCart(User): 

    def __init__(self): 

        super().__init__() 

        self.cart_items = [] 

  

    def add_to_cart(self, product_id, quantity): 

        print("Product added to cart.") 

  

    def remove_from_cart(self, product_id): 

        print("Product removed from cart.") 

  

    def update_quantity(self, product_id, new_quantity): 

        print("Quantity updated for product in cart.") 

  

    def view_cart(self): 

        print("Viewing shopping cart.") 

  

    def checkout(self): 

        print("Checking out shopping cart.") 

  

  

class Order(User): 

    def place_order(self): 

        print("Order placed successfully.") 

  

    def cancel_order(self, order_id): 

        print("Order cancelled successfully.") 

  

    def track_order(self, order_id): 

        print("Tracking order.") 

  

    def view_order_details(self, order_id): 

        print("Viewing order details.") 

  

    def update_status(self, order_id, new_status): 

        print("Updating order status.") 

  

  

if __name__ == "__main__": 

    print("-------------------Online Shopping System Software---------------------") 

    print("Press 1 for User related query\nPress 2 for Product related query\nPress 3 for ShoppingCart related query\nPress 4 for Order related query") 

  

    choice = int(input()) 

    if choice == 1: 

        print("Enter username") 

        u_name = input() 

        print("Do you want to:\n1.Register?\n2.Login?\n3.Update Address\n4.View Orders\n5.Logout") 

        ch = int(input()) 

        print("Enter password: ") 

        pswd = input() 

        if ch != 2: 

            print("Enter your email-id: ") 

            email_id = input() 

            print("Enter address: ") 

            addr = input() 

        user1 = User(u_name, email_id, pswd, addr) if ch != 2 else User(u_name) 

        if ch == 1: 

            user1.register_user() 

        elif ch == 2: 

            user1.login() 

        elif ch == 3: 

            print("Enter new address") 

            new_addr = input() 

            user1.update_address(new_addr) 

        elif ch == 4: 

            user1.view_orders() 

        elif ch == 5: 

            user1.logout() 

        else: 

            print("Wrong Input") 

    elif choice == 2: 

        print("Enter product id: ") 

        prod_id = int(input()) 

        print("Do you want to:\n1.Add a Product\n2.Update existing product\n3.Update Stock\n4.View Details of the product\n5.Search a Product") 

        ch = int(input()) 

        key = "" 

        if ch == 1: 

            print("Name of the product: ") 

            prod_name = input() 

            print("Description: ") 

            prod_desc = input() 

            print("Price: ") 

            prod_price = float(input()) 

            print("Quantity: ") 

            prod_qty = int(input()) 

        product1 = Product(prod_id, prod_name, prod_desc, prod_price, prod_qty) if ch == 1 else Product(prod_id) 

        if ch == 1: 

            product1.add_product() 

        elif ch == 2: 

            print("New Price: ") 

            new_price = float(input()) 

            product1.update_price(new_price) 

        elif ch == 3: 

            print("New stock: ") 

            new_qty = int(input()) 

            product1.update_stock(new_qty) 

        elif ch == 4: 

            product1.view_details() 

        elif ch == 5: 

            print("Keyword to be searched by: ") 

            key = input() 

            product1.search_product(key) 

        else: 

            print("Wrong input") 

    elif choice == 3: 

        print("Do you want to:\n1.Add to Cart\n2.Remove an item from cart\n3.Update the quantity of an item in cart\n4.View Cart\n5.Checkout") 

        ch = int(input()) 

        cart = ShoppingCart() 

        if ch == 1 or ch == 2 or ch == 3: 

            print("Product Id: ") 

            prod_id = int(input()) 

            if ch == 1 or ch == 3: 

                print("Quantity: ") 

                qty = int(input()) 

        if ch == 1: 

            cart.add_to_cart(prod_id, qty) 

        elif ch == 2: 

            cart.remove_from_cart(prod_id) 

        elif ch == 3: 

            cart.update_quantity(prod_id, qty) 

        elif ch == 4: 

            cart.view_cart() 

        elif ch == 5: 

            cart.checkout() 

        else: 

            print("Wrong Input") 

    elif choice == 4: 

        order = Order() 

        print("What do you want to do:\n1.Place Order\n2.Cancel order\n3.Track Order\n4.View Order\n5.Update Order details") 

        ch = int(input()) 

        if ch == 1: 

            order.place_order() 

        elif ch == 2: 

            order.cancel_order(order_id) 

        elif ch == 3: 

            order.track_order(order_id) 

        elif ch == 4: 

            order.view_order_details(order_id) 

        elif ch == 5: 

            order.update_status(order_id, "Shipped") 

        else: 

            print("Wrong Input") 

    else: 

        print("Wrong choice, select again") 

 

 

