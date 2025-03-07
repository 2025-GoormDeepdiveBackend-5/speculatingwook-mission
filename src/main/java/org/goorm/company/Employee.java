package org.goorm.company;

public class Employee {
    private final String name;
    private final Integer salary;

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("직원 이름: ")
                .append(name).append("\n")
                .append("월급: ").append(salary).append("\n");
        return sb.toString();
    }
}
