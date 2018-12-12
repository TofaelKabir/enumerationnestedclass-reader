package enumeration;

public class Macys {

    Size chart;

    public  Macys(){
   }
    public Macys(Size chart) {
        this.chart = chart;
    }

    public void whatSizeYouAreLooking(){//opening of method body
        switch(chart){
            case Small:
                System.out.println("We find the small size");
                break;
            case Large:
                System.out.println("We find the large size");
                break;
            default:
                System.out.println("Sorry!we don't have this size");
                break;
        }
    }//closing of method body
}//closing of class body
