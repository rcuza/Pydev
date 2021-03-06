// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;

public final class NameTok extends NameTokType implements name_contextType {
    public String id;
    public int ctx;

    public NameTok(String id, int ctx) {
        this.id = id;
        this.ctx = ctx;
    }


    public NameTok createCopy() {
        return createCopy(true);
    }
    public NameTok createCopy(boolean copyComments) {
        NameTok temp = new NameTok(id, ctx);
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
        StringBuffer sb = new StringBuffer("NameTok[");
        sb.append("id=");
        sb.append(dumpThis(this.id));
        sb.append(", ");
        sb.append("ctx=");
        sb.append(dumpThis(this.ctx, name_contextType.name_contextTypeNames));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitNameTok(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

}
