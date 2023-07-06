public class Main {
    public static String calculatorCool(int ageHuman, int temperature) {
        String answer = "Можно идти гулять";

        if (ageHuman >= 20 && ageHuman < 45 && temperature >= -20 && temperature < 30)
            System.out.println(answer);

        else if (ageHuman < 20 && temperature > 0 && temperature < 28)
            System.out.println(answer);


        else if (ageHuman > 45 && temperature > -10 && temperature < 25)
            System.out.println(answer);
        else

            System.out.println("Оставайтесь дома");


        return answer;

    }
    public static void main(String[] args) {
        int ageHuman;
        int temperature;
        calculatorCool(ageHuman=30,temperature=12);
        calculatorCool(ageHuman=15,temperature=23);
        calculatorCool(ageHuman=50, temperature=-3);
        calculatorCool(ageHuman=-10, temperature=-20);



    }



}