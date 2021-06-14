package Model;

import Model.Parser.TAParserBaseVisitor;
import Model.Types.Value;

import java.util.ArrayList;
import java.util.HashMap;

public class ApplyFunctionVisitor extends TAParserBaseVisitor<Value> {

    ArrayList<HashMap<String, Value>> memory;
    public ApplyFunctionVisitor(ArrayList<HashMap<String, Value>> memory){
        this.memory = memory;
    }



}
