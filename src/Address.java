/**
 * Address Class
 */
public class Address {


    /**
     * toString() : void
     * Overrides the default toString() method.
     * This will format the address in the form of
     * <p>
     * street
     * city, province
     * postalCode
     *
     * @return String consisting of a formatted mailing address.
     */

    String street;
    String city;
    String province;
    String postalCode;

    public String toString() {
        return this.street + "\n" + this.city + ", " + this.province + this.postalCode;
    }
}
