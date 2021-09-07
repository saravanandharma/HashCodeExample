package com.saravanan;

public class Employee {
    public int id;
    public String name;
    public String level;
    public int salary;

    Employee(){

    }

    Employee(int id, String name, String level, int salary){
        this.id = id;
        this.salary=salary;
        this.name=name;
        this.level=level;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31* hash + (int) id;
        hash = 31+ hash + (int ) salary;
        hash = 31+ hash + (name == null ? 0: name.hashCode());
        hash = 31+ hash + (level == null ? 0: level.hashCode());
        System.out.println(" hashCode() invoked...: "+ hash);
        return hash;
    }

    @Override
    public boolean equals(Object o){
        if ( this == o ) return true;
        if (o == null ) return false;
        if( this.getClass() != o.getClass()) return false;

        Employee employee =  (Employee) o;
        System.out.println(" equals() invoked...");
        return id == ((Employee) o).id
                && (salary == ((Employee) o).salary)
                && (name.equals(((Employee) o).name))
                && (level.equals(((Employee) o).level));
    }

}
