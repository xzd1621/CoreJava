package chapter9;

import java.util.Objects;

public class Item implements Comparable<Item> {
    private String description;
    private int partNumber;

    public Item(String description,int partNumber)
    {
        this.description=description;
        this.partNumber=partNumber;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "description: "+description+" partNumber: "+partNumber;
    }

    public int hashCode()
    {
        return Objects.hash(description,partNumber);
    }
    @Override
    public int compareTo(Item other) {
        int diff=Integer.compare(partNumber,other.partNumber);
        return diff!=0?diff:description.compareTo(other.description);
    }
}
