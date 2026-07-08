class Person{
    private String name;
    private int age;
    
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name=name;
    }
    int getAge(){
        return this.age;
    }
    void setAge(int age){
        this.age=age;
    }
}

class Student extends Person{
    private int roll;
    private String course;
    private String dept;

    Student(String name, int age, int roll,String course,String dept){
        super(name,age);
        this.course=course;
        this.roll=roll;
        this.dept=dept;
    }
    String getCourse(){
        return this.course;
    }
    void setCourse(String course){
        this.course=course;
    }
    int getRoll(){
        return this.roll;
    }
    void setRoll(int roll){
        this.roll=roll;
    }
    String getDept(){
        return this.dept;
    }
    void setDept(String dept){
        this.dept=dept;
    }
}

class Teacher extends Person{
    private String dept;
    private String spec;

    Teacher(String name,int age,String dept,String spec){
        super(name,age);
        this.dept=dept;
        this.spec=spec;
    }
    String getDept(){
        return this.dept;
    }
    void setDept(String dept){
        this.dept=dept;
    }
    String getSpec(){
        return this.spec;
    }
    void setSpec(String spec){
        this.spec=spec;
    }

}

class Talk{

    void talk(){
        System.out.println("Hello");
    }
    void talk(String name){
        System.out.println("Hello "+name);
    }
}

class Main{
    public static void main(String[] args) {
        Talk t= new Talk();
        t.talk();
        t.talk("Manasi");
        Student s= new Student("Riya",20,34,"BE","CS");
        Teacher teacher = new Teacher("Panday",45,"Mech","Fluid Mechanics");
        System.out.println(s.getName()+" "+s.getDept()+" "+s.getCourse());
        System.out.println(teacher.getName()+" "+teacher.getDept()+" "+teacher.getSpec());
    }
}