package com.olaemy;

public class Main {

    public static void main(String[] args) {
	Study first = new Study("Изучение Java-это просто!");
        System.out.println(first.printCourse());
        House house1=new House();
        House house2=new House();
        house1.setDate(2000);
        house1.setFloors(3);
        house1.setName("House1");
        house2.setDate(2006);
        house2.setFloors(5);
        house2.setName("House2");
        System.out.println(house1.toString());
        System.out.println(house2.toString());
        Tree tree1=new Tree(100,"Oak");
        Tree tree2=new Tree(55,"live","Birch");
        Tree tree3=new Tree();
        Aircraft aircraft1= new Aircraft();
        Aircraft.Wing wing1=aircraft1.new Wing(1999);
        wing1.print();
        Aircraft.Wing wing2=aircraft1.new Wing(2500);
        wing2.print();
    }
}
class Study {
    private String course;
    public Study(String course){
        this.course=course;
    }
    public String printCourse(){
        return this.course;
    }
}
class House{
    int floors;
    int date;
    String name;
    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int aged(int date){
        return date-this.date;
    }
}
class Tree{
    int age;
    String status;
    String name;
    public Tree(int age,String name){
        this.age=age;
        this.name=name;
    }

    public Tree(int age, String status, String name) {
        this.age = age;
        this.status = status;
        this.name = name;
    }
    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал.");
    }

}
class Aircraft{

    class Wing{
        int weight;
        public Wing(int weight){
            this.weight=weight;
        }
        public void print(){
            System.out.println("Вес крыла"+this.weight);
        }
    }
}
