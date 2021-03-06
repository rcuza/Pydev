// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;

public final class WithItem extends WithItemType {
    public exprType context_expr;
    public exprType optional_vars;

    public WithItem(exprType context_expr, exprType optional_vars) {
        this.context_expr = context_expr;
        this.optional_vars = optional_vars;
    }


    public WithItem createCopy() {
        return createCopy(true);
    }
    public WithItem createCopy(boolean copyComments) {
        WithItem temp = new
        WithItem(context_expr!=null?(exprType)context_expr.createCopy(copyComments):null,
        optional_vars!=null?(exprType)optional_vars.createCopy(copyComments):null);
        temp.beginLine = this.beginLine;
        temp.beginColumn = this.beginColumn;
        if(this.specialsBefore != null && copyComments){
            for(Object o:this.specialsBefore){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsBefore().add(commentType.createCopy(copyComments));
                }
            }
        }
        if(this.specialsAfter != null && copyComments){
            for(Object o:this.specialsAfter){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsAfter().add(commentType.createCopy(copyComments));
                }
            }
        }
        return temp;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("WithItem[");
        sb.append("context_expr=");
        sb.append(dumpThis(this.context_expr));
        sb.append(", ");
        sb.append("optional_vars=");
        sb.append(dumpThis(this.optional_vars));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitWithItem(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (context_expr != null){
            context_expr.accept(visitor);
        }
        if (optional_vars != null){
            optional_vars.accept(visitor);
        }
    }

}
