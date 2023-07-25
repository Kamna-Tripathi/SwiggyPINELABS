package org.example;

public class Dish {





    String id;

    String restroId;
    String name;

    float price;

    public void setRestroId(String restroId) {
        this.restroId = restroId;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getRestroId() {
        return restroId;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getId()
    {
        return id;
    }


    public float getPrice() {
        return  price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id='" + id + '\'' +
                ", restroId='" + restroId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
