public class Man extends Person{
    private Boolean isRetired = false;

    public Man(String firstName, String lastName, int age, String partner) {
        super(firstName, lastName, age, partner);
        if(age>=65){
            this.isRetired = true;
        }
    }

    public Boolean isRetired() {
        return this.isRetired;
    }
}
