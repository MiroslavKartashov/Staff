//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//* Конструктор класса должен заполнять эти поля при создании объекта;
//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//* Создать массив из 5 сотрудников
// С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

public class Staff{
    String firstname, name, middlename, position, email;
    int salary, age;

   public Staff() {

   }
   public Staff (String firstname, String name, String middlename, String position,
                 String email, int salary,int age) {
        this.firstname = firstname;
        this.name = name;
        this.middlename = middlename;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo(){
        System.out.println("ФИО: " + firstname + " " + name + " " + middlename
                +  "    Должность: " + position  + "   mail: " + email + "   Зарплата: " + salary + "   Возраст: "
                + age);
        }

    public  int getAge(){
        return age;
        }

    protected int getSalary(){
       return salary;
        }

}


