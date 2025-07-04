package quan_ly_doi_tuong.model.entity;

public class SubClass2 extends ParentClass{
    private String subclass2;

    public SubClass2() {
        super();
        this.subclass2 = "";
    }

    @Override
    public String toString() {
        return "Subclass2: \n"
                +super.toString()
                + "Subclass2: " + this.subclass2 + "\n";
    }

    @Override
    public String getInfoToCSV() {
        return "";
    }
}
