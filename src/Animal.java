public class Animal {
    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    private String type, name;
    private int age;
    private double weigth;
    private boolean isFly, isWalk, isSwim;
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
