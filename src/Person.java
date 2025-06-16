public class Person {
    protected String id;
    protected String name;
    protected String status;
    protected String birthday;
    protected String contact;

    public Person()
    {
        id = "";
        name = "";
        status = "";
        birthday = "";
        contact = "";
    }

    public Person(String id, String name, String status, String birthday, String contact)
    {
        this.id = id;
        this.name = name;
        this.status = status;
        this.birthday = birthday;
        this.contact = contact;
    }

    public void printInfo()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Status: " + status);
        System.out.println("Birthday: " + birthday);
        System.out.println("Contact: " + contact);
    }


}
