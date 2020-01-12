public class Main {
    public static void main(String[] args) {
        Place winneHome= new Place("Доме Винни");
        Place pigletHome= new Place("Доме Пяточка");
        Place tigerHome= new Place("Доме Тигра");

        Character winnePooh= new Character("Винни Пух");
        Character piglet = new Character("Пяточок");
        Character tiger = new Character("Тигра");

        winnePooh.setCurrentPlace(winneHome);
        piglet.setCurrentPlace(pigletHome);
        tiger.setCurrentPlace(tigerHome);
        winnePooh.Be();
        winnePooh.Say();
        winnePooh.to("Тигре");
        Breakfast breakfast = new Breakfast("завтрак");
        Lunch lunch = new Lunch("обед");
        Diner diner = new Diner("ужин");
        winnePooh.Eat(breakfast,lunch,diner,6.00);
        tiger.to("к Пяточку");
        Acorn acorn= new Acorn(0,"желудями");
        piglet.Treat(acorn);


    }
}
