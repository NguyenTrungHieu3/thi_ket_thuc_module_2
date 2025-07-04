package quan_ly_doi_tuong.model.entity;

public class SubClass1 extends ParentClass {
    private String subclass1;

    public SubClass1() {
        super();
        this.subclass1 = "";
    }

    @Override
    public String toString() {
        return "Subclass1: \n"
                + super.toString()
                + "Subclass1: " + this.subclass1 + "\n";
    }

    @Override
    public String getInfoToCSV() {
        return "";
    }
}
