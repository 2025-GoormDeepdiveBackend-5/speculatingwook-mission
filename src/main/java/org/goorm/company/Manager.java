package org.goorm.company;

public class Manager extends Employee{
    private final String role;

    public Manager(String name, Integer salary, String role) {
        super(name, salary);
        this.role = role;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("관리자 이름: ").append(this.getName()).append("\n")
                .append("관리자 월급: ").append(this.getSalary()).append("\n")
                .append("관리자 직급: ").append(role).append("\n");

        return sb.toString();
    }
}
