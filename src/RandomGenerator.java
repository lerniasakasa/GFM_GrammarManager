import org.grammaticalframework.pgf.*;

import java.util.ArrayList;
import java.util.List;

public class RandomGenerator{
    private String random;
    private PGF pgf;
    private GrammarManager gManager;

    public RandomGenerator(GrammarManager gm){
        pgf = gm.getGrammar();
        gManager = gm;
    }

    public String generate(String language){

            String sentence = "";
            List<String> words = gManager.loadWords(language, pgf.getStartCat(), ""); //
            String chosen = select(words);
            sentence = sentence + chosen + " ";

            while(!chosen.equals("")){

                words = gManager.loadWords(language, pgf.getStartCat(), sentence);
                chosen = select(words);
                sentence = sentence + chosen + " ";
            }

            if(validate(sentence, language) == false){
               sentence = generate(language); //regenerate
            }

            return sentence;

    }

    //selects a random word in a given array
    private String select(List<String> words){
        String word="";
        if(words.size() != 0){
         word = words.get((int) (Math.random() * words.size()));}

        else{}

        return word;
    }


    //check if the randomly generated sentence can be translated.
    private boolean validate(String s, String language){

        boolean valid = false;

        if(gManager.getTranslation(s, language, "All") == null){
            return valid;
        }
        else{
            valid = true;
            return valid;

        }

    }
}
