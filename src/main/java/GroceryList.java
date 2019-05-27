public class GroceryList {
    public static void main(String[] args) {
        String[] myGroceryListForEach= {"ice cream", "hot sauce", "pickles", "bananas", "cereal", "rice", "yogurt"};
        String[] myGroceryListFor = { "eggs", "milk", "bread", "bananas", "cereal", "rice"};
        for (String groceryItem : myGroceryListForEach) {
            System.out.println(groceryItem);
        }

        for (Integer index = 0 ; index < myGroceryListFor.length ; index++) {
            System.out.println(myGroceryListFor[index]);
        }
    }
}
