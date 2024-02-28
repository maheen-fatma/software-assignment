
#include <iostream>
#include <vector>
#include <string>

using namespace std;

class User
{
private:
string username;
string email;
string password;
string address;

public:
User(string username, string email, string password, string address)
{
this->username = username;
this->email = email;
this->password = password;
this->address = address;
}
User()
{

this->username = "defaultUser";
this->email = "defaultUser@123example.com";
this->password = "defaultPasscode";
this->address = "123, DefaultStreet";
}

void registerUser() // string username, string email, string password, string address)
{
cout << "User \"" << username << "\"registered successfully.\nThe email:\"" << email << "\"1" << endl;
}

bool login()
{
cout << "User " << username << " logged in." << endl;
return true;
}

void updateAddress(string newAddress)
{
this->address = newAddress;
cout << "User " << username << "'s address updated to " << newAddress << "." << endl;
}

void viewOrders()
{
cout << "Fetching orders for user " << username << "." << endl;
}

void logout()
{
cout << "User " << username << " logged out." << endl;
}
};

class Product
{
private:
int productId;
string name;
string description;
double price;
int stockQuantity;

public:
Product(int productId, string name = "Anonyous", string description = "Anonymous Description", double price = 100.00, int stockQuantity = 0)
{
this->productId = productId;
this->name = name;
this->description = description;
this->price = price;
this->stockQuantity = stockQuantity;
}

void addProduct()
{
cout << "Product " << name << " added successfully." << endl;
}

void updatePrice(double newPrice)
{
cout << "Price of product " << productId << " updated to " << newPrice << "." << endl;
}

void updateStock(int quantityChange)
{
cout << "Stock quantity of product " << productId << " updated." << endl;
}

void viewDetails()
{
cout << "Fetching details for product " << productId << "." << endl;
cout << "Name: " << name;
cout << "\nDescription: " << description;
cout << "\nPrice: " << price;
cout << "\nQuantity Left: " << stockQuantity << endl;
}

void searchProduct(string keyword)
{
cout << "...Searching for products with keyword " << keyword << "..." << endl;
}
};

class Review
{
private:
int reviewId;
int userId;
int productId;
int rating;
string comment;

public:
void addReview(int userId, int productId, int rating, string comment)
{
cout << "Review added successfully." << endl;
}

void updateReview(int reviewId, int newRating, string newComment)
{
cout << "Review updated successfully." << endl;
}

void deleteReview(int reviewId)
{
cout << "Review deleted successfully." << endl;
}

void viewReviews(int productId)
{
cout << "Fetching reviews for product " << productId << "." << endl;
}

void averageRating(int productId)
{
cout << "Calculating average rating for product " << productId << "." << endl;
}
};

class ShoppingCart : public User
{
private:
vector<int> cartItems;

public:
void addToCart(int productId, int quantity)
{
cout << "Product added to cart." << endl;
}

void removeFromCart(int productId)
{
cout << "Product removed from cart." << endl;
}

void updateQuantity(int productId, int newQuantity)
{
cout << "Quantity updated for product in cart." << endl;
}

void viewCart()
{
cout << "Viewing shopping cart." << endl;
}

void checkout()
{
cout << "Checking out shopping cart." << endl;
}
};

class Order : public User
{
private:
int orderId;
double totalAmount;
string status;

public:
void placeOrder()
{
cout << "Order placed successfully." << endl;
}

void cancelOrder(int orderId)
{
cout << "Order cancelled successfully." << endl;
}

void trackOrder(int orderId)
{
cout << "Tracking order." << endl;
}

void viewOrderDetails(int orderId)
{
cout << "Viewing order details." << endl;
}

void updateStatus(int orderId, string newStatus)
{
cout << "Updating order status." << endl;
}
};

int main()
{
// Example usage
printf("-------------------Online Shopping Syatem Software---------------------\n");
printf("Press 1 for User related query\nPress 2 for Product related query\nPress 3 for ShoppingCart related query\nPress 4 for Order related query\n ");
int choice, ch, qty, id;
string uName, pass;
cin >> choice;
if (choice == 1) // User block
{
cout << "Enter username" << endl;

cin >> uName;
cout << "Do you want to:\n1.Register?\n2.Login?\n3.Update Address\n4.ViewOrders\n5.Logout\n";

cin >> ch;
cout << "Enter password: ";

cin >> pass;
string email, addr;
if (ch != 2)
{
cout << "Enter your email-id: ";

cin >> email;
cout << "Enter address: ";
cin >> addr;
}

User user1(uName, email, pass, addr);
if (ch == 1) // register
{

user1.registerUser();
}
else if (ch == 2) // login
{
user1.login();
}
else if (ch == 3)
{
cout << "Enter new address" << endl;
cin >> addr;
user1.updateAddress(addr);
}
else if (ch == 4)
{
user1.viewOrders();
}
else if (ch == 5)
{
user1.logout();
}
else
{
cout << "Wrong Input";
}
}
else if (choice == 2) // Product block
{
double price;

cout << "Enter product id: ";

cin >> id;
cout << "\nDo you want to:\n1.Add a Product\n2.Update existing product\n3.Update Stock\n4.View Details of the product\n5.Search a Product" << endl;
cin >> ch;

string key;
if (ch == 1)
{
cout << "Name of the product: ";
cin >> uName;
cout << "Description: ";
cin >> pass;
cout << "Price";
cin >> price;
cout << "Quantity: ";
cin >> qty;
}
Product product1(id, uName, pass, price, qty);
switch (ch)
{

case 1:
// add product

product1.addProduct();
break;

case 2:
cout << "\nNew Price: ";
cin >> price;
product1.updatePrice(price);
break;

case 3:
cout << "\nNew stock: ";
cin >> qty;
product1.updateStock(qty);
break;

case 4:
product1.viewDetails();
break;

case 5:

cout << "\nKeyword to be searched by: ";
cin >> key;
product1.searchProduct(key);
break;

default:
cout << "Wrong input" << endl;
}
}
else if (choice == 3) // Cart Block
{

cout << "Do you want to:\n1.Add to Cart\n2.Remove an item from cart\n3.Update the quanity of an item cart\n4.View Cart\n5.Checkout\n";
cin >> ch;
ShoppingCart cart;
if (ch == 1 || ch == 2 || ch == 3)
{
cout << "Product Id: ";
cin >> id;
if (ch == 1 || ch == 3)
{
cout << "\nQuantity: ";
cin >> qty;
}
}
switch (ch)
{

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
cout << "Wrong Input";
}
}
else if (choice == 4) // Order Block
{
Order order;
cout << "What do you want to do:\n1.Place Order\n2.Cancel order\n3.Track Order\n4.View Order\n5.Update Order details\n";
cin >> ch;
if (ch != 1)
{
cout << "Order Id Please: ";
cin >> id;
}
switch (ch)
{
case 1:
order.placeOrder();
break;

case 2:
order.cancelOrder(id);
break;

case 3:
order.trackOrder(id);
break;

case 4:
order.viewOrderDetails(id);
break;

case 5:
order.updateStatus(id, "Shipped");
break;
default:
cout << "Wrong Input";
}
}
else // default
{
cout << "Wrong choice, select again";
}
return 0; 
}
      