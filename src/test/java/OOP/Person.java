package OOP;


import java.time.YearMonth;

//Person- класс
public class Person {
    //Параметры у каждого представителя класса
    private String name;
    private String middleName;
    private String familyName;
    private int age;

    //Функция, которая позволяет пришедшие с консоли данные определить к параметрам класса
    public Person (String name, String middleName, String familyName, int age){
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }


    //позволяет запросить извне значение name
    public String getName(){
        return name;
    }

// позволяет извне изменить установить для name новое значение
    public void setName(String name){
        if(!(name.length()==0)){
        this.name=name;
        }
    }

    public String getMiddleName(){
        return middleName;
    }

    public void setMiddleName(String middleName){
        this.middleName=middleName;
    }

    public String getFamilyName(){
        return familyName;
    }

    public void setFamilyName(String familyName){
        this.familyName=familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getBirthYear(){
        return YearMonth.now().getYear() - age;
    }

    // Метод, определяющий  вид данных для вывода
    @Override
    public String toString() {
        return "{" + name +" " + middleName +" "+ familyName +" "+ age +"}";
    }
}
