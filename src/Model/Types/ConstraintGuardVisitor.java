package Model.Types;

import Model.Location;
import Model.Parser.TAParser;
import Model.Parser.TAParserBaseVisitor;
import ilog.concert.IloRange;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;

public class ConstraintGuardVisitor extends TAParserBaseVisitor<IloRange> {

    private List<HashMap<String, Value>> memory;
    private Location location;
    public ConstraintGuardVisitor(List<HashMap<String, Value>> memory, Location location){
        this.memory=memory;
    }

    @Override
    public IloRange visitConsGuard(TAParser.ConsGuardContext ctx) {
        return super.visitConsGuard(ctx);
    }

    private Value lookUpMemory(TerminalNode identifier) {
        String id = identifier.getText();
        for(int i=this.memory.size()-1; i>=0; i--){
            Value num = this.memory.get(i).get(id);
            if(num!=null){
                return num;
            }
        }
        return new Number(0);
    }

}
