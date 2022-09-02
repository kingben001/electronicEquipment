public class demo {

    public static void main(String[] args) {

        computer c1= new computer("X1 Carbon",500,"Lenovo", 23.0, 4.0);
        cellphone cp1= new cellphone("Samsung Galaxy s21",250,"Samsung", 2,5);
        digitalCamera ca1= new digitalCamera("Canon t7",300,"Canon",23,2);
        pager p1= new pager("Apollo",325,"Apple",250,12);

        System.out.println(c1);
        System.out.println(cp1);
        System.out.println(ca1);
        System.out.println(p1);
    }

}