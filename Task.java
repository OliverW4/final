package assignmentFinal;

public class Task implements Priority {
    String name;
    String priority;
    public Task(String n, String p){
        name = n;
        setPriority(p);
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setPriority(String s){
        priority = s;
    }

    public String getPriority(){
        return priority;
    }

    public String toString(){
        return "Name: " + name + "\nPriority: " + getPriority();
    }
}
