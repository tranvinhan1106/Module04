package codegym.vn.entity;
public class Symptom {
    private  String name;
    private  Boolean choose;
    public  Symptom(){}

    public Symptom(String name, Boolean choose) {
        this.name = name;
        this.choose = choose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getChoose() {
        return choose;
    }

    public void setChoose(Boolean choose) {
        this.choose = choose;
    }
}
