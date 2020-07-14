
public class Main {
    public static void main(String[] args) {

        Staff[] employees = new Staff[5];
        employees[0] = new Staff("Карташов", "Мирослав", "Анатольевич",
                "Дворник", "kma@mail.ru", 15000, 39);
        employees[1] = new Staff("Майденко", "Иван", "Валентинович", "Управляющий",
                "@mail.ru", 50000, 44);
        employees[2] = new Staff("Дмитриев", "Александр", "Игоревич",
                "Водитель", "DAlex@mail.ru", 35000, 40);
        employees[3] = new Staff("Винокуров", "Дмитрий", "Генадиевич",
                "Ассистент", "dima@mail.ru", 65000, 41);
        employees[4] = new Staff("Бачинский", "Николай", "Алексеевич",
                "PR-менеджер", "nicol@mail.ru", 30000, 66);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printInfo();
            }

//            if ((employees[i].getSalary() > 30000) && (employees[i].getAge()) < 50){
//                employees[i].printInfo();
//            }
        }
    }
}