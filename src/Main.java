import org.grammaticalframework.pgf.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class Main {
    public static void main(String[] args) {

        try{
            GrammarManager gm = new GrammarManager();
            gm.loadGrammar("Phrasebook.pgf");
            //System.out.println(gm.getCategories());

            System.out.println(gm.loadWords("Eng", "Phrase", ""));
            //gm.getTranslation("we want expensive bread", "Eng", "All");
            //gm.tree("we want expensive bread", "Eng");


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
}