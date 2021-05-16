import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
            
        double gramPureChocoladedruppels = 180;
        double gramZachteRoomboter = 75;
        double gramBloem = 200;
        double zakjeBakpoeder = 0.33;
        double theelepelZout = 0.5;
        double groteEieren = 2;
        double gramSuiker = 150;
        double theelepelVanilleEssence = 2;
        double gramPoederSuiker = 75;

        int aantalKoekjes = 20;

        Koekenbakker alice = new Koekenbakker();

        alice.SetIngredienten(gramPureChocoladedruppels, gramZachteRoomboter, gramBloem, zakjeBakpoeder, theelepelZout, groteEieren, gramSuiker, theelepelVanilleEssence, gramPoederSuiker);

        List<ChocoladeBrownieKoekje> koektrommel = alice.MaakKoekjes(aantalKoekjes);

        PrintKoekjes(koektrommel);
    }

    private static void PrintKoekjes(List<ChocoladeBrownieKoekje> koekjes) {
        for (ChocoladeBrownieKoekje koekje : koekjes) {
            System.out.println();
            System.out.println("=======================================");
            System.out.println("- Per koekje");
            System.out.println("=======================================");
            System.out.println("- Pure chocoladedruppels: " + koekje.GramPureChocoladedruppels + " gram");
            System.out.println("- Zachte roomboter: " + koekje.GramZachteRoomboter + " gram");
            System.out.println("- Bloem per koekje: " + koekje.GramBloem + " gram");
            System.out.println("- Zakjes bakpoeder: " + koekje.ZakjeBakpoeder);
            System.out.println("- Theelepels zout: " + koekje.TheelepelZout);
            System.out.println("- Grote eieren: " + koekje.GroteEieren);
            System.out.println("- Suiker: " + koekje.GramSuiker + " gram");
            System.out.println("- Theelepels vanille-essence: " + koekje.TheelepelsVanilleEssence);
            System.out.println("- Poedersuiker: " + koekje.GramPoederSuiker + " gram");
            System.out.println("=====================================");
            System.out.println();
            break;
        }
    }
}
