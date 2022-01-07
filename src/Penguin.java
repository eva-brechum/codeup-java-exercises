public class Penguin {
    private String name;
    private int weight;
    private String species;
    private String sex;

    public Penguin(){

    }
    public static boolean canFly() {
        return false;
    }

    public static void areEvil() {
//        return true;
    }
    public Penguin(String name, int weight, String species, String sex) {
        this.name = name;
        this.weight = weight;
        this.species = species;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
    public int getWeight(){
    return weight;
    }
    public String getSpecies(){
        return species;
    }
    public String getSex(){
        return sex;
    }
    public void setName(String name){
         this.name = name;
    }
    public void setWeight(){
         this.weight= weight;

    }
    public void setSpecies(){
        this.species = species;
    }
    public void setSex(){
        this.sex = sex;
    }


}
