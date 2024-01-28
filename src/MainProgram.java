import java.awt.*;

public class MainProgram {
    public static void main(String[] args) {
//        PaymentTerminal unicafeExactum = new PaymentTerminal();
//        System.out.println(unicafeExactum);
//
//        PaymentCard annesCard = new PaymentCard(2);
//
//        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
//
//        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        unicafeExactum.addMoneyToCard(annesCard, 100);
//
//        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
//
//        System.out.println(unicafeExactum);
////-----------------------------------------------------------------------------------------------------------------
//        SimpleDate now = new SimpleDate(13, 2, 2015);
//        SimpleDate afterOneWeek = now;
//        afterOneWeek.advance(7);
//
//        System.out.println("Now: " + now);
//        System.out.println("After one week: " + afterOneWeek);
//
////-----------------------------------------------------------------------------------------------------------------
//
//            SimpleDate date = new SimpleDate(13, 2, 2015);
//            System.out.println("Friday of the examined week is " + date);
//
//            SimpleDate newDate = date.afterNumberOfDays(7);
//            int week = 1;
//            while (week <= 7) {
//                System.out.println("Friday after " + week + " weeks is " + newDate);
//                newDate = newDate.afterNumberOfDays(7);
//
//                week = week + 1;
//            }
//
//
//            System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
//                System.out.println("Try " + date.afterNumberOfDays(790));
////-----------------------------------------------------------------------------------------------------------------
//    Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
//        System.out.println(tim);
//        System.out.println(tim.getAge());
//        System.out.println(tim.collectPay());
//
//        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "03/03/2020", 35000);
//        System.out.println(joe);
//        System.out.println(joe.collectPay());
//        joe.retire();
//        System.out.println(joe.collectPay());
////-----------------------------------------------------------------------------------------------------------------
//        Menu menu = new Menu();
//        menu.addMeal("Tofu ratatouille");
//        menu.addMeal("Chilli Coconut Chicken");
//        menu.addMeal("Chilli Coconut Chicken");
//        menu.addMeal("Meatballs with mustard sauce");
//
//        menu.printMeals();
//        menu.clearMenu();
//
//        System.out.println();
//        menu.addMeal("Tomato and mozzarella salad");
//        menu.printMeals();
//        Stack s = new Stack();
//        System.out.println(s.isEmpty());
//        System.out.println(s.values());
//        s.add("Value");
//        System.out.println(s.isEmpty());
//        System.out.println(s.values());
//        String taken = s.take();
//        System.out.println(s.isEmpty());
//        System.out.println(s.values());
//        System.out.println(taken);
//        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
//
//        System.out.println("Gift's name: " + book.getName());
//        System.out.println("Gift's weight: " + book.getWeight());
//
//        System.out.println("Gift: " + book);
////-----------------------------------------------------------------------------------------------------------------
//        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
//
//        Package gifts = new Package();
//        gifts.addGift(book);
//        System.out.println(gifts.totalWeight());
////-----------------------------------------------------------------------------------------------------------------
//        Item book = new Item("The lord of the rings", 2);
//        Item phone = new Item("Nokia 3210", 1);
//
//        System.out.println("The book's name: " + book.getName());
//        System.out.println("The book's weight: " + book.getWeight());
//
//        System.out.println("Book: " + book);
//        System.out.println("Phone: " + phone);
////-----------------------------------------------------------------------------------------------------------------
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }


}
