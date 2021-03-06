// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;

public final class TryExcept extends stmtType {
    public stmtType[] body;
    public excepthandlerType[] handlers;
    public suiteType orelse;

    public TryExcept(stmtType[] body, excepthandlerType[] handlers, suiteType orelse) {
        this.body = body;
        this.handlers = handlers;
        this.orelse = orelse;
    }


    public TryExcept createCopy() {
        return createCopy(true);
    }
    public TryExcept createCopy(boolean copyComments) {
        stmtType[] new0;
        if(this.body != null){
        new0 = new stmtType[this.body.length];
        for(int i=0;i<this.body.length;i++){
            new0[i] = (stmtType) (this.body[i] != null? this.body[i].createCopy(copyComments):null);
        }
        }else{
            new0 = this.body;
        }
        excepthandlerType[] new1;
        if(this.handlers != null){
        new1 = new excepthandlerType[this.handlers.length];
        for(int i=0;i<this.handlers.length;i++){
            new1[i] = (excepthandlerType) (this.handlers[i] != null?
            this.handlers[i].createCopy(copyComments):null);
        }
        }else{
            new1 = this.handlers;
        }
        TryExcept temp = new TryExcept(new0, new1,
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
        StringBuffer sb = new StringBuffer("TryExcept[");
        sb.append("body=");
        sb.append(dumpThis(this.body));
        sb.append(", ");
        sb.append("handlers=");
        sb.append(dumpThis(this.handlers));
        sb.append(", ");
        sb.append("orelse=");
        sb.append(dumpThis(this.orelse));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitTryExcept(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (body != null) {
            for (int i = 0; i < body.length; i++) {
                if (body[i] != null){
                    body[i].accept(visitor);
                }
            }
        }
        if (handlers != null) {
            for (int i = 0; i < handlers.length; i++) {
                if (handlers[i] != null){
                    handlers[i].accept(visitor);
                }
            }
        }
        if (orelse != null){
            orelse.accept(visitor);
        }
    }

}
