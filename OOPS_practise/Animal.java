package OOPS_practise;
public class Animal{
    public String name;
    public int bodyWeight;
    public class Type{
        public String typeName;
        public String parentFamily;
        
        public Type() {
        }
        public Type(String typeName, String parentFamily) {
            this.typeName = typeName;
            this.parentFamily = parentFamily;
        }
        public String getTypeName() {
            return typeName;
        }
        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }
        public String getParentFamily() {
            return parentFamily;
        }
        public void setParentFamily(String parentFamily) {
            this.parentFamily = parentFamily;
        }

        
    }
    public Animal(String name, int bodyWeight) {
        this.name = name;
        this.bodyWeight = bodyWeight;
    }
    @Override
    public String toString() {
        return super.toString();
    }
    
}