package mainPackage;

public abstract class Food implements Concumable{
    private String name;

    public String getName(){
        return name;
    }

    public String setName(String name){
        this.name = name;
        return name;
    }

    public Food(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public boolean equals(Object arg0){
        if (!(arg0 instanceof Food)) return false;
        if (name == null || ((Food)arg0).name == null) return false;
        return name.equals(((Food)arg0).name);
    }
}
