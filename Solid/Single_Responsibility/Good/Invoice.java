package LLD.Concept_And_Coding.L1_Solid.Single_Responsibility.Good;

import LLD.Concept_And_Coding.L1_Solid.Single_Responsibility.Bad.Marker;


public class Invoice {
    private final Marker marker;
    private final int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        return ((marker.price) * this.quantity);
    }
}
