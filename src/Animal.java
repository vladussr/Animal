public class Animal {
    String type, name;
    int age;
    double weigth;
    boolean isFly, isWalk, isSwim;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.name = "No Name";
        this.age = age;
    }

    public Animal(String type, String name, int age, double weigth, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weigth = weigth;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    void display(){
        System.out.println("Тип животного: " + type + ", Имя: " + name + ", Возраст: " + age + ", Вес: " + weigth + ", Умеет летать: " + (isFly?"Да":"Нет") + ", Умеет ходить: " + (isWalk?"Да":"Нет") + ", Умеет плавать: " + (isSwim?"Да":"Нет"));
    }
     void rename(String name){
        this.name = name;
     }
     void holiday(int day) {
         this.weigth += 0.1 * day;
     }
}
