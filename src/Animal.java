public class Animal {
    String type, name;
    int age;
    double weigth;
    boolean isFly, isWalk, isSwim;
    void display(){
        System.out.println("Тип животного: " + type + ", Имя: " + name + ", Возраст: " + age + ", Вес: " + weigth + ", Умеет летать: " + (isFly?"Да":"Нет") + ", Умеет ходить: " + (isWalk?"Да":"Нет") + ", Умеет плавать: " + (isSwim?"Да":"Нет"));
    }
     void rename(String name){
        this.name = name;
     }
     void holiday(int day){
        this.weigth += 0.1*day;
     }
}
