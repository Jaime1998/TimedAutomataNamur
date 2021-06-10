package Model;

import Model.Location;
import Model.Parser.TAParser;
import Model.Parser.TAParserBaseVisitor;
import Model.Types.Number;
import Model.Types.Value;
import ilog.concert.IloRange;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;

public class ConstraintGuardVisitor extends TAParserBaseVisitor<Object> {

    private List<HashMap<String, Value>> memory;

    public ConstraintGuardVisitor(List<HashMap<String, Value>> memory){
        this.memory=memory;
    }

    @Override
    public Object visitConsGuard(TAParser.ConsGuardContext ctx) {
        visit(ctx.expr());
        return super.visitConsGuard(ctx);
    }



}
