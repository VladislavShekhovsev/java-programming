package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        System.out.println("-------------------PRICES MORE THEN 100--------------------");
        for(double eachPrice: prices ){
            if(eachPrice>100){
                System.out.print(eachPrice+",  ");

            }


            }
        System.out.println();
        System.out.println("-----------prices between 10 and 70 included-------------");
        for(double priceNew:prices){
            if(priceNew>10&&priceNew<=70){
                System.out.print(priceNew+" ");
        }
        }
        System.out.println("\n-------------count of the prices that are more then 50-----------");
        int count=0;
        for( double sumOfPrices:prices ){
            if(sumOfPrices>50){
               count++;
           }
        }
        System.out.print("count "+count);
        System.out.println("\n counties with name more then 7 inclusive characters");
        for(String longNameCountry : countries){
            if(longNameCountry.length()>=7){
                System.out.print(longNameCountry+" - "+longNameCountry.length()+" ");
            }
        }

        }
    }

