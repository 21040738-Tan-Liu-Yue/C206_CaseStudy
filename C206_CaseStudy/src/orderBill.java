public class orderBill {
		 private int id;
		 private String date;
		 private String meal;
		 private String drink;
		 private String fruit;
		 private double amount;
		 
		 public orderBill(int id, String date, String meal, String drink,String fruit,double amount) {
		  this.id = id;
		  this.date = date;
		  this.meal = meal;
		  this.drink = drink;
		  this.fruit = fruit;
		  this.amount = amount;
		 }
		 public int getID() {
		  return id;
		 }
		 public void setID(int id) {
		  this.id = id;
		 }
		 public String getDate(){
		  return date;
		 }
		 public void setDate(String date) {
		  this.date = date;
		 
		 }
		 public String getMeal(){
		  return meal;
		 }
		 public void setMeal(String meal) {
		  this.meal = meal;
		 
		 }
		 public String getDrink(){
		  return drink;
		 }
		 public void setDrink(String drink) {
		  this.drink = drink;
		 
		 }
		 public String getFruit(){
		  return fruit;
		 }
		 public void setFruit(String fruit) {
		  this.fruit = fruit;
		 
		 }
		 public double getAmount() {
		  return amount;
		 }
		 public void setAmount(double amount) {
		  this.amount = amount;
		 }
}
