package HomeWork4;

public class Main {
        public static void main(String[] args){
                Phonebook phonebook = new Phonebook();

                System.out.println("Наполняем справочник");
                phonebook.add("Иванов", "223344");
                phonebook.add("Иванов", "22334411");
                phonebook.add("Петров", "22334499");
                phonebook.add("Сидоров", "22334488");
                phonebook.add("Иванов", "22334422");

                phonebook.get("Иванов");
                phonebook.get("Петров");
                phonebook.get("Сидоров");
                System.out.println("-----------------");

                System.out.println("Случай отсутствия записи");
                phonebook.get("Кузнецов");

                }
        }