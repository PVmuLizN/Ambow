class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
}
class Teacher extends Person {
    constructor(name,age,salary) {
        super(name,age);
        this.salary = salary;
    }
    show() {
        document.write(this.name, this.age, this.salary + "\n");
    }
}

class Student {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
    show() {
        document.write(this.name + this.age + "\n");
    }
}
let s1 = new Student("Student", 11);
let t1 = new Teacher("Tom", 12, 11111);
s1.show();
t1.show();
