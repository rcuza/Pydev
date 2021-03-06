// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;

public final class DictComp extends exprType {
    public exprType key;
    public exprType value;
    public comprehensionType[] generators;

    public DictComp(exprType key, exprType value, comprehensionType[] generators) {
        this.key = key;
        this.value = value;
        this.generators = generators;
    }


    public DictComp createCopy() {
        return createCopy(true);
    }
    public DictComp createCopy(boolean copyComments) {
        comprehensionType[] new0;
        if(this.generators != null){
        new0 = new comprehensionType[this.generators.length];
        for(int i=0;i<this.generators.length;i++){
            new0[i] = (comprehensionType) (this.generators[i] != null?
            this.generators[i].createCopy(copyComments):null);
        }
        }else{
            new0 = this.generators;
        }
        DictComp temp = new DictComp(key!=null?(exprType)key.createCopy(copyComments):null,
        value!=null?(exprType)value.createCopy(copyComments):null, new0);
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
        StringBuffer sb = new StringBuffer("DictComp[");
        sb.append("key=");
        sb.append(dumpThis(this.key));
        sb.append(", ");
        sb.append("value=");
        sb.append(dumpThis(this.value));
        sb.append(", ");
        sb.append("generators=");
        sb.append(dumpThis(this.generators));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitDictComp(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (key != null){
            key.accept(visitor);
        }
        if (value != null){
            value.accept(visitor);
        }
        if (generators != null) {
            for (int i = 0; i < generators.length; i++) {
                if (generators[i] != null){
                    generators[i].accept(visitor);
                }
            }
        }
    }

}
