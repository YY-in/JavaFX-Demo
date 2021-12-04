module com.example.javafxdemo {
    /**
     * 发现是某些模块在jdk11被剥离开来了，需要手动导入，或者某些内部类和不可读类也要显式申明才能使用。
     */
    requires javafx.controls;
    requires javafx.fxml;

    requires jdk.management;
    requires jdk.naming.rmi;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires junit;
    requires druid;
    requires java.sql;
    requires commons.dbutils;

    opens com.example.javafxdemo to javafx.fxml;
    exports com.example.javafxdemo.utils;
    exports com.example.javafxdemo.dao.impl;
    exports com.example.javafxdemo.model;
    exports com.example.javafxdemo.dao;
}