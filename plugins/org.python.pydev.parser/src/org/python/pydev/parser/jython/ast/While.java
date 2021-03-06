// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;

public final class While extends stmtType {
    public exprType test;
    public stmtType[] body;
    public suiteType orelse;

    public While(exprType test, stmtType[] body, suiteType orelse) {
        this.test = test;
        this.body = body;
        this.orelse = orelse;
    }


    public While createCopy() {
        return createCopy(true);
    }
    public While createCopy(boolean copyComments) {
        stmtType[] new0;
        if(this.body != null){
        new0 = new stmtType[this.body.length];
        for(int i=0;i<this.body.length;i++){
            new0[i] = (stmtType) (this.body[i] != null? this.body[i].createCopy(copyComments):null);
        }
        }else{
            new0 = this.body;
        }
        While temp = new While(test!=null?(exprType)test.createCopy(copyComments):null, new0,
        orelse!=null?(suiteType)orelse.createCopy(copyComments):null);
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
        StringBuffer sb = new StringBuffer("While[");
        sb.append("test=");
        sb.append(dumpThis(this.test));
        sb.append(", ");
        sb.append("body=");
        sb.append(dumpThis(this.body));
        sb.append(", ");
        sb.append("orelse=");
        sb.append(dumpThis(this.orelse));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitWhile(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (test != null){
            test.accept(visitor);
        }
        if (body != null) {
            for (int i = 0; i < body.length; i++) {
                if (body[i] != null){
                    body[i].accept(visitor);
                }
            }
        }
        if (orelse != null){
            orelse.accept(visitor);
        }
    }

}
