package Opgave2;

public class Customer implements Comparable<Customer> {
    private String fornavn;
    private String efternavn;

    private int alder;

    public Customer(String fornavn, String efternavn, int alder) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.alder = alder;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public int getAlder() {
        return alder;
    }

    public int compareTo(Customer other) {
        int efternavn = this.efternavn.compareTo(other.efternavn);
        if (efternavn != 0)
            return efternavn;
        efternavn = this.fornavn.compareTo(other.fornavn);
        if (efternavn != 0)
            return efternavn;
        return Integer.compare(this.alder, other.alder); //yngeste først

    }

}
