package CyberSport;

import static CyberSport.Statistics.place;

public class Games {
    public static void main(String[] args) {

        int money = 0;

        {



            VirtusPro dota2Virtuspro = new VirtusPro(1, "VirtusPro");
            System.out.print(dota2Virtuspro.getPlace());
            System.out.print(" место заняла команда " + dota2Virtuspro.getMajor());
            if (place ==1)money=1000000;
            if (place ==2)money=500000;
            if (place ==3)money=250000;
            if (place >=4)money=100000;
            if (place <= 4)

            {
                System.out.println(" она выигрывает  "  + money+"$");
            } else{
                System.out.println(" и попробует свои силы в следующем году. ");

        }


            ViciGaming dota2Vicigaming = new ViciGaming(2, "ViciGaming");
            System.out.print(dota2Vicigaming.getPlace());
            System.out.print(" место заняла команда " + dota2Vicigaming.getMajor());
            if (place ==1)money=1000000;
            if (place ==2)money=500000;
            if (place ==3)money=250000;
            if (place ==4)money=100000;
            if (place <= 4) {
                System.out.println(" она выигрывает  "  +money+"$");
            } else {
                System.out.println(" и попробует свои силы в следующем году. ");
            }

            Fnatic dota2Fnatic = new Fnatic(3, "Fnatic");
            System.out.print(dota2Fnatic.getPlace());
            System.out.print(" место заняла команда " + dota2Fnatic.getMajor());
            if (place ==1)money=1000000;
            if (place ==2)money=500000;
            if (place ==3)money=250000;
            if (place ==4)money=100000;
            if (place <= 4) {
                System.out.println(" она выигрывает  "  +money+"$");
            } else {
                System.out.println(" и она попробует свои силы в следующем году. ");

            }

            Secret dota2Secret = new Secret(4, "Secret");
            System.out.print(dota2Secret.getPlace());
            System.out.print(" место заняла команда " + dota2Secret.getMajor());
            if (place ==1)money=1000000;
            if (place ==2)money=500000;
            if (place ==3)money=250000;
            if (place ==4)money=100000;
            if (place <= 4) {
                System.out.println(" она выигрывает  "  +money+"$");
            } else {
                System.out.println(" и попробует свои силы в следующем году. ");
            }

            EvilGenius dota2Evilgenius = new EvilGenius(5, "EvilGenius");
            System.out.print(dota2Evilgenius.getPlace());
            System.out.print(" место заняла команда " + dota2Evilgenius.getMajor());
            if (place ==1)money=1000000;
            if (place ==2)money=500000;
            if (place ==3)money=250000;
            if (place ==4)money=100000;
            if (place==5)money=50000;
            if (place <=4) {
                System.out.println("и она проходит в финальную часть турнира." + money+"$");
            } else {
                System.out.println(" и она попробует свои силы в следующем году, она заработала  "+ money+"$");
            }


        }

    }
}






