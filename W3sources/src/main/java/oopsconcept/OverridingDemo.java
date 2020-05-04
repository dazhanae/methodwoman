package oopsconcept;

public class OverridingDemo {

        public static void main(String[] args) {

            //Creating Object of SuperClass and calling getModel Method
            Mobile m = new Mobile("Nokia", "Win8", "Lumia",10000);
            System.out.println(m.getModel());
            //Creating Object of Subclass and calling getModel Method
            Androids a = new Androids("Samsung", "Android", "Grand",30000);
            System.out.println(a.getModel());
            //Creating Object of Subclass and calling getModel Method
            Blackberry b = new Blackberry("BlackB", "RIM", "Curve",20000);
            System.out.println(b.getModel());
        }
    }


