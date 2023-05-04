public class Woman extends Person{
    private Boolean isRetired = false;
    private String maidenName;

    public Woman(String firstName, String lastName, int age, String partner) {
        super(firstName, lastName, age, partner);
        if(age>=60){
            this.isRetired = true;
        }
    }

    public void registerPartnership(Man partner){
        this.maidenName = getLastName();
        setLastName(partner.getLastName());
        setPartner(partner.getFirstName() + " " + partner.getLastName());
        partner.setPartner(getFirstName() + " " + getLastName());
    }

    public void deregisterPartnership(Boolean isDeregister, Man partner){
        if(isDeregister){
            setLastName(this.maidenName);
            setPartner("Single");
            partner.setPartner("Single");
        }
    }

    public Boolean isRetired() {
        return this.isRetired;
    }
}
