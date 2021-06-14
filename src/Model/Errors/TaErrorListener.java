package Model.Errors;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import javax.swing.*;
import java.util.Collections;
import java.util.List;

public class TaErrorListener extends BaseErrorListener {

    private final JTextArea printArea;

    public TaErrorListener(JTextArea printArea) {
        this.printArea = printArea;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(stack);

        this.printArea.append("line " + line + ":" + charPositionInLine + " : " + msg + "\n");

        /**
         * System.err.println("rule stack: "+ stack);
         *         System.err.println("line " + line + ":" + charPositionInLine + " at " +
         *                             offendingSymbol + ":" + msg);
         */

    }
}
