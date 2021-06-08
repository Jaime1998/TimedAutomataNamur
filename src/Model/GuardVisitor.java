package Model;

import Model.Parser.TAParser;
import Model.Parser.TAParserBaseVisitor;

public class GuardVisitor extends TAParserBaseVisitor<Interval> {

    @Override
    public Interval visitGuard(TAParser.GuardContext ctx) {



        return super.visitGuard(ctx);
    }

}
