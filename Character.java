public class Character implements Eaten,Movable {
    private String name;
    private Place currentPlace;

    public Character(String name){

        this.name = name;
    }

    public void setName(Character character){

        this.name = name;
    }

    public String getName(){

        return  this.name ;
    }

    @Override
    public String toString(){

        return  this.name ;
    }

    public void setCurrentPlace(Place place){

        this.currentPlace = place;

        System.out.println(this.getName() + " сейчас находится в " + place.getName());

    }

    public void Say(){

        System.out.println();

        System.out.print(getName()+" " +Communion.hastily.getWorld()+" сообщил"+" ");
    }

    @Override
    public void Eat(Food food, Food food1, Food food2,double time){


     if (time>=7 && time<=12){

         System.out.print(Union.What.getWorld()+Union.How.getWorld()+" "+Union.Only.getWorld()+" " +getName()+" скушает " + food.getName());

         String z=Go();

         System.out.print(z);
     }
     else if(time>12 && time<=17){

         System.out.print(Union.What.getWorld()+Union.How.getWorld()+" "+Union.Only.getWorld()+" " +getName()+" скушает " + food1.getName());

         String z=Go();

         System.out.print(z);
     }

     else if(time>17 && time<=21){

         System.out.print(Union.What.getWorld()+Union.How.getWorld()+" "+Union.Only.getWorld()+" " +getName()+" скушает " + food2.getName() );

         String z=Go();

         System.out.print(z);
     }
     else {
         System.out.println(Union.What.getWorld()+Union.If.getWorld()+" "+getName()+" спит");

         String z=NotGo();

         System.out.print(z);
     }
}

    public static String Go() {
        
       String k="Они пойдут в гости ";

       return k;
    }

    public static String NotGo() {

        String c="Тигруля пойдет один в гости ";

        return c;
    }

    @Override
    public void Treat(Acorn acorn){

        if (acorn.number>0) {

            System.out.print(Union.And.getWorld()+" "+Union.Maybe.getWorld());

            System.out.println(" " + getName() + " угостит " + acorn.number + " " + acorn.getName());
        }

        else {

            System.out.println("Если " +getName() + " неугостит чем-либо" );

            String m=Beat();

        }
    }

    public static String Beat(){

        System.out.println("Тигруля даст щелбан Пяточку");

        return "";
    }
    public void Be(){

        System.out.print(this.getName()+"у "+Union.This.getWorld()+" было "+Communion.pretty.getWorld());
    }
    @Override
    public void to(String a) {

        System.out.println(a);
    }
    @Override
    public void in(String a) {

        System.out.print(a);
    }

    @Override
    public void by(String a) {

        System.out.print(a);
    }

    @Override
    public int hashCode(){

        return this.name.hashCode();
  }

    @Override
    public boolean equals(Object obj){

        Character m = (Character) obj;
        return (this.name == m.name) ? true : false;
    }
}



