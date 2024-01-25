public class mem {
    private String name;
    private int id;
    private String domain;
    public mem(){

    }

    public mem(String name, int id, String domain) {
        this.name = name;
        this.id = id;
        this.domain = domain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

//    public void add(member list) {
//    }
}
