package chapter1;

public class Exercise01_11 {
    public static void main(String[] args) {

        double currentPopulation = 312032486;

        double secondsInYear = 365 * 24 * 60 * 60;
        double birthsPerYear = secondsInYear / 7.0;
        double deathsPerYear = secondsInYear / 13.0;
        double immigrantsPerYear = secondsInYear / 45.0;


        double changePerYear = (birthsPerYear + immigrantsPerYear) - deathsPerYear;


        System.out.println("Population Change Per Year: " + changePerYear);

        double year1 = currentPopulation + changePerYear;
        double year2 = currentPopulation + changePerYear * 2;
        double year3 = currentPopulation + changePerYear * 3;
        double year4 = currentPopulation + changePerYear * 4;
        double year5 = currentPopulation + changePerYear * 5;

        System.out.println("Year 1: " + year1);
        System.out.println("Year 2: " + year2);
        System.out.println("Year 3: " + year3);
        System.out.println("Year 4: " + year4);
        System.out.println("Year 5: " + year5);


    }
}
