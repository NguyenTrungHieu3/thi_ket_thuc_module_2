package quan_ly_doi_tuong.model.entity;

public abstract class ParentClass {
    private int id;
    private String name;

    public ParentClass() {
        this.id = 0;
        this.name = "";
    }

    @Override
    public String toString() {
        return "Id: " + this.id + "\n"
                + "name: " + this.name + "\n";
    }

    public abstract String getInfoToCSV();
}
