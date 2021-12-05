package com.example.javafxdemo.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

/**
 * @Author: YinZhihao
 * @Description:我们需要一个模型类来保存联系人信息到我们的通讯录中。在模型包中 (ch.makery.address.model) 添加一个叫 Person的类。Person 类将会有一些变量，名字，地址和生日。将以下代码添加到类。在代码后，我将解释一些 JavaFX 的细节
 * @Explaination： 在JavaFX中, 对一个模型类的所有属性使用 Properties是很常见的. 一个 Property 允许我们, 打个比方, 当 lastName 或其他属性被改变时自动收到通知, 这有助于我们保持视图与数据的同步，阅读 Using JavaFX Properties and Binding 学习更多关于 Properties 的内容。
 * <p>
 * birthday, 我们使用了 LocalDate 类型, 这在 Date and Time API for JDK 8 中是一个新的部分.
 * @Date: Created in 22:32 2021/12/1
 */
public class Person {

    //StringProperty is the abstract base class for observable string properties
    private final IntegerProperty id;
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty street;
    private final IntegerProperty postalCode;
    private final StringProperty city;
    private final StringProperty birthday;

    public Person() {
        this(null, null);
    }

    public Person(String firstName, String lastName) {

        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);

        //Some initial dummy data,just for convenient testing
        this.street = new SimpleStringProperty("HaiXia Street");
        this.postalCode = new SimpleIntegerProperty(999 - 996);
        this.city = new SimpleStringProperty("DaLian");
        this.birthday = new SimpleStringProperty("2002-01-23");
        this.id = new SimpleIntegerProperty(1);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public String getStreet() {
        return street.get();
    }

    public StringProperty streetProperty() {
        return street;
    }

    public void setStreet(String street) {
        this.street.set(street);
    }

    public int getPostalCode() {
        return postalCode.get();
    }

    public IntegerProperty postalCodeProperty() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode.set(postalCode);
    }

    public String getCity() {
        return city.get();
    }

    public StringProperty cityProperty() {
        return city;
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public String getBirthday() {
        return birthday.get();
    }

    public StringProperty birthdayProperty() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday.set(String.valueOf(birthday));
    }
}
