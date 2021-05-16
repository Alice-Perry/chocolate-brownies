import java.util.ArrayList;
import java.util.List;

public class Alice {
    double gramPureChocoladedruppels;
    double gramZachteRoomboter;
    double gramBloem;
    double zakjeBakpoeder;
    double theelepelZout;
    double groteEieren;
    double gramSuiker;
    double theelepelVanilleEssence;
    double gramPoederSuiker;

    public void NeemIngredienten(double gramPureChocoladedruppels, double gramZachteRoomboter, double gramBloem, double zakjeBakpoeder, double theelepelZout, double groteEieren, double gramSuiker, double theelepelVanilleEssence, double gramPoedersuiker) {
        this.gramPureChocoladedruppels = gramPureChocoladedruppels;
        this.gramZachteRoomboter = gramZachteRoomboter;
        this.gramBloem = gramBloem;
        this.zakjeBakpoeder = zakjeBakpoeder;
        this.theelepelZout = theelepelZout;
        this.groteEieren = groteEieren;
        this.gramSuiker = gramSuiker;
        this.theelepelVanilleEssence = theelepelVanilleEssence;
        this.gramPoederSuiker = gramPoedersuiker;
    }

    public List<ChocoladeBrownieKoekje> MaakKoekjes(int numberOfKoekjes) {

        SmeltChocoladeTotGladdeMassa();
        MengenInMiddelgroteKom();
        KloppenEnKoelen();
        VerwarmOvenEnVetBakplaatIn();
        DraaiBalletjesEnLegZeOpDeBakplaat();
        Bakken();
        Afkoelen();

        List<ChocoladeBrownieKoekje> koekjes = new ArrayList<ChocoladeBrownieKoekje>();

        for (int i = 0; i < numberOfKoekjes; i++) {

            ChocoladeBrownieKoekje koekje = new ChocoladeBrownieKoekje();

            koekje.GramPureChocoladedruppels = gramPureChocoladedruppels / numberOfKoekjes;
            koekje.GramZachteRoomboter = gramZachteRoomboter / numberOfKoekjes;
            koekje.GramBloem = gramBloem / numberOfKoekjes;
            koekje.ZakjeBakpoeder = zakjeBakpoeder / numberOfKoekjes;
            koekje.TheelepelZout = theelepelZout / numberOfKoekjes;
            koekje.GroteEieren = groteEieren / numberOfKoekjes;
            koekje.GramSuiker = gramSuiker / numberOfKoekjes;
            koekje.TheelepelsVanilleEssence  = theelepelVanilleEssence / numberOfKoekjes;
            koekje.GramPoederSuiker = gramPoederSuiker / numberOfKoekjes;

            koekjes.add(koekje);
        }
        
        return koekjes;
    }

    private void SmeltChocoladeTotGladdeMassa() {

    }

    private void MengenInMiddelgroteKom() {

    }

    private void KloppenEnKoelen() {

    }

    private void VerwarmOvenEnVetBakplaatIn() {

    }

    private void DraaiBalletjesEnLegZeOpDeBakplaat() {

    }

    private void Bakken() {

    }

    private void Afkoelen() {

    }
}
