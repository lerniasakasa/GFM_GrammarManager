import org.grammaticalframework.pgf.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        try{
            GrammarManager gm = new GrammarManager();
            gm.loadGrammar("Phrasebook.pgf");
            //System.out.println(gm.getCategories());


            PGF pgf = PGF.readPGF("Phrasebook.pgf");




            //gm.tree("the apple please", "Eng");
            //RandomGenerator randomizer = new RandomGenerator(gm);
            //String r = randomizer.generate("Eng");
            //System.out.println(r);
            //System.out.println(gm.getLanguages());
            //System.out.println(gm.getTranslation(r, "Eng", "All"));
            //gm.getTranslation("we want expensive bread", "Eng", "All");
            //gm.tree("we want expensive bread", "Eng");
           // gm.loadWords("Eng", "Phrase", "");
           // System.out.println(gm.loadWords("Eng", "Phrase", ""));

           // System.out.println("Clean list below");
            //System.out.println(gm.duplicateSearch(gm.loadWords("Eng", "Phrase", "")));


            // SETTING UP THE WORDS
            /** List<String> words = gm.loadWords;
             * for(int w = 0 ; w <words.size(); w++){
             * Label numberLabel = new Label(words.get(w));
             //
             **/
        }
        catch(Exception e){

            e.printStackTrace();
        }
    }
        //catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
        //}

    }