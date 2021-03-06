// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;

public final class BinOp extends exprType implements operatorType {
    public exprType left;
    public int op;
    public exprType right;

    public BinOp(exprType left, int op, exprType right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }


    public BinOp createCopy() {
        return createCopy(true);
    }
    public BinOp createCopy(boolean copyComments) {
        BinOp temp = new BinOp(left!=null?(exprType)left.createCopy(copyComments):null, op,
        right!=null?(exprType)right.createCopy(copyComments):null);
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
        StringBuffer sb = new StringBuffer("BinOp[");
        sb.append("left=");
        sb.append(dumpThis(this.left));
        sb.append(", ");
        sb.append("op=");
        sb.append(dumpThis(this.op, operatorType.operatorTypeNames));
        sb.append(", ");
        sb.append("right=");
        sb.append(dumpThis(this.right));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitBinOp(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (left != null){
            left.accept(visitor);
        }
        if (right != null){
            right.accept(visitor);
        }
    }

}
