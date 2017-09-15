package Compiler;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


import Runtime.Readfile;
@SuppressWarnings("deprecation")
public class EntryPoint {
	public static void main(String[] args) throws IOException {
		String intCodeFileName="Kodo_Program.kin";//intermediate language file
		String hllCodeFile ="Kodo_Program.kd";//high level language code file
		ANTLRFileStream input;
		if(args[0].length() > 0 ){
			hllCodeFile = args[0];
			input= new ANTLRFileStream(hllCodeFile);
			 if(args.length > 1 && args[1].equals("-i"))
			 {
				 intCodeFileName = hllCodeFile.replace(".kd", ".kin");
			 }
		else{
			 input = new ANTLRFileStream(hllCodeFile);//input to compiler
		}
		KodoGrammarLexer lexer = new KodoGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        KodoGrammarParser parser = new KodoGrammarParser(tokens);
        ParseTree tree = parser.entryPoint(); 
        
        //System.out.println(tree.toStringTree(parser));  
//        JFrame frame = new JFrame("Kodo Parse Tree");
//        JPanel panel = new JPanel();
//        TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
//        viewr.setScale(1.5);
//        panel.add(viewr);
//        frame.add(panel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(1200,600);
//        frame.setVisible(true);          
//        JScrollPane jsp = new JScrollPane(panel);
//        frame.add(jsp); 
        
        
        ParseTreeWalker walker = new ParseTreeWalker(); 
        KodoGrammarBaseListener extractor = new KodoGrammarBaseListener();
        walker.walk(extractor, tree);
        
        FileOutputStream fos = new FileOutputStream(new File(intCodeFileName));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
        for(String s: KodoGrammarBaseListener.File) {
        	writer.write(s);
        }
        writer.close();
        
        Readfile.runtime(intCodeFileName);	
        }
}
}
