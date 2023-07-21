public class Main {
    public static void main(String[] args) {
//        Shark shark1 = new Shark ("grey ", 11) ;
//        Shark shark2 = new Shark("pink ", 10) ;
//        Shark [] sharks = {shark1, shark2};
//        for (Shark shark : sharks){
//            System.out.println(shark);
//        }
//        System.out.println();
//
//        Turtle turtle1 = new Turtle("green ", 22) ;
//        Turtle turtle2 = new Turtle("yellow ", 23) ;
//        Turtle [] turtles = {turtle1, turtle2};
//        for ( Turtle turtle : turtles){
//
//        }
//        System.out.println();
//
//        Eagle eagle1 = new Eagle("blue ", 17) ;
//        Eagle eagle2 = new Eagle("black ", 16) ;
//        Eagle [] eagles = {eagle1 , eagle2};
//        for (Eagle eagle : eagles) {
//            System.out.println(eagle.toString());
//        }
//        System.out.println();
//


        Animal []animals={
                new Shark ("grey ", 11) ,
                new Shark("pink ", 10) ,

                new Turtle("green ", 22) ,
                new Turtle("yellow ", 23) ,

                new Eagle("blue ", 17) ,
                new Eagle("black ", 16)
                            };
        for (int i = 0; i < animals.length; i++) {

            System.out.println( animals[i].getAge()+" || "+ animals[i].toString());
        }



        for (int i = 0; i < animals.length; i++) {
            animals[i].Class();
        }

    }
}